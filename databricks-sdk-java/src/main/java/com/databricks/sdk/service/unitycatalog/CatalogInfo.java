// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CatalogInfo {
    /**
     * The type of the catalog.
     */
    @JsonProperty("catalog_type")
    private CatalogType catalogType;
    
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this Catalog was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of Catalog creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Unique identifier of parent Metastore.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Name of Catalog.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of Catalog.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    /**
     * The name of delta sharing provider.
     * 
     * A Delta Sharing Catalog is a catalog that is based on a Delta share on a
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
     * Storage Location URL (full path) for managed tables within Catalog.
     */
    @JsonProperty("storage_location")
    private String storageLocation;
    
    /**
     * Storage root URL for managed tables within Catalog.
     */
    @JsonProperty("storage_root")
    private String storageRoot;
    
    /**
     * Time at which this Catalog was last modified, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of user who last modified Catalog.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public CatalogInfo setCatalogType(CatalogType catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    public CatalogType getCatalogType() {
        return catalogType;
    }
    
    public CatalogInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CatalogInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public CatalogInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public CatalogInfo setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public CatalogInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CatalogInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public CatalogInfo setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
    public CatalogInfo setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public String getProviderName() {
        return providerName;
    }
    
    public CatalogInfo setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    public String getShareName() {
        return shareName;
    }
    
    public CatalogInfo setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    public String getStorageLocation() {
        return storageLocation;
    }
    
    public CatalogInfo setStorageRoot(String storageRoot) {
        this.storageRoot = storageRoot;
        return this;
    }

    public String getStorageRoot() {
        return storageRoot;
    }
    
    public CatalogInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public CatalogInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
