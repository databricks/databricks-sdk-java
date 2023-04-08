// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get OAuth Custom App Integration
 */
public class GetCustomAppIntegrationRequest {
    /**
     * The oauth app integration ID.
     */
    
    private String integrationId;
    
    public GetCustomAppIntegrationRequest setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    public String getIntegrationId() {
        return integrationId;
    }
    
}
