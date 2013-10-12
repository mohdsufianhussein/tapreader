
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
    @ASN1BoxedType ( name = "DepositTimeStamp" )
    public class DepositTimeStamp implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "DepositTimeStamp", isOptional =  false , hasTag =  true, tag = 88, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private DateTime  value;        

        
        
        public DepositTimeStamp () {
        }
        
        
        
        public void setValue(DateTime value) {
            this.value = value;
        }
        
        
        
        public DateTime getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DepositTimeStamp.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            