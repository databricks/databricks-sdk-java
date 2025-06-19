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

/** GCP long-lived credential. Databricks-created Google Cloud Storage service account. */
@Generated
@JsonSerialize(using = DatabricksGcpServiceAccount.DatabricksGcpServiceAccountSerializer.class)
@JsonDeserialize(using = DatabricksGcpServiceAccount.DatabricksGcpServiceAccountDeserializer.class)
public class DatabricksGcpServiceAccount {
  /**
   * The Databricks internal ID that represents this managed identity. This field is only used to
   * persist the credential_id once it is fetched from the credentials manager - as we only use the
   * protobuf serializer to store credentials, this ID gets persisted to the database
   */
  private String credentialId;

  /** The email of the service account. */
  private String email;

  /** The ID that represents the private key for this Service Account */
  private String privateKeyId;

  public DatabricksGcpServiceAccount setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public DatabricksGcpServiceAccount setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public DatabricksGcpServiceAccount setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

  public String getPrivateKeyId() {
    return privateKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksGcpServiceAccount that = (DatabricksGcpServiceAccount) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(email, that.email)
        && Objects.equals(privateKeyId, that.privateKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, email, privateKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksGcpServiceAccount.class)
        .add("credentialId", credentialId)
        .add("email", email)
        .add("privateKeyId", privateKeyId)
        .toString();
  }

  DatabricksGcpServiceAccountPb toPb() {
    DatabricksGcpServiceAccountPb pb = new DatabricksGcpServiceAccountPb();
    pb.setCredentialId(credentialId);
    pb.setEmail(email);
    pb.setPrivateKeyId(privateKeyId);

    return pb;
  }

  static DatabricksGcpServiceAccount fromPb(DatabricksGcpServiceAccountPb pb) {
    DatabricksGcpServiceAccount model = new DatabricksGcpServiceAccount();
    model.setCredentialId(pb.getCredentialId());
    model.setEmail(pb.getEmail());
    model.setPrivateKeyId(pb.getPrivateKeyId());

    return model;
  }

  public static class DatabricksGcpServiceAccountSerializer
      extends JsonSerializer<DatabricksGcpServiceAccount> {
    @Override
    public void serialize(
        DatabricksGcpServiceAccount value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabricksGcpServiceAccountPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabricksGcpServiceAccountDeserializer
      extends JsonDeserializer<DatabricksGcpServiceAccount> {
    @Override
    public DatabricksGcpServiceAccount deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabricksGcpServiceAccountPb pb = mapper.readValue(p, DatabricksGcpServiceAccountPb.class);
      return DatabricksGcpServiceAccount.fromPb(pb);
    }
  }
}
