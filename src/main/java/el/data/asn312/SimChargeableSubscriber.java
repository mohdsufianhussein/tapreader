
package el.data.asn312;
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
    @ASN1BoxedType ( name = "SimChargeableSubscriber" )
    public class SimChargeableSubscriber implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "SimChargeableSubscriber" , isSet = false )
       public static class SimChargeableSubscriberSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "imsi", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Imsi imsi = null;
                
  
        @ASN1Element ( name = "msisdn", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Msisdn msisdn = null;
                
  
        
        public Imsi getImsi () {
            return this.imsi;
        }

        
        public boolean isImsiPresent () {
            return this.imsi != null;
        }
        

        public void setImsi (Imsi value) {
            this.imsi = value;
        }
        
  
        
        public Msisdn getMsisdn () {
            return this.msisdn;
        }

        
        public boolean isMsisdnPresent () {
            return this.msisdn != null;
        }
        

        public void setMsisdn (Msisdn value) {
            this.msisdn = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_SimChargeableSubscriberSequenceType;
        }

       private static IASN1PreparedElementData preparedData_SimChargeableSubscriberSequenceType = CoderFactory.getInstance().newPreparedElementData(SimChargeableSubscriberSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "SimChargeableSubscriber", isOptional =  false , hasTag =  true, tag = 199, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private SimChargeableSubscriberSequenceType  value;        

        
        
        public SimChargeableSubscriber () {
        }
        
        
        
        public void setValue(SimChargeableSubscriberSequenceType value) {
            this.value = value;
        }
        
        
        
        public SimChargeableSubscriberSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(SimChargeableSubscriber.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            