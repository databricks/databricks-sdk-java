// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ValidateCredentialRequest {
  /** The AWS IAM role configuration */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure managed identity configuration. */
  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentity azureManagedIdentity;

  /** Required. The name of an existing credential or long-lived cloud credential to validate. */
  @JsonProperty("credential_name")
  private String credentialName;

  /** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  /**
   * The name of an existing external location to validate. Only applicable for storage credentials
   * (purpose is **STORAGE**.)
   */
  @JsonProperty("external_location_name")
  private String externalLocationName;

  /** The purpose of the credential. This should only be used when the credential is specified. */
  @JsonProperty("purpose")
  private CredentialPurpose purpose;

  /**
   * Whether the credential is only usable for read operations. Only applicable for storage
   * credentials (purpose is **STORAGE**.)
   */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** The external location url to validate. Only applicable when purpose is **STORAGE**. */
  @JsonProperty("url")
  private String url;

  public ValidateCredentialRequest setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public ValidateCredentialRequest setAzureManagedIdentity(
      AzureManagedIdentity azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentity getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public ValidateCredentialRequest setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public ValidateCredentialRequest setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public ValidateCredentialRequest setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  public String getExternalLocationName() {
    return externalLocationName;
  }

  public ValidateCredentialRequest setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  public ValidateCredentialRequest setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ValidateCredentialRequest setUrl(String url) {
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
    ValidateCredentialRequest that = (ValidateCredentialRequest) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(externalLocationName, that.externalLocationName)
        && Objects.equals(purpose, that.purpose)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureManagedIdentity,
        credentialName,
        databricksGcpServiceAccount,
        externalLocationName,
        purpose,
        readOnly,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateCredentialRequest.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("credentialName", credentialName)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("externalLocationName", externalLocationName)
        .add("purpose", purpose)
        .add("readOnly", readOnly)
        .add("url", url)
        .toString();
  }
}
