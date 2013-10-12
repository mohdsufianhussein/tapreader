
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
    @ASN1Choice ( name = "ScuVasChargeableSubscriber" )
    public class ScuVasChargeableSubscriber implements IASN1PreparedElement {
            
        @ASN1Element ( name = "gsmChargeableSubscriber", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private GsmChargeableSubscriber gsmChargeableSubscriber = null;
                
  
        @ASN1Element ( name = "minChargeableSubscriber", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private MinChargeableSubscriber minChargeableSubscriber = null;
                
  
        
        public GsmChargeableSubscriber getGsmChargeableSubscriber () {
            return this.gsmChargeableSubscriber;
        }

        public boolean isGsmChargeableSubscriberSelected () {
            return this.gsmChargeableSubscriber != null;
        }

        private void setGsmChargeableSubscriber (GsmChargeableSubscriber value) {
            this.gsmChargeableSubscriber = value;
        }

        
        public void selectGsmChargeableSubscriber (GsmChargeableSubscriber value) {
            this.gsmChargeableSubscriber = value;
            
                    setMinChargeableSubscriber(null);
                            
        }

        
  
        
        public MinChargeableSubscriber getMinChargeableSubscriber () {
            return this.minChargeableSubscriber;
        }

        public boolean isMinChargeableSubscriberSelected () {
            return this.minChargeableSubscriber != null;
        }

        private void setMinChargeableSubscriber (MinChargeableSubscriber value) {
            this.minChargeableSubscriber = value;
        }

        
        public void selectMinChargeableSubscriber (MinChargeableSubscriber value) {
            this.minChargeableSubscriber = value;
            
                    setGsmChargeableSubscriber(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ScuVasChargeableSubscriber.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            