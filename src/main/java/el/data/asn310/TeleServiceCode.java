
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
    @ASN1BoxedType ( name = "TeleServiceCode" )
    public class TeleServiceCode implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "TeleServiceCode", isOptional =  false , hasTag =  true, tag = 218, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private HexString  value;        

        
        
        public TeleServiceCode () {
        }
        
        
        
        public void setValue(HexString value) {
            this.value = value;
        }
        
        
        
        public HexString getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TeleServiceCode.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            