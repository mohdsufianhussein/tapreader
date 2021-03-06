
package el.data.asn310;
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
    @ASN1BoxedType ( name = "ScuTimeStamps" )
    public class ScuTimeStamps implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ScuTimeStamps" , isSet = false )
       public static class ScuTimeStampsSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "depositTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DepositTimeStamp depositTimeStamp = null;
                
  
        @ASN1Element ( name = "completionTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CompletionTimeStamp completionTimeStamp = null;
                
  
        @ASN1Element ( name = "chargingPoint", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargingPoint chargingPoint = null;
                
  
        
        public DepositTimeStamp getDepositTimeStamp () {
            return this.depositTimeStamp;
        }

        
        public boolean isDepositTimeStampPresent () {
            return this.depositTimeStamp != null;
        }
        

        public void setDepositTimeStamp (DepositTimeStamp value) {
            this.depositTimeStamp = value;
        }
        
  
        
        public CompletionTimeStamp getCompletionTimeStamp () {
            return this.completionTimeStamp;
        }

        
        public boolean isCompletionTimeStampPresent () {
            return this.completionTimeStamp != null;
        }
        

        public void setCompletionTimeStamp (CompletionTimeStamp value) {
            this.completionTimeStamp = value;
        }
        
  
        
        public ChargingPoint getChargingPoint () {
            return this.chargingPoint;
        }

        
        public boolean isChargingPointPresent () {
            return this.chargingPoint != null;
        }
        

        public void setChargingPoint (ChargingPoint value) {
            this.chargingPoint = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ScuTimeStampsSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ScuTimeStampsSequenceType = CoderFactory.getInstance().newPreparedElementData(ScuTimeStampsSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ScuTimeStamps", isOptional =  false , hasTag =  true, tag = 193, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ScuTimeStampsSequenceType  value;        

        
        
        public ScuTimeStamps () {
        }
        
        
        
        public void setValue(ScuTimeStampsSequenceType value) {
            this.value = value;
        }
        
        
        
        public ScuTimeStampsSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ScuTimeStamps.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            