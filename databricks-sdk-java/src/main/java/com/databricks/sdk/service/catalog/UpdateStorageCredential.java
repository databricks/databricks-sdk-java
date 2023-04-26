// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateStorageCredential class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateStorageCredential {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** Force update even if there are dependent external locations or external tables. */
  @JsonProperty("force")
  private Boolean force;

  /** The GCP service account key configuration. */
  @JsonProperty("gcp_service_account_key")
  private GcpServiceAccountKey gcpServiceAccountKey;

  /** The credential name. The name must be unique within the metastore. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of credential. */
  @JsonProperty("owner")
  private String owner;

  /** Whether the storage credential is only usable for read operations. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Supplying true to this argument skips validation of the updated credential. */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  /**
   * <p>Setter for the field <code>awsIamRole</code>.</p>
   *
   * @param awsIamRole a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setAwsIamRole(AwsIamRole awsIamRole) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setAzureServicePrincipal(
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setComment(String comment) {
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
   * <p>Setter for the field <code>force</code>.</p>
   *
   * @param force a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setForce(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * <p>Getter for the field <code>force</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getForce() {
    return force;
  }

  /**
   * <p>Setter for the field <code>gcpServiceAccountKey</code>.</p>
   *
   * @param gcpServiceAccountKey a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setGcpServiceAccountKey(
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setOwner(String owner) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setReadOnly(Boolean readOnly) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateStorageCredential} object
   */
  public UpdateStorageCredential setSkipValidation(Boolean skipValidation) {
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
    UpdateStorageCredential that = (UpdateStorageCredential) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(comment, that.comment)
        && Objects.equals(force, that.force)
        && Objects.equals(gcpServiceAccountKey, that.gcpServiceAccountKey)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
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
        force,
        gcpServiceAccountKey,
        name,
        owner,
        readOnly,
        skipValidation);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateStorageCredential.class)
        .add("awsIamRole", awsIamRole)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("comment", comment)
        .add("force", force)
        .add("gcpServiceAccountKey", gcpServiceAccountKey)
        .add("name", name)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .toString();
  }
}
