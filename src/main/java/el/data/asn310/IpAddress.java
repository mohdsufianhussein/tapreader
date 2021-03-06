
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
    @ASN1Choice ( name = "IpAddress" )
    public class IpAddress implements IASN1PreparedElement {
            
        @ASN1Element ( name = "iPTextV4Address", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private IPTextV4Address iPTextV4Address = null;
                
  
        @ASN1Element ( name = "iPTextV6Address", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private IPTextV6Address iPTextV6Address = null;
                
  
        
        public IPTextV4Address getIPTextV4Address () {
            return this.iPTextV4Address;
        }

        public boolean isIPTextV4AddressSelected () {
            return this.iPTextV4Address != null;
        }

        private void setIPTextV4Address (IPTextV4Address value) {
            this.iPTextV4Address = value;
        }

        
        public void selectIPTextV4Address (IPTextV4Address value) {
            this.iPTextV4Address = value;
            
                    setIPTextV6Address(null);
                            
        }

        
  
        
        public IPTextV6Address getIPTextV6Address () {
            return this.iPTextV6Address;
        }

        public boolean isIPTextV6AddressSelected () {
            return this.iPTextV6Address != null;
        }

        private void setIPTextV6Address (IPTextV6Address value) {
            this.iPTextV6Address = value;
        }

        
        public void selectIPTextV6Address (IPTextV6Address value) {
            this.iPTextV6Address = value;
            
                    setIPTextV4Address(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(IpAddress.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            