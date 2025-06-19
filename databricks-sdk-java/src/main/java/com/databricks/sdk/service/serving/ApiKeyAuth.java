// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = ApiKeyAuth.ApiKeyAuthSerializer.class)
@JsonDeserialize(using = ApiKeyAuth.ApiKeyAuthDeserializer.class)
public class ApiKeyAuth {
  /** The name of the API key parameter used for authentication. */
  private String key;

  /**
   * The Databricks secret key reference for an API Key. If you prefer to paste your token directly,
   * see `value_plaintext`.
   */
  private String value;

  /**
   * The API Key provided as a plaintext string. If you prefer to reference your token using
   * Databricks Secrets, see `value`.
   */
  private String valuePlaintext;

  public ApiKeyAuth setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ApiKeyAuth setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public ApiKeyAuth setValuePlaintext(String valuePlaintext) {
    this.valuePlaintext = valuePlaintext;
    return this;
  }

  public String getValuePlaintext() {
    return valuePlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiKeyAuth that = (ApiKeyAuth) o;
    return Objects.equals(key, that.key)
        && Objects.equals(value, that.value)
        && Objects.equals(valuePlaintext, that.valuePlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, valuePlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(ApiKeyAuth.class)
        .add("key", key)
        .add("value", value)
        .add("valuePlaintext", valuePlaintext)
        .toString();
  }

  ApiKeyAuthPb toPb() {
    ApiKeyAuthPb pb = new ApiKeyAuthPb();
    pb.setKey(key);
    pb.setValue(value);
    pb.setValuePlaintext(valuePlaintext);

    return pb;
  }

  static ApiKeyAuth fromPb(ApiKeyAuthPb pb) {
    ApiKeyAuth model = new ApiKeyAuth();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());
    model.setValuePlaintext(pb.getValuePlaintext());

    return model;
  }

  public static class ApiKeyAuthSerializer extends JsonSerializer<ApiKeyAuth> {
    @Override
    public void serialize(ApiKeyAuth value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ApiKeyAuthPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ApiKeyAuthDeserializer extends JsonDeserializer<ApiKeyAuth> {
    @Override
    public ApiKeyAuth deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ApiKeyAuthPb pb = mapper.readValue(p, ApiKeyAuthPb.class);
      return ApiKeyAuth.fromPb(pb);
    }
  }
}
