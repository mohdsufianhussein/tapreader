
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
    @ASN1BoxedType ( name = "NetworkInfo" )
    public class NetworkInfo implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "NetworkInfo" , isSet = false )
       public static class NetworkInfoSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "utcTimeOffsetInfo", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private UtcTimeOffsetInfoList utcTimeOffsetInfo = null;
                
  
        @ASN1Element ( name = "recEntityInfo", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RecEntityInfoList recEntityInfo = null;
                
  
        
        public UtcTimeOffsetInfoList getUtcTimeOffsetInfo () {
            return this.utcTimeOffsetInfo;
        }

        
        public boolean isUtcTimeOffsetInfoPresent () {
            return this.utcTimeOffsetInfo != null;
        }
        

        public void setUtcTimeOffsetInfo (UtcTimeOffsetInfoList value) {
            this.utcTimeOffsetInfo = value;
        }
        
  
        
        public RecEntityInfoList getRecEntityInfo () {
            return this.recEntityInfo;
        }

        
        public boolean isRecEntityInfoPresent () {
            return this.recEntityInfo != null;
        }
        

        public void setRecEntityInfo (RecEntityInfoList value) {
            this.recEntityInfo = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_NetworkInfoSequenceType;
        }

       private static IASN1PreparedElementData preparedData_NetworkInfoSequenceType = CoderFactory.getInstance().newPreparedElementData(NetworkInfoSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "NetworkInfo", isOptional =  false , hasTag =  true, tag = 6, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private NetworkInfoSequenceType  value;        

        
        
        public NetworkInfo () {
        }
        
        
        
        public void setValue(NetworkInfoSequenceType value) {
            this.value = value;
        }
        
        
        
        public NetworkInfoSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(NetworkInfo.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            