// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ShareInfo {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this share was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of share creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Name of the share.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * A list of shared data objects within the share.
     */
    @JsonProperty("objects")
    private java.util.List<SharedDataObject> objects;
    
    /**
     * Username of current owner of share.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Time at which this share was updated, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of share updater.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public ShareInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public ShareInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public ShareInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public ShareInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ShareInfo setObjects(java.util.List<SharedDataObject> objects) {
        this.objects = objects;
        return this;
    }

    public java.util.List<SharedDataObject> getObjects() {
        return objects;
    }
    
    public ShareInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public ShareInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public ShareInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
