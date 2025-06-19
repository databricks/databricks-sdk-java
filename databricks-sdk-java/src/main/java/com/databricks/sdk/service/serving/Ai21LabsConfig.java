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
@JsonSerialize(using = Ai21LabsConfig.Ai21LabsConfigSerializer.class)
@JsonDeserialize(using = Ai21LabsConfig.Ai21LabsConfigDeserializer.class)
public class Ai21LabsConfig {
  /**
   * The Databricks secret key reference for an AI21 Labs API key. If you prefer to paste your API
   * key directly, see `ai21labs_api_key_plaintext`. You must provide an API key using one of the
   * following fields: `ai21labs_api_key` or `ai21labs_api_key_plaintext`.
   */
  private String ai21labsApiKey;

  /**
   * An AI21 Labs API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `ai21labs_api_key`. You must provide an API key using one of the
   * following fields: `ai21labs_api_key` or `ai21labs_api_key_plaintext`.
   */
  private String ai21labsApiKeyPlaintext;

  public Ai21LabsConfig setAi21labsApiKey(String ai21labsApiKey) {
    this.ai21labsApiKey = ai21labsApiKey;
    return this;
  }

  public String getAi21labsApiKey() {
    return ai21labsApiKey;
  }

  public Ai21LabsConfig setAi21labsApiKeyPlaintext(String ai21labsApiKeyPlaintext) {
    this.ai21labsApiKeyPlaintext = ai21labsApiKeyPlaintext;
    return this;
  }

  public String getAi21labsApiKeyPlaintext() {
    return ai21labsApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ai21LabsConfig that = (Ai21LabsConfig) o;
    return Objects.equals(ai21labsApiKey, that.ai21labsApiKey)
        && Objects.equals(ai21labsApiKeyPlaintext, that.ai21labsApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ai21labsApiKey, ai21labsApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(Ai21LabsConfig.class)
        .add("ai21labsApiKey", ai21labsApiKey)
        .add("ai21labsApiKeyPlaintext", ai21labsApiKeyPlaintext)
        .toString();
  }

  Ai21LabsConfigPb toPb() {
    Ai21LabsConfigPb pb = new Ai21LabsConfigPb();
    pb.setAi21labsApiKey(ai21labsApiKey);
    pb.setAi21labsApiKeyPlaintext(ai21labsApiKeyPlaintext);

    return pb;
  }

  static Ai21LabsConfig fromPb(Ai21LabsConfigPb pb) {
    Ai21LabsConfig model = new Ai21LabsConfig();
    model.setAi21labsApiKey(pb.getAi21labsApiKey());
    model.setAi21labsApiKeyPlaintext(pb.getAi21labsApiKeyPlaintext());

    return model;
  }

  public static class Ai21LabsConfigSerializer extends JsonSerializer<Ai21LabsConfig> {
    @Override
    public void serialize(Ai21LabsConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      Ai21LabsConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class Ai21LabsConfigDeserializer extends JsonDeserializer<Ai21LabsConfig> {
    @Override
    public Ai21LabsConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      Ai21LabsConfigPb pb = mapper.readValue(p, Ai21LabsConfigPb.class);
      return Ai21LabsConfig.fromPb(pb);
    }
  }
}
