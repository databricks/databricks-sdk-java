// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Route {
    /**
     * The name of the served model this route configures traffic for.
     */
    @JsonProperty("served_model_name")
    private String servedModelName;
    
    /**
     * The percentage of endpoint traffic to send to this route. It must be an
     * integer between 0 and 100 inclusive.
     */
    @JsonProperty("traffic_percentage")
    private Long trafficPercentage;
    
    public Route setServedModelName(String servedModelName) {
        this.servedModelName = servedModelName;
        return this;
    }

    public String getServedModelName() {
        return servedModelName;
    }
    
    public Route setTrafficPercentage(Long trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }

    public Long getTrafficPercentage() {
        return trafficPercentage;
    }
    
}
