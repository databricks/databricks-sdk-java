// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RegisteredModel {
    /**
     * Timestamp recorded when this `registered_model` was created.
     */
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    
    /**
     * Description of this `registered_model`.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Timestamp recorded when metadata for this `registered_model` was last
     * updated.
     */
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    
    /**
     * Collection of latest model versions for each stage. Only contains models
     * with current `READY` status.
     */
    @JsonProperty("latest_versions")
    private java.util.List<ModelVersion> latestVersions;
    
    /**
     * Unique name for the model.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Tags: Additional metadata key-value pairs for this `registered_model`.
     */
    @JsonProperty("tags")
    private java.util.List<RegisteredModelTag> tags;
    
    /**
     * User that created this `registered_model`
     */
    @JsonProperty("user_id")
    private String userId;
    
    public RegisteredModel setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }
    
    public RegisteredModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public RegisteredModel setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
    public RegisteredModel setLatestVersions(java.util.List<ModelVersion> latestVersions) {
        this.latestVersions = latestVersions;
        return this;
    }

    public java.util.List<ModelVersion> getLatestVersions() {
        return latestVersions;
    }
    
    public RegisteredModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public RegisteredModel setTags(java.util.List<RegisteredModelTag> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<RegisteredModelTag> getTags() {
        return tags;
    }
    
    public RegisteredModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }
    
}
