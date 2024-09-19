// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Update AI Gateway of a serving endpoint */
@Generated
public class PutAiGatewayRequest {
  /**
   * Configuration for AI Guardrails to prevent unwanted data and unsafe data in requests and
   * responses.
   */
  @JsonProperty("guardrails")
  private AiGatewayGuardrails guardrails;

  /**
   * Configuration for payload logging using inference tables. Use these tables to monitor and audit
   * data being sent to and received from model APIs and to improve model quality.
   */
  @JsonProperty("inference_table_config")
  private AiGatewayInferenceTableConfig inferenceTableConfig;

  /** The name of the serving endpoint whose AI Gateway is being updated. This field is required. */
  @JsonIgnore private String name;

  /** Configuration for rate limits which can be set to limit endpoint traffic. */
  @JsonProperty("rate_limits")
  private Collection<AiGatewayRateLimit> rateLimits;

  /**
   * Configuration to enable usage tracking using system tables. These tables allow you to monitor
   * operational usage on endpoints and their associated costs.
   */
  @JsonProperty("usage_tracking_config")
  private AiGatewayUsageTrackingConfig usageTrackingConfig;

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
    return Objects.equals(guardrails, that.guardrails)
        && Objects.equals(inferenceTableConfig, that.inferenceTableConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(usageTrackingConfig, that.usageTrackingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guardrails, inferenceTableConfig, name, rateLimits, usageTrackingConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(PutAiGatewayRequest.class)
        .add("guardrails", guardrails)
        .add("inferenceTableConfig", inferenceTableConfig)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .add("usageTrackingConfig", usageTrackingConfig)
        .toString();
  }
}
