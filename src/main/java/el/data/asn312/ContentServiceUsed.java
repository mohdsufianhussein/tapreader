
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
    @ASN1BoxedType ( name = "ContentServiceUsed" )
    public class ContentServiceUsed implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ContentServiceUsed" , isSet = false )
       public static class ContentServiceUsedSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "contentTransactionCode", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ContentTransactionCode contentTransactionCode = null;
                
  
        @ASN1Element ( name = "contentTransactionType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ContentTransactionType contentTransactionType = null;
                
  
        @ASN1Element ( name = "objectType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ObjectType objectType = null;
                
  
        @ASN1Element ( name = "transactionDescriptionSupp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransactionDescriptionSupp transactionDescriptionSupp = null;
                
  
        @ASN1Element ( name = "transactionShortDescription", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransactionShortDescription transactionShortDescription = null;
                
  
        @ASN1Element ( name = "transactionDetailDescription", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransactionDetailDescription transactionDetailDescription = null;
                
  
        @ASN1Element ( name = "transactionIdentifier", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransactionIdentifier transactionIdentifier = null;
                
  
        @ASN1Element ( name = "transactionAuthCode", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransactionAuthCode transactionAuthCode = null;
                
  
        @ASN1Element ( name = "dataVolumeIncoming", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DataVolumeIncoming dataVolumeIncoming = null;
                
  
        @ASN1Element ( name = "dataVolumeOutgoing", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DataVolumeOutgoing dataVolumeOutgoing = null;
                
  
        @ASN1Element ( name = "totalDataVolume", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalDataVolume totalDataVolume = null;
                
  
        @ASN1Element ( name = "chargeRefundIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeRefundIndicator chargeRefundIndicator = null;
                
  
        @ASN1Element ( name = "contentChargingPoint", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ContentChargingPoint contentChargingPoint = null;
                
  
        @ASN1Element ( name = "chargeInformationList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeInformationList chargeInformationList = null;
                
  
        @ASN1Element ( name = "advisedChargeInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private AdvisedChargeInformation advisedChargeInformation = null;
                
  
        
        public ContentTransactionCode getContentTransactionCode () {
            return this.contentTransactionCode;
        }

        
        public boolean isContentTransactionCodePresent () {
            return this.contentTransactionCode != null;
        }
        

        public void setContentTransactionCode (ContentTransactionCode value) {
            this.contentTransactionCode = value;
        }
        
  
        
        public ContentTransactionType getContentTransactionType () {
            return this.contentTransactionType;
        }

        
        public boolean isContentTransactionTypePresent () {
            return this.contentTransactionType != null;
        }
        

        public void setContentTransactionType (ContentTransactionType value) {
            this.contentTransactionType = value;
        }
        
  
        
        public ObjectType getObjectType () {
            return this.objectType;
        }

        
        public boolean isObjectTypePresent () {
            return this.objectType != null;
        }
        

        public void setObjectType (ObjectType value) {
            this.objectType = value;
        }
        
  
        
        public TransactionDescriptionSupp getTransactionDescriptionSupp () {
            return this.transactionDescriptionSupp;
        }

        
        public boolean isTransactionDescriptionSuppPresent () {
            return this.transactionDescriptionSupp != null;
        }
        

        public void setTransactionDescriptionSupp (TransactionDescriptionSupp value) {
            this.transactionDescriptionSupp = value;
        }
        
  
        
        public TransactionShortDescription getTransactionShortDescription () {
            return this.transactionShortDescription;
        }

        
        public boolean isTransactionShortDescriptionPresent () {
            return this.transactionShortDescription != null;
        }
        

        public void setTransactionShortDescription (TransactionShortDescription value) {
            this.transactionShortDescription = value;
        }
        
  
        
        public TransactionDetailDescription getTransactionDetailDescription () {
            return this.transactionDetailDescription;
        }

        
        public boolean isTransactionDetailDescriptionPresent () {
            return this.transactionDetailDescription != null;
        }
        

        public void setTransactionDetailDescription (TransactionDetailDescription value) {
            this.transactionDetailDescription = value;
        }
        
  
        
        public TransactionIdentifier getTransactionIdentifier () {
            return this.transactionIdentifier;
        }

        
        public boolean isTransactionIdentifierPresent () {
            return this.transactionIdentifier != null;
        }
        

        public void setTransactionIdentifier (TransactionIdentifier value) {
            this.transactionIdentifier = value;
        }
        
  
        
        public TransactionAuthCode getTransactionAuthCode () {
            return this.transactionAuthCode;
        }

        
        public boolean isTransactionAuthCodePresent () {
            return this.transactionAuthCode != null;
        }
        

        public void setTransactionAuthCode (TransactionAuthCode value) {
            this.transactionAuthCode = value;
        }
        
  
        
        public DataVolumeIncoming getDataVolumeIncoming () {
            return this.dataVolumeIncoming;
        }

        
        public boolean isDataVolumeIncomingPresent () {
            return this.dataVolumeIncoming != null;
        }
        

        public void setDataVolumeIncoming (DataVolumeIncoming value) {
            this.dataVolumeIncoming = value;
        }
        
  
        
        public DataVolumeOutgoing getDataVolumeOutgoing () {
            return this.dataVolumeOutgoing;
        }

        
        public boolean isDataVolumeOutgoingPresent () {
            return this.dataVolumeOutgoing != null;
        }
        

        public void setDataVolumeOutgoing (DataVolumeOutgoing value) {
            this.dataVolumeOutgoing = value;
        }
        
  
        
        public TotalDataVolume getTotalDataVolume () {
            return this.totalDataVolume;
        }

        
        public boolean isTotalDataVolumePresent () {
            return this.totalDataVolume != null;
        }
        

        public void setTotalDataVolume (TotalDataVolume value) {
            this.totalDataVolume = value;
        }
        
  
        
        public ChargeRefundIndicator getChargeRefundIndicator () {
            return this.chargeRefundIndicator;
        }

        
        public boolean isChargeRefundIndicatorPresent () {
            return this.chargeRefundIndicator != null;
        }
        

        public void setChargeRefundIndicator (ChargeRefundIndicator value) {
            this.chargeRefundIndicator = value;
        }
        
  
        
        public ContentChargingPoint getContentChargingPoint () {
            return this.contentChargingPoint;
        }

        
        public boolean isContentChargingPointPresent () {
            return this.contentChargingPoint != null;
        }
        

        public void setContentChargingPoint (ContentChargingPoint value) {
            this.contentChargingPoint = value;
        }
        
  
        
        public ChargeInformationList getChargeInformationList () {
            return this.chargeInformationList;
        }

        
        public boolean isChargeInformationListPresent () {
            return this.chargeInformationList != null;
        }
        

        public void setChargeInformationList (ChargeInformationList value) {
            this.chargeInformationList = value;
        }
        
  
        
        public AdvisedChargeInformation getAdvisedChargeInformation () {
            return this.advisedChargeInformation;
        }

        
        public boolean isAdvisedChargeInformationPresent () {
            return this.advisedChargeInformation != null;
        }
        

        public void setAdvisedChargeInformation (AdvisedChargeInformation value) {
            this.advisedChargeInformation = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ContentServiceUsedSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ContentServiceUsedSequenceType = CoderFactory.getInstance().newPreparedElementData(ContentServiceUsedSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ContentServiceUsed", isOptional =  false , hasTag =  true, tag = 352, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ContentServiceUsedSequenceType  value;        

        
        
        public ContentServiceUsed () {
        }
        
        
        
        public void setValue(ContentServiceUsedSequenceType value) {
            this.value = value;
        }
        
        
        
        public ContentServiceUsedSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ContentServiceUsed.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            