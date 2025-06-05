// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class AiGatewayConfigPb {
  @JsonProperty("fallback_config")
  private FallbackConfig fallbackConfig;

  @JsonProperty("guardrails")
  private AiGatewayGuardrails guardrails;

  @JsonProperty("inference_table_config")
  private AiGatewayInferenceTableConfig inferenceTableConfig;

  @JsonProperty("rate_limits")
  private Collection<AiGatewayRateLimit> rateLimits;

  @JsonProperty("usage_tracking_config")
  private AiGatewayUsageTrackingConfig usageTrackingConfig;

  public AiGatewayConfigPb setFallbackConfig(FallbackConfig fallbackConfig) {
    this.fallbackConfig = fallbackConfig;
    return this;
  }

  public FallbackConfig getFallbackConfig() {
    return fallbackConfig;
  }

  public AiGatewayConfigPb setGuardrails(AiGatewayGuardrails guardrails) {
    this.guardrails = guardrails;
    return this;
  }

  public AiGatewayGuardrails getGuardrails() {
    return guardrails;
  }

  public AiGatewayConfigPb setInferenceTableConfig(
      AiGatewayInferenceTableConfig inferenceTableConfig) {
    this.inferenceTableConfig = inferenceTableConfig;
    return this;
  }

  public AiGatewayInferenceTableConfig getInferenceTableConfig() {
    return inferenceTableConfig;
  }

  public AiGatewayConfigPb setRateLimits(Collection<AiGatewayRateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<AiGatewayRateLimit> getRateLimits() {
    return rateLimits;
  }

  public AiGatewayConfigPb setUsageTrackingConfig(
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
    AiGatewayConfigPb that = (AiGatewayConfigPb) o;
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
    return new ToStringer(AiGatewayConfigPb.class)
        .add("fallbackConfig", fallbackConfig)
        .add("guardrails", guardrails)
        .add("inferenceTableConfig", inferenceTableConfig)
        .add("rateLimits", rateLimits)
        .add("usageTrackingConfig", usageTrackingConfig)
        .toString();
  }
}
