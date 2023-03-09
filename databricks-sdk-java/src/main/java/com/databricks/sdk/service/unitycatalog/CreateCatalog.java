// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateCatalog {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Name of catalog.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * A map of key-value properties attached to the securable.
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    /**
     * The name of delta sharing provider.
     * 
     * A Delta Sharing catalog is a catalog that is based on a Delta share on a
     * remote sharing server.
     */
    @JsonProperty("provider_name")
    private String providerName;
    
    /**
     * The name of the share under the share provider.
     */
    @JsonProperty("share_name")
    private String shareName;
    
    /**
     * Storage root URL for managed tables within catalog.
     */
    @JsonProperty("storage_root")
    private String storageRoot;
    
    public CreateCatalog setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CreateCatalog setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreateCatalog setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
    public CreateCatalog setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public String getProviderName() {
        return providerName;
    }
    
    public CreateCatalog setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    public String getShareName() {
        return shareName;
    }
    
    public CreateCatalog setStorageRoot(String storageRoot) {
        this.storageRoot = storageRoot;
        return this;
    }

    public String getStorageRoot() {
        return storageRoot;
    }
    
}
