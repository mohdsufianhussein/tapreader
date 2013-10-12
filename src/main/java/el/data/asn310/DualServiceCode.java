
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
    @ASN1Choice ( name = "DualServiceCode" )
    public class DualServiceCode implements IASN1PreparedElement {
            
        @ASN1Element ( name = "dualTeleServiceCode", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private DualTeleServiceCode dualTeleServiceCode = null;
                
  
        @ASN1Element ( name = "dualBearerServiceCode", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private DualBearerServiceCode dualBearerServiceCode = null;
                
  
        
        public DualTeleServiceCode getDualTeleServiceCode () {
            return this.dualTeleServiceCode;
        }

        public boolean isDualTeleServiceCodeSelected () {
            return this.dualTeleServiceCode != null;
        }

        private void setDualTeleServiceCode (DualTeleServiceCode value) {
            this.dualTeleServiceCode = value;
        }

        
        public void selectDualTeleServiceCode (DualTeleServiceCode value) {
            this.dualTeleServiceCode = value;
            
                    setDualBearerServiceCode(null);
                            
        }

        
  
        
        public DualBearerServiceCode getDualBearerServiceCode () {
            return this.dualBearerServiceCode;
        }

        public boolean isDualBearerServiceCodeSelected () {
            return this.dualBearerServiceCode != null;
        }

        private void setDualBearerServiceCode (DualBearerServiceCode value) {
            this.dualBearerServiceCode = value;
        }

        
        public void selectDualBearerServiceCode (DualBearerServiceCode value) {
            this.dualBearerServiceCode = value;
            
                    setDualTeleServiceCode(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DualServiceCode.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            