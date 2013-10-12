
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
    @ASN1BoxedType ( name = "MobileSession" )
    public class MobileSession implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "MobileSession" , isSet = false )
       public static class MobileSessionSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "mobileSessionService", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private MobileSessionService mobileSessionService = null;
                
  
        @ASN1Element ( name = "chargedParty", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargedParty chargedParty = null;
                
  
        @ASN1Element ( name = "rapFileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RapFileSequenceNumber rapFileSequenceNumber = null;
                
  
        @ASN1Element ( name = "simToolkitIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private SimToolkitIndicator simToolkitIndicator = null;
                
  
        @ASN1Element ( name = "geographicalLocation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private GeographicalLocation geographicalLocation = null;
                
  
        @ASN1Element ( name = "locationArea", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private LocationArea locationArea = null;
                
  
        @ASN1Element ( name = "cellId", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CellId cellId = null;
                
  
        @ASN1Element ( name = "eventReference", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private EventReference eventReference = null;
                
  
        @ASN1Element ( name = "recEntityCodeList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RecEntityCodeList recEntityCodeList = null;
                
  
        @ASN1Element ( name = "serviceStartTimestamp", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ServiceStartTimestamp serviceStartTimestamp = null;
                
  
        @ASN1Element ( name = "causeForTerm", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private CauseForTerm causeForTerm = null;
                
  
        @ASN1Element ( name = "totalCallEventDuration", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private TotalCallEventDuration totalCallEventDuration = null;
                
  
        @ASN1Element ( name = "nonChargedParty", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonChargedParty nonChargedParty = null;
                
  
        @ASN1Element ( name = "sessionChargeInfoList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private SessionChargeInfoList sessionChargeInfoList = null;
                
  
        @ASN1Element ( name = "operatorSpecInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OperatorSpecInfoList operatorSpecInformation = null;
                
  
        
        public MobileSessionService getMobileSessionService () {
            return this.mobileSessionService;
        }

        
        public boolean isMobileSessionServicePresent () {
            return this.mobileSessionService != null;
        }
        

        public void setMobileSessionService (MobileSessionService value) {
            this.mobileSessionService = value;
        }
        
  
        
        public ChargedParty getChargedParty () {
            return this.chargedParty;
        }

        
        public boolean isChargedPartyPresent () {
            return this.chargedParty != null;
        }
        

        public void setChargedParty (ChargedParty value) {
            this.chargedParty = value;
        }
        
  
        
        public RapFileSequenceNumber getRapFileSequenceNumber () {
            return this.rapFileSequenceNumber;
        }

        
        public boolean isRapFileSequenceNumberPresent () {
            return this.rapFileSequenceNumber != null;
        }
        

        public void setRapFileSequenceNumber (RapFileSequenceNumber value) {
            this.rapFileSequenceNumber = value;
        }
        
  
        
        public SimToolkitIndicator getSimToolkitIndicator () {
            return this.simToolkitIndicator;
        }

        
        public boolean isSimToolkitIndicatorPresent () {
            return this.simToolkitIndicator != null;
        }
        

        public void setSimToolkitIndicator (SimToolkitIndicator value) {
            this.simToolkitIndicator = value;
        }
        
  
        
        public GeographicalLocation getGeographicalLocation () {
            return this.geographicalLocation;
        }

        
        public boolean isGeographicalLocationPresent () {
            return this.geographicalLocation != null;
        }
        

        public void setGeographicalLocation (GeographicalLocation value) {
            this.geographicalLocation = value;
        }
        
  
        
        public LocationArea getLocationArea () {
            return this.locationArea;
        }

        
        public boolean isLocationAreaPresent () {
            return this.locationArea != null;
        }
        

        public void setLocationArea (LocationArea value) {
            this.locationArea = value;
        }
        
  
        
        public CellId getCellId () {
            return this.cellId;
        }

        
        public boolean isCellIdPresent () {
            return this.cellId != null;
        }
        

        public void setCellId (CellId value) {
            this.cellId = value;
        }
        
  
        
        public EventReference getEventReference () {
            return this.eventReference;
        }

        
        public boolean isEventReferencePresent () {
            return this.eventReference != null;
        }
        

        public void setEventReference (EventReference value) {
            this.eventReference = value;
        }
        
  
        
        public RecEntityCodeList getRecEntityCodeList () {
            return this.recEntityCodeList;
        }

        
        public boolean isRecEntityCodeListPresent () {
            return this.recEntityCodeList != null;
        }
        

        public void setRecEntityCodeList (RecEntityCodeList value) {
            this.recEntityCodeList = value;
        }
        
  
        
        public ServiceStartTimestamp getServiceStartTimestamp () {
            return this.serviceStartTimestamp;
        }

        
        public boolean isServiceStartTimestampPresent () {
            return this.serviceStartTimestamp != null;
        }
        

        public void setServiceStartTimestamp (ServiceStartTimestamp value) {
            this.serviceStartTimestamp = value;
        }
        
  
        
        public CauseForTerm getCauseForTerm () {
            return this.causeForTerm;
        }

        
        public boolean isCauseForTermPresent () {
            return this.causeForTerm != null;
        }
        

        public void setCauseForTerm (CauseForTerm value) {
            this.causeForTerm = value;
        }
        
  
        
        public TotalCallEventDuration getTotalCallEventDuration () {
            return this.totalCallEventDuration;
        }

        
        public boolean isTotalCallEventDurationPresent () {
            return this.totalCallEventDuration != null;
        }
        

        public void setTotalCallEventDuration (TotalCallEventDuration value) {
            this.totalCallEventDuration = value;
        }
        
  
        
        public NonChargedParty getNonChargedParty () {
            return this.nonChargedParty;
        }

        
        public boolean isNonChargedPartyPresent () {
            return this.nonChargedParty != null;
        }
        

        public void setNonChargedParty (NonChargedParty value) {
            this.nonChargedParty = value;
        }
        
  
        
        public SessionChargeInfoList getSessionChargeInfoList () {
            return this.sessionChargeInfoList;
        }

        
        public boolean isSessionChargeInfoListPresent () {
            return this.sessionChargeInfoList != null;
        }
        

        public void setSessionChargeInfoList (SessionChargeInfoList value) {
            this.sessionChargeInfoList = value;
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
            return preparedData_MobileSessionSequenceType;
        }

       private static IASN1PreparedElementData preparedData_MobileSessionSequenceType = CoderFactory.getInstance().newPreparedElementData(MobileSessionSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "MobileSession", isOptional =  false , hasTag =  true, tag = 434, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private MobileSessionSequenceType  value;        

        
        
        public MobileSession () {
        }
        
        
        
        public void setValue(MobileSessionSequenceType value) {
            this.value = value;
        }
        
        
        
        public MobileSessionSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(MobileSession.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            