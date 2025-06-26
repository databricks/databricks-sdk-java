// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCredentialRequest {
  /** The AWS IAM role configuration. */
  @JsonProperty("aws_iam_role")
  private AwsIamRole awsIamRole;

  /** The Azure managed identity configuration. */
  @JsonProperty("azure_managed_identity")
  private AzureManagedIdentity azureManagedIdentity;

  /** The Azure service principal configuration. */
  @JsonProperty("azure_service_principal")
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  @JsonProperty("comment")
  private String comment;

  /** The Databricks managed GCP service account configuration. */
  @JsonProperty("databricks_gcp_service_account")
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  /**
   * Force an update even if there are dependent services (when purpose is **SERVICE**) or dependent
   * external locations and external tables (when purpose is **STORAGE**).
   */
  @JsonProperty("force")
  private Boolean force;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  /** Name of the credential. */
  @JsonIgnore private String nameArg;

  /** New name of credential. */
  @JsonProperty("new_name")
  private String newName;

  /** Username of current owner of credential. */
  @JsonProperty("owner")
  private String owner;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Supply true to this argument to skip validation of the updated credential. */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  public UpdateCredentialRequest setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public UpdateCredentialRequest setAzureManagedIdentity(
      AzureManagedIdentity azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentity getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public UpdateCredentialRequest setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public UpdateCredentialRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateCredentialRequest setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public UpdateCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public UpdateCredentialRequest setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateCredentialRequest setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  public UpdateCredentialRequest setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateCredentialRequest setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateCredentialRequest setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public UpdateCredentialRequest setSkipValidation(Boolean skipValidation) {
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
    UpdateCredentialRequest that = (UpdateCredentialRequest) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(comment, that.comment)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(force, that.force)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(nameArg, that.nameArg)
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
        comment,
        databricksGcpServiceAccount,
        force,
        isolationMode,
        nameArg,
        newName,
        owner,
        readOnly,
        skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCredentialRequest.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("comment", comment)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("force", force)
        .add("isolationMode", isolationMode)
        .add("nameArg", nameArg)
        .add("newName", newName)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .toString();
  }
}
