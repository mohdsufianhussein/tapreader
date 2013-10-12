
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
    @ASN1BoxedType ( name = "BasicServiceCode" )
    public class BasicServiceCode implements IASN1PreparedElement {
                
        
        
    @ASN1PreparedElement
    @ASN1Choice ( name = "BasicServiceCode" )
    public static class BasicServiceCodeChoiceType implements IASN1PreparedElement {
            
        @ASN1Element ( name = "teleServiceCode", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private TeleServiceCode teleServiceCode = null;
                
  
        @ASN1Element ( name = "bearerServiceCode", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private BearerServiceCode bearerServiceCode = null;
                
  
        
        public TeleServiceCode getTeleServiceCode () {
            return this.teleServiceCode;
        }

        public boolean isTeleServiceCodeSelected () {
            return this.teleServiceCode != null;
        }

        private void setTeleServiceCode (TeleServiceCode value) {
            this.teleServiceCode = value;
        }

        
        public void selectTeleServiceCode (TeleServiceCode value) {
            this.teleServiceCode = value;
            
                    setBearerServiceCode(null);
                            
        }

        
  
        
        public BearerServiceCode getBearerServiceCode () {
            return this.bearerServiceCode;
        }

        public boolean isBearerServiceCodeSelected () {
            return this.bearerServiceCode != null;
        }

        private void setBearerServiceCode (BearerServiceCode value) {
            this.bearerServiceCode = value;
        }

        
        public void selectBearerServiceCode (BearerServiceCode value) {
            this.bearerServiceCode = value;
            
                    setTeleServiceCode(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_BasicServiceCodeChoiceType;
        }

        private static IASN1PreparedElementData preparedData_BasicServiceCodeChoiceType = CoderFactory.getInstance().newPreparedElementData(BasicServiceCodeChoiceType.class);

    }

                
        @ASN1Element ( name = "BasicServiceCode", isOptional =  false , hasTag =  true, tag = 426, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private BasicServiceCodeChoiceType  value;        

        
        
        public BasicServiceCode () {
        }
        
        
        
        public void setValue(BasicServiceCodeChoiceType value) {
            this.value = value;
        }
        
        
        
        public BasicServiceCodeChoiceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(BasicServiceCode.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            