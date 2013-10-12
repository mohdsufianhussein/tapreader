
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
    @ASN1Choice ( name = "CallEventDetail" )
    public class CallEventDetail implements IASN1PreparedElement {
            
        @ASN1Element ( name = "mobileOriginatedCall", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private MobileOriginatedCall mobileOriginatedCall = null;
                
  
        @ASN1Element ( name = "mobileTerminatedCall", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private MobileTerminatedCall mobileTerminatedCall = null;
                
  
        @ASN1Element ( name = "supplServiceEvent", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private SupplServiceEvent supplServiceEvent = null;
                
  
        @ASN1Element ( name = "serviceCentreUsage", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private ServiceCentreUsage serviceCentreUsage = null;
                
  
        @ASN1Element ( name = "gprsCall", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private GprsCall gprsCall = null;
                
  
        @ASN1Element ( name = "contentTransaction", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private ContentTransaction contentTransaction = null;
                
  
        @ASN1Element ( name = "locationService", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private LocationService locationService = null;
                
  
        @ASN1Element ( name = "messagingEvent", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private MessagingEvent messagingEvent = null;
                
  
        @ASN1Element ( name = "mobileSession", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private MobileSession mobileSession = null;
                
  
        
        public MobileOriginatedCall getMobileOriginatedCall () {
            return this.mobileOriginatedCall;
        }

        public boolean isMobileOriginatedCallSelected () {
            return this.mobileOriginatedCall != null;
        }

        private void setMobileOriginatedCall (MobileOriginatedCall value) {
            this.mobileOriginatedCall = value;
        }

        
        public void selectMobileOriginatedCall (MobileOriginatedCall value) {
            this.mobileOriginatedCall = value;
            
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public MobileTerminatedCall getMobileTerminatedCall () {
            return this.mobileTerminatedCall;
        }

        public boolean isMobileTerminatedCallSelected () {
            return this.mobileTerminatedCall != null;
        }

        private void setMobileTerminatedCall (MobileTerminatedCall value) {
            this.mobileTerminatedCall = value;
        }

        
        public void selectMobileTerminatedCall (MobileTerminatedCall value) {
            this.mobileTerminatedCall = value;
            
                    setMobileOriginatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public SupplServiceEvent getSupplServiceEvent () {
            return this.supplServiceEvent;
        }

        public boolean isSupplServiceEventSelected () {
            return this.supplServiceEvent != null;
        }

        private void setSupplServiceEvent (SupplServiceEvent value) {
            this.supplServiceEvent = value;
        }

        
        public void selectSupplServiceEvent (SupplServiceEvent value) {
            this.supplServiceEvent = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public ServiceCentreUsage getServiceCentreUsage () {
            return this.serviceCentreUsage;
        }

        public boolean isServiceCentreUsageSelected () {
            return this.serviceCentreUsage != null;
        }

        private void setServiceCentreUsage (ServiceCentreUsage value) {
            this.serviceCentreUsage = value;
        }

        
        public void selectServiceCentreUsage (ServiceCentreUsage value) {
            this.serviceCentreUsage = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public GprsCall getGprsCall () {
            return this.gprsCall;
        }

        public boolean isGprsCallSelected () {
            return this.gprsCall != null;
        }

        private void setGprsCall (GprsCall value) {
            this.gprsCall = value;
        }

        
        public void selectGprsCall (GprsCall value) {
            this.gprsCall = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public ContentTransaction getContentTransaction () {
            return this.contentTransaction;
        }

        public boolean isContentTransactionSelected () {
            return this.contentTransaction != null;
        }

        private void setContentTransaction (ContentTransaction value) {
            this.contentTransaction = value;
        }

        
        public void selectContentTransaction (ContentTransaction value) {
            this.contentTransaction = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public LocationService getLocationService () {
            return this.locationService;
        }

        public boolean isLocationServiceSelected () {
            return this.locationService != null;
        }

        private void setLocationService (LocationService value) {
            this.locationService = value;
        }

        
        public void selectLocationService (LocationService value) {
            this.locationService = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setMessagingEvent(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public MessagingEvent getMessagingEvent () {
            return this.messagingEvent;
        }

        public boolean isMessagingEventSelected () {
            return this.messagingEvent != null;
        }

        private void setMessagingEvent (MessagingEvent value) {
            this.messagingEvent = value;
        }

        
        public void selectMessagingEvent (MessagingEvent value) {
            this.messagingEvent = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMobileSession(null);
                            
        }

        
  
        
        public MobileSession getMobileSession () {
            return this.mobileSession;
        }

        public boolean isMobileSessionSelected () {
            return this.mobileSession != null;
        }

        private void setMobileSession (MobileSession value) {
            this.mobileSession = value;
        }

        
        public void selectMobileSession (MobileSession value) {
            this.mobileSession = value;
            
                    setMobileOriginatedCall(null);
                
                    setMobileTerminatedCall(null);
                
                    setSupplServiceEvent(null);
                
                    setServiceCentreUsage(null);
                
                    setGprsCall(null);
                
                    setContentTransaction(null);
                
                    setLocationService(null);
                
                    setMessagingEvent(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(CallEventDetail.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            