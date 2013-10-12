
package el.data.asn311;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "MoBasicCallInformation" )
    public class MoBasicCallInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "MoBasicCallInformation" , isSet = false )
       public static class MoBasicCallInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "chargeableSubscriber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeableSubscriber chargeableSubscriber = null;
                
  
        @ASN1Element ( name = "rapFileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RapFileSequenceNumber rapFileSequenceNumber = null;
                
  
        @ASN1Element ( name = "destination", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Destination destination = null;
                
  
        @ASN1Element ( name = "destinationNetwork", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DestinationNetwork destinationNetwork = null;
                
  
        @ASN1Element ( name = "callEventStartTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CallEventStartTimeStamp callEventStartTimeStamp = null;
                
  
        @ASN1Element ( name = "totalCallEventDuration", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalCallEventDuration totalCallEventDuration = null;
                
  
        @ASN1Element ( name = "simToolkitIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private SimToolkitIndicator simToolkitIndicator = null;
                
  
        @ASN1Element ( name = "causeForTerm", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CauseForTerm causeForTerm = null;
                
  
        
        public ChargeableSubscriber getChargeableSubscriber () {
            return this.chargeableSubscriber;
        }

        
        public boolean isChargeableSubscriberPresent () {
            return this.chargeableSubscriber != null;
        }
        

        public void setChargeableSubscriber (ChargeableSubscriber value) {
            this.chargeableSubscriber = value;
        }
        
  
        
        public RapFileSequenceNumber getRapFileSequenceNumber () {
            return this.rapFileSequenceNumber;
        }

        
        public boolean isRapFileSequenceNumberPresent () {
            return this.rapFileSequenceNumber != null;
        }
        

        public void setRapFileSequenceNumber (RapFileSequenceNumber value) {
            this.rapFileSequenceNumber = value;
        }
        
  
        
        public Destination getDestination () {
            return this.destination;
        }

        
        public boolean isDestinationPresent () {
            return this.destination != null;
        }
        

        public void setDestination (Destination value) {
            this.destination = value;
        }
        
  
        
        public DestinationNetwork getDestinationNetwork () {
            return this.destinationNetwork;
        }

        
        public boolean isDestinationNetworkPresent () {
            return this.destinationNetwork != null;
        }
        

        public void setDestinationNetwork (DestinationNetwork value) {
            this.destinationNetwork = value;
        }
        
  
        
        public CallEventStartTimeStamp getCallEventStartTimeStamp () {
            return this.callEventStartTimeStamp;
        }

        
        public boolean isCallEventStartTimeStampPresent () {
            return this.callEventStartTimeStamp != null;
        }
        

        public void setCallEventStartTimeStamp (CallEventStartTimeStamp value) {
            this.callEventStartTimeStamp = value;
        }
        
  
        
        public TotalCallEventDuration getTotalCallEventDuration () {
            return this.totalCallEventDuration;
        }

        
        public boolean isTotalCallEventDurationPresent () {
            return this.totalCallEventDuration != null;
        }
        

        public void setTotalCallEventDuration (TotalCallEventDuration value) {
            this.totalCallEventDuration = value;
        }
        
  
        
        public SimToolkitIndicator getSimToolkitIndicator () {
            return this.simToolkitIndicator;
        }

        
        public boolean isSimToolkitIndicatorPresent () {
            return this.simToolkitIndicator != null;
        }
        

        public void setSimToolkitIndicator (SimToolkitIndicator value) {
            this.simToolkitIndicator = value;
        }
        
  
        
        public CauseForTerm getCauseForTerm () {
            return this.causeForTerm;
        }

        
        public boolean isCauseForTermPresent () {
            return this.causeForTerm != null;
        }
        

        public void setCauseForTerm (CauseForTerm value) {
            this.causeForTerm = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_MoBasicCallInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_MoBasicCallInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(MoBasicCallInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "MoBasicCallInformation", isOptional =  false , hasTag =  true, tag = 147, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private MoBasicCallInformationSequenceType  value;        

        
        
        public MoBasicCallInformation () {
        }
        
        
        
        public void setValue(MoBasicCallInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public MoBasicCallInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(MoBasicCallInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            