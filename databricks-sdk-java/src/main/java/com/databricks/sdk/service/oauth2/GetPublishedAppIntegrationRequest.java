// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get OAuth Published App Integration
 */
public class GetPublishedAppIntegrationRequest {
    /**
     * The oauth app integration ID.
     */
    
    private String integrationId;
    
    public GetPublishedAppIntegrationRequest setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    public String getIntegrationId() {
        return integrationId;
    }
    
}
