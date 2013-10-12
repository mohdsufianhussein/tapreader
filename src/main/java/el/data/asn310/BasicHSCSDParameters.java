
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
    @ASN1BoxedType ( name = "BasicHSCSDParameters" )
    public class BasicHSCSDParameters implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "BasicHSCSDParameters" , isSet = false )
       public static class BasicHSCSDParametersSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "maxNumberOfChannels", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private NumberOfChannels maxNumberOfChannels = null;
                
  
        @ASN1Element ( name = "channelCodingAcceptableList", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChannelCodingAcceptableList channelCodingAcceptableList = null;
                
  
        @ASN1Element ( name = "channelCodingUsed", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private ChannelCoding channelCodingUsed = null;
                
  
        @ASN1Element ( name = "numberOfChannelsUsed", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private NumberOfChannelsUsed numberOfChannelsUsed = null;
                
  
        
        public NumberOfChannels getMaxNumberOfChannels () {
            return this.maxNumberOfChannels;
        }

        
        public boolean isMaxNumberOfChannelsPresent () {
            return this.maxNumberOfChannels != null;
        }
        

        public void setMaxNumberOfChannels (NumberOfChannels value) {
            this.maxNumberOfChannels = value;
        }
        
  
        
        public ChannelCodingAcceptableList getChannelCodingAcceptableList () {
            return this.channelCodingAcceptableList;
        }

        
        public boolean isChannelCodingAcceptableListPresent () {
            return this.channelCodingAcceptableList != null;
        }
        

        public void setChannelCodingAcceptableList (ChannelCodingAcceptableList value) {
            this.channelCodingAcceptableList = value;
        }
        
  
        
        public ChannelCoding getChannelCodingUsed () {
            return this.channelCodingUsed;
        }

        
        public boolean isChannelCodingUsedPresent () {
            return this.channelCodingUsed != null;
        }
        

        public void setChannelCodingUsed (ChannelCoding value) {
            this.channelCodingUsed = value;
        }
        
  
        
        public NumberOfChannelsUsed getNumberOfChannelsUsed () {
            return this.numberOfChannelsUsed;
        }

        
        public boolean isNumberOfChannelsUsedPresent () {
            return this.numberOfChannelsUsed != null;
        }
        

        public void setNumberOfChannelsUsed (NumberOfChannelsUsed value) {
            this.numberOfChannelsUsed = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_BasicHSCSDParametersSequenceType;
        }

       private static IASN1PreparedElementData preparedData_BasicHSCSDParametersSequenceType = CoderFactory.getInstance().newPreparedElementData(BasicHSCSDParametersSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "BasicHSCSDParameters", isOptional =  false , hasTag =  true, tag = 35, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private BasicHSCSDParametersSequenceType  value;        

        
        
        public BasicHSCSDParameters () {
        }
        
        
        
        public void setValue(BasicHSCSDParametersSequenceType value) {
            this.value = value;
        }
        
        
        
        public BasicHSCSDParametersSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(BasicHSCSDParameters.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            