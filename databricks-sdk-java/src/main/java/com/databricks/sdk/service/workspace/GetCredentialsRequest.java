// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Get a credential entry */
@Generated
@JsonSerialize(using = GetCredentialsRequest.GetCredentialsRequestSerializer.class)
@JsonDeserialize(using = GetCredentialsRequest.GetCredentialsRequestDeserializer.class)
public class GetCredentialsRequest {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  public GetCredentialsRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialsRequest that = (GetCredentialsRequest) o;
    return Objects.equals(credentialId, that.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialsRequest.class).add("credentialId", credentialId).toString();
  }

  GetCredentialsRequestPb toPb() {
    GetCredentialsRequestPb pb = new GetCredentialsRequestPb();
    pb.setCredentialId(credentialId);

    return pb;
  }

  static GetCredentialsRequest fromPb(GetCredentialsRequestPb pb) {
    GetCredentialsRequest model = new GetCredentialsRequest();
    model.setCredentialId(pb.getCredentialId());

    return model;
  }

  public static class GetCredentialsRequestSerializer
      extends JsonSerializer<GetCredentialsRequest> {
    @Override
    public void serialize(
        GetCredentialsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCredentialsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCredentialsRequestDeserializer
      extends JsonDeserializer<GetCredentialsRequest> {
    @Override
    public GetCredentialsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCredentialsRequestPb pb = mapper.readValue(p, GetCredentialsRequestPb.class);
      return GetCredentialsRequest.fromPb(pb);
    }
  }
}
