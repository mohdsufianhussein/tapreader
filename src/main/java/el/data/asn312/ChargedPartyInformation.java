
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
    @ASN1BoxedType ( name = "ChargedPartyInformation" )
    public class ChargedPartyInformation implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ChargedPartyInformation" , isSet = false )
       public static class ChargedPartyInformationSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "chargedPartyIdList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargedPartyIdList chargedPartyIdList = null;
                
  
        @ASN1Element ( name = "chargedPartyHomeIdList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargedPartyHomeIdList chargedPartyHomeIdList = null;
                
  
        @ASN1Element ( name = "chargedPartyLocationList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargedPartyLocationList chargedPartyLocationList = null;
                
  
        @ASN1Element ( name = "chargedPartyEquipment", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargedPartyEquipment chargedPartyEquipment = null;
                
  
        
        public ChargedPartyIdList getChargedPartyIdList () {
            return this.chargedPartyIdList;
        }

        
        public boolean isChargedPartyIdListPresent () {
            return this.chargedPartyIdList != null;
        }
        

        public void setChargedPartyIdList (ChargedPartyIdList value) {
            this.chargedPartyIdList = value;
        }
        
  
        
        public ChargedPartyHomeIdList getChargedPartyHomeIdList () {
            return this.chargedPartyHomeIdList;
        }

        
        public boolean isChargedPartyHomeIdListPresent () {
            return this.chargedPartyHomeIdList != null;
        }
        

        public void setChargedPartyHomeIdList (ChargedPartyHomeIdList value) {
            this.chargedPartyHomeIdList = value;
        }
        
  
        
        public ChargedPartyLocationList getChargedPartyLocationList () {
            return this.chargedPartyLocationList;
        }

        
        public boolean isChargedPartyLocationListPresent () {
            return this.chargedPartyLocationList != null;
        }
        

        public void setChargedPartyLocationList (ChargedPartyLocationList value) {
            this.chargedPartyLocationList = value;
        }
        
  
        
        public ChargedPartyEquipment getChargedPartyEquipment () {
            return this.chargedPartyEquipment;
        }

        
        public boolean isChargedPartyEquipmentPresent () {
            return this.chargedPartyEquipment != null;
        }
        

        public void setChargedPartyEquipment (ChargedPartyEquipment value) {
            this.chargedPartyEquipment = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ChargedPartyInformationSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ChargedPartyInformationSequenceType = CoderFactory.getInstance().newPreparedElementData(ChargedPartyInformationSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ChargedPartyInformation", isOptional =  false , hasTag =  true, tag = 324, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ChargedPartyInformationSequenceType  value;        

        
        
        public ChargedPartyInformation () {
        }
        
        
        
        public void setValue(ChargedPartyInformationSequenceType value) {
            this.value = value;
        }
        
        
        
        public ChargedPartyInformationSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ChargedPartyInformation.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            