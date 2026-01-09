// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Map;
import java.util.Objects;

/** A collection of settings for a compute endpoint. */
@Generated
public class ProjectDefaultEndpointSettings {
  /** The maximum number of Compute Units. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /** A raw representation of Postgres settings. */
  @JsonProperty("pg_settings")
  private Map<String, String> pgSettings;

  /** Duration of inactivity after which the compute endpoint is automatically suspended. */
  @JsonProperty("suspend_timeout_duration")
  private Duration suspendTimeoutDuration;

  public ProjectDefaultEndpointSettings setAutoscalingLimitMaxCu(Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public ProjectDefaultEndpointSettings setAutoscalingLimitMinCu(Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public ProjectDefaultEndpointSettings setPgSettings(Map<String, String> pgSettings) {
    this.pgSettings = pgSettings;
    return this;
  }

  public Map<String, String> getPgSettings() {
    return pgSettings;
  }

  public ProjectDefaultEndpointSettings setSuspendTimeoutDuration(Duration suspendTimeoutDuration) {
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
    ProjectDefaultEndpointSettings that = (ProjectDefaultEndpointSettings) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(pgSettings, that.pgSettings)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu, autoscalingLimitMinCu, pgSettings, suspendTimeoutDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectDefaultEndpointSettings.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("pgSettings", pgSettings)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .toString();
  }
}
