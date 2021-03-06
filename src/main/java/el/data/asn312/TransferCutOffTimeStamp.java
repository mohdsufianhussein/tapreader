
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
    @ASN1BoxedType ( name = "TransferCutOffTimeStamp" )
    public class TransferCutOffTimeStamp implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "TransferCutOffTimeStamp", isOptional =  false , hasTag =  true, tag = 227, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private DateTimeLong  value;        

        
        
        public TransferCutOffTimeStamp () {
        }
        
        
        
        public void setValue(DateTimeLong value) {
            this.value = value;
        }
        
        
        
        public DateTimeLong getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TransferCutOffTimeStamp.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            