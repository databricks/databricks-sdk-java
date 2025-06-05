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

/** Next ID: 17 */
@Generated
@JsonSerialize(using = ValidateCredentialRequest.ValidateCredentialRequestSerializer.class)
@JsonDeserialize(using = ValidateCredentialRequest.ValidateCredentialRequestDeserializer.class)
public class ValidateCredentialRequest {
  /** The AWS IAM role configuration */
  private AwsIamRole awsIamRole;

  /** The Azure managed identity configuration. */
  private AzureManagedIdentity azureManagedIdentity;

  /** Required. The name of an existing credential or long-lived cloud credential to validate. */
  private String credentialName;

  /** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
  private DatabricksGcpServiceAccount databricksGcpServiceAccount;

  /**
   * The name of an existing external location to validate. Only applicable for storage credentials
   * (purpose is **STORAGE**.)
   */
  private String externalLocationName;

  /** The purpose of the credential. This should only be used when the credential is specified. */
  private CredentialPurpose purpose;

  /**
   * Whether the credential is only usable for read operations. Only applicable for storage
   * credentials (purpose is **STORAGE**.)
   */
  private Boolean readOnly;

  /** The external location url to validate. Only applicable when purpose is **STORAGE**. */
  private String url;

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

  public ValidateCredentialRequest setDatabricksGcpServiceAccount(
      DatabricksGcpServiceAccount databricksGcpServiceAccount) {
    this.databricksGcpServiceAccount = databricksGcpServiceAccount;
    return this;
  }

  public DatabricksGcpServiceAccount getDatabricksGcpServiceAccount() {
    return databricksGcpServiceAccount;
  }

  public ValidateCredentialRequest setExternalLocationName(String externalLocationName) {
    this.externalLocationName = externalLocationName;
    return this;
  }

  public String getExternalLocationName() {
    return externalLocationName;
  }

  public ValidateCredentialRequest setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  public ValidateCredentialRequest setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ValidateCredentialRequest setUrl(String url) {
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
    ValidateCredentialRequest that = (ValidateCredentialRequest) o;
    return Objects.equals(awsIamRole, that.awsIamRole)
        && Objects.equals(azureManagedIdentity, that.azureManagedIdentity)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(databricksGcpServiceAccount, that.databricksGcpServiceAccount)
        && Objects.equals(externalLocationName, that.externalLocationName)
        && Objects.equals(purpose, that.purpose)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsIamRole,
        azureManagedIdentity,
        credentialName,
        databricksGcpServiceAccount,
        externalLocationName,
        purpose,
        readOnly,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateCredentialRequest.class)
        .add("awsIamRole", awsIamRole)
        .add("azureManagedIdentity", azureManagedIdentity)
        .add("credentialName", credentialName)
        .add("databricksGcpServiceAccount", databricksGcpServiceAccount)
        .add("externalLocationName", externalLocationName)
        .add("purpose", purpose)
        .add("readOnly", readOnly)
        .add("url", url)
        .toString();
  }

  ValidateCredentialRequestPb toPb() {
    ValidateCredentialRequestPb pb = new ValidateCredentialRequestPb();
    pb.setAwsIamRole(awsIamRole);
    pb.setAzureManagedIdentity(azureManagedIdentity);
    pb.setCredentialName(credentialName);
    pb.setDatabricksGcpServiceAccount(databricksGcpServiceAccount);
    pb.setExternalLocationName(externalLocationName);
    pb.setPurpose(purpose);
    pb.setReadOnly(readOnly);
    pb.setUrl(url);

    return pb;
  }

  static ValidateCredentialRequest fromPb(ValidateCredentialRequestPb pb) {
    ValidateCredentialRequest model = new ValidateCredentialRequest();
    model.setAwsIamRole(pb.getAwsIamRole());
    model.setAzureManagedIdentity(pb.getAzureManagedIdentity());
    model.setCredentialName(pb.getCredentialName());
    model.setDatabricksGcpServiceAccount(pb.getDatabricksGcpServiceAccount());
    model.setExternalLocationName(pb.getExternalLocationName());
    model.setPurpose(pb.getPurpose());
    model.setReadOnly(pb.getReadOnly());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class ValidateCredentialRequestSerializer
      extends JsonSerializer<ValidateCredentialRequest> {
    @Override
    public void serialize(
        ValidateCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ValidateCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ValidateCredentialRequestDeserializer
      extends JsonDeserializer<ValidateCredentialRequest> {
    @Override
    public ValidateCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ValidateCredentialRequestPb pb = mapper.readValue(p, ValidateCredentialRequestPb.class);
      return ValidateCredentialRequest.fromPb(pb);
    }
  }
}
