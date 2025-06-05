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

@Generated
@JsonSerialize(using = GetSecretResponse.GetSecretResponseSerializer.class)
@JsonDeserialize(using = GetSecretResponse.GetSecretResponseDeserializer.class)
public class GetSecretResponse {
  /** A unique name to identify the secret. */
  private String key;

  /** The value of the secret in its byte representation. */
  private String value;

  public GetSecretResponse setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public GetSecretResponse setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSecretResponse that = (GetSecretResponse) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSecretResponse.class).add("key", key).add("value", value).toString();
  }

  GetSecretResponsePb toPb() {
    GetSecretResponsePb pb = new GetSecretResponsePb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static GetSecretResponse fromPb(GetSecretResponsePb pb) {
    GetSecretResponse model = new GetSecretResponse();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class GetSecretResponseSerializer extends JsonSerializer<GetSecretResponse> {
    @Override
    public void serialize(GetSecretResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSecretResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSecretResponseDeserializer extends JsonDeserializer<GetSecretResponse> {
    @Override
    public GetSecretResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSecretResponsePb pb = mapper.readValue(p, GetSecretResponsePb.class);
      return GetSecretResponse.fromPb(pb);
    }
  }
}
