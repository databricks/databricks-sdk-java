// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateStorageCredential class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateStorageCredential {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** The GCP service account key configuration. */
  @JsonProperty("gcp_service_account_key")
  private GcpServiceAccountKey gcpServiceAccountKey;

  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  /** The credential name. The name must be unique within the metastore. */
  @JsonProperty("name")
  private String name;

  /** Whether the storage credential is only usable for read operations. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Supplying true to this argument skips validation of the created credential. */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  /**
   * <p>Setter for the field <code>awsIamRole</code>.</p>
   *
   * @param awsIamRole a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setAwsIamRole(AwsIamRole awsIamRole) {
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
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setAzureServicePrincipal(
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
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setComment(String comment) {
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
   * <p>Setter for the field <code>gcpServiceAccountKey</code>.</p>
   *
   * @param gcpServiceAccountKey a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setGcpServiceAccountKey(
      GcpServiceAccountKey gcpServiceAccountKey) {
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
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setName(String name) {
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
   * <p>Setter for the field <code>readOnly</code>.</p>
   *
   * @param readOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setReadOnly(Boolean readOnly) {
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
   * <p>Setter for the field <code>skipValidation</code>.</p>
   *
   * @param skipValidation a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   */
  public CreateStorageCredential setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  /**
   * <p>Getter for the field <code>skipValidation</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateStorageCredential that = (CreateStorageCredential) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(comment, that.comment)
        && Objects.equals(gcpServiceAccountKey, that.gcpServiceAccountKey)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(skipValidation, that.skipValidation);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureServicePrincipal,
        comment,
        gcpServiceAccountKey,
        metastoreId,
        name,
        readOnly,
        skipValidation);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateStorageCredential.class)
        .add("awsIamRole", awsIamRole)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("comment", comment)
        .add("gcpServiceAccountKey", gcpServiceAccountKey)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .toString();
  }
}
