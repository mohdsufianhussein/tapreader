
package el.data.asn311;
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
    @ASN1BoxedType ( name = "Sender" )
    public class Sender implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "Sender", isOptional =  false , hasTag =  true, tag = 196, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private PlmnId  value;        

        
        
        public Sender () {
        }
        
        
        
        public void setValue(PlmnId value) {
            this.value = value;
        }
        
        
        
        public PlmnId getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Sender.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            