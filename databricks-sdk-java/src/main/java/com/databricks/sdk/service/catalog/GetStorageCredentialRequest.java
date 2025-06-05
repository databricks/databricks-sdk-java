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
@JsonSerialize(using = GetStorageCredentialRequest.GetStorageCredentialRequestSerializer.class)
@JsonDeserialize(using = GetStorageCredentialRequest.GetStorageCredentialRequestDeserializer.class)
public class GetStorageCredentialRequest {
  /** Name of the storage credential. */
  private String name;

  public GetStorageCredentialRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStorageCredentialRequest that = (GetStorageCredentialRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStorageCredentialRequest.class).add("name", name).toString();
  }

  GetStorageCredentialRequestPb toPb() {
    GetStorageCredentialRequestPb pb = new GetStorageCredentialRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetStorageCredentialRequest fromPb(GetStorageCredentialRequestPb pb) {
    GetStorageCredentialRequest model = new GetStorageCredentialRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetStorageCredentialRequestSerializer
      extends JsonSerializer<GetStorageCredentialRequest> {
    @Override
    public void serialize(
        GetStorageCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetStorageCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetStorageCredentialRequestDeserializer
      extends JsonDeserializer<GetStorageCredentialRequest> {
    @Override
    public GetStorageCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetStorageCredentialRequestPb pb = mapper.readValue(p, GetStorageCredentialRequestPb.class);
      return GetStorageCredentialRequest.fromPb(pb);
    }
  }
}
