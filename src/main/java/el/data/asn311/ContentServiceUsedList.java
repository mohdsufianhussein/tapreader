
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
    @ASN1BoxedType ( name = "ContentServiceUsedList" )
    public class ContentServiceUsedList implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "ContentServiceUsedList", isSetOf = false ) 

    
        @ASN1Element ( name = "ContentServiceUsedList", isOptional =  false , hasTag =  true, tag = 285, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<ContentServiceUsed>   value;        

        
        
        public ContentServiceUsedList () {
        }
        
        
        
        public void setValue(java.util.Collection<ContentServiceUsed>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<ContentServiceUsed>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ContentServiceUsedList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            