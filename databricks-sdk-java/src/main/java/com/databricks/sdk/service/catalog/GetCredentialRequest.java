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

/** Get a credential */
@Generated
@JsonSerialize(using = GetCredentialRequest.GetCredentialRequestSerializer.class)
@JsonDeserialize(using = GetCredentialRequest.GetCredentialRequestDeserializer.class)
public class GetCredentialRequest {
  /** Name of the credential. */
  private String nameArg;

  public GetCredentialRequest setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialRequest that = (GetCredentialRequest) o;
    return Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialRequest.class).add("nameArg", nameArg).toString();
  }

  GetCredentialRequestPb toPb() {
    GetCredentialRequestPb pb = new GetCredentialRequestPb();
    pb.setNameArg(nameArg);

    return pb;
  }

  static GetCredentialRequest fromPb(GetCredentialRequestPb pb) {
    GetCredentialRequest model = new GetCredentialRequest();
    model.setNameArg(pb.getNameArg());

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
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCredentialRequestPb pb = mapper.readValue(p, GetCredentialRequestPb.class);
      return GetCredentialRequest.fromPb(pb);
    }
  }
}
