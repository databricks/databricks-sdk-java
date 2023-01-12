// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class MetastoreInfo {
    /**
     * Time at which this Metastore was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of Metastore creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Unique identifier of (Default) Data Access Configuration
     */
    @JsonProperty("default_data_access_config_id")
    private String defaultDataAccessConfigId;
    
    /**
     * Whether Delta Sharing is enabled on this metastore.
     */
    @JsonProperty("delta_sharing_enabled")
    private Boolean deltaSharingEnabled;
    
    /**
     * The lifetime of delta sharing recipient token in seconds
     */
    @JsonProperty("delta_sharing_recipient_token_lifetime_in_seconds")
    private Long deltaSharingRecipientTokenLifetimeInSeconds;
    
    /**
     * Unique identifier of Metastore.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Name of Metastore.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The owner of the metastore.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * The region this metastore has an afinity to. This is used by
     * accounts-manager. Ignored by Unity Catalog.
     */
    @JsonProperty("region")
    private String region;
    
    /**
     * Storage root URL for Metastore
     */
    @JsonProperty("storage_root")
    private String storageRoot;
    
    /**
     * UUID of storage credential to access storage_root
     */
    @JsonProperty("storage_root_credential_id")
    private String storageRootCredentialId;
    
    /**
     * Time at which the Metastore was last modified, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of user who last modified the Metastore.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public MetastoreInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public MetastoreInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public MetastoreInfo setDefaultDataAccessConfigId(String defaultDataAccessConfigId) {
        this.defaultDataAccessConfigId = defaultDataAccessConfigId;
        return this;
    }

    public String getDefaultDataAccessConfigId() {
        return defaultDataAccessConfigId;
    }
    
    public MetastoreInfo setDeltaSharingEnabled(Boolean deltaSharingEnabled) {
        this.deltaSharingEnabled = deltaSharingEnabled;
        return this;
    }

    public Boolean getDeltaSharingEnabled() {
        return deltaSharingEnabled;
    }
    
    public MetastoreInfo setDeltaSharingRecipientTokenLifetimeInSeconds(Long deltaSharingRecipientTokenLifetimeInSeconds) {
        this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
        return this;
    }

    public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
        return deltaSharingRecipientTokenLifetimeInSeconds;
    }
    
    public MetastoreInfo setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public MetastoreInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public MetastoreInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public MetastoreInfo setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return region;
    }
    
    public MetastoreInfo setStorageRoot(String storageRoot) {
        this.storageRoot = storageRoot;
        return this;
    }

    public String getStorageRoot() {
        return storageRoot;
    }
    
    public MetastoreInfo setStorageRootCredentialId(String storageRootCredentialId) {
        this.storageRootCredentialId = storageRootCredentialId;
        return this;
    }

    public String getStorageRootCredentialId() {
        return storageRootCredentialId;
    }
    
    public MetastoreInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public MetastoreInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
