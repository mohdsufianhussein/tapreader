package tapreader;

import el.data.asn311.*;
import org.apache.commons.io.FileUtils;
import org.bn.CoderFactory;
import org.bn.IDecoder;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1OctetString;
import org.bn.annotations.ASN1Sequence;
import org.bn.annotations.ASN1SequenceOf;
import org.bn.coders.CoderUtils;
import org.bn.coders.IASN1PreparedElement;
import utils.ByteCharSequence;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{
    private static void treeDump2(IASN1PreparedElement element, String s) throws Exception {
        if(element == null) { return; }
        if(!element.getClass().isAnnotationPresent(ASN1Sequence.class)) {
            System.out.println(s + element.getPreparedData().getTypeMetadata().getName());
        }
        Field[] fields = element.getPreparedData().getFields();

        for(Field f: fields) {
            if(f.isAnnotationPresent(ASN1Element.class) && IASN1PreparedElement.class.isAssignableFrom(f.getType())) {
                treeDump2((IASN1PreparedElement) CoderUtils.findGetterMethodForField(f, element.getClass()).invoke
                            (element), s + " ");
            } else if(f.isAnnotationPresent(ASN1SequenceOf.class)) {
                List<IASN1PreparedElement> l = (List<IASN1PreparedElement>) element.getClass().getMethod("getValue").invoke(element);
                for(IASN1PreparedElement e: l) { treeDump2(e, s + " "); }
            } else {
                if(f.isAnnotationPresent(ASN1OctetString.class)) {
                    System.out.println(s + "-->" + new String((byte[])CoderUtils.findGetterMethodForField(f, element.getClass()).invoke(element)));
                } else {
                    System.out.println(s + "-->" + CoderUtils.findGetterMethodForField(f, element.getClass()).invoke(element));
                }
            }
        }

    }

    private static final Pattern TAP_FILE =
            Pattern.compile("^\\x61.+\\x5f\\x81\\x44\\x05.+\\x5f\\x81\\x49\\x01(.)" +
                    ".*\\x5f\\x81\\x3d\\x01(.)", Pattern.DOTALL);

    public static void main( String[] args ) throws Throwable
    {

        if(args.length == 0) {
            System.out.println("Usage: java -jar TapReader-1.0-SNAPSHOT-jar-with-dependencies.jar tap3file");
            return;
        }

        byte[] buffer = FileUtils.readFileToByteArray(new File(args[0]));
        Matcher matcher = TAP_FILE.matcher(new ByteCharSequence(buffer));

        if(matcher.find()) {
            int a = matcher.start(1);
            System.out.println("Good tap, version:  " +
                    buffer[matcher.start(1)] + ":" + (buffer[matcher.start(2)]));
            System.out.println();
            IDecoder decoder = CoderFactory.getInstance().newDecoder("BER");
            DataInterChange dataInterChange =
                    decoder.decode(new ByteArrayInputStream(buffer), DataInterChange.class);

            treeDump2(dataInterChange, "");

            TransferBatch transferBatch = dataInterChange.getTransferBatch();
            BatchControlInfo batchControlInfo = transferBatch.getValue().getBatchControlInfo();

            System.out.println("Sender:" + new String(batchControlInfo.getValue().getSender().
                    getValue().getValue().getValue()));
            System.out.println("Recipient:" + new String(batchControlInfo.getValue().getRecipient().
                    getValue().getValue().getValue()));

            CallEventDetailList callEventDetailList =
                    transferBatch.getValue().getCallEventDetails();

            for(CallEventDetail c: callEventDetailList.getValue()) {
                if(c.isMobileOriginatedCallSelected()) {
                    System.out.println("MobileOriginatedCall");
                } else if(c.isMobileTerminatedCallSelected()) {
                    System.out.println("MobileTerminatedCall");
                    if(c.getMobileTerminatedCall().getValue().
                            isLocationInformationPresent()) {
                        LocationInformation l =
                                c.getMobileTerminatedCall().getValue().getLocationInformation();
                        System.out.println("networkLocation:cellId: " +
                                l.getValue().getNetworkLocation().getValue().getCellId().getValue());
                    }
                }
            }
        }
    }
}
