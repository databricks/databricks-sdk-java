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
@JsonSerialize(using = AnthropicConfig.AnthropicConfigSerializer.class)
@JsonDeserialize(using = AnthropicConfig.AnthropicConfigDeserializer.class)
public class AnthropicConfig {
  /**
   * The Databricks secret key reference for an Anthropic API key. If you prefer to paste your API
   * key directly, see `anthropic_api_key_plaintext`. You must provide an API key using one of the
   * following fields: `anthropic_api_key` or `anthropic_api_key_plaintext`.
   */
  private String anthropicApiKey;

  /**
   * The Anthropic API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `anthropic_api_key`. You must provide an API key using one of the
   * following fields: `anthropic_api_key` or `anthropic_api_key_plaintext`.
   */
  private String anthropicApiKeyPlaintext;

  public AnthropicConfig setAnthropicApiKey(String anthropicApiKey) {
    this.anthropicApiKey = anthropicApiKey;
    return this;
  }

  public String getAnthropicApiKey() {
    return anthropicApiKey;
  }

  public AnthropicConfig setAnthropicApiKeyPlaintext(String anthropicApiKeyPlaintext) {
    this.anthropicApiKeyPlaintext = anthropicApiKeyPlaintext;
    return this;
  }

  public String getAnthropicApiKeyPlaintext() {
    return anthropicApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnthropicConfig that = (AnthropicConfig) o;
    return Objects.equals(anthropicApiKey, that.anthropicApiKey)
        && Objects.equals(anthropicApiKeyPlaintext, that.anthropicApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anthropicApiKey, anthropicApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(AnthropicConfig.class)
        .add("anthropicApiKey", anthropicApiKey)
        .add("anthropicApiKeyPlaintext", anthropicApiKeyPlaintext)
        .toString();
  }

  AnthropicConfigPb toPb() {
    AnthropicConfigPb pb = new AnthropicConfigPb();
    pb.setAnthropicApiKey(anthropicApiKey);
    pb.setAnthropicApiKeyPlaintext(anthropicApiKeyPlaintext);

    return pb;
  }

  static AnthropicConfig fromPb(AnthropicConfigPb pb) {
    AnthropicConfig model = new AnthropicConfig();
    model.setAnthropicApiKey(pb.getAnthropicApiKey());
    model.setAnthropicApiKeyPlaintext(pb.getAnthropicApiKeyPlaintext());

    return model;
  }

  public static class AnthropicConfigSerializer extends JsonSerializer<AnthropicConfig> {
    @Override
    public void serialize(AnthropicConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AnthropicConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AnthropicConfigDeserializer extends JsonDeserializer<AnthropicConfig> {
    @Override
    public AnthropicConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AnthropicConfigPb pb = mapper.readValue(p, AnthropicConfigPb.class);
      return AnthropicConfig.fromPb(pb);
    }
  }
}
