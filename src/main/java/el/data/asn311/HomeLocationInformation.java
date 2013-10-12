
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
    @ASN1BoxedType ( name = "HomeLocationInformation" )
    public class HomeLocationInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "HomeLocationInformation" , isSet = false )
       public static class HomeLocationInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "homeBid", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private HomeBid homeBid = null;
                
  
        @ASN1Element ( name = "homeLocationDescription", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private HomeLocationDescription homeLocationDescription = null;
                
  
        
        public HomeBid getHomeBid () {
            return this.homeBid;
        }

        
        public boolean isHomeBidPresent () {
            return this.homeBid != null;
        }
        

        public void setHomeBid (HomeBid value) {
            this.homeBid = value;
        }
        
  
        
        public HomeLocationDescription getHomeLocationDescription () {
            return this.homeLocationDescription;
        }

        
        public boolean isHomeLocationDescriptionPresent () {
            return this.homeLocationDescription != null;
        }
        

        public void setHomeLocationDescription (HomeLocationDescription value) {
            this.homeLocationDescription = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_HomeLocationInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_HomeLocationInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(HomeLocationInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "HomeLocationInformation", isOptional =  false , hasTag =  true, tag = 123, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private HomeLocationInformationSequenceType  value;        

        
        
        public HomeLocationInformation () {
        }
        
        
        
        public void setValue(HomeLocationInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public HomeLocationInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(HomeLocationInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            