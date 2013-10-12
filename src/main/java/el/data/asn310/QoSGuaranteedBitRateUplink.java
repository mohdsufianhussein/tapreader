
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
    @ASN1BoxedType ( name = "QoSGuaranteedBitRateUplink" )
    public class QoSGuaranteedBitRateUplink implements IASN1PreparedElement {
                
        @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "QoSGuaranteedBitRateUplink", isOptional =  false , hasTag =  true, tag = 284, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private byte[]  value;        

        
        
        public QoSGuaranteedBitRateUplink () {
        }
        
        
        
        public void setValue(byte[] value) {
            this.value = value;
        }
        
        
        
        public byte[] getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(QoSGuaranteedBitRateUplink.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            