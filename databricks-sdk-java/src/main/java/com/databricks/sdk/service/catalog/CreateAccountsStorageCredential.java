// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAccountsStorageCredential {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRoleRequest awsIamRole;

  /** The Azure managed identity configuration. */
  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentityRequest azureManagedIdentity;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** The Cloudflare API token configuration. */
  @JsonProperty("cloudflare_api_token")
  private CloudflareApiToken cloudflareApiToken;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** The Databricks managed GCP service account configuration. */
  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccountRequest databricksGcpServiceAccount;

  /**
   * The credential name. The name must be unique among storage and service credentials within the
   * metastore.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  @JsonProperty("read_only")
  private Boolean readOnly;

  public CreateAccountsStorageCredential setAwsIamRole(AwsIamRoleRequest awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleRequest getAwsIamRole() {
    return awsIamRole;
  }

  public CreateAccountsStorageCredential setAzureManagedIdentity(
      AzureManagedIdentityRequest azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityRequest getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public CreateAccountsStorageCredential setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public CreateAccountsStorageCredential setCloudflareApiToken(
      CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public CreateAccountsStorageCredential setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateAccountsStorageCredential setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountRequest databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountRequest getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public CreateAccountsStorageCredential setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateAccountsStorageCredential setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAccountsStorageCredential that = (CreateAccountsStorageCredential) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(name, that.name)
        && Objects.equals(readOnly, that.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureManagedIdentity,
        azureServicePrincipal,
        cloudflareApiToken,
        comment,
        databricksGcpServiceAccount,
        name,
        readOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccountsStorageCredential.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("name", name)
        .add("readOnly", readOnly)
        .toString();
  }
}
