
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
    @ASN1BoxedType ( name = "Discount" )
    public class Discount implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "Discount", isOptional =  false , hasTag =  true, tag = 412, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private DiscountValue  value;        

        
        
        public Discount () {
        }
        
        
        
        public void setValue(DiscountValue value) {
            this.value = value;
        }
        
        
        
        public DiscountValue getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Discount.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            