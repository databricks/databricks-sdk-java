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

  /** The purpose of the credential. This should only be used when the credential is specified. */
  @JsonProperty("purpose")
  private CredentialPurpose purpose;

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

  public ValidateCredentialRequest setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateCredentialRequest that = (ValidateCredentialRequest) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(purpose, that.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsIamRole, azureManagedIdentity, credentialName, purpose);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateCredentialRequest.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("credentialName", credentialName)
        .add("purpose", purpose)
        .toString();
  }
}
