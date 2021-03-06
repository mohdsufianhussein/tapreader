
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
    @ASN1BoxedType ( name = "VasInformation" )
    public class VasInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "VasInformation" , isSet = false )
       public static class VasInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "vasCode", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private VasCode vasCode = null;
                
  
        @ASN1Element ( name = "vasShortDesc", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private VasShortDescription vasShortDesc = null;
                
  
        @ASN1Element ( name = "vasDesc", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private VasDescription vasDesc = null;
                
  
        
        public VasCode getVasCode () {
            return this.vasCode;
        }

        
        public boolean isVasCodePresent () {
            return this.vasCode != null;
        }
        

        public void setVasCode (VasCode value) {
            this.vasCode = value;
        }
        
  
        
        public VasShortDescription getVasShortDesc () {
            return this.vasShortDesc;
        }

        
        public boolean isVasShortDescPresent () {
            return this.vasShortDesc != null;
        }
        

        public void setVasShortDesc (VasShortDescription value) {
            this.vasShortDesc = value;
        }
        
  
        
        public VasDescription getVasDesc () {
            return this.vasDesc;
        }

        
        public boolean isVasDescPresent () {
            return this.vasDesc != null;
        }
        

        public void setVasDesc (VasDescription value) {
            this.vasDesc = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_VasInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_VasInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(VasInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "VasInformation", isOptional =  false , hasTag =  true, tag = 238, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private VasInformationSequenceType  value;        

        
        
        public VasInformation () {
        }
        
        
        
        public void setValue(VasInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public VasInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(VasInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            