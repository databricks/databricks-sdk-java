// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

@Generated
public class EndpointStatus {
  /** The maximum number of Compute Units. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /** */
  @JsonProperty("current_state")
  private EndpointStatusState currentState;

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

  /** Details on the HA configuration of the endpoint. */
  @JsonProperty("group")
  private EndpointGroupStatus group;

  /** Contains host information for connecting to the endpoint. */
  @JsonProperty("hosts")
  private EndpointHosts hosts;

  /** */
  @JsonProperty("pending_state")
  private EndpointStatusState pendingState;

  /** */
  @JsonProperty("settings")
  private EndpointSettings settings;

  /** Duration of inactivity after which the compute endpoint is automatically suspended. */
  @JsonProperty("suspend_timeout_duration")
  private Duration suspendTimeoutDuration;

  public EndpointStatus setAutoscalingLimitMaxCu(Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public EndpointStatus setAutoscalingLimitMinCu(Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public EndpointStatus setCurrentState(EndpointStatusState currentState) {
    this.currentState = currentState;
    return this;
  }

  public EndpointStatusState getCurrentState() {
    return currentState;
  }

  public EndpointStatus setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public EndpointStatus setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public EndpointStatus setGroup(EndpointGroupStatus group) {
    this.group = group;
    return this;
  }

  public EndpointGroupStatus getGroup() {
    return group;
  }

  public EndpointStatus setHosts(EndpointHosts hosts) {
    this.hosts = hosts;
    return this;
  }

  public EndpointHosts getHosts() {
    return hosts;
  }

  public EndpointStatus setPendingState(EndpointStatusState pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public EndpointStatusState getPendingState() {
    return pendingState;
  }

  public EndpointStatus setSettings(EndpointSettings settings) {
    this.settings = settings;
    return this;
  }

  public EndpointSettings getSettings() {
    return settings;
  }

  public EndpointStatus setSuspendTimeoutDuration(Duration suspendTimeoutDuration) {
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
    EndpointStatus that = (EndpointStatus) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(currentState, that.currentState)
        && Objects.equals(disabled, that.disabled)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(group, that.group)
        && Objects.equals(hosts, that.hosts)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(settings, that.settings)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu,
        autoscalingLimitMinCu,
        currentState,
        disabled,
        endpointType,
        group,
        hosts,
        pendingState,
        settings,
        suspendTimeoutDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointStatus.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("currentState", currentState)
        .add("disabled", disabled)
        .add("endpointType", endpointType)
        .add("group", group)
        .add("hosts", hosts)
        .add("pendingState", pendingState)
        .add("settings", settings)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .toString();
  }
}
