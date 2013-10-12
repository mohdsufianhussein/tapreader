
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
    @ASN1BoxedType ( name = "Notification" )
    public class Notification implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "Notification" , isSet = false )
       public static class NotificationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "sender", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Sender sender = null;
                
  
        @ASN1Element ( name = "recipient", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Recipient recipient = null;
                
  
        @ASN1Element ( name = "fileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private FileSequenceNumber fileSequenceNumber = null;
                
  
        @ASN1Element ( name = "rapFileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RapFileSequenceNumber rapFileSequenceNumber = null;
                
  
        @ASN1Element ( name = "fileCreationTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private FileCreationTimeStamp fileCreationTimeStamp = null;
                
  
        @ASN1Element ( name = "fileAvailableTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private FileAvailableTimeStamp fileAvailableTimeStamp = null;
                
  
        @ASN1Element ( name = "transferCutOffTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TransferCutOffTimeStamp transferCutOffTimeStamp = null;
                
  
        @ASN1Element ( name = "specificationVersionNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private SpecificationVersionNumber specificationVersionNumber = null;
                
  
        @ASN1Element ( name = "releaseVersionNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ReleaseVersionNumber releaseVersionNumber = null;
                
  
        @ASN1Element ( name = "fileTypeIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private FileTypeIndicator fileTypeIndicator = null;
                
  
        @ASN1Element ( name = "operatorSpecInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OperatorSpecInfoList operatorSpecInformation = null;
                
  
        
        public Sender getSender () {
            return this.sender;
        }

        
        public boolean isSenderPresent () {
            return this.sender != null;
        }
        

        public void setSender (Sender value) {
            this.sender = value;
        }
        
  
        
        public Recipient getRecipient () {
            return this.recipient;
        }

        
        public boolean isRecipientPresent () {
            return this.recipient != null;
        }
        

        public void setRecipient (Recipient value) {
            this.recipient = value;
        }
        
  
        
        public FileSequenceNumber getFileSequenceNumber () {
            return this.fileSequenceNumber;
        }

        
        public boolean isFileSequenceNumberPresent () {
            return this.fileSequenceNumber != null;
        }
        

        public void setFileSequenceNumber (FileSequenceNumber value) {
            this.fileSequenceNumber = value;
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
        
  
        
        public FileCreationTimeStamp getFileCreationTimeStamp () {
            return this.fileCreationTimeStamp;
        }

        
        public boolean isFileCreationTimeStampPresent () {
            return this.fileCreationTimeStamp != null;
        }
        

        public void setFileCreationTimeStamp (FileCreationTimeStamp value) {
            this.fileCreationTimeStamp = value;
        }
        
  
        
        public FileAvailableTimeStamp getFileAvailableTimeStamp () {
            return this.fileAvailableTimeStamp;
        }

        
        public boolean isFileAvailableTimeStampPresent () {
            return this.fileAvailableTimeStamp != null;
        }
        

        public void setFileAvailableTimeStamp (FileAvailableTimeStamp value) {
            this.fileAvailableTimeStamp = value;
        }
        
  
        
        public TransferCutOffTimeStamp getTransferCutOffTimeStamp () {
            return this.transferCutOffTimeStamp;
        }

        
        public boolean isTransferCutOffTimeStampPresent () {
            return this.transferCutOffTimeStamp != null;
        }
        

        public void setTransferCutOffTimeStamp (TransferCutOffTimeStamp value) {
            this.transferCutOffTimeStamp = value;
        }
        
  
        
        public SpecificationVersionNumber getSpecificationVersionNumber () {
            return this.specificationVersionNumber;
        }

        
        public boolean isSpecificationVersionNumberPresent () {
            return this.specificationVersionNumber != null;
        }
        

        public void setSpecificationVersionNumber (SpecificationVersionNumber value) {
            this.specificationVersionNumber = value;
        }
        
  
        
        public ReleaseVersionNumber getReleaseVersionNumber () {
            return this.releaseVersionNumber;
        }

        
        public boolean isReleaseVersionNumberPresent () {
            return this.releaseVersionNumber != null;
        }
        

        public void setReleaseVersionNumber (ReleaseVersionNumber value) {
            this.releaseVersionNumber = value;
        }
        
  
        
        public FileTypeIndicator getFileTypeIndicator () {
            return this.fileTypeIndicator;
        }

        
        public boolean isFileTypeIndicatorPresent () {
            return this.fileTypeIndicator != null;
        }
        

        public void setFileTypeIndicator (FileTypeIndicator value) {
            this.fileTypeIndicator = value;
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
            return preparedData_NotificationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_NotificationSequenceType = CoderFactory.getInstance().newPreparedElementData(NotificationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "Notification", isOptional =  false , hasTag =  true, tag = 2, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private NotificationSequenceType  value;        

        
        
        public Notification () {
        }
        
        
        
        public void setValue(NotificationSequenceType value) {
            this.value = value;
        }
        
        
        
        public NotificationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Notification.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            