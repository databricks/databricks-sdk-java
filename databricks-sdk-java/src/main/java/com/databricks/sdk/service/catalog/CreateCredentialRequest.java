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
@JsonSerialize(using = CreateCredentialRequest.CreateCredentialRequestSerializer.class)
@JsonDeserialize(using = CreateCredentialRequest.CreateCredentialRequestDeserializer.class)
public class CreateCredentialRequest {
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
   * The credential name. The name must be unique among storage and service credentials within the
   * metastore.
   */
  private String name;

  /** Indicates the purpose of the credential. */
  private CredentialPurpose purpose;

  /**
   * Whether the credential is usable only for read operations. Only applicable when purpose is
   * **STORAGE**.
   */
  private Boolean readOnly;

  /**
   * Optional. Supplying true to this argument skips validation of the created set of credentials.
   */
  private Boolean skipValidation;

  public CreateCredentialRequest setAwsIamRole(AwsIamRole awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRole getAwsIamRole() {
    return awsIamRole;
  }

  public CreateCredentialRequest setAzureManagedIdentity(
      AzureManagedIdentity azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentity getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public CreateCredentialRequest setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public CreateCredentialRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateCredentialRequest setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public CreateCredentialRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCredentialRequest setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  public CreateCredentialRequest setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public CreateCredentialRequest setSkipValidation(Boolean skipValidation) {
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
    CreateCredentialRequest that = (CreateCredentialRequest) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(comment, that.comment)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(name, that.name)
        && Objects.equals(purpose, that.purpose)
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
        name,
        purpose,
        readOnly,
        skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialRequest.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("comment", comment)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("name", name)
        .add("purpose", purpose)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .toString();
  }

  CreateCredentialRequestPb toPb() {
    CreateCredentialRequestPb pb = new CreateCredentialRequestPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setAzureServicePrincipal(azureServicePrincipal);
    pb.setComment(comment);
    pb.setDatabricksGcpServiceAccount(databricksGcpServiceAccount);
    pb.setName(name);
    pb.setPurpose(purpose);
    pb.setReadOnly(readOnly);
    pb.setSkipValidation(skipValidation);

    return pb;
  }

  static CreateCredentialRequest fromPb(CreateCredentialRequestPb pb) {
    CreateCredentialRequest model = new CreateCredentialRequest();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setAzureServicePrincipal(pb.getAzureServicePrincipal());
    model.setComment(pb.getComment());
    model.setDatabricksGcpServiceAccount(pb.getDatabricksGcpServiceAccount());
    model.setName(pb.getName());
    model.setPurpose(pb.getPurpose());
    model.setReadOnly(pb.getReadOnly());
    model.setSkipValidation(pb.getSkipValidation());

    return model;
  }

  public static class CreateCredentialRequestSerializer
      extends JsonSerializer<CreateCredentialRequest> {
    @Override
    public void serialize(
        CreateCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCredentialRequestDeserializer
      extends JsonDeserializer<CreateCredentialRequest> {
    @Override
    public CreateCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCredentialRequestPb pb = mapper.readValue(p, CreateCredentialRequestPb.class);
      return CreateCredentialRequest.fromPb(pb);
    }
  }
}
