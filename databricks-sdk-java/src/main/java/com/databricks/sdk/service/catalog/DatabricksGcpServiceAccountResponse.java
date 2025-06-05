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
@JsonSerialize(
    using = DatabricksGcpServiceAccountResponse.DatabricksGcpServiceAccountResponseSerializer.class)
@JsonDeserialize(
    using =
        DatabricksGcpServiceAccountResponse.DatabricksGcpServiceAccountResponseDeserializer.class)
public class DatabricksGcpServiceAccountResponse {
  /**
   * The Databricks internal ID that represents this service account. This is an output-only field.
   */
  private String credentialId;

  /** The email of the service account. This is an output-only field. */
  private String email;

  public DatabricksGcpServiceAccountResponse setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public DatabricksGcpServiceAccountResponse setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksGcpServiceAccountResponse that = (DatabricksGcpServiceAccountResponse) o;
    return Objects.equals(credentialId, that.credentialId) && Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, email);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksGcpServiceAccountResponse.class)
        .add("credentialId", credentialId)
        .add("email", email)
        .toString();
  }

  DatabricksGcpServiceAccountResponsePb toPb() {
    DatabricksGcpServiceAccountResponsePb pb = new DatabricksGcpServiceAccountResponsePb();
    pb.setCredentialId(credentialId);
    pb.setEmail(email);

    return pb;
  }

  static DatabricksGcpServiceAccountResponse fromPb(DatabricksGcpServiceAccountResponsePb pb) {
    DatabricksGcpServiceAccountResponse model = new DatabricksGcpServiceAccountResponse();
    model.setCredentialId(pb.getCredentialId());
    model.setEmail(pb.getEmail());

    return model;
  }

  public static class DatabricksGcpServiceAccountResponseSerializer
      extends JsonSerializer<DatabricksGcpServiceAccountResponse> {
    @Override
    public void serialize(
        DatabricksGcpServiceAccountResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabricksGcpServiceAccountResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabricksGcpServiceAccountResponseDeserializer
      extends JsonDeserializer<DatabricksGcpServiceAccountResponse> {
    @Override
    public DatabricksGcpServiceAccountResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabricksGcpServiceAccountResponsePb pb =
          mapper.readValue(p, DatabricksGcpServiceAccountResponsePb.class);
      return DatabricksGcpServiceAccountResponse.fromPb(pb);
    }
  }
}
