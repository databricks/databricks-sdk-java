// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CredentialInfo {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure managed identity configuration. */
  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentity azureManagedIdentity;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this credential was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of credential creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** The Databricks managed GCP service account configuration. */
  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  /** The full name of the credential. */
  @JsonProperty("full_name")
  private String fullName;

  /** The unique identifier of the credential. */
  @JsonProperty("id")
  private String id;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  /** Unique identifier of the parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * The credential name. The name must be unique among storage and service credentials within the
   * metastore.
   */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of credential. */
  @JsonProperty("owner")
  private String owner;

  /** Indicates the purpose of the credential. */
  @JsonProperty("purpose")
  private CredentialPurpose purpose;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Time at which this credential was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified the credential. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * Whether this credential is the current metastore's root storage credential. Only applicable
   * when purpose is **STORAGE**.
   */
  @JsonProperty("used_for_managed_storage")
  private Boolean usedForManagedStorage;

  public CredentialInfo setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public CredentialInfo setAzureManagedIdentity(AzureManagedIdentity azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentity getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public CredentialInfo setAzureServicePrincipal(AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public CredentialInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CredentialInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CredentialInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public CredentialInfo setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public CredentialInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public CredentialInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CredentialInfo setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public CredentialInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public CredentialInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CredentialInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CredentialInfo setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  public CredentialInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public CredentialInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public CredentialInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public CredentialInfo setUsedForManagedStorage(Boolean usedForManagedStorage) {
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
    CredentialInfo that = (CredentialInfo) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
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
        && Objects.equals(purpose, that.purpose)
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
        purpose,
        readOnly,
        updatedAt,
        updatedBy,
        usedForManagedStorage);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialInfo.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
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
        .add("purpose", purpose)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("usedForManagedStorage", usedForManagedStorage)
        .toString();
  }
}
