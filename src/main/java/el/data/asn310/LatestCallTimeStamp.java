
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
    @ASN1BoxedType ( name = "LatestCallTimeStamp" )
    public class LatestCallTimeStamp implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "LatestCallTimeStamp", isOptional =  false , hasTag =  true, tag = 133, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private DateTimeLong  value;        

        
        
        public LatestCallTimeStamp () {
        }
        
        
        
        public void setValue(DateTimeLong value) {
            this.value = value;
        }
        
        
        
        public DateTimeLong getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LatestCallTimeStamp.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            