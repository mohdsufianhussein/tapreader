
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
    @ASN1BoxedType ( name = "SessionChargeInfoList" )
    public class SessionChargeInfoList implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "SessionChargeInfoList", isSetOf = false ) 

    
        @ASN1Element ( name = "SessionChargeInfoList", isOptional =  false , hasTag =  true, tag = 448, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<SessionChargeInformation>   value;        

        
        
        public SessionChargeInfoList () {
        }
        
        
        
        public void setValue(java.util.Collection<SessionChargeInformation>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<SessionChargeInformation>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(SessionChargeInfoList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            