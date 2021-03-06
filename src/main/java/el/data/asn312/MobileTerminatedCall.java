
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
    @ASN1BoxedType ( name = "MobileTerminatedCall" )
    public class MobileTerminatedCall implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "MobileTerminatedCall" , isSet = false )
       public static class MobileTerminatedCallSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "basicCallInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private MtBasicCallInformation basicCallInformation = null;
                
  
        @ASN1Element ( name = "locationInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LocationInformation locationInformation = null;
                
  
        @ASN1Element ( name = "equipmentIdentifier", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ImeiOrEsn equipmentIdentifier = null;
                
  
        @ASN1Element ( name = "basicServiceUsedList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private BasicServiceUsedList basicServiceUsedList = null;
                
  
        @ASN1Element ( name = "camelServiceUsed", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CamelServiceUsed camelServiceUsed = null;
                
  
        @ASN1Element ( name = "operatorSpecInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OperatorSpecInfoList operatorSpecInformation = null;
                
  
        
        public MtBasicCallInformation getBasicCallInformation () {
            return this.basicCallInformation;
        }

        
        public boolean isBasicCallInformationPresent () {
            return this.basicCallInformation != null;
        }
        

        public void setBasicCallInformation (MtBasicCallInformation value) {
            this.basicCallInformation = value;
        }
        
  
        
        public LocationInformation getLocationInformation () {
            return this.locationInformation;
        }

        
        public boolean isLocationInformationPresent () {
            return this.locationInformation != null;
        }
        

        public void setLocationInformation (LocationInformation value) {
            this.locationInformation = value;
        }
        
  
        
        public ImeiOrEsn getEquipmentIdentifier () {
            return this.equipmentIdentifier;
        }

        
        public boolean isEquipmentIdentifierPresent () {
            return this.equipmentIdentifier != null;
        }
        

        public void setEquipmentIdentifier (ImeiOrEsn value) {
            this.equipmentIdentifier = value;
        }
        
  
        
        public BasicServiceUsedList getBasicServiceUsedList () {
            return this.basicServiceUsedList;
        }

        
        public boolean isBasicServiceUsedListPresent () {
            return this.basicServiceUsedList != null;
        }
        

        public void setBasicServiceUsedList (BasicServiceUsedList value) {
            this.basicServiceUsedList = value;
        }
        
  
        
        public CamelServiceUsed getCamelServiceUsed () {
            return this.camelServiceUsed;
        }

        
        public boolean isCamelServiceUsedPresent () {
            return this.camelServiceUsed != null;
        }
        

        public void setCamelServiceUsed (CamelServiceUsed value) {
            this.camelServiceUsed = value;
        }
        
  
        
        public OperatorSpecInfoList getOperatorSpecInformation () {
            return this.operatorSpecInformation;
        }

        
        public boolean isOperatorSpecInformationPresent () {
            return this.operatorSpecInformation != null;
        }
        

        public void setOperatorSpecInformation (OperatorSpecInfoList value) {
            this.operatorSpecInformation = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_MobileTerminatedCallSequenceType;
        }

       private static IASN1PreparedElementData preparedData_MobileTerminatedCallSequenceType = CoderFactory.getInstance().newPreparedElementData(MobileTerminatedCallSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "MobileTerminatedCall", isOptional =  false , hasTag =  true, tag = 10, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private MobileTerminatedCallSequenceType  value;        

        
        
        public MobileTerminatedCall () {
        }
        
        
        
        public void setValue(MobileTerminatedCallSequenceType value) {
            this.value = value;
        }
        
        
        
        public MobileTerminatedCallSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(MobileTerminatedCall.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            