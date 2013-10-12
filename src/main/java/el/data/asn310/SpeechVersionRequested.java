
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
    @ASN1BoxedType ( name = "SpeechVersionRequested" )
    public class SpeechVersionRequested implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "SpeechVersionRequested", isOptional =  false , hasTag =  true, tag = 202, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private SpeechVersion  value;        

        
        
        public SpeechVersionRequested () {
        }
        
        
        
        public void setValue(SpeechVersion value) {
            this.value = value;
        }
        
        
        
        public SpeechVersion getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(SpeechVersionRequested.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            