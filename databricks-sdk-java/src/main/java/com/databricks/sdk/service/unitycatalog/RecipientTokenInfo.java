// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RecipientTokenInfo {
    /**
     * Full activation URL to retrieve the access token. It will be empty if the
     * token is already retrieved.
     */
    @JsonProperty("activation_url")
    private String activationUrl;
    
    /**
     * Time at which this recipient Token was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of recipient token creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Expiration timestamp of the token in epoch milliseconds.
     */
    @JsonProperty("expiration_time")
    private Long expirationTime;
    
    /**
     * Unique ID of the recipient token.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Time at which this recipient Token was updated, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of recipient Token updater.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public RecipientTokenInfo setActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
        return this;
    }

    public String getActivationUrl() {
        return activationUrl;
    }
    
    public RecipientTokenInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public RecipientTokenInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public RecipientTokenInfo setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }
    
    public RecipientTokenInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public RecipientTokenInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public RecipientTokenInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
