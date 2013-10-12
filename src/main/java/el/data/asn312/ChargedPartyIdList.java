
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
    @ASN1BoxedType ( name = "ChargedPartyIdList" )
    public class ChargedPartyIdList implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "ChargedPartyIdList", isSetOf = false ) 

    
        @ASN1Element ( name = "ChargedPartyIdList", isOptional =  false , hasTag =  true, tag = 310, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<ChargedPartyIdentification>   value;        

        
        
        public ChargedPartyIdList () {
        }
        
        
        
        public void setValue(java.util.Collection<ChargedPartyIdentification>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<ChargedPartyIdentification>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ChargedPartyIdList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            