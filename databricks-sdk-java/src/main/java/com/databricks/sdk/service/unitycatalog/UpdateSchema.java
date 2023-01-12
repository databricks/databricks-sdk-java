// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateSchema {
    /**
     * Name of parent Catalog.
     */
    @JsonProperty("catalog_name")
    private String catalogName;
    
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Required. Full name of the schema (from URL).
     */
    
    private String fullName;
    
    /**
     * Name of Schema, relative to parent Catalog.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of Schema.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    /**
     * Storage root URL for managed tables within schema.
     */
    @JsonProperty("storage_root")
    private String storageRoot;
    
    public UpdateSchema setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }
    
    public UpdateSchema setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateSchema setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public UpdateSchema setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateSchema setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateSchema setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
    public UpdateSchema setStorageRoot(String storageRoot) {
        this.storageRoot = storageRoot;
        return this;
    }

    public String getStorageRoot() {
        return storageRoot;
    }
    
}
