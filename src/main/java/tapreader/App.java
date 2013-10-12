package tapreader;

import el.data.asn311.*;
import org.apache.commons.io.FileUtils;
import org.bn.CoderFactory;
import org.bn.IDecoder;
import utils.ByteCharSequence;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{
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
