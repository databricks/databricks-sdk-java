// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get all log delivery configurations
 */
public class ListLogDeliveryRequest {
    /**
     * Filter by credential configuration ID.
     */
    @QueryParam("credentials_id")
    private String credentialsId;
    
    /**
     * Filter by status `ENABLED` or `DISABLED`.
     */
    @QueryParam("status")
    private LogDeliveryConfigStatus status;
    
    /**
     * Filter by storage configuration ID.
     */
    @QueryParam("storage_configuration_id")
    private String storageConfigurationId;
    
    public ListLogDeliveryRequest setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }
    
    public ListLogDeliveryRequest setStatus(LogDeliveryConfigStatus status) {
        this.status = status;
        return this;
    }

    public LogDeliveryConfigStatus getStatus() {
        return status;
    }
    
    public ListLogDeliveryRequest setStorageConfigurationId(String storageConfigurationId) {
        this.storageConfigurationId = storageConfigurationId;
        return this;
    }

    public String getStorageConfigurationId() {
        return storageConfigurationId;
    }
    
}
