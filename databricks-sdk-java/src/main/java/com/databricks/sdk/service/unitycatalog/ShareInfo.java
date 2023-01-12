// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ShareInfo {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this Share was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of Share creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Name of the Share.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * A list of shared data objects within the Share.
     */
    @JsonProperty("objects")
    private java.util.List<SharedDataObject> objects;
    
    /**
     * Username of current owner of Share.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Array of shared data object updates.
     */
    @JsonProperty("updates")
    private java.util.List<SharedDataObjectUpdate> updates;
    
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
    
    public ShareInfo setUpdates(java.util.List<SharedDataObjectUpdate> updates) {
        this.updates = updates;
        return this;
    }

    public java.util.List<SharedDataObjectUpdate> getUpdates() {
        return updates;
    }
    
}
