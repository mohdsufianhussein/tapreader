
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
    @ASN1BoxedType ( name = "AdvisedChargeInformation" )
    public class AdvisedChargeInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "AdvisedChargeInformation" , isSet = false )
       public static class AdvisedChargeInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "paidIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private PaidIndicator paidIndicator = null;
                
  
        @ASN1Element ( name = "paymentMethod", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private PaymentMethod paymentMethod = null;
                
  
        @ASN1Element ( name = "advisedChargeCurrency", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private AdvisedChargeCurrency advisedChargeCurrency = null;
                
  
        @ASN1Element ( name = "advisedCharge", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private AdvisedCharge advisedCharge = null;
                
  
        @ASN1Element ( name = "commission", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Commission commission = null;
                
  
        
        public PaidIndicator getPaidIndicator () {
            return this.paidIndicator;
        }

        
        public boolean isPaidIndicatorPresent () {
            return this.paidIndicator != null;
        }
        

        public void setPaidIndicator (PaidIndicator value) {
            this.paidIndicator = value;
        }
        
  
        
        public PaymentMethod getPaymentMethod () {
            return this.paymentMethod;
        }

        
        public boolean isPaymentMethodPresent () {
            return this.paymentMethod != null;
        }
        

        public void setPaymentMethod (PaymentMethod value) {
            this.paymentMethod = value;
        }
        
  
        
        public AdvisedChargeCurrency getAdvisedChargeCurrency () {
            return this.advisedChargeCurrency;
        }

        
        public boolean isAdvisedChargeCurrencyPresent () {
            return this.advisedChargeCurrency != null;
        }
        

        public void setAdvisedChargeCurrency (AdvisedChargeCurrency value) {
            this.advisedChargeCurrency = value;
        }
        
  
        
        public AdvisedCharge getAdvisedCharge () {
            return this.advisedCharge;
        }

        
        public boolean isAdvisedChargePresent () {
            return this.advisedCharge != null;
        }
        

        public void setAdvisedCharge (AdvisedCharge value) {
            this.advisedCharge = value;
        }
        
  
        
        public Commission getCommission () {
            return this.commission;
        }

        
        public boolean isCommissionPresent () {
            return this.commission != null;
        }
        

        public void setCommission (Commission value) {
            this.commission = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_AdvisedChargeInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_AdvisedChargeInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(AdvisedChargeInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "AdvisedChargeInformation", isOptional =  false , hasTag =  true, tag = 351, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AdvisedChargeInformationSequenceType  value;        

        
        
        public AdvisedChargeInformation () {
        }
        
        
        
        public void setValue(AdvisedChargeInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public AdvisedChargeInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AdvisedChargeInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            