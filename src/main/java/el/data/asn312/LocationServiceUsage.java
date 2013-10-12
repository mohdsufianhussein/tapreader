
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
    @ASN1BoxedType ( name = "LocationServiceUsage" )
    public class LocationServiceUsage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "LocationServiceUsage" , isSet = false )
       public static class LocationServiceUsageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "lCSQosRequested", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LCSQosRequested lCSQosRequested = null;
                
  
        @ASN1Element ( name = "lCSQosDelivered", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LCSQosDelivered lCSQosDelivered = null;
                
  
        @ASN1Element ( name = "chargingTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargingTimeStamp chargingTimeStamp = null;
                
  
        @ASN1Element ( name = "chargeInformationList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeInformationList chargeInformationList = null;
                
  
        
        public LCSQosRequested getLCSQosRequested () {
            return this.lCSQosRequested;
        }

        
        public boolean isLCSQosRequestedPresent () {
            return this.lCSQosRequested != null;
        }
        

        public void setLCSQosRequested (LCSQosRequested value) {
            this.lCSQosRequested = value;
        }
        
  
        
        public LCSQosDelivered getLCSQosDelivered () {
            return this.lCSQosDelivered;
        }

        
        public boolean isLCSQosDeliveredPresent () {
            return this.lCSQosDelivered != null;
        }
        

        public void setLCSQosDelivered (LCSQosDelivered value) {
            this.lCSQosDelivered = value;
        }
        
  
        
        public ChargingTimeStamp getChargingTimeStamp () {
            return this.chargingTimeStamp;
        }

        
        public boolean isChargingTimeStampPresent () {
            return this.chargingTimeStamp != null;
        }
        

        public void setChargingTimeStamp (ChargingTimeStamp value) {
            this.chargingTimeStamp = value;
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
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_LocationServiceUsageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_LocationServiceUsageSequenceType = CoderFactory.getInstance().newPreparedElementData(LocationServiceUsageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "LocationServiceUsage", isOptional =  false , hasTag =  true, tag = 382, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private LocationServiceUsageSequenceType  value;        

        
        
        public LocationServiceUsage () {
        }
        
        
        
        public void setValue(LocationServiceUsageSequenceType value) {
            this.value = value;
        }
        
        
        
        public LocationServiceUsageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LocationServiceUsage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            