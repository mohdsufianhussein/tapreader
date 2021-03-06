
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
    @ASN1BoxedType ( name = "AuditControlInfo" )
    public class AuditControlInfo implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "AuditControlInfo" , isSet = false )
       public static class AuditControlInfoSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "earliestCallTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private EarliestCallTimeStamp earliestCallTimeStamp = null;
                
  
        @ASN1Element ( name = "latestCallTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LatestCallTimeStamp latestCallTimeStamp = null;
                
  
        @ASN1Element ( name = "totalCharge", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalCharge totalCharge = null;
                
  
        @ASN1Element ( name = "totalChargeRefund", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalChargeRefund totalChargeRefund = null;
                
  
        @ASN1Element ( name = "totalTaxRefund", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalTaxRefund totalTaxRefund = null;
                
  
        @ASN1Element ( name = "totalTaxValue", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalTaxValue totalTaxValue = null;
                
  
        @ASN1Element ( name = "totalDiscountValue", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalDiscountValue totalDiscountValue = null;
                
  
        @ASN1Element ( name = "totalDiscountRefund", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalDiscountRefund totalDiscountRefund = null;
                
  
        @ASN1Element ( name = "totalAdvisedChargeValueList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalAdvisedChargeValueList totalAdvisedChargeValueList = null;
                
  
        @ASN1Element ( name = "callEventDetailsCount", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CallEventDetailsCount callEventDetailsCount = null;
                
  
        @ASN1Element ( name = "operatorSpecInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OperatorSpecInfoList operatorSpecInformation = null;
                
  
        
        public EarliestCallTimeStamp getEarliestCallTimeStamp () {
            return this.earliestCallTimeStamp;
        }

        
        public boolean isEarliestCallTimeStampPresent () {
            return this.earliestCallTimeStamp != null;
        }
        

        public void setEarliestCallTimeStamp (EarliestCallTimeStamp value) {
            this.earliestCallTimeStamp = value;
        }
        
  
        
        public LatestCallTimeStamp getLatestCallTimeStamp () {
            return this.latestCallTimeStamp;
        }

        
        public boolean isLatestCallTimeStampPresent () {
            return this.latestCallTimeStamp != null;
        }
        

        public void setLatestCallTimeStamp (LatestCallTimeStamp value) {
            this.latestCallTimeStamp = value;
        }
        
  
        
        public TotalCharge getTotalCharge () {
            return this.totalCharge;
        }

        
        public boolean isTotalChargePresent () {
            return this.totalCharge != null;
        }
        

        public void setTotalCharge (TotalCharge value) {
            this.totalCharge = value;
        }
        
  
        
        public TotalChargeRefund getTotalChargeRefund () {
            return this.totalChargeRefund;
        }

        
        public boolean isTotalChargeRefundPresent () {
            return this.totalChargeRefund != null;
        }
        

        public void setTotalChargeRefund (TotalChargeRefund value) {
            this.totalChargeRefund = value;
        }
        
  
        
        public TotalTaxRefund getTotalTaxRefund () {
            return this.totalTaxRefund;
        }

        
        public boolean isTotalTaxRefundPresent () {
            return this.totalTaxRefund != null;
        }
        

        public void setTotalTaxRefund (TotalTaxRefund value) {
            this.totalTaxRefund = value;
        }
        
  
        
        public TotalTaxValue getTotalTaxValue () {
            return this.totalTaxValue;
        }

        
        public boolean isTotalTaxValuePresent () {
            return this.totalTaxValue != null;
        }
        

        public void setTotalTaxValue (TotalTaxValue value) {
            this.totalTaxValue = value;
        }
        
  
        
        public TotalDiscountValue getTotalDiscountValue () {
            return this.totalDiscountValue;
        }

        
        public boolean isTotalDiscountValuePresent () {
            return this.totalDiscountValue != null;
        }
        

        public void setTotalDiscountValue (TotalDiscountValue value) {
            this.totalDiscountValue = value;
        }
        
  
        
        public TotalDiscountRefund getTotalDiscountRefund () {
            return this.totalDiscountRefund;
        }

        
        public boolean isTotalDiscountRefundPresent () {
            return this.totalDiscountRefund != null;
        }
        

        public void setTotalDiscountRefund (TotalDiscountRefund value) {
            this.totalDiscountRefund = value;
        }
        
  
        
        public TotalAdvisedChargeValueList getTotalAdvisedChargeValueList () {
            return this.totalAdvisedChargeValueList;
        }

        
        public boolean isTotalAdvisedChargeValueListPresent () {
            return this.totalAdvisedChargeValueList != null;
        }
        

        public void setTotalAdvisedChargeValueList (TotalAdvisedChargeValueList value) {
            this.totalAdvisedChargeValueList = value;
        }
        
  
        
        public CallEventDetailsCount getCallEventDetailsCount () {
            return this.callEventDetailsCount;
        }

        
        public boolean isCallEventDetailsCountPresent () {
            return this.callEventDetailsCount != null;
        }
        

        public void setCallEventDetailsCount (CallEventDetailsCount value) {
            this.callEventDetailsCount = value;
        }
        
  
        
        public OperatorSpecInfoList getOperatorSpecInformation () {
            return this.operatorSpecInformation;
        }

        
        public boolean isOperatorSpecInformationPresent () {
            return this.operatorSpecInformation != null;
        }
        

        public void setOperatorSpecInformation (OperatorSpecInfoList value) {
            this.operatorSpecInformation = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_AuditControlInfoSequenceType;
        }

       private static IASN1PreparedElementData preparedData_AuditControlInfoSequenceType = CoderFactory.getInstance().newPreparedElementData(AuditControlInfoSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "AuditControlInfo", isOptional =  false , hasTag =  true, tag = 15, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AuditControlInfoSequenceType  value;        

        
        
        public AuditControlInfo () {
        }
        
        
        
        public void setValue(AuditControlInfoSequenceType value) {
            this.value = value;
        }
        
        
        
        public AuditControlInfoSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AuditControlInfo.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            