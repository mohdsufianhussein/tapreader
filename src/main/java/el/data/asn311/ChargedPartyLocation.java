
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
    @ASN1BoxedType ( name = "ChargedPartyLocation" )
    public class ChargedPartyLocation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ChargedPartyLocation" , isSet = false )
       public static class ChargedPartyLocationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "locationIdType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LocationIdType locationIdType = null;
                
  
        @ASN1Element ( name = "locationIdentifier", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LocationIdentifier locationIdentifier = null;
                
  
        
        public LocationIdType getLocationIdType () {
            return this.locationIdType;
        }

        
        public boolean isLocationIdTypePresent () {
            return this.locationIdType != null;
        }
        

        public void setLocationIdType (LocationIdType value) {
            this.locationIdType = value;
        }
        
  
        
        public LocationIdentifier getLocationIdentifier () {
            return this.locationIdentifier;
        }

        
        public boolean isLocationIdentifierPresent () {
            return this.locationIdentifier != null;
        }
        

        public void setLocationIdentifier (LocationIdentifier value) {
            this.locationIdentifier = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ChargedPartyLocationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ChargedPartyLocationSequenceType = CoderFactory.getInstance().newPreparedElementData(ChargedPartyLocationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ChargedPartyLocation", isOptional =  false , hasTag =  true, tag = 320, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ChargedPartyLocationSequenceType  value;        

        
        
        public ChargedPartyLocation () {
        }
        
        
        
        public void setValue(ChargedPartyLocationSequenceType value) {
            this.value = value;
        }
        
        
        
        public ChargedPartyLocationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ChargedPartyLocation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            