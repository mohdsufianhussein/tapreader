
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
    @ASN1BoxedType ( name = "TrackingCustomerLocList" )
    public class TrackingCustomerLocList implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "TrackingCustomerLocList", isSetOf = false ) 

    
        @ASN1Element ( name = "TrackingCustomerLocList", isOptional =  false , hasTag =  true, tag = 368, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<TrackingCustomerLocation>   value;        

        
        
        public TrackingCustomerLocList () {
        }
        
        
        
        public void setValue(java.util.Collection<TrackingCustomerLocation>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<TrackingCustomerLocation>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TrackingCustomerLocList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            