// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAccountsStorageCredential {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRoleRequest awsIamRole;

  /** The Azure managed identity configuration. */
  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentityResponse azureManagedIdentity;

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
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  /** Username of current owner of credential. */
  @JsonProperty("owner")
  private String owner;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  @JsonProperty("read_only")
  private Boolean readOnly;

  public UpdateAccountsStorageCredential setAwsIamRole(AwsIamRoleRequest awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleRequest getAwsIamRole() {
    return awsIamRole;
  }

  public UpdateAccountsStorageCredential setAzureManagedIdentity(
      AzureManagedIdentityResponse azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityResponse getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public UpdateAccountsStorageCredential setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public UpdateAccountsStorageCredential setCloudflareApiToken(
      CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public UpdateAccountsStorageCredential setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateAccountsStorageCredential setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountRequest databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountRequest getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public UpdateAccountsStorageCredential setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateAccountsStorageCredential setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateAccountsStorageCredential setReadOnly(Boolean readOnly) {
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
    UpdateAccountsStorageCredential that = (UpdateAccountsStorageCredential) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(owner, that.owner)
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
        isolationMode,
        owner,
        readOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAccountsStorageCredential.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("isolationMode", isolationMode)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .toString();
  }
}
