// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SchemaInfo {
    /**
     * Name of parent catalog.
     */
    @JsonProperty("catalog_name")
    private String catalogName;
    
    /**
     * The type of the parent catalog.
     */
    @JsonProperty("catalog_type")
    private String catalogType;
    
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this schema was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of schema creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Full name of schema, in form of __catalog_name__.__schema_name__.
     */
    @JsonProperty("full_name")
    private String fullName;
    
    /**
     * Unique identifier of parent metastore.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Name of schema, relative to parent catalog.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of schema.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * A map of key-value properties attached to the securable.
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    /**
     * Storage location for managed tables within schema.
     */
    @JsonProperty("storage_location")
    private String storageLocation;
    
    /**
     * Storage root URL for managed tables within schema.
     */
    @JsonProperty("storage_root")
    private String storageRoot;
    
    /**
     * Time at which this schema was created, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of user who last modified schema.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public SchemaInfo setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }
    
    public SchemaInfo setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    public String getCatalogType() {
        return catalogType;
    }
    
    public SchemaInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public SchemaInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public SchemaInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public SchemaInfo setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public SchemaInfo setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public SchemaInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public SchemaInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public SchemaInfo setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
    public SchemaInfo setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    public String getStorageLocation() {
        return storageLocation;
    }
    
    public SchemaInfo setStorageRoot(String storageRoot) {
        this.storageRoot = storageRoot;
        return this;
    }

    public String getStorageRoot() {
        return storageRoot;
    }
    
    public SchemaInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public SchemaInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
