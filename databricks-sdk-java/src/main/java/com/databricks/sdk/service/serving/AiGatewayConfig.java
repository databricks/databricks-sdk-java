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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = AiGatewayConfig.AiGatewayConfigSerializer.class)
@JsonDeserialize(using = AiGatewayConfig.AiGatewayConfigDeserializer.class)
public class AiGatewayConfig {
  /**
   * Configuration for traffic fallback which auto fallbacks to other served entities if the request
   * to a served entity fails with certain error codes, to increase availability.
   */
  private FallbackConfig fallbackConfig;

  /**
   * Configuration for AI Guardrails to prevent unwanted data and unsafe data in requests and
   * responses.
   */
  private AiGatewayGuardrails guardrails;

  /**
   * Configuration for payload logging using inference tables. Use these tables to monitor and audit
   * data being sent to and received from model APIs and to improve model quality.
   */
  private AiGatewayInferenceTableConfig inferenceTableConfig;

  /** Configuration for rate limits which can be set to limit endpoint traffic. */
  private Collection<AiGatewayRateLimit> rateLimits;

  /**
   * Configuration to enable usage tracking using system tables. These tables allow you to monitor
   * operational usage on endpoints and their associated costs.
   */
  private AiGatewayUsageTrackingConfig usageTrackingConfig;

  public AiGatewayConfig setFallbackConfig(FallbackConfig fallbackConfig) {
    this.fallbackConfig = fallbackConfig;
    return this;
  }

  public FallbackConfig getFallbackConfig() {
    return fallbackConfig;
  }

  public AiGatewayConfig setGuardrails(AiGatewayGuardrails guardrails) {
    this.guardrails = guardrails;
    return this;
  }

  public AiGatewayGuardrails getGuardrails() {
    return guardrails;
  }

  public AiGatewayConfig setInferenceTableConfig(
      AiGatewayInferenceTableConfig inferenceTableConfig) {
    this.inferenceTableConfig = inferenceTableConfig;
    return this;
  }

  public AiGatewayInferenceTableConfig getInferenceTableConfig() {
    return inferenceTableConfig;
  }

  public AiGatewayConfig setRateLimits(Collection<AiGatewayRateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<AiGatewayRateLimit> getRateLimits() {
    return rateLimits;
  }

  public AiGatewayConfig setUsageTrackingConfig(AiGatewayUsageTrackingConfig usageTrackingConfig) {
    this.usageTrackingConfig = usageTrackingConfig;
    return this;
  }

  public AiGatewayUsageTrackingConfig getUsageTrackingConfig() {
    return usageTrackingConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayConfig that = (AiGatewayConfig) o;
    return Objects.equals(fallbackConfig, that.fallbackConfig)
        && Objects.equals(guardrails, that.guardrails)
        && Objects.equals(inferenceTableConfig, that.inferenceTableConfig)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(usageTrackingConfig, that.usageTrackingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fallbackConfig, guardrails, inferenceTableConfig, rateLimits, usageTrackingConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayConfig.class)
        .add("fallbackConfig", fallbackConfig)
        .add("guardrails", guardrails)
        .add("inferenceTableConfig", inferenceTableConfig)
        .add("rateLimits", rateLimits)
        .add("usageTrackingConfig", usageTrackingConfig)
        .toString();
  }

  AiGatewayConfigPb toPb() {
    AiGatewayConfigPb pb = new AiGatewayConfigPb();
    pb.setFallbackConfig(fallbackConfig);
    pb.setGuardrails(guardrails);
    pb.setInferenceTableConfig(inferenceTableConfig);
    pb.setRateLimits(rateLimits);
    pb.setUsageTrackingConfig(usageTrackingConfig);

    return pb;
  }

  static AiGatewayConfig fromPb(AiGatewayConfigPb pb) {
    AiGatewayConfig model = new AiGatewayConfig();
    model.setFallbackConfig(pb.getFallbackConfig());
    model.setGuardrails(pb.getGuardrails());
    model.setInferenceTableConfig(pb.getInferenceTableConfig());
    model.setRateLimits(pb.getRateLimits());
    model.setUsageTrackingConfig(pb.getUsageTrackingConfig());

    return model;
  }

  public static class AiGatewayConfigSerializer extends JsonSerializer<AiGatewayConfig> {
    @Override
    public void serialize(AiGatewayConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayConfigDeserializer extends JsonDeserializer<AiGatewayConfig> {
    @Override
    public AiGatewayConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayConfigPb pb = mapper.readValue(p, AiGatewayConfigPb.class);
      return AiGatewayConfig.fromPb(pb);
    }
  }
}
