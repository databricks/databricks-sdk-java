// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreatePublishedAppIntegrationOutput {
    /**
     * unique integration id for the published oauth app
     */
    @JsonProperty("integration_id")
    private String integrationId;
    
    public CreatePublishedAppIntegrationOutput setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    public String getIntegrationId() {
        return integrationId;
    }
    
}
