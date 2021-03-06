
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
    @ASN1BoxedType ( name = "ChargeDetail" )
    public class ChargeDetail implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ChargeDetail" , isSet = false )
       public static class ChargeDetailSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "chargeType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeType chargeType = null;
                
  
        @ASN1Element ( name = "charge", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Charge charge = null;
                
  
        @ASN1Element ( name = "chargeableUnits", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeableUnits chargeableUnits = null;
                
  
        @ASN1Element ( name = "chargedUnits", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargedUnits chargedUnits = null;
                
  
        @ASN1Element ( name = "chargeDetailTimeStamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargingTimeStamp chargeDetailTimeStamp = null;
                
  
        @ASN1Element ( name = "dayCategory", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DayCategory dayCategory = null;
                
  
        @ASN1Element ( name = "dayCategorySubtype", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private DayCategorySubtype dayCategorySubtype = null;
                
  
        @ASN1Element ( name = "timeBand", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TimeBand timeBand = null;
                
  
        @ASN1Element ( name = "timeBandSubtype", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TimeBandSubtype timeBandSubtype = null;
                
  
        @ASN1Element ( name = "multiRateIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private MultiRateIndicator multiRateIndicator = null;
                
  
        
        public ChargeType getChargeType () {
            return this.chargeType;
        }

        
        public boolean isChargeTypePresent () {
            return this.chargeType != null;
        }
        

        public void setChargeType (ChargeType value) {
            this.chargeType = value;
        }
        
  
        
        public Charge getCharge () {
            return this.charge;
        }

        
        public boolean isChargePresent () {
            return this.charge != null;
        }
        

        public void setCharge (Charge value) {
            this.charge = value;
        }
        
  
        
        public ChargeableUnits getChargeableUnits () {
            return this.chargeableUnits;
        }

        
        public boolean isChargeableUnitsPresent () {
            return this.chargeableUnits != null;
        }
        

        public void setChargeableUnits (ChargeableUnits value) {
            this.chargeableUnits = value;
        }
        
  
        
        public ChargedUnits getChargedUnits () {
            return this.chargedUnits;
        }

        
        public boolean isChargedUnitsPresent () {
            return this.chargedUnits != null;
        }
        

        public void setChargedUnits (ChargedUnits value) {
            this.chargedUnits = value;
        }
        
  
        
        public ChargingTimeStamp getChargeDetailTimeStamp () {
            return this.chargeDetailTimeStamp;
        }

        
        public boolean isChargeDetailTimeStampPresent () {
            return this.chargeDetailTimeStamp != null;
        }
        

        public void setChargeDetailTimeStamp (ChargingTimeStamp value) {
            this.chargeDetailTimeStamp = value;
        }
        
  
        
        public DayCategory getDayCategory () {
            return this.dayCategory;
        }

        
        public boolean isDayCategoryPresent () {
            return this.dayCategory != null;
        }
        

        public void setDayCategory (DayCategory value) {
            this.dayCategory = value;
        }
        
  
        
        public DayCategorySubtype getDayCategorySubtype () {
            return this.dayCategorySubtype;
        }

        
        public boolean isDayCategorySubtypePresent () {
            return this.dayCategorySubtype != null;
        }
        

        public void setDayCategorySubtype (DayCategorySubtype value) {
            this.dayCategorySubtype = value;
        }
        
  
        
        public TimeBand getTimeBand () {
            return this.timeBand;
        }

        
        public boolean isTimeBandPresent () {
            return this.timeBand != null;
        }
        

        public void setTimeBand (TimeBand value) {
            this.timeBand = value;
        }
        
  
        
        public TimeBandSubtype getTimeBandSubtype () {
            return this.timeBandSubtype;
        }

        
        public boolean isTimeBandSubtypePresent () {
            return this.timeBandSubtype != null;
        }
        

        public void setTimeBandSubtype (TimeBandSubtype value) {
            this.timeBandSubtype = value;
        }
        
  
        
        public MultiRateIndicator getMultiRateIndicator () {
            return this.multiRateIndicator;
        }

        
        public boolean isMultiRateIndicatorPresent () {
            return this.multiRateIndicator != null;
        }
        

        public void setMultiRateIndicator (MultiRateIndicator value) {
            this.multiRateIndicator = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ChargeDetailSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ChargeDetailSequenceType = CoderFactory.getInstance().newPreparedElementData(ChargeDetailSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ChargeDetail", isOptional =  false , hasTag =  true, tag = 63, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ChargeDetailSequenceType  value;        

        
        
        public ChargeDetail () {
        }
        
        
        
        public void setValue(ChargeDetailSequenceType value) {
            this.value = value;
        }
        
        
        
        public ChargeDetailSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ChargeDetail.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            