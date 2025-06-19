// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = PagerdutyConfig.PagerdutyConfigSerializer.class)
@JsonDeserialize(using = PagerdutyConfig.PagerdutyConfigDeserializer.class)
public class PagerdutyConfig {
  /** [Input-Only] Integration key for PagerDuty. */
  private String integrationKey;

  /** [Output-Only] Whether integration key is set. */
  private Boolean integrationKeySet;

  public PagerdutyConfig setIntegrationKey(String integrationKey) {
    this.integrationKey = integrationKey;
    return this;
  }

  public String getIntegrationKey() {
    return integrationKey;
  }

  public PagerdutyConfig setIntegrationKeySet(Boolean integrationKeySet) {
    this.integrationKeySet = integrationKeySet;
    return this;
  }

  public Boolean getIntegrationKeySet() {
    return integrationKeySet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PagerdutyConfig that = (PagerdutyConfig) o;
    return Objects.equals(integrationKey, that.integrationKey)
        && Objects.equals(integrationKeySet, that.integrationKeySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationKey, integrationKeySet);
  }

  @Override
  public String toString() {
    return new ToStringer(PagerdutyConfig.class)
        .add("integrationKey", integrationKey)
        .add("integrationKeySet", integrationKeySet)
        .toString();
  }

  PagerdutyConfigPb toPb() {
    PagerdutyConfigPb pb = new PagerdutyConfigPb();
    pb.setIntegrationKey(integrationKey);
    pb.setIntegrationKeySet(integrationKeySet);

    return pb;
  }

  static PagerdutyConfig fromPb(PagerdutyConfigPb pb) {
    PagerdutyConfig model = new PagerdutyConfig();
    model.setIntegrationKey(pb.getIntegrationKey());
    model.setIntegrationKeySet(pb.getIntegrationKeySet());

    return model;
  }

  public static class PagerdutyConfigSerializer extends JsonSerializer<PagerdutyConfig> {
    @Override
    public void serialize(PagerdutyConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PagerdutyConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PagerdutyConfigDeserializer extends JsonDeserializer<PagerdutyConfig> {
    @Override
    public PagerdutyConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PagerdutyConfigPb pb = mapper.readValue(p, PagerdutyConfigPb.class);
      return PagerdutyConfig.fromPb(pb);
    }
  }
}
