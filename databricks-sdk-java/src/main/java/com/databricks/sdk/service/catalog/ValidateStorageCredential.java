// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  public ValidateStorageCredential setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public ValidateStorageCredential setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public ValidateStorageCredential setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  public String getExternalLocationName() {
    return externalLocationName;
  }

  public ValidateStorageCredential setGcpServiceAccountKey(
      GcpServiceAccountKey gcpServiceAccountKey) {
    this.gcpServiceAccountKey = gcpServiceAccountKey;
    return this;
  }

  public GcpServiceAccountKey getGcpServiceAccountKey() {
    return gcpServiceAccountKey;
  }

  public ValidateStorageCredential setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ValidateStorageCredential setStorageCredentialName(
      Object /* MISSING TYPE */ storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public Object /* MISSING TYPE */ getStorageCredentialName() {
    return storageCredentialName;
  }

  public ValidateStorageCredential setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

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
