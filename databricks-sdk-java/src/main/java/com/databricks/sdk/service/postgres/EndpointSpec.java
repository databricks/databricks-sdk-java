// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

@Generated
public class EndpointSpec {
  /** The maximum number of Compute Units. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /**
   * Whether to restrict connections to the compute endpoint. Enabling this option schedules a
   * suspend compute operation. A disabled compute endpoint cannot be enabled by a connection or
   * console action.
   */
  @JsonProperty("disabled")
  private Boolean disabled;

  /** The endpoint type. A branch can only have one READ_WRITE endpoint. */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** */
  @JsonProperty("pooler_mode")
  private EndpointPoolerMode poolerMode;

  /** */
  @JsonProperty("settings")
  private EndpointSettings settings;

  /** Duration of inactivity after which the compute endpoint is automatically suspended. */
  @JsonProperty("suspend_timeout_duration")
  private Duration suspendTimeoutDuration;

  public EndpointSpec setAutoscalingLimitMaxCu(Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public EndpointSpec setAutoscalingLimitMinCu(Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public EndpointSpec setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public EndpointSpec setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public EndpointSpec setPoolerMode(EndpointPoolerMode poolerMode) {
    this.poolerMode = poolerMode;
    return this;
  }

  public EndpointPoolerMode getPoolerMode() {
    return poolerMode;
  }

  public EndpointSpec setSettings(EndpointSettings settings) {
    this.settings = settings;
    return this;
  }

  public EndpointSettings getSettings() {
    return settings;
  }

  public EndpointSpec setSuspendTimeoutDuration(Duration suspendTimeoutDuration) {
    this.suspendTimeoutDuration = suspendTimeoutDuration;
    return this;
  }

  public Duration getSuspendTimeoutDuration() {
    return suspendTimeoutDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointSpec that = (EndpointSpec) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(disabled, that.disabled)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(poolerMode, that.poolerMode)
        && Objects.equals(settings, that.settings)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu,
        autoscalingLimitMinCu,
        disabled,
        endpointType,
        poolerMode,
        settings,
        suspendTimeoutDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointSpec.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("disabled", disabled)
        .add("endpointType", endpointType)
        .add("poolerMode", poolerMode)
        .add("settings", settings)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .toString();
  }
}
