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
@JsonSerialize(using = CohereConfig.CohereConfigSerializer.class)
@JsonDeserialize(using = CohereConfig.CohereConfigDeserializer.class)
public class CohereConfig {
  /**
   * This is an optional field to provide a customized base URL for the Cohere API. If left
   * unspecified, the standard Cohere base URL is used.
   */
  private String cohereApiBase;

  /**
   * The Databricks secret key reference for a Cohere API key. If you prefer to paste your API key
   * directly, see `cohere_api_key_plaintext`. You must provide an API key using one of the
   * following fields: `cohere_api_key` or `cohere_api_key_plaintext`.
   */
  private String cohereApiKey;

  /**
   * The Cohere API key provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `cohere_api_key`. You must provide an API key using one of the
   * following fields: `cohere_api_key` or `cohere_api_key_plaintext`.
   */
  private String cohereApiKeyPlaintext;

  public CohereConfig setCohereApiBase(String cohereApiBase) {
    this.cohereApiBase = cohereApiBase;
    return this;
  }

  public String getCohereApiBase() {
    return cohereApiBase;
  }

  public CohereConfig setCohereApiKey(String cohereApiKey) {
    this.cohereApiKey = cohereApiKey;
    return this;
  }

  public String getCohereApiKey() {
    return cohereApiKey;
  }

  public CohereConfig setCohereApiKeyPlaintext(String cohereApiKeyPlaintext) {
    this.cohereApiKeyPlaintext = cohereApiKeyPlaintext;
    return this;
  }

  public String getCohereApiKeyPlaintext() {
    return cohereApiKeyPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CohereConfig that = (CohereConfig) o;
    return Objects.equals(cohereApiBase, that.cohereApiBase)
        && Objects.equals(cohereApiKey, that.cohereApiKey)
        && Objects.equals(cohereApiKeyPlaintext, that.cohereApiKeyPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohereApiBase, cohereApiKey, cohereApiKeyPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(CohereConfig.class)
        .add("cohereApiBase", cohereApiBase)
        .add("cohereApiKey", cohereApiKey)
        .add("cohereApiKeyPlaintext", cohereApiKeyPlaintext)
        .toString();
  }

  CohereConfigPb toPb() {
    CohereConfigPb pb = new CohereConfigPb();
    pb.setCohereApiBase(cohereApiBase);
    pb.setCohereApiKey(cohereApiKey);
    pb.setCohereApiKeyPlaintext(cohereApiKeyPlaintext);

    return pb;
  }

  static CohereConfig fromPb(CohereConfigPb pb) {
    CohereConfig model = new CohereConfig();
    model.setCohereApiBase(pb.getCohereApiBase());
    model.setCohereApiKey(pb.getCohereApiKey());
    model.setCohereApiKeyPlaintext(pb.getCohereApiKeyPlaintext());

    return model;
  }

  public static class CohereConfigSerializer extends JsonSerializer<CohereConfig> {
    @Override
    public void serialize(CohereConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CohereConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CohereConfigDeserializer extends JsonDeserializer<CohereConfig> {
    @Override
    public CohereConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CohereConfigPb pb = mapper.readValue(p, CohereConfigPb.class);
      return CohereConfig.fromPb(pb);
    }
  }
}
