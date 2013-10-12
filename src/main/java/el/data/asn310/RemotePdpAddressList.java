
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
    @ASN1BoxedType ( name = "RemotePdpAddressList" )
    public class RemotePdpAddressList implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "RemotePdpAddressList", isSetOf = false ) 

    
        @ASN1Element ( name = "RemotePdpAddressList", isOptional =  false , hasTag =  true, tag = 190, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<PacketDataProtocolAddress>   value;        

        
        
        public RemotePdpAddressList () {
        }
        
        
        
        public void setValue(java.util.Collection<PacketDataProtocolAddress>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<PacketDataProtocolAddress>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(RemotePdpAddressList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            