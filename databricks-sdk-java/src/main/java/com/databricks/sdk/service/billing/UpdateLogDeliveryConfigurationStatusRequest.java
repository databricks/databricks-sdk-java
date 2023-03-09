// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateLogDeliveryConfigurationStatusRequest {
    /**
     * Databricks log delivery configuration ID
     */
    
    private String logDeliveryConfigurationId;
    
    /**
     * Status of log delivery configuration. Set to `ENABLED` (enabled) or
     * `DISABLED` (disabled). Defaults to `ENABLED`. You can [enable or disable
     * the configuration](#operation/patch-log-delivery-config-status) later.
     * Deletion of a configuration is not supported, so disable a log delivery
     * configuration that is no longer needed.
     */
    @JsonProperty("status")
    private LogDeliveryConfigStatus status;
    
    public UpdateLogDeliveryConfigurationStatusRequest setLogDeliveryConfigurationId(String logDeliveryConfigurationId) {
        this.logDeliveryConfigurationId = logDeliveryConfigurationId;
        return this;
    }

    public String getLogDeliveryConfigurationId() {
        return logDeliveryConfigurationId;
    }
    
    public UpdateLogDeliveryConfigurationStatusRequest setStatus(LogDeliveryConfigStatus status) {
        this.status = status;
        return this;
    }

    public LogDeliveryConfigStatus getStatus() {
        return status;
    }
    
}
