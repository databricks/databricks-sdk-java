// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class InstancePoolAzureAttributes {
    /**
     * Shows the Availability type used for the spot nodes.
     * 
     * The default value is defined by
     * InstancePoolConf.instancePoolDefaultAzureAvailability
     */
    @JsonProperty("availability")
    private InstancePoolAzureAttributesAvailability availability;
    
    /**
     * The default value and documentation here should be kept consistent with
     * CommonConf.defaultSpotBidMaxPrice.
     */
    @JsonProperty("spot_bid_max_price")
    private Float spotBidMaxPrice;
    
    public InstancePoolAzureAttributes setAvailability(InstancePoolAzureAttributesAvailability availability) {
        this.availability = availability;
        return this;
    }

    public InstancePoolAzureAttributesAvailability getAvailability() {
        return availability;
    }
    
    public InstancePoolAzureAttributes setSpotBidMaxPrice(Float spotBidMaxPrice) {
        this.spotBidMaxPrice = spotBidMaxPrice;
        return this;
    }

    public Float getSpotBidMaxPrice() {
        return spotBidMaxPrice;
    }
    
}
