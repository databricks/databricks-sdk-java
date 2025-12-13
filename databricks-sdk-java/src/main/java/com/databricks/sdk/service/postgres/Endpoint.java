// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class Endpoint {
  /** The maximum number of Compute Units. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /** A timestamp indicating when the compute endpoint was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** */
  @JsonProperty("current_state")
  private EndpointState currentState;

  /**
   * Whether to restrict connections to the compute endpoint. Enabling this option schedules a
   * suspend compute operation. A disabled compute endpoint cannot be enabled by a connection or
   * console action.
   */
  @JsonProperty("disabled")
  private Boolean disabled;

  /** The maximum number of Compute Units. */
  @JsonProperty("effective_autoscaling_limit_max_cu")
  private Double effectiveAutoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("effective_autoscaling_limit_min_cu")
  private Double effectiveAutoscalingLimitMinCu;

  /**
   * Whether to restrict connections to the compute endpoint. Enabling this option schedules a
   * suspend compute operation. A disabled compute endpoint cannot be enabled by a connection or
   * console action.
   */
  @JsonProperty("effective_disabled")
  private Boolean effectiveDisabled;

  /** */
  @JsonProperty("effective_pooler_mode")
  private EndpointPoolerMode effectivePoolerMode;

  /** */
  @JsonProperty("effective_settings")
  private EndpointSettings effectiveSettings;

  /** Duration of inactivity after which the compute endpoint is automatically suspended. */
  @JsonProperty("effective_suspend_timeout_duration")
  private Duration effectiveSuspendTimeoutDuration;

  /** The endpoint type. There could be only one READ_WRITE endpoint per branch. */
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

  /**
   * The resource name of the endpoint. Format:
   * projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonProperty("name")
  private String name;

  /** The branch containing this endpoint. Format: projects/{project_id}/branches/{branch_id} */
  @JsonProperty("parent")
  private String parent;

  /** */
  @JsonProperty("pending_state")
  private EndpointState pendingState;

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

  /** System generated unique ID for the endpoint. */
  @JsonProperty("uid")
  private String uid;

  /** A timestamp indicating when the compute endpoint was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Endpoint setAutoscalingLimitMaxCu(Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public Endpoint setAutoscalingLimitMinCu(Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public Endpoint setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Endpoint setCurrentState(EndpointState currentState) {
    this.currentState = currentState;
    return this;
  }

  public EndpointState getCurrentState() {
    return currentState;
  }

  public Endpoint setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public Endpoint setEffectiveAutoscalingLimitMaxCu(Double effectiveAutoscalingLimitMaxCu) {
    this.effectiveAutoscalingLimitMaxCu = effectiveAutoscalingLimitMaxCu;
    return this;
  }

  public Double getEffectiveAutoscalingLimitMaxCu() {
    return effectiveAutoscalingLimitMaxCu;
  }

  public Endpoint setEffectiveAutoscalingLimitMinCu(Double effectiveAutoscalingLimitMinCu) {
    this.effectiveAutoscalingLimitMinCu = effectiveAutoscalingLimitMinCu;
    return this;
  }

  public Double getEffectiveAutoscalingLimitMinCu() {
    return effectiveAutoscalingLimitMinCu;
  }

  public Endpoint setEffectiveDisabled(Boolean effectiveDisabled) {
    this.effectiveDisabled = effectiveDisabled;
    return this;
  }

  public Boolean getEffectiveDisabled() {
    return effectiveDisabled;
  }

  public Endpoint setEffectivePoolerMode(EndpointPoolerMode effectivePoolerMode) {
    this.effectivePoolerMode = effectivePoolerMode;
    return this;
  }

  public EndpointPoolerMode getEffectivePoolerMode() {
    return effectivePoolerMode;
  }

  public Endpoint setEffectiveSettings(EndpointSettings effectiveSettings) {
    this.effectiveSettings = effectiveSettings;
    return this;
  }

  public EndpointSettings getEffectiveSettings() {
    return effectiveSettings;
  }

  public Endpoint setEffectiveSuspendTimeoutDuration(Duration effectiveSuspendTimeoutDuration) {
    this.effectiveSuspendTimeoutDuration = effectiveSuspendTimeoutDuration;
    return this;
  }

  public Duration getEffectiveSuspendTimeoutDuration() {
    return effectiveSuspendTimeoutDuration;
  }

  public Endpoint setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public Endpoint setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public Endpoint setLastActiveTime(Timestamp lastActiveTime) {
    this.lastActiveTime = lastActiveTime;
    return this;
  }

  public Timestamp getLastActiveTime() {
    return lastActiveTime;
  }

  public Endpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Endpoint setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public Endpoint setPendingState(EndpointState pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public EndpointState getPendingState() {
    return pendingState;
  }

  public Endpoint setPoolerMode(EndpointPoolerMode poolerMode) {
    this.poolerMode = poolerMode;
    return this;
  }

  public EndpointPoolerMode getPoolerMode() {
    return poolerMode;
  }

  public Endpoint setSettings(EndpointSettings settings) {
    this.settings = settings;
    return this;
  }

  public EndpointSettings getSettings() {
    return settings;
  }

  public Endpoint setStartTime(Timestamp startTime) {
    this.startTime = startTime;
    return this;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  public Endpoint setSuspendTime(Timestamp suspendTime) {
    this.suspendTime = suspendTime;
    return this;
  }

  public Timestamp getSuspendTime() {
    return suspendTime;
  }

  public Endpoint setSuspendTimeoutDuration(Duration suspendTimeoutDuration) {
    this.suspendTimeoutDuration = suspendTimeoutDuration;
    return this;
  }

  public Duration getSuspendTimeoutDuration() {
    return suspendTimeoutDuration;
  }

  public Endpoint setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public Endpoint setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Endpoint that = (Endpoint) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(currentState, that.currentState)
        && Objects.equals(disabled, that.disabled)
        && Objects.equals(effectiveAutoscalingLimitMaxCu, that.effectiveAutoscalingLimitMaxCu)
        && Objects.equals(effectiveAutoscalingLimitMinCu, that.effectiveAutoscalingLimitMinCu)
        && Objects.equals(effectiveDisabled, that.effectiveDisabled)
        && Objects.equals(effectivePoolerMode, that.effectivePoolerMode)
        && Objects.equals(effectiveSettings, that.effectiveSettings)
        && Objects.equals(effectiveSuspendTimeoutDuration, that.effectiveSuspendTimeoutDuration)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(host, that.host)
        && Objects.equals(lastActiveTime, that.lastActiveTime)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(poolerMode, that.poolerMode)
        && Objects.equals(settings, that.settings)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(suspendTime, that.suspendTime)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu,
        autoscalingLimitMinCu,
        createTime,
        currentState,
        disabled,
        effectiveAutoscalingLimitMaxCu,
        effectiveAutoscalingLimitMinCu,
        effectiveDisabled,
        effectivePoolerMode,
        effectiveSettings,
        effectiveSuspendTimeoutDuration,
        endpointType,
        host,
        lastActiveTime,
        name,
        parent,
        pendingState,
        poolerMode,
        settings,
        startTime,
        suspendTime,
        suspendTimeoutDuration,
        uid,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Endpoint.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("createTime", createTime)
        .add("currentState", currentState)
        .add("disabled", disabled)
        .add("effectiveAutoscalingLimitMaxCu", effectiveAutoscalingLimitMaxCu)
        .add("effectiveAutoscalingLimitMinCu", effectiveAutoscalingLimitMinCu)
        .add("effectiveDisabled", effectiveDisabled)
        .add("effectivePoolerMode", effectivePoolerMode)
        .add("effectiveSettings", effectiveSettings)
        .add("effectiveSuspendTimeoutDuration", effectiveSuspendTimeoutDuration)
        .add("endpointType", endpointType)
        .add("host", host)
        .add("lastActiveTime", lastActiveTime)
        .add("name", name)
        .add("parent", parent)
        .add("pendingState", pendingState)
        .add("poolerMode", poolerMode)
        .add("settings", settings)
        .add("startTime", startTime)
        .add("suspendTime", suspendTime)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
