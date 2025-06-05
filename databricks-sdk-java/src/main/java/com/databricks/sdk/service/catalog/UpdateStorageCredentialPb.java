// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateStorageCredentialPb {
  @JsonProperty("aws_iam_role")
  private AwsIamRoleRequest awsIamRole;

  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentityResponse azureManagedIdentity;

  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  @JsonProperty("cloudflare_api_token")
  private CloudflareApiToken cloudflareApiToken;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccountRequest databricksGcpServiceAccount;

  @JsonProperty("force")
  private Boolean force;

  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  @JsonIgnore private String name;

  @JsonProperty("new_name")
  private String newName;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("read_only")
  private Boolean readOnly;

  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  public UpdateStorageCredentialPb setAwsIamRole(AwsIamRoleRequest awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleRequest getAwsIamRole() {
    return awsIamRole;
  }

  public UpdateStorageCredentialPb setAzureManagedIdentity(
      AzureManagedIdentityResponse azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityResponse getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public UpdateStorageCredentialPb setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public UpdateStorageCredentialPb setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public UpdateStorageCredentialPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateStorageCredentialPb setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountRequest databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountRequest getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public UpdateStorageCredentialPb setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public UpdateStorageCredentialPb setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateStorageCredentialPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateStorageCredentialPb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateStorageCredentialPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateStorageCredentialPb setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public UpdateStorageCredentialPb setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateStorageCredentialPb that = (UpdateStorageCredentialPb) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(force, that.force)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(skipValidation, that.skipValidation);
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
        force,
        isolationMode,
        name,
        newName,
        owner,
        readOnly,
        skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateStorageCredentialPb.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("force", force)
        .add("isolationMode", isolationMode)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .toString();
  }
}
