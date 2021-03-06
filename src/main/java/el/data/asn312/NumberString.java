
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
    @ASN1BoxedType ( name = "NumberString" )
    public class NumberString implements IASN1PreparedElement {
    
            @ASN1OctetString( name = "NumberString" )
            
            private byte[] value = null;
            
            public NumberString() {
            }

            public NumberString(byte[] value) {
                this.value = value;
            }

            public NumberString(BitString value) {
                setValue(value);
            }
            
            public void setValue(byte[] value) {
                this.value = value;
            }

            public void setValue(BitString btStr) {
                this.value = btStr.getValue();
            }
            
            public byte[] getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(NumberString.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            