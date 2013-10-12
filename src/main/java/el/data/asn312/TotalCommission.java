
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
    @ASN1BoxedType ( name = "TotalCommission" )
    public class TotalCommission implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "TotalCommission", isOptional =  false , hasTag =  true, tag = 358, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AbsoluteAmount  value;        

        
        
        public TotalCommission () {
        }
        
        
        
        public void setValue(AbsoluteAmount value) {
            this.value = value;
        }
        
        
        
        public AbsoluteAmount getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TotalCommission.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            