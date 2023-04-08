// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdatePublishedAppIntegration {
    /**
     * The oauth app integration ID.
     */
    
    private String integrationId;
    
    /**
     * Token access policy to be updated in the published oauth app integration
     */
    @JsonProperty("token_access_policy")
    private TokenAccessPolicy tokenAccessPolicy;
    
    public UpdatePublishedAppIntegration setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    public String getIntegrationId() {
        return integrationId;
    }
    
    public UpdatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
        this.tokenAccessPolicy = tokenAccessPolicy;
        return this;
    }

    public TokenAccessPolicy getTokenAccessPolicy() {
        return tokenAccessPolicy;
    }
    
}
