
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
    @ASN1BoxedType ( name = "ThreeGcamelDestination" )
    public class ThreeGcamelDestination implements IASN1PreparedElement {
                
        
        
    @ASN1PreparedElement
    @ASN1Choice ( name = "ThreeGcamelDestination" )
    public static class ThreeGcamelDestinationChoiceType implements IASN1PreparedElement {
            
        @ASN1Element ( name = "camelDestinationNumber", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private CamelDestinationNumber camelDestinationNumber = null;
                
  
        @ASN1Element ( name = "gprsDestination", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private GprsDestination gprsDestination = null;
                
  
        
        public CamelDestinationNumber getCamelDestinationNumber () {
            return this.camelDestinationNumber;
        }

        public boolean isCamelDestinationNumberSelected () {
            return this.camelDestinationNumber != null;
        }

        private void setCamelDestinationNumber (CamelDestinationNumber value) {
            this.camelDestinationNumber = value;
        }

        
        public void selectCamelDestinationNumber (CamelDestinationNumber value) {
            this.camelDestinationNumber = value;
            
                    setGprsDestination(null);
                            
        }

        
  
        
        public GprsDestination getGprsDestination () {
            return this.gprsDestination;
        }

        public boolean isGprsDestinationSelected () {
            return this.gprsDestination != null;
        }

        private void setGprsDestination (GprsDestination value) {
            this.gprsDestination = value;
        }

        
        public void selectGprsDestination (GprsDestination value) {
            this.gprsDestination = value;
            
                    setCamelDestinationNumber(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ThreeGcamelDestinationChoiceType;
        }

        private static IASN1PreparedElementData preparedData_ThreeGcamelDestinationChoiceType = CoderFactory.getInstance().newPreparedElementData(ThreeGcamelDestinationChoiceType.class);

    }

                
        @ASN1Element ( name = "ThreeGcamelDestination", isOptional =  false , hasTag =  true, tag = 431, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ThreeGcamelDestinationChoiceType  value;        

        
        
        public ThreeGcamelDestination () {
        }
        
        
        
        public void setValue(ThreeGcamelDestinationChoiceType value) {
            this.value = value;
        }
        
        
        
        public ThreeGcamelDestinationChoiceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ThreeGcamelDestination.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            