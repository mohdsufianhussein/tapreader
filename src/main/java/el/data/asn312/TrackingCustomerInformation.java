
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
    @ASN1BoxedType ( name = "TrackingCustomerInformation" )
    public class TrackingCustomerInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "TrackingCustomerInformation" , isSet = false )
       public static class TrackingCustomerInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "trackingCustomerIdList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackingCustomerIdList trackingCustomerIdList = null;
                
  
        @ASN1Element ( name = "trackingCustomerHomeIdList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackingCustomerHomeIdList trackingCustomerHomeIdList = null;
                
  
        @ASN1Element ( name = "trackingCustomerLocList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackingCustomerLocList trackingCustomerLocList = null;
                
  
        @ASN1Element ( name = "trackingCustomerEquipment", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackingCustomerEquipment trackingCustomerEquipment = null;
                
  
        
        public TrackingCustomerIdList getTrackingCustomerIdList () {
            return this.trackingCustomerIdList;
        }

        
        public boolean isTrackingCustomerIdListPresent () {
            return this.trackingCustomerIdList != null;
        }
        

        public void setTrackingCustomerIdList (TrackingCustomerIdList value) {
            this.trackingCustomerIdList = value;
        }
        
  
        
        public TrackingCustomerHomeIdList getTrackingCustomerHomeIdList () {
            return this.trackingCustomerHomeIdList;
        }

        
        public boolean isTrackingCustomerHomeIdListPresent () {
            return this.trackingCustomerHomeIdList != null;
        }
        

        public void setTrackingCustomerHomeIdList (TrackingCustomerHomeIdList value) {
            this.trackingCustomerHomeIdList = value;
        }
        
  
        
        public TrackingCustomerLocList getTrackingCustomerLocList () {
            return this.trackingCustomerLocList;
        }

        
        public boolean isTrackingCustomerLocListPresent () {
            return this.trackingCustomerLocList != null;
        }
        

        public void setTrackingCustomerLocList (TrackingCustomerLocList value) {
            this.trackingCustomerLocList = value;
        }
        
  
        
        public TrackingCustomerEquipment getTrackingCustomerEquipment () {
            return this.trackingCustomerEquipment;
        }

        
        public boolean isTrackingCustomerEquipmentPresent () {
            return this.trackingCustomerEquipment != null;
        }
        

        public void setTrackingCustomerEquipment (TrackingCustomerEquipment value) {
            this.trackingCustomerEquipment = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_TrackingCustomerInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_TrackingCustomerInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(TrackingCustomerInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "TrackingCustomerInformation", isOptional =  false , hasTag =  true, tag = 298, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private TrackingCustomerInformationSequenceType  value;        

        
        
        public TrackingCustomerInformation () {
        }
        
        
        
        public void setValue(TrackingCustomerInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public TrackingCustomerInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TrackingCustomerInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            