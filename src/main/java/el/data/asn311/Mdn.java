
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
    @ASN1BoxedType ( name = "Mdn" )
    public class Mdn implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "Mdn", isOptional =  false , hasTag =  true, tag = 253, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private NumberString  value;        

        
        
        public Mdn () {
        }
        
        
        
        public void setValue(NumberString value) {
            this.value = value;
        }
        
        
        
        public NumberString getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Mdn.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            