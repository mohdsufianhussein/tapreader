
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
    @ASN1BoxedType ( name = "ContentTransactionBasicInfo" )
    public class ContentTransactionBasicInfo implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ContentTransactionBasicInfo" , isSet = false )
       public static class ContentTransactionBasicInfoSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "rapFileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RapFileSequenceNumber rapFileSequenceNumber = null;
                
  
        @ASN1Element ( name = "orderPlacedTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OrderPlacedTimeStamp orderPlacedTimeStamp = null;
                
  
        @ASN1Element ( name = "requestedDeliveryTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RequestedDeliveryTimeStamp requestedDeliveryTimeStamp = null;
                
  
        @ASN1Element ( name = "actualDeliveryTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ActualDeliveryTimeStamp actualDeliveryTimeStamp = null;
                
  
        @ASN1Element ( name = "totalTransactionDuration", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalTransactionDuration totalTransactionDuration = null;
                
  
        @ASN1Element ( name = "transactionStatus", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransactionStatus transactionStatus = null;
                
  
        
        public RapFileSequenceNumber getRapFileSequenceNumber () {
            return this.rapFileSequenceNumber;
        }

        
        public boolean isRapFileSequenceNumberPresent () {
            return this.rapFileSequenceNumber != null;
        }
        

        public void setRapFileSequenceNumber (RapFileSequenceNumber value) {
            this.rapFileSequenceNumber = value;
        }
        
  
        
        public OrderPlacedTimeStamp getOrderPlacedTimeStamp () {
            return this.orderPlacedTimeStamp;
        }

        
        public boolean isOrderPlacedTimeStampPresent () {
            return this.orderPlacedTimeStamp != null;
        }
        

        public void setOrderPlacedTimeStamp (OrderPlacedTimeStamp value) {
            this.orderPlacedTimeStamp = value;
        }
        
  
        
        public RequestedDeliveryTimeStamp getRequestedDeliveryTimeStamp () {
            return this.requestedDeliveryTimeStamp;
        }

        
        public boolean isRequestedDeliveryTimeStampPresent () {
            return this.requestedDeliveryTimeStamp != null;
        }
        

        public void setRequestedDeliveryTimeStamp (RequestedDeliveryTimeStamp value) {
            this.requestedDeliveryTimeStamp = value;
        }
        
  
        
        public ActualDeliveryTimeStamp getActualDeliveryTimeStamp () {
            return this.actualDeliveryTimeStamp;
        }

        
        public boolean isActualDeliveryTimeStampPresent () {
            return this.actualDeliveryTimeStamp != null;
        }
        

        public void setActualDeliveryTimeStamp (ActualDeliveryTimeStamp value) {
            this.actualDeliveryTimeStamp = value;
        }
        
  
        
        public TotalTransactionDuration getTotalTransactionDuration () {
            return this.totalTransactionDuration;
        }

        
        public boolean isTotalTransactionDurationPresent () {
            return this.totalTransactionDuration != null;
        }
        

        public void setTotalTransactionDuration (TotalTransactionDuration value) {
            this.totalTransactionDuration = value;
        }
        
  
        
        public TransactionStatus getTransactionStatus () {
            return this.transactionStatus;
        }

        
        public boolean isTransactionStatusPresent () {
            return this.transactionStatus != null;
        }
        

        public void setTransactionStatus (TransactionStatus value) {
            this.transactionStatus = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ContentTransactionBasicInfoSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ContentTransactionBasicInfoSequenceType = CoderFactory.getInstance().newPreparedElementData(ContentTransactionBasicInfoSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ContentTransactionBasicInfo", isOptional =  false , hasTag =  true, tag = 304, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ContentTransactionBasicInfoSequenceType  value;        

        
        
        public ContentTransactionBasicInfo () {
        }
        
        
        
        public void setValue(ContentTransactionBasicInfoSequenceType value) {
            this.value = value;
        }
        
        
        
        public ContentTransactionBasicInfoSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ContentTransactionBasicInfo.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            