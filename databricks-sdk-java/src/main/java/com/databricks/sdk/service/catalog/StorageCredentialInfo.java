// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>StorageCredentialInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StorageCredentialInfo {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this Credential was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of credential creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** The GCP service account key configuration. */
  @JsonProperty("gcp_service_account_key")
  private GcpServiceAccountKey gcpServiceAccountKey;

  /** The unique identifier of the credential. */
  @JsonProperty("id")
  private String id;

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

  /**
   * <p>Setter for the field <code>awsIamRole</code>.</p>
   *
   * @param awsIamRole a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsIamRole</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   */
  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  /**
   * <p>Setter for the field <code>azureServicePrincipal</code>.</p>
   *
   * @param azureServicePrincipal a {@link com.databricks.sdk.service.catalog.AzureServicePrincipal} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureServicePrincipal</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.AzureServicePrincipal} object
   */
  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>createdBy</code>.</p>
   *
   * @param createdBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * <p>Setter for the field <code>gcpServiceAccountKey</code>.</p>
   *
   * @param gcpServiceAccountKey a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setGcpServiceAccountKey(GcpServiceAccountKey gcpServiceAccountKey) {
    this.gcpServiceAccountKey = gcpServiceAccountKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>gcpServiceAccountKey</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   */
  public GcpServiceAccountKey getGcpServiceAccountKey() {
    return gcpServiceAccountKey;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMetastoreId() {
    return metastoreId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>owner</code>.</p>
   *
   * @param owner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * <p>Getter for the field <code>owner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOwner() {
    return owner;
  }

  /**
   * <p>Setter for the field <code>readOnly</code>.</p>
   *
   * @param readOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * <p>Getter for the field <code>readOnly</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>updatedBy</code>.</p>
   *
   * @param updatedBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * <p>Setter for the field <code>usedForManagedStorage</code>.</p>
   *
   * @param usedForManagedStorage a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo setUsedForManagedStorage(Boolean usedForManagedStorage) {
    this.usedForManagedStorage = usedForManagedStorage;
    return this;
  }

  /**
   * <p>Getter for the field <code>usedForManagedStorage</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUsedForManagedStorage() {
    return usedForManagedStorage;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageCredentialInfo that = (StorageCredentialInfo) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(gcpServiceAccountKey, that.gcpServiceAccountKey)
        && Objects.equals(id, that.id)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(usedForManagedStorage, that.usedForManagedStorage);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureServicePrincipal,
        comment,
        createdAt,
        createdBy,
        gcpServiceAccountKey,
        id,
        metastoreId,
        name,
        owner,
        readOnly,
        updatedAt,
        updatedBy,
        usedForManagedStorage);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StorageCredentialInfo.class)
        .add("awsIamRole", awsIamRole)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("gcpServiceAccountKey", gcpServiceAccountKey)
        .add("id", id)
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
