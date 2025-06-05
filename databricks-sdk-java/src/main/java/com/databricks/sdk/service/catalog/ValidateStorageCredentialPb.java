// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ValidateStorageCredentialPb {
  @JsonProperty("aws_iam_role")
  private AwsIamRoleRequest awsIamRole;

  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentityRequest azureManagedIdentity;

  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  @JsonProperty("cloudflare_api_token")
  private CloudflareApiToken cloudflareApiToken;

  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccountRequest databricksGcpServiceAccount;

  @JsonProperty("external_location_name")
  private String externalLocationName;

  @JsonProperty("read_only")
  private Boolean readOnly;

  @JsonProperty("storage_credential_name")
  private String storageCredentialName;

  @JsonProperty("url")
  private String url;

  public ValidateStorageCredentialPb setAwsIamRole(AwsIamRoleRequest awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleRequest getAwsIamRole() {
    return awsIamRole;
  }

  public ValidateStorageCredentialPb setAzureManagedIdentity(
      AzureManagedIdentityRequest azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityRequest getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public ValidateStorageCredentialPb setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public ValidateStorageCredentialPb setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public ValidateStorageCredentialPb setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountRequest databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountRequest getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public ValidateStorageCredentialPb setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  public String getExternalLocationName() {
    return externalLocationName;
  }

  public ValidateStorageCredentialPb setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ValidateStorageCredentialPb setStorageCredentialName(String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  public ValidateStorageCredentialPb setUrl(String url) {
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
    ValidateStorageCredentialPb that = (ValidateStorageCredentialPb) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(externalLocationName, that.externalLocationName)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(storageCredentialName, that.storageCredentialName)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureManagedIdentity,
        azureServicePrincipal,
        cloudflareApiToken,
        databricksGcpServiceAccount,
        externalLocationName,
        readOnly,
        storageCredentialName,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateStorageCredentialPb.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("externalLocationName", externalLocationName)
        .add("readOnly", readOnly)
        .add("storageCredentialName", storageCredentialName)
        .add("url", url)
        .toString();
  }
}
