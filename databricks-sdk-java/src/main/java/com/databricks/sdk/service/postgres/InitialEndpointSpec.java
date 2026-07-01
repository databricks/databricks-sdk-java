// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/** Configuration for the initial Read/Write endpoint created during project creation. */
@Generated
public class InitialEndpointSpec {
  /** The maximum number of Compute Units for the initial endpoint. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units for the initial endpoint. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /** Settings for HA configuration of the endpoint. */
  @JsonProperty("group")
  private EndpointGroupSpec group;

  /**
   * When set to true, explicitly disables automatic suspension (never suspend). Should be set to
   * true when provided. Mutually exclusive with `suspend_timeout_duration`.
   */
  @JsonProperty("no_suspension")
  private Boolean noSuspension;

  /**
   * Duration of inactivity after which the initial endpoint is automatically suspended. If
   * specified, should be between 60s and 604800s (1 minute to 1 week). Mutually exclusive with
   * `no_suspension`.
   */
  @JsonProperty("suspend_timeout_duration")
  private Duration suspendTimeoutDuration;

  public InitialEndpointSpec setAutoscalingLimitMaxCu(Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public InitialEndpointSpec setAutoscalingLimitMinCu(Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public InitialEndpointSpec setGroup(EndpointGroupSpec group) {
    this.group = group;
    return this;
  }

  public EndpointGroupSpec getGroup() {
    return group;
  }

  public InitialEndpointSpec setNoSuspension(Boolean noSuspension) {
    this.noSuspension = noSuspension;
    return this;
  }

  public Boolean getNoSuspension() {
    return noSuspension;
  }

  public InitialEndpointSpec setSuspendTimeoutDuration(Duration suspendTimeoutDuration) {
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
    InitialEndpointSpec that = (InitialEndpointSpec) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(group, that.group)
        && Objects.equals(noSuspension, that.noSuspension)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu, autoscalingLimitMinCu, group, noSuspension, suspendTimeoutDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(InitialEndpointSpec.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("group", group)
        .add("noSuspension", noSuspension)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .toString();
  }
}
