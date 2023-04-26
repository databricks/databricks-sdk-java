// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ValidateStorageCredential class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ValidateStorageCredential {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** The name of an existing external location to validate. */
  @JsonProperty("external_location_name")
  private String externalLocationName;

  /** The GCP service account key configuration. */
  @JsonProperty("gcp_service_account_key")
  private GcpServiceAccountKey gcpServiceAccountKey;

  /** Whether the storage credential is only usable for read operations. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** The name of the storage credential to validate. */
  @JsonProperty("storage_credential_name")
  private Object /* MISSING TYPE */ storageCredentialName;

  /** The external location url to validate. */
  @JsonProperty("url")
  private String url;

  /**
   * <p>Setter for the field <code>awsIamRole</code>.</p>
   *
   * @param awsIamRole a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setAwsIamRole(AwsIamRole awsIamRole) {
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
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setAzureServicePrincipal(
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
   * <p>Setter for the field <code>externalLocationName</code>.</p>
   *
   * @param externalLocationName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalLocationName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExternalLocationName() {
    return externalLocationName;
  }

  /**
   * <p>Setter for the field <code>gcpServiceAccountKey</code>.</p>
   *
   * @param gcpServiceAccountKey a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setGcpServiceAccountKey(
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
   * <p>Setter for the field <code>readOnly</code>.</p>
   *
   * @param readOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setReadOnly(Boolean readOnly) {
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
   * <p>Setter for the field <code>storageCredentialName</code>.</p>
   *
   * @param storageCredentialName a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setStorageCredentialName(
      Object /* MISSING TYPE */ storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageCredentialName</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getStorageCredentialName() {
    return storageCredentialName;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredential} object
   */
  public ValidateStorageCredential setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateStorageCredential that = (ValidateStorageCredential) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(externalLocationName, that.externalLocationName)
        && Objects.equals(gcpServiceAccountKey, that.gcpServiceAccountKey)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(storageCredentialName, that.storageCredentialName)
        && Objects.equals(url, that.url);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureServicePrincipal,
        externalLocationName,
        gcpServiceAccountKey,
        readOnly,
        storageCredentialName,
        url);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ValidateStorageCredential.class)
        .add("awsIamRole", awsIamRole)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("externalLocationName", externalLocationName)
        .add("gcpServiceAccountKey", gcpServiceAccountKey)
        .add("readOnly", readOnly)
        .add("storageCredentialName", storageCredentialName)
        .add("url", url)
        .toString();
  }
}
