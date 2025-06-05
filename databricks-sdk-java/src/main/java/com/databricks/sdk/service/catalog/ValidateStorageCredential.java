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
@JsonSerialize(using = ValidateStorageCredential.ValidateStorageCredentialSerializer.class)
@JsonDeserialize(using = ValidateStorageCredential.ValidateStorageCredentialDeserializer.class)
public class ValidateStorageCredential {
  /** The AWS IAM role configuration. */
  private AwsIamRoleRequest awsIamRole;

  /** The Azure managed identity configuration. */
  private AzureManagedIdentityRequest azureManagedIdentity;

  /** The Azure service principal configuration. */
  private AzureServicePrincipal azureServicePrincipal;

  /** The Cloudflare API token configuration. */
  private CloudflareApiToken cloudflareApiToken;

  /** The Databricks created GCP service account configuration. */
  private DatabricksGcpServiceAccountRequest databricksGcpServiceAccount;

  /** The name of an existing external location to validate. */
  private String externalLocationName;

  /** Whether the storage credential is only usable for read operations. */
  private Boolean readOnly;

  /** The name of the storage credential to validate. */
  private String storageCredentialName;

  /** The external location url to validate. */
  private String url;

  public ValidateStorageCredential setAwsIamRole(AwsIamRoleRequest awsIamRole) {
    this.awsIamRole = awsIamRole;
    return this;
  }

  public AwsIamRoleRequest getAwsIamRole() {
    return awsIamRole;
  }

  public ValidateStorageCredential setAzureManagedIdentity(
      AzureManagedIdentityRequest azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

  public AzureManagedIdentityRequest getAzureManagedIdentity() {
    return azureManagedIdentity;
  }

  public ValidateStorageCredential setAzureServicePrincipal(
      AzureServicePrincipal azureServicePrincipal) {
    this.azureServicePrincipal = azureServicePrincipal;
    return this;
  }

  public AzureServicePrincipal getAzureServicePrincipal() {
    return azureServicePrincipal;
  }

  public ValidateStorageCredential setCloudflareApiToken(CloudflareApiToken cloudflareApiToken) {
    this.cloudflareApiToken = cloudflareApiToken;
    return this;
  }

  public CloudflareApiToken getCloudflareApiToken() {
    return cloudflareApiToken;
  }

  public ValidateStorageCredential setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccountRequest databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccountRequest getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public ValidateStorageCredential setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  public String getExternalLocationName() {
    return externalLocationName;
  }

  public ValidateStorageCredential setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ValidateStorageCredential setStorageCredentialName(String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  public ValidateStorageCredential setUrl(String url) {
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
    ValidateStorageCredential that = (ValidateStorageCredential) o;
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
    return new ToStringer(ValidateStorageCredential.class)
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

  ValidateStorageCredentialPb toPb() {
    ValidateStorageCredentialPb pb = new ValidateStorageCredentialPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setAzureServicePrincipal(azureServicePrincipal);
    pb.setCloudflareApiToken(cloudflareApiToken);
    pb.setDatabricksGcpServiceAccount(databricksGcpServiceAccount);
    pb.setExternalLocationName(externalLocationName);
    pb.setReadOnly(readOnly);
    pb.setStorageCredentialName(storageCredentialName);
    pb.setUrl(url);

    return pb;
  }

  static ValidateStorageCredential fromPb(ValidateStorageCredentialPb pb) {
    ValidateStorageCredential model = new ValidateStorageCredential();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setAzureServicePrincipal(pb.getAzureServicePrincipal());
    model.setCloudflareApiToken(pb.getCloudflareApiToken());
    model.setDatabricksGcpServiceAccount(pb.getDatabricksGcpServiceAccount());
    model.setExternalLocationName(pb.getExternalLocationName());
    model.setReadOnly(pb.getReadOnly());
    model.setStorageCredentialName(pb.getStorageCredentialName());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class ValidateStorageCredentialSerializer
      extends JsonSerializer<ValidateStorageCredential> {
    @Override
    public void serialize(
        ValidateStorageCredential value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ValidateStorageCredentialPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ValidateStorageCredentialDeserializer
      extends JsonDeserializer<ValidateStorageCredential> {
    @Override
    public ValidateStorageCredential deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ValidateStorageCredentialPb pb = mapper.readValue(p, ValidateStorageCredentialPb.class);
      return ValidateStorageCredential.fromPb(pb);
    }
  }
}
