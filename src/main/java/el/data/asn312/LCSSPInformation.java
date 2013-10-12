
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
    @ASN1BoxedType ( name = "LCSSPInformation" )
    public class LCSSPInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "LCSSPInformation" , isSet = false )
       public static class LCSSPInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "lCSSPIdentificationList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LCSSPIdentificationList lCSSPIdentificationList = null;
                
  
        @ASN1Element ( name = "iSPList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ISPList iSPList = null;
                
  
        @ASN1Element ( name = "networkList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private NetworkList networkList = null;
                
  
        
        public LCSSPIdentificationList getLCSSPIdentificationList () {
            return this.lCSSPIdentificationList;
        }

        
        public boolean isLCSSPIdentificationListPresent () {
            return this.lCSSPIdentificationList != null;
        }
        

        public void setLCSSPIdentificationList (LCSSPIdentificationList value) {
            this.lCSSPIdentificationList = value;
        }
        
  
        
        public ISPList getISPList () {
            return this.iSPList;
        }

        
        public boolean isISPListPresent () {
            return this.iSPList != null;
        }
        

        public void setISPList (ISPList value) {
            this.iSPList = value;
        }
        
  
        
        public NetworkList getNetworkList () {
            return this.networkList;
        }

        
        public boolean isNetworkListPresent () {
            return this.networkList != null;
        }
        

        public void setNetworkList (NetworkList value) {
            this.networkList = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_LCSSPInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_LCSSPInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(LCSSPInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "LCSSPInformation", isOptional =  false , hasTag =  true, tag = 373, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private LCSSPInformationSequenceType  value;        

        
        
        public LCSSPInformation () {
        }
        
        
        
        public void setValue(LCSSPInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public LCSSPInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LCSSPInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            