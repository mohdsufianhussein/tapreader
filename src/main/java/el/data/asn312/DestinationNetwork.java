
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
    @ASN1BoxedType ( name = "DestinationNetwork" )
    public class DestinationNetwork implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "DestinationNetwork", isOptional =  false , hasTag =  true, tag = 90, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private NetworkId  value;        

        
        
        public DestinationNetwork () {
        }
        
        
        
        public void setValue(NetworkId value) {
            this.value = value;
        }
        
        
        
        public NetworkId getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DestinationNetwork.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            