// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class WrappedLogDeliveryConfiguration {
    /**
     
     */
    @JsonProperty("log_delivery_configuration")
    private LogDeliveryConfiguration logDeliveryConfiguration;
    
    public WrappedLogDeliveryConfiguration setLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
        return this;
    }

    public LogDeliveryConfiguration getLogDeliveryConfiguration() {
        return logDeliveryConfiguration;
    }
    
}
