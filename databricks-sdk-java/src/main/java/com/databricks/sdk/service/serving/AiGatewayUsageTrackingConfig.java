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
@JsonSerialize(using = AiGatewayUsageTrackingConfig.AiGatewayUsageTrackingConfigSerializer.class)
@JsonDeserialize(
    using = AiGatewayUsageTrackingConfig.AiGatewayUsageTrackingConfigDeserializer.class)
public class AiGatewayUsageTrackingConfig {
  /** Whether to enable usage tracking. */
  private Boolean enabled;

  public AiGatewayUsageTrackingConfig setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayUsageTrackingConfig that = (AiGatewayUsageTrackingConfig) o;
    return Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayUsageTrackingConfig.class).add("enabled", enabled).toString();
  }

  AiGatewayUsageTrackingConfigPb toPb() {
    AiGatewayUsageTrackingConfigPb pb = new AiGatewayUsageTrackingConfigPb();
    pb.setEnabled(enabled);

    return pb;
  }

  static AiGatewayUsageTrackingConfig fromPb(AiGatewayUsageTrackingConfigPb pb) {
    AiGatewayUsageTrackingConfig model = new AiGatewayUsageTrackingConfig();
    model.setEnabled(pb.getEnabled());

    return model;
  }

  public static class AiGatewayUsageTrackingConfigSerializer
      extends JsonSerializer<AiGatewayUsageTrackingConfig> {
    @Override
    public void serialize(
        AiGatewayUsageTrackingConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayUsageTrackingConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayUsageTrackingConfigDeserializer
      extends JsonDeserializer<AiGatewayUsageTrackingConfig> {
    @Override
    public AiGatewayUsageTrackingConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayUsageTrackingConfigPb pb = mapper.readValue(p, AiGatewayUsageTrackingConfigPb.class);
      return AiGatewayUsageTrackingConfig.fromPb(pb);
    }
  }
}
