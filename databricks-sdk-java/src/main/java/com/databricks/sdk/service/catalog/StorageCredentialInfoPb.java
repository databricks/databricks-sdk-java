// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class StorageCredentialInfoPb {
  @JsonProperty("aws_iam_role")
  private AwsIamRoleResponse awsIamRole;

  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentityResponse azureManagedIdentity;

  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  @JsonProperty("cloudflare_api_token")
  private CloudflareApiToken cloudflareApiToken;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccountResponse databricksGcpServiceAccount;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("read_only")
  private Boolean readOnly;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  @JsonProperty("used_for_managed_storage")
  private Boolean usedForManagedStorage;

  public StorageCredentialInfoPb setAwsIamRole(AwsIamRoleResponse awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleResponse getAwsIamRole() {
    return awsIamRole;
  }

  public StorageCredentialInfoPb setAzureManagedIdentity(
      AzureManagedIdentityResponse azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityResponse getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public StorageCredentialInfoPb setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public StorageCredentialInfoPb setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public StorageCredentialInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public StorageCredentialInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public StorageCredentialInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public StorageCredentialInfoPb setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountResponse databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountResponse getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public StorageCredentialInfoPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public StorageCredentialInfoPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public StorageCredentialInfoPb setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public StorageCredentialInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public StorageCredentialInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public StorageCredentialInfoPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public StorageCredentialInfoPb setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public StorageCredentialInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public StorageCredentialInfoPb setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public StorageCredentialInfoPb setUsedForManagedStorage(Boolean usedForManagedStorage) {
    this.usedForManagedStorage = usedForManagedStorage;
    return this;
  }

  public Boolean getUsedForManagedStorage() {
    return usedForManagedStorage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageCredentialInfoPb that = (StorageCredentialInfoPb) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(id, that.id)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(usedForManagedStorage, that.usedForManagedStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureManagedIdentity,
        azureServicePrincipal,
        cloudflareApiToken,
        comment,
        createdAt,
        createdBy,
        databricksGcpServiceAccount,
        fullName,
        id,
        isolationMode,
        metastoreId,
        name,
        owner,
        readOnly,
        updatedAt,
        updatedBy,
        usedForManagedStorage);
  }

  @Override
  public String toString() {
    return new ToStringer(StorageCredentialInfoPb.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("fullName", fullName)
        .add("id", id)
        .add("isolationMode", isolationMode)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("usedForManagedStorage", usedForManagedStorage)
        .toString();
  }
}
