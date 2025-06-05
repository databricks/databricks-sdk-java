// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PutAiGatewayRequestPb {
  @JsonProperty("fallback_config")
  private FallbackConfig fallbackConfig;

  @JsonProperty("guardrails")
  private AiGatewayGuardrails guardrails;

  @JsonProperty("inference_table_config")
  private AiGatewayInferenceTableConfig inferenceTableConfig;

  @JsonIgnore private String name;

  @JsonProperty("rate_limits")
  private Collection<AiGatewayRateLimit> rateLimits;

  @JsonProperty("usage_tracking_config")
  private AiGatewayUsageTrackingConfig usageTrackingConfig;

  public PutAiGatewayRequestPb setFallbackConfig(FallbackConfig fallbackConfig) {
    this.fallbackConfig = fallbackConfig;
    return this;
  }

  public FallbackConfig getFallbackConfig() {
    return fallbackConfig;
  }

  public PutAiGatewayRequestPb setGuardrails(AiGatewayGuardrails guardrails) {
    this.guardrails = guardrails;
    return this;
  }

  public AiGatewayGuardrails getGuardrails() {
    return guardrails;
  }

  public PutAiGatewayRequestPb setInferenceTableConfig(
      AiGatewayInferenceTableConfig inferenceTableConfig) {
    this.inferenceTableConfig = inferenceTableConfig;
    return this;
  }

  public AiGatewayInferenceTableConfig getInferenceTableConfig() {
    return inferenceTableConfig;
  }

  public PutAiGatewayRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PutAiGatewayRequestPb setRateLimits(Collection<AiGatewayRateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<AiGatewayRateLimit> getRateLimits() {
    return rateLimits;
  }

  public PutAiGatewayRequestPb setUsageTrackingConfig(
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
    PutAiGatewayRequestPb that = (PutAiGatewayRequestPb) o;
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
    return new ToStringer(PutAiGatewayRequestPb.class)
        .add("fallbackConfig", fallbackConfig)
        .add("guardrails", guardrails)
        .add("inferenceTableConfig", inferenceTableConfig)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .add("usageTrackingConfig", usageTrackingConfig)
        .toString();
  }
}
