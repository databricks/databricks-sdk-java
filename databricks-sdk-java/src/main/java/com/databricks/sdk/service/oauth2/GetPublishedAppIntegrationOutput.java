// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetPublishedAppIntegrationOutput {
    /**
     * app-id of the published app integration
     */
    @JsonProperty("app_id")
    private String appId;
    
    /**
     * unique integration id for the published oauth app
     */
    @JsonProperty("integration_id")
    private String integrationId;
    
    /**
     * name of the published oauth app
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Token access policy
     */
    @JsonProperty("token_access_policy")
    private TokenAccessPolicy tokenAccessPolicy;
    
    public GetPublishedAppIntegrationOutput setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAppId() {
        return appId;
    }
    
    public GetPublishedAppIntegrationOutput setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    public String getIntegrationId() {
        return integrationId;
    }
    
    public GetPublishedAppIntegrationOutput setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GetPublishedAppIntegrationOutput setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
        this.tokenAccessPolicy = tokenAccessPolicy;
        return this;
    }

    public TokenAccessPolicy getTokenAccessPolicy() {
        return tokenAccessPolicy;
    }
    
}
