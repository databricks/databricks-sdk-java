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
@JsonSerialize(using = CreateStorageCredential.CreateStorageCredentialSerializer.class)
@JsonDeserialize(using = CreateStorageCredential.CreateStorageCredentialDeserializer.class)
public class CreateStorageCredential {
  /** The AWS IAM role configuration. */
  private AwsIamRoleRequest awsIamRole;

  /** The Azure managed identity configuration. */
  private AzureManagedIdentityRequest azureManagedIdentity;

  /** The Azure service principal configuration. */
  private AzureServicePrincipal azureServicePrincipal;

  /** The Cloudflare API token configuration. */
  private CloudflareApiToken cloudflareApiToken;

  /** Comment associated with the credential. */
  private String comment;

  /** The Databricks managed GCP service account configuration. */
  private DatabricksGcpServiceAccountRequest databricksGcpServiceAccount;

  /** The credential name. The name must be unique within the metastore. */
  private String name;

  /** Whether the storage credential is only usable for read operations. */
  private Boolean readOnly;

  /** Supplying true to this argument skips validation of the created credential. */
  private Boolean skipValidation;

  public CreateStorageCredential setAwsIamRole(AwsIamRoleRequest awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleRequest getAwsIamRole() {
    return awsIamRole;
  }

  public CreateStorageCredential setAzureManagedIdentity(
      AzureManagedIdentityRequest azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityRequest getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public CreateStorageCredential setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public CreateStorageCredential setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public CreateStorageCredential setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateStorageCredential setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountRequest databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountRequest getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public CreateStorageCredential setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateStorageCredential setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public CreateStorageCredential setSkipValidation(Boolean skipValidation) {
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
    CreateStorageCredential that = (CreateStorageCredential) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(azureServicePrincipal, that.azureServicePrincipal)
        && Objects.equals(cloudflareApiToken, that.cloudflareApiToken)
        && Objects.equals(comment, that.comment)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(name, that.name)
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
        name,
        readOnly,
        skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStorageCredential.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("azureServicePrincipal", azureServicePrincipal)
        .add("cloudflareApiToken", cloudflareApiToken)
        .add("comment", comment)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("name", name)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .toString();
  }

  CreateStorageCredentialPb toPb() {
    CreateStorageCredentialPb pb = new CreateStorageCredentialPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setAzureServicePrincipal(azureServicePrincipal);
    pb.setCloudflareApiToken(cloudflareApiToken);
    pb.setComment(comment);
    pb.setDatabricksGcpServiceAccount(databricksGcpServiceAccount);
    pb.setName(name);
    pb.setReadOnly(readOnly);
    pb.setSkipValidation(skipValidation);

    return pb;
  }

  static CreateStorageCredential fromPb(CreateStorageCredentialPb pb) {
    CreateStorageCredential model = new CreateStorageCredential();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setAzureServicePrincipal(pb.getAzureServicePrincipal());
    model.setCloudflareApiToken(pb.getCloudflareApiToken());
    model.setComment(pb.getComment());
    model.setDatabricksGcpServiceAccount(pb.getDatabricksGcpServiceAccount());
    model.setName(pb.getName());
    model.setReadOnly(pb.getReadOnly());
    model.setSkipValidation(pb.getSkipValidation());

    return model;
  }

  public static class CreateStorageCredentialSerializer
      extends JsonSerializer<CreateStorageCredential> {
    @Override
    public void serialize(
        CreateStorageCredential value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateStorageCredentialPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateStorageCredentialDeserializer
      extends JsonDeserializer<CreateStorageCredential> {
    @Override
    public CreateStorageCredential deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateStorageCredentialPb pb = mapper.readValue(p, CreateStorageCredentialPb.class);
      return CreateStorageCredential.fromPb(pb);
    }
  }
}
