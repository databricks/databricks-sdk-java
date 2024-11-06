// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class StorageCredentialInfo {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRoleResponse awsIamRole;

  /** The Azure managed identity configuration. */
  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentityResponse azureManagedIdentity;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** The Cloudflare API token configuration. */
  @JsonProperty("cloudflare_api_token")
  private CloudflareApiToken cloudflareApiToken;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this Credential was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of credential creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** The Databricks managed GCP service account configuration. */
  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccountResponse databricksGcpServiceAccount;

  /** The unique identifier of the credential. */
  @JsonProperty("id")
  private String id;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The credential name. The name must be unique within the metastore. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of credential. */
  @JsonProperty("owner")
  private String owner;

  /** Whether the storage credential is only usable for read operations. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Time at which this credential was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified the credential. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** Whether this credential is the current metastore's root storage credential. */
  @JsonProperty("used_for_managed_storage")
  private Boolean usedForManagedStorage;

  public StorageCredentialInfo setAwsIamRole(AwsIamRoleResponse awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleResponse getAwsIamRole() {
    return awsIamRole;
  }

  public StorageCredentialInfo setAzureManagedIdentity(
      AzureManagedIdentityResponse azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityResponse getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public StorageCredentialInfo setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public StorageCredentialInfo setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
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

  public StorageCredentialInfo setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountResponse databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountResponse getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public StorageCredentialInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public StorageCredentialInfo setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageCredentialInfo that = (StorageCredentialInfo) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
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
    return new ToStringer(StorageCredentialInfo.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
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
