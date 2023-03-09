// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class StorageCredentialInfo {
    /**
     * The AWS IAM role configuration.
     */
    @JsonProperty("aws_iam_role")
    private AwsIamRole awsIamRole;
    
    /**
     * The Azure service principal configuration.
     */
    @JsonProperty("azure_service_principal")
    private AzureServicePrincipal azureServicePrincipal;
    
    /**
     * Comment associated with the credential.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this Credential was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of credential creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * The GCP service account key configuration.
     */
    @JsonProperty("gcp_service_account_key")
    private GcpServiceAccountKey gcpServiceAccountKey;
    
    /**
     * The unique identifier of the credential.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Unique identifier of parent metastore.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * The credential name. The name must be unique within the metastore.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of credential.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Whether the storage credential is only usable for read operations.
     */
    @JsonProperty("read_only")
    private Boolean readOnly;
    
    /**
     * Time at which this credential was last modified, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of user who last modified the credential.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    /**
     * Whether this credential is the current metastore's root storage
     * credential.
     */
    @JsonProperty("used_for_managed_storage")
    private Boolean usedForManagedStorage;
    
    public StorageCredentialInfo setAwsIamRole(AwsIamRole awsIamRole) {
        this.awsIamRole = awsIamRole;
        return this;
    }

    public AwsIamRole getAwsIamRole() {
        return awsIamRole;
    }
    
    public StorageCredentialInfo setAzureServicePrincipal(AzureServicePrincipal azureServicePrincipal) {
        this.azureServicePrincipal = azureServicePrincipal;
        return this;
    }

    public AzureServicePrincipal getAzureServicePrincipal() {
        return azureServicePrincipal;
    }
    
    public StorageCredentialInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public StorageCredentialInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public StorageCredentialInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public StorageCredentialInfo setGcpServiceAccountKey(GcpServiceAccountKey gcpServiceAccountKey) {
        this.gcpServiceAccountKey = gcpServiceAccountKey;
        return this;
    }

    public GcpServiceAccountKey getGcpServiceAccountKey() {
        return gcpServiceAccountKey;
    }
    
    public StorageCredentialInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public StorageCredentialInfo setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public StorageCredentialInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public StorageCredentialInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public StorageCredentialInfo setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }
    
    public StorageCredentialInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public StorageCredentialInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
    public StorageCredentialInfo setUsedForManagedStorage(Boolean usedForManagedStorage) {
        this.usedForManagedStorage = usedForManagedStorage;
        return this;
    }

    public Boolean getUsedForManagedStorage() {
        return usedForManagedStorage;
    }
    
}
