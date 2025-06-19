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

/** Get a secret */
@Generated
@JsonSerialize(using = GetSecretRequest.GetSecretRequestSerializer.class)
@JsonDeserialize(using = GetSecretRequest.GetSecretRequestDeserializer.class)
public class GetSecretRequest {
  /** The key to fetch secret for. */
  private String key;

  /** The name of the scope to fetch secret information from. */
  private String scope;

  public GetSecretRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public GetSecretRequest setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSecretRequest that = (GetSecretRequest) o;
    return Objects.equals(key, that.key) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSecretRequest.class).add("key", key).add("scope", scope).toString();
  }

  GetSecretRequestPb toPb() {
    GetSecretRequestPb pb = new GetSecretRequestPb();
    pb.setKey(key);
    pb.setScope(scope);

    return pb;
  }

  static GetSecretRequest fromPb(GetSecretRequestPb pb) {
    GetSecretRequest model = new GetSecretRequest();
    model.setKey(pb.getKey());
    model.setScope(pb.getScope());

    return model;
  }

  public static class GetSecretRequestSerializer extends JsonSerializer<GetSecretRequest> {
    @Override
    public void serialize(GetSecretRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSecretRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSecretRequestDeserializer extends JsonDeserializer<GetSecretRequest> {
    @Override
    public GetSecretRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSecretRequestPb pb = mapper.readValue(p, GetSecretRequestPb.class);
      return GetSecretRequest.fromPb(pb);
    }
  }
}
