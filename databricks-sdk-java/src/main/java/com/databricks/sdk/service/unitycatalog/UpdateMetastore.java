// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateMetastore {
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
     * Required. Unique ID of the Metastore (from URL).
     */
    
    private String id;
    
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
     * UUID of storage credential to access storage_root
     */
    @JsonProperty("storage_root_credential_id")
    private String storageRootCredentialId;
    
    public UpdateMetastore setDefaultDataAccessConfigId(String defaultDataAccessConfigId) {
        this.defaultDataAccessConfigId = defaultDataAccessConfigId;
        return this;
    }

    public String getDefaultDataAccessConfigId() {
        return defaultDataAccessConfigId;
    }
    
    public UpdateMetastore setDeltaSharingEnabled(Boolean deltaSharingEnabled) {
        this.deltaSharingEnabled = deltaSharingEnabled;
        return this;
    }

    public Boolean getDeltaSharingEnabled() {
        return deltaSharingEnabled;
    }
    
    public UpdateMetastore setDeltaSharingRecipientTokenLifetimeInSeconds(Long deltaSharingRecipientTokenLifetimeInSeconds) {
        this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
        return this;
    }

    public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
        return deltaSharingRecipientTokenLifetimeInSeconds;
    }
    
    public UpdateMetastore setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public UpdateMetastore setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateMetastore setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateMetastore setStorageRootCredentialId(String storageRootCredentialId) {
        this.storageRootCredentialId = storageRootCredentialId;
        return this;
    }

    public String getStorageRootCredentialId() {
        return storageRootCredentialId;
    }
    
}
