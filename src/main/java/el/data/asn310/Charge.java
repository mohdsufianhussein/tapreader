
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
    @ASN1BoxedType ( name = "Charge" )
    public class Charge implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "Charge", isOptional =  false , hasTag =  true, tag = 62, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AbsoluteAmount  value;        

        
        
        public Charge () {
        }
        
        
        
        public void setValue(AbsoluteAmount value) {
            this.value = value;
        }
        
        
        
        public AbsoluteAmount getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Charge.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            