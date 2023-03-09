// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RecipientProfile {
    /**
     * The token used to authorize the recipient.
     */
    @JsonProperty("bearer_token")
    private String bearerToken;
    
    /**
     * The endpoint for the share to be used by the recipient.
     */
    @JsonProperty("endpoint")
    private String endpoint;
    
    /**
     * The version number of the recipient's credentials on a share.
     */
    @JsonProperty("share_credentials_version")
    private Long shareCredentialsVersion;
    
    public RecipientProfile setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
        return this;
    }

    public String getBearerToken() {
        return bearerToken;
    }
    
    public RecipientProfile setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }
    
    public RecipientProfile setShareCredentialsVersion(Long shareCredentialsVersion) {
        this.shareCredentialsVersion = shareCredentialsVersion;
        return this;
    }

    public Long getShareCredentialsVersion() {
        return shareCredentialsVersion;
    }
    
}
