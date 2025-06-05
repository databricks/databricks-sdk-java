// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Get credential configuration */
@Generated
@JsonSerialize(using = GetCredentialRequest.GetCredentialRequestSerializer.class)
@JsonDeserialize(using = GetCredentialRequest.GetCredentialRequestDeserializer.class)
public class GetCredentialRequest {
  /** Databricks Account API credential configuration ID */
  private String credentialsId;

  public GetCredentialRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialRequest that = (GetCredentialRequest) o;
    return Objects.equals(credentialsId, that.credentialsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialRequest.class)
        .add("credentialsId", credentialsId)
        .toString();
  }

  GetCredentialRequestPb toPb() {
    GetCredentialRequestPb pb = new GetCredentialRequestPb();
    pb.setCredentialsId(credentialsId);

    return pb;
  }

  static GetCredentialRequest fromPb(GetCredentialRequestPb pb) {
    GetCredentialRequest model = new GetCredentialRequest();
    model.setCredentialsId(pb.getCredentialsId());

    return model;
  }

  public static class GetCredentialRequestSerializer extends JsonSerializer<GetCredentialRequest> {
    @Override
    public void serialize(
        GetCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCredentialRequestDeserializer
      extends JsonDeserializer<GetCredentialRequest> {
    @Override
    public GetCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCredentialRequestPb pb = mapper.readValue(p, GetCredentialRequestPb.class);
      return GetCredentialRequest.fromPb(pb);
    }
  }
}
