
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
    @ASN1BoxedType ( name = "LocationService" )
    public class LocationService implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "LocationService" , isSet = false )
       public static class LocationServiceSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "rapFileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RapFileSequenceNumber rapFileSequenceNumber = null;
                
  
        @ASN1Element ( name = "recEntityCode", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RecEntityCode recEntityCode = null;
                
  
        @ASN1Element ( name = "callReference", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CallReference callReference = null;
                
  
        @ASN1Element ( name = "trackingCustomerInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackingCustomerInformation trackingCustomerInformation = null;
                
  
        @ASN1Element ( name = "lCSSPInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LCSSPInformation lCSSPInformation = null;
                
  
        @ASN1Element ( name = "trackedCustomerInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TrackedCustomerInformation trackedCustomerInformation = null;
                
  
        @ASN1Element ( name = "locationServiceUsage", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LocationServiceUsage locationServiceUsage = null;
                
  
        @ASN1Element ( name = "operatorSpecInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OperatorSpecInfoList operatorSpecInformation = null;
                
  
        
        public RapFileSequenceNumber getRapFileSequenceNumber () {
            return this.rapFileSequenceNumber;
        }

        
        public boolean isRapFileSequenceNumberPresent () {
            return this.rapFileSequenceNumber != null;
        }
        

        public void setRapFileSequenceNumber (RapFileSequenceNumber value) {
            this.rapFileSequenceNumber = value;
        }
        
  
        
        public RecEntityCode getRecEntityCode () {
            return this.recEntityCode;
        }

        
        public boolean isRecEntityCodePresent () {
            return this.recEntityCode != null;
        }
        

        public void setRecEntityCode (RecEntityCode value) {
            this.recEntityCode = value;
        }
        
  
        
        public CallReference getCallReference () {
            return this.callReference;
        }

        
        public boolean isCallReferencePresent () {
            return this.callReference != null;
        }
        

        public void setCallReference (CallReference value) {
            this.callReference = value;
        }
        
  
        
        public TrackingCustomerInformation getTrackingCustomerInformation () {
            return this.trackingCustomerInformation;
        }

        
        public boolean isTrackingCustomerInformationPresent () {
            return this.trackingCustomerInformation != null;
        }
        

        public void setTrackingCustomerInformation (TrackingCustomerInformation value) {
            this.trackingCustomerInformation = value;
        }
        
  
        
        public LCSSPInformation getLCSSPInformation () {
            return this.lCSSPInformation;
        }

        
        public boolean isLCSSPInformationPresent () {
            return this.lCSSPInformation != null;
        }
        

        public void setLCSSPInformation (LCSSPInformation value) {
            this.lCSSPInformation = value;
        }
        
  
        
        public TrackedCustomerInformation getTrackedCustomerInformation () {
            return this.trackedCustomerInformation;
        }

        
        public boolean isTrackedCustomerInformationPresent () {
            return this.trackedCustomerInformation != null;
        }
        

        public void setTrackedCustomerInformation (TrackedCustomerInformation value) {
            this.trackedCustomerInformation = value;
        }
        
  
        
        public LocationServiceUsage getLocationServiceUsage () {
            return this.locationServiceUsage;
        }

        
        public boolean isLocationServiceUsagePresent () {
            return this.locationServiceUsage != null;
        }
        

        public void setLocationServiceUsage (LocationServiceUsage value) {
            this.locationServiceUsage = value;
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
            return preparedData_LocationServiceSequenceType;
        }

       private static IASN1PreparedElementData preparedData_LocationServiceSequenceType = CoderFactory.getInstance().newPreparedElementData(LocationServiceSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "LocationService", isOptional =  false , hasTag =  true, tag = 297, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private LocationServiceSequenceType  value;        

        
        
        public LocationService () {
        }
        
        
        
        public void setValue(LocationServiceSequenceType value) {
            this.value = value;
        }
        
        
        
        public LocationServiceSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LocationService.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            