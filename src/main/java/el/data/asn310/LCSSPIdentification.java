
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
    @ASN1BoxedType ( name = "LCSSPIdentification" )
    public class LCSSPIdentification implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "LCSSPIdentification" , isSet = false )
       public static class LCSSPIdentificationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "contentProviderIdType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ContentProviderIdType contentProviderIdType = null;
                
  
        @ASN1Element ( name = "contentProviderIdentifier", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ContentProviderIdentifier contentProviderIdentifier = null;
                
  
        
        public ContentProviderIdType getContentProviderIdType () {
            return this.contentProviderIdType;
        }

        
        public boolean isContentProviderIdTypePresent () {
            return this.contentProviderIdType != null;
        }
        

        public void setContentProviderIdType (ContentProviderIdType value) {
            this.contentProviderIdType = value;
        }
        
  
        
        public ContentProviderIdentifier getContentProviderIdentifier () {
            return this.contentProviderIdentifier;
        }

        
        public boolean isContentProviderIdentifierPresent () {
            return this.contentProviderIdentifier != null;
        }
        

        public void setContentProviderIdentifier (ContentProviderIdentifier value) {
            this.contentProviderIdentifier = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_LCSSPIdentificationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_LCSSPIdentificationSequenceType = CoderFactory.getInstance().newPreparedElementData(LCSSPIdentificationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "LCSSPIdentification", isOptional =  false , hasTag =  true, tag = 375, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private LCSSPIdentificationSequenceType  value;        

        
        
        public LCSSPIdentification () {
        }
        
        
        
        public void setValue(LCSSPIdentificationSequenceType value) {
            this.value = value;
        }
        
        
        
        public LCSSPIdentificationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LCSSPIdentification.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            