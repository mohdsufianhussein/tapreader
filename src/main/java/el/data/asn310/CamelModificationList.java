
package el.data.asn310;
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
    @ASN1BoxedType ( name = "CamelModificationList" )
    public class CamelModificationList implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "CamelModificationList", isSetOf = false ) 

    
        @ASN1Element ( name = "CamelModificationList", isOptional =  false , hasTag =  true, tag = 54, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<CamelModification>   value;        

        
        
        public CamelModificationList () {
        }
        
        
        
        public void setValue(java.util.Collection<CamelModification>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<CamelModification>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(CamelModificationList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            