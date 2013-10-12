
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
    @ASN1BoxedType ( name = "NetworkElement" )
    public class NetworkElement implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "NetworkElement" , isSet = false )
       public static class NetworkElementSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "elementType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ElementType elementType = null;
                
  
        @ASN1Element ( name = "elementId", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ElementId elementId = null;
                
  
        
        public ElementType getElementType () {
            return this.elementType;
        }

        
        public boolean isElementTypePresent () {
            return this.elementType != null;
        }
        

        public void setElementType (ElementType value) {
            this.elementType = value;
        }
        
  
        
        public ElementId getElementId () {
            return this.elementId;
        }

        
        public boolean isElementIdPresent () {
            return this.elementId != null;
        }
        

        public void setElementId (ElementId value) {
            this.elementId = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_NetworkElementSequenceType;
        }

       private static IASN1PreparedElementData preparedData_NetworkElementSequenceType = CoderFactory.getInstance().newPreparedElementData(NetworkElementSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "NetworkElement", isOptional =  false , hasTag =  true, tag = 441, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private NetworkElementSequenceType  value;        

        
        
        public NetworkElement () {
        }
        
        
        
        public void setValue(NetworkElementSequenceType value) {
            this.value = value;
        }
        
        
        
        public NetworkElementSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(NetworkElement.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            