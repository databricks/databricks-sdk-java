// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateMetastore {
    /**
     * The organization name of a Delta Sharing entity, to be used in
     * Databricks-to-Databricks Delta Sharing as the official name.
     */
    @JsonProperty("delta_sharing_organization_name")
    private String deltaSharingOrganizationName;
    
    /**
     * The lifetime of delta sharing recipient token in seconds.
     */
    @JsonProperty("delta_sharing_recipient_token_lifetime_in_seconds")
    private Long deltaSharingRecipientTokenLifetimeInSeconds;
    
    /**
     * The scope of Delta Sharing enabled for the metastore.
     */
    @JsonProperty("delta_sharing_scope")
    private UpdateMetastoreDeltaSharingScope deltaSharingScope;
    
    /**
     * Unique ID of the metastore.
     */
    
    private String id;
    
    /**
     * Databricks Unity Catalog metastore ID
     */
    
    private String metastoreId;
    
    /**
     * The user-specified name of the metastore.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The owner of the metastore.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Privilege model version of the metastore, of the form `major.minor`
     * (e.g., `1.0`).
     */
    @JsonProperty("privilege_model_version")
    private String privilegeModelVersion;
    
    /**
     * UUID of storage credential to access the metastore storage_root.
     */
    @JsonProperty("storage_root_credential_id")
    private String storageRootCredentialId;
    
    public UpdateMetastore setDeltaSharingOrganizationName(String deltaSharingOrganizationName) {
        this.deltaSharingOrganizationName = deltaSharingOrganizationName;
        return this;
    }

    public String getDeltaSharingOrganizationName() {
        return deltaSharingOrganizationName;
    }
    
    public UpdateMetastore setDeltaSharingRecipientTokenLifetimeInSeconds(Long deltaSharingRecipientTokenLifetimeInSeconds) {
        this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
        return this;
    }

    public Long getDeltaSharingRecipientTokenLifetimeInSeconds() {
        return deltaSharingRecipientTokenLifetimeInSeconds;
    }
    
    public UpdateMetastore setDeltaSharingScope(UpdateMetastoreDeltaSharingScope deltaSharingScope) {
        this.deltaSharingScope = deltaSharingScope;
        return this;
    }

    public UpdateMetastoreDeltaSharingScope getDeltaSharingScope() {
        return deltaSharingScope;
    }
    
    public UpdateMetastore setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public UpdateMetastore setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
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
    
    public UpdateMetastore setPrivilegeModelVersion(String privilegeModelVersion) {
        this.privilegeModelVersion = privilegeModelVersion;
        return this;
    }

    public String getPrivilegeModelVersion() {
        return privilegeModelVersion;
    }
    
    public UpdateMetastore setStorageRootCredentialId(String storageRootCredentialId) {
        this.storageRootCredentialId = storageRootCredentialId;
        return this;
    }

    public String getStorageRootCredentialId() {
        return storageRootCredentialId;
    }
    
}
