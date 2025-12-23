// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
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

  /**
   * The hostname of the compute endpoint. This is the hostname specified when connecting to a
   * database.
   */
  @JsonProperty("host")
  private String host;

  /** A timestamp indicating when the compute endpoint was last active. */
  @JsonProperty("last_active_time")
  private Timestamp lastActiveTime;

  /** */
  @JsonProperty("pending_state")
  private EndpointStatusState pendingState;

  /** */
  @JsonProperty("pooler_mode")
  private EndpointPoolerMode poolerMode;

  /** */
  @JsonProperty("settings")
  private EndpointSettings settings;

  /** A timestamp indicating when the compute endpoint was last started. */
  @JsonProperty("start_time")
  private Timestamp startTime;

  /** A timestamp indicating when the compute endpoint was last suspended. */
  @JsonProperty("suspend_time")
  private Timestamp suspendTime;

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

  public EndpointStatus setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public EndpointStatus setLastActiveTime(Timestamp lastActiveTime) {
    this.lastActiveTime = lastActiveTime;
    return this;
  }

  public Timestamp getLastActiveTime() {
    return lastActiveTime;
  }

  public EndpointStatus setPendingState(EndpointStatusState pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public EndpointStatusState getPendingState() {
    return pendingState;
  }

  public EndpointStatus setPoolerMode(EndpointPoolerMode poolerMode) {
    this.poolerMode = poolerMode;
    return this;
  }

  public EndpointPoolerMode getPoolerMode() {
    return poolerMode;
  }

  public EndpointStatus setSettings(EndpointSettings settings) {
    this.settings = settings;
    return this;
  }

  public EndpointSettings getSettings() {
    return settings;
  }

  public EndpointStatus setStartTime(Timestamp startTime) {
    this.startTime = startTime;
    return this;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  public EndpointStatus setSuspendTime(Timestamp suspendTime) {
    this.suspendTime = suspendTime;
    return this;
  }

  public Timestamp getSuspendTime() {
    return suspendTime;
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
        && Objects.equals(host, that.host)
        && Objects.equals(lastActiveTime, that.lastActiveTime)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(poolerMode, that.poolerMode)
        && Objects.equals(settings, that.settings)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(suspendTime, that.suspendTime)
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
        host,
        lastActiveTime,
        pendingState,
        poolerMode,
        settings,
        startTime,
        suspendTime,
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
        .add("host", host)
        .add("lastActiveTime", lastActiveTime)
        .add("pendingState", pendingState)
        .add("poolerMode", poolerMode)
        .add("settings", settings)
        .add("startTime", startTime)
        .add("suspendTime", suspendTime)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .toString();
  }
}
