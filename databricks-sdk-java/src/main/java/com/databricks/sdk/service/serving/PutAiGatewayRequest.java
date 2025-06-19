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
@JsonSerialize(using = PutAiGatewayRequest.PutAiGatewayRequestSerializer.class)
@JsonDeserialize(using = PutAiGatewayRequest.PutAiGatewayRequestDeserializer.class)
public class PutAiGatewayRequest {
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

  /** The name of the serving endpoint whose AI Gateway is being updated. This field is required. */
  private String name;

  /** Configuration for rate limits which can be set to limit endpoint traffic. */
  private Collection<AiGatewayRateLimit> rateLimits;

  /**
   * Configuration to enable usage tracking using system tables. These tables allow you to monitor
   * operational usage on endpoints and their associated costs.
   */
  private AiGatewayUsageTrackingConfig usageTrackingConfig;

  public PutAiGatewayRequest setFallbackConfig(FallbackConfig fallbackConfig) {
    this.fallbackConfig = fallbackConfig;
    return this;
  }

  public FallbackConfig getFallbackConfig() {
    return fallbackConfig;
  }

  public PutAiGatewayRequest setGuardrails(AiGatewayGuardrails guardrails) {
    this.guardrails = guardrails;
    return this;
  }

  public AiGatewayGuardrails getGuardrails() {
    return guardrails;
  }

  public PutAiGatewayRequest setInferenceTableConfig(
      AiGatewayInferenceTableConfig inferenceTableConfig) {
    this.inferenceTableConfig = inferenceTableConfig;
    return this;
  }

  public AiGatewayInferenceTableConfig getInferenceTableConfig() {
    return inferenceTableConfig;
  }

  public PutAiGatewayRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PutAiGatewayRequest setRateLimits(Collection<AiGatewayRateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<AiGatewayRateLimit> getRateLimits() {
    return rateLimits;
  }

  public PutAiGatewayRequest setUsageTrackingConfig(
      AiGatewayUsageTrackingConfig usageTrackingConfig) {
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
    PutAiGatewayRequest that = (PutAiGatewayRequest) o;
    return Objects.equals(fallbackConfig, that.fallbackConfig)
        && Objects.equals(guardrails, that.guardrails)
        && Objects.equals(inferenceTableConfig, that.inferenceTableConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(usageTrackingConfig, that.usageTrackingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fallbackConfig, guardrails, inferenceTableConfig, name, rateLimits, usageTrackingConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(PutAiGatewayRequest.class)
        .add("fallbackConfig", fallbackConfig)
        .add("guardrails", guardrails)
        .add("inferenceTableConfig", inferenceTableConfig)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .add("usageTrackingConfig", usageTrackingConfig)
        .toString();
  }

  PutAiGatewayRequestPb toPb() {
    PutAiGatewayRequestPb pb = new PutAiGatewayRequestPb();
    pb.setFallbackConfig(fallbackConfig);
    pb.setGuardrails(guardrails);
    pb.setInferenceTableConfig(inferenceTableConfig);
    pb.setName(name);
    pb.setRateLimits(rateLimits);
    pb.setUsageTrackingConfig(usageTrackingConfig);

    return pb;
  }

  static PutAiGatewayRequest fromPb(PutAiGatewayRequestPb pb) {
    PutAiGatewayRequest model = new PutAiGatewayRequest();
    model.setFallbackConfig(pb.getFallbackConfig());
    model.setGuardrails(pb.getGuardrails());
    model.setInferenceTableConfig(pb.getInferenceTableConfig());
    model.setName(pb.getName());
    model.setRateLimits(pb.getRateLimits());
    model.setUsageTrackingConfig(pb.getUsageTrackingConfig());

    return model;
  }

  public static class PutAiGatewayRequestSerializer extends JsonSerializer<PutAiGatewayRequest> {
    @Override
    public void serialize(PutAiGatewayRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutAiGatewayRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutAiGatewayRequestDeserializer
      extends JsonDeserializer<PutAiGatewayRequest> {
    @Override
    public PutAiGatewayRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutAiGatewayRequestPb pb = mapper.readValue(p, PutAiGatewayRequestPb.class);
      return PutAiGatewayRequest.fromPb(pb);
    }
  }
}
