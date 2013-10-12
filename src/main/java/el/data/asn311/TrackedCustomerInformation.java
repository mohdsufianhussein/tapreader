
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
    @ASN1BoxedType ( name = "TrackedCustomerInformation" )
    public class TrackedCustomerInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "TrackedCustomerInformation" , isSet = false )
       public static class TrackedCustomerInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "trackedCustomerIdList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackedCustomerIdList trackedCustomerIdList = null;
                
  
        @ASN1Element ( name = "trackedCustomerHomeIdList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackedCustomerHomeIdList trackedCustomerHomeIdList = null;
                
  
        @ASN1Element ( name = "trackedCustomerLocList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackedCustomerLocList trackedCustomerLocList = null;
                
  
        @ASN1Element ( name = "trackedCustomerEquipment", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackedCustomerEquipment trackedCustomerEquipment = null;
                
  
        
        public TrackedCustomerIdList getTrackedCustomerIdList () {
            return this.trackedCustomerIdList;
        }

        
        public boolean isTrackedCustomerIdListPresent () {
            return this.trackedCustomerIdList != null;
        }
        

        public void setTrackedCustomerIdList (TrackedCustomerIdList value) {
            this.trackedCustomerIdList = value;
        }
        
  
        
        public TrackedCustomerHomeIdList getTrackedCustomerHomeIdList () {
            return this.trackedCustomerHomeIdList;
        }

        
        public boolean isTrackedCustomerHomeIdListPresent () {
            return this.trackedCustomerHomeIdList != null;
        }
        

        public void setTrackedCustomerHomeIdList (TrackedCustomerHomeIdList value) {
            this.trackedCustomerHomeIdList = value;
        }
        
  
        
        public TrackedCustomerLocList getTrackedCustomerLocList () {
            return this.trackedCustomerLocList;
        }

        
        public boolean isTrackedCustomerLocListPresent () {
            return this.trackedCustomerLocList != null;
        }
        

        public void setTrackedCustomerLocList (TrackedCustomerLocList value) {
            this.trackedCustomerLocList = value;
        }
        
  
        
        public TrackedCustomerEquipment getTrackedCustomerEquipment () {
            return this.trackedCustomerEquipment;
        }

        
        public boolean isTrackedCustomerEquipmentPresent () {
            return this.trackedCustomerEquipment != null;
        }
        

        public void setTrackedCustomerEquipment (TrackedCustomerEquipment value) {
            this.trackedCustomerEquipment = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_TrackedCustomerInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_TrackedCustomerInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(TrackedCustomerInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "TrackedCustomerInformation", isOptional =  false , hasTag =  true, tag = 367, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private TrackedCustomerInformationSequenceType  value;        

        
        
        public TrackedCustomerInformation () {
        }
        
        
        
        public void setValue(TrackedCustomerInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public TrackedCustomerInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TrackedCustomerInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            