
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
    @ASN1BoxedType ( name = "CalledRegion" )
    public class CalledRegion implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "CalledRegion", isOptional =  false , hasTag =  true, tag = 46, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AsciiString  value;        

        
        
        public CalledRegion () {
        }
        
        
        
        public void setValue(AsciiString value) {
            this.value = value;
        }
        
        
        
        public AsciiString getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(CalledRegion.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            