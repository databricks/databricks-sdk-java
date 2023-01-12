// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class WrappedLogDeliveryConfigurations {
    /**
     
     */
    @JsonProperty("log_delivery_configurations")
    private java.util.List<LogDeliveryConfiguration> logDeliveryConfigurations;
    
    public WrappedLogDeliveryConfigurations setLogDeliveryConfigurations(java.util.List<LogDeliveryConfiguration> logDeliveryConfigurations) {
        this.logDeliveryConfigurations = logDeliveryConfigurations;
        return this;
    }

    public java.util.List<LogDeliveryConfiguration> getLogDeliveryConfigurations() {
        return logDeliveryConfigurations;
    }
    
}
