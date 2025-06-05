// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateCredentialRequest.UpdateCredentialRequestSerializer.class)
@JsonDeserialize(using = UpdateCredentialRequest.UpdateCredentialRequestDeserializer.class)
public class UpdateCredentialRequest {
  /** The AWS IAM role configuration */
  private AwsIamRole awsIamRole;

  /** The Azure managed identity configuration. */
  private AzureManagedIdentity azureManagedIdentity;

  /** The Azure service principal configuration. Only applicable when purpose is **STORAGE**. */
  private AzureServicePrincipal azureServicePrincipal;

  /** Comment associated with the credential. */
  private String comment;

  /** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  /**
   * Force an update even if there are dependent services (when purpose is **SERVICE**) or dependent
   * external locations and external tables (when purpose is **STORAGE**).
   */
  private Boolean force;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  private IsolationMode isolationMode;

  /** Name of the credential. */
  private String nameArg;

  /** New name of credential. */
  private String newName;

  /** Username of current owner of credential. */
  private String owner;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  private Boolean readOnly;

  /** Supply true to this argument to skip validation of the updated credential. */
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

  UpdateCredentialRequestPb toPb() {
    UpdateCredentialRequestPb pb = new UpdateCredentialRequestPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setAzureServicePrincipal(azureServicePrincipal);
    pb.setComment(comment);
    pb.setDatabricksGcpServiceAccount(databricksGcpServiceAccount);
    pb.setForce(force);
    pb.setIsolationMode(isolationMode);
    pb.setNameArg(nameArg);
    pb.setNewName(newName);
    pb.setOwner(owner);
    pb.setReadOnly(readOnly);
    pb.setSkipValidation(skipValidation);

    return pb;
  }

  static UpdateCredentialRequest fromPb(UpdateCredentialRequestPb pb) {
    UpdateCredentialRequest model = new UpdateCredentialRequest();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setAzureServicePrincipal(pb.getAzureServicePrincipal());
    model.setComment(pb.getComment());
    model.setDatabricksGcpServiceAccount(pb.getDatabricksGcpServiceAccount());
    model.setForce(pb.getForce());
    model.setIsolationMode(pb.getIsolationMode());
    model.setNameArg(pb.getNameArg());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());
    model.setReadOnly(pb.getReadOnly());
    model.setSkipValidation(pb.getSkipValidation());

    return model;
  }

  public static class UpdateCredentialRequestSerializer
      extends JsonSerializer<UpdateCredentialRequest> {
    @Override
    public void serialize(
        UpdateCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCredentialRequestDeserializer
      extends JsonDeserializer<UpdateCredentialRequest> {
    @Override
    public UpdateCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCredentialRequestPb pb = mapper.readValue(p, UpdateCredentialRequestPb.class);
      return UpdateCredentialRequest.fromPb(pb);
    }
  }
}
