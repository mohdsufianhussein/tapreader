
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
    @ASN1BoxedType ( name = "ServiceCentreUsage" )
    public class ServiceCentreUsage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ServiceCentreUsage" , isSet = false )
       public static class ServiceCentreUsageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "fraudMonitorIndicator", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private FraudMonitorIndicator fraudMonitorIndicator = null;
                
  
        @ASN1Element ( name = "basicInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ScuBasicInformation basicInformation = null;
                
  
        @ASN1Element ( name = "rapFileSequenceNumber", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RapFileSequenceNumber rapFileSequenceNumber = null;
                
  
        @ASN1Element ( name = "networkType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private NetworkType networkType = null;
                
  
        @ASN1Element ( name = "servingNetwork", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ServingNetwork servingNetwork = null;
                
  
        @ASN1Element ( name = "recEntityCode", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private RecEntityCode recEntityCode = null;
                
  
        @ASN1Element ( name = "chargeInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChargeInformation chargeInformation = null;
                
  
        @ASN1Element ( name = "scuChargeType", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ScuChargeType scuChargeType = null;
                
  
        @ASN1Element ( name = "scuTimeStamps", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ScuTimeStamps scuTimeStamps = null;
                
  
        @ASN1Element ( name = "operatorSpecInformation", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private OperatorSpecInfoList operatorSpecInformation = null;
                
  
        
        public FraudMonitorIndicator getFraudMonitorIndicator () {
            return this.fraudMonitorIndicator;
        }

        
        public boolean isFraudMonitorIndicatorPresent () {
            return this.fraudMonitorIndicator != null;
        }
        

        public void setFraudMonitorIndicator (FraudMonitorIndicator value) {
            this.fraudMonitorIndicator = value;
        }
        
  
        
        public ScuBasicInformation getBasicInformation () {
            return this.basicInformation;
        }

        
        public boolean isBasicInformationPresent () {
            return this.basicInformation != null;
        }
        

        public void setBasicInformation (ScuBasicInformation value) {
            this.basicInformation = value;
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
        
  
        
        public NetworkType getNetworkType () {
            return this.networkType;
        }

        
        public boolean isNetworkTypePresent () {
            return this.networkType != null;
        }
        

        public void setNetworkType (NetworkType value) {
            this.networkType = value;
        }
        
  
        
        public ServingNetwork getServingNetwork () {
            return this.servingNetwork;
        }

        
        public boolean isServingNetworkPresent () {
            return this.servingNetwork != null;
        }
        

        public void setServingNetwork (ServingNetwork value) {
            this.servingNetwork = value;
        }
        
  
        
        public RecEntityCode getRecEntityCode () {
            return this.recEntityCode;
        }

        
        public boolean isRecEntityCodePresent () {
            return this.recEntityCode != null;
        }
        

        public void setRecEntityCode (RecEntityCode value) {
            this.recEntityCode = value;
        }
        
  
        
        public ChargeInformation getChargeInformation () {
            return this.chargeInformation;
        }

        
        public boolean isChargeInformationPresent () {
            return this.chargeInformation != null;
        }
        

        public void setChargeInformation (ChargeInformation value) {
            this.chargeInformation = value;
        }
        
  
        
        public ScuChargeType getScuChargeType () {
            return this.scuChargeType;
        }

        
        public boolean isScuChargeTypePresent () {
            return this.scuChargeType != null;
        }
        

        public void setScuChargeType (ScuChargeType value) {
            this.scuChargeType = value;
        }
        
  
        
        public ScuTimeStamps getScuTimeStamps () {
            return this.scuTimeStamps;
        }

        
        public boolean isScuTimeStampsPresent () {
            return this.scuTimeStamps != null;
        }
        

        public void setScuTimeStamps (ScuTimeStamps value) {
            this.scuTimeStamps = value;
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
            return preparedData_ServiceCentreUsageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ServiceCentreUsageSequenceType = CoderFactory.getInstance().newPreparedElementData(ServiceCentreUsageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ServiceCentreUsage", isOptional =  false , hasTag =  true, tag = 12, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ServiceCentreUsageSequenceType  value;        

        
        
        public ServiceCentreUsage () {
        }
        
        
        
        public void setValue(ServiceCentreUsageSequenceType value) {
            this.value = value;
        }
        
        
        
        public ServiceCentreUsageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ServiceCentreUsage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            