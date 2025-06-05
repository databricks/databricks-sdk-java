// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Next ID: 17 */
@Generated
class ValidateCredentialRequestPb {
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentity azureManagedIdentity;

  @JsonProperty("credential_name")
  private String credentialName;

  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  @JsonProperty("external_location_name")
  private String externalLocationName;

  @JsonProperty("purpose")
  private CredentialPurpose purpose;

  @JsonProperty("read_only")
  private Boolean readOnly;

  @JsonProperty("url")
  private String url;

  public ValidateCredentialRequestPb setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public ValidateCredentialRequestPb setAzureManagedIdentity(
      AzureManagedIdentity azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentity getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public ValidateCredentialRequestPb setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public ValidateCredentialRequestPb setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public ValidateCredentialRequestPb setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  public String getExternalLocationName() {
    return externalLocationName;
  }

  public ValidateCredentialRequestPb setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  public ValidateCredentialRequestPb setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ValidateCredentialRequestPb setUrl(String url) {
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
    ValidateCredentialRequestPb that = (ValidateCredentialRequestPb) o;
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
    return new ToStringer(ValidateCredentialRequestPb.class)
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
