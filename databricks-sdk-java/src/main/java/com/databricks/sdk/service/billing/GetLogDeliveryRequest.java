// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get log delivery configuration
 */
public class GetLogDeliveryRequest {
    /**
     * Databricks log delivery configuration ID
     */
    
    private String logDeliveryConfigurationId;
    
    public GetLogDeliveryRequest setLogDeliveryConfigurationId(String logDeliveryConfigurationId) {
        this.logDeliveryConfigurationId = logDeliveryConfigurationId;
        return this;
    }

    public String getLogDeliveryConfigurationId() {
        return logDeliveryConfigurationId;
    }
    
}
