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
@JsonSerialize(using = NccEgressConfig.NccEgressConfigSerializer.class)
@JsonDeserialize(using = NccEgressConfig.NccEgressConfigDeserializer.class)
public class NccEgressConfig {
  /**
   * The network connectivity rules that are applied by default without resource specific
   * configurations. You can find the stable network information of your serverless compute
   * resources here.
   */
  private NccEgressDefaultRules defaultRules;

  /**
   * The network connectivity rules that configured for each destinations. These rules override
   * default rules.
   */
  private NccEgressTargetRules targetRules;

  public NccEgressConfig setDefaultRules(NccEgressDefaultRules defaultRules) {
    this.defaultRules = defaultRules;
    return this;
  }

  public NccEgressDefaultRules getDefaultRules() {
    return defaultRules;
  }

  public NccEgressConfig setTargetRules(NccEgressTargetRules targetRules) {
    this.targetRules = targetRules;
    return this;
  }

  public NccEgressTargetRules getTargetRules() {
    return targetRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressConfig that = (NccEgressConfig) o;
    return Objects.equals(defaultRules, that.defaultRules)
        && Objects.equals(targetRules, that.targetRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRules, targetRules);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressConfig.class)
        .add("defaultRules", defaultRules)
        .add("targetRules", targetRules)
        .toString();
  }

  NccEgressConfigPb toPb() {
    NccEgressConfigPb pb = new NccEgressConfigPb();
    pb.setDefaultRules(defaultRules);
    pb.setTargetRules(targetRules);

    return pb;
  }

  static NccEgressConfig fromPb(NccEgressConfigPb pb) {
    NccEgressConfig model = new NccEgressConfig();
    model.setDefaultRules(pb.getDefaultRules());
    model.setTargetRules(pb.getTargetRules());

    return model;
  }

  public static class NccEgressConfigSerializer extends JsonSerializer<NccEgressConfig> {
    @Override
    public void serialize(NccEgressConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NccEgressConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NccEgressConfigDeserializer extends JsonDeserializer<NccEgressConfig> {
    @Override
    public NccEgressConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NccEgressConfigPb pb = mapper.readValue(p, NccEgressConfigPb.class);
      return NccEgressConfig.fromPb(pb);
    }
  }
}
