
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
    @ASN1BoxedType ( name = "Destination" )
    public class Destination implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "Destination" , isSet = false )
       public static class DestinationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "calledNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CalledNumber calledNumber = null;
                
  
        @ASN1Element ( name = "dialledDigits", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DialledDigits dialledDigits = null;
                
  
        @ASN1Element ( name = "calledPlace", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CalledPlace calledPlace = null;
                
  
        @ASN1Element ( name = "calledRegion", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CalledRegion calledRegion = null;
                
  
        @ASN1Element ( name = "sMSDestinationNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private SMSDestinationNumber sMSDestinationNumber = null;
                
  
        
        public CalledNumber getCalledNumber () {
            return this.calledNumber;
        }

        
        public boolean isCalledNumberPresent () {
            return this.calledNumber != null;
        }
        

        public void setCalledNumber (CalledNumber value) {
            this.calledNumber = value;
        }
        
  
        
        public DialledDigits getDialledDigits () {
            return this.dialledDigits;
        }

        
        public boolean isDialledDigitsPresent () {
            return this.dialledDigits != null;
        }
        

        public void setDialledDigits (DialledDigits value) {
            this.dialledDigits = value;
        }
        
  
        
        public CalledPlace getCalledPlace () {
            return this.calledPlace;
        }

        
        public boolean isCalledPlacePresent () {
            return this.calledPlace != null;
        }
        

        public void setCalledPlace (CalledPlace value) {
            this.calledPlace = value;
        }
        
  
        
        public CalledRegion getCalledRegion () {
            return this.calledRegion;
        }

        
        public boolean isCalledRegionPresent () {
            return this.calledRegion != null;
        }
        

        public void setCalledRegion (CalledRegion value) {
            this.calledRegion = value;
        }
        
  
        
        public SMSDestinationNumber getSMSDestinationNumber () {
            return this.sMSDestinationNumber;
        }

        
        public boolean isSMSDestinationNumberPresent () {
            return this.sMSDestinationNumber != null;
        }
        

        public void setSMSDestinationNumber (SMSDestinationNumber value) {
            this.sMSDestinationNumber = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_DestinationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_DestinationSequenceType = CoderFactory.getInstance().newPreparedElementData(DestinationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "Destination", isOptional =  false , hasTag =  true, tag = 89, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private DestinationSequenceType  value;        

        
        
        public Destination () {
        }
        
        
        
        public void setValue(DestinationSequenceType value) {
            this.value = value;
        }
        
        
        
        public DestinationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Destination.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            