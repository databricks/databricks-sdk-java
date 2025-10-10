// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabaseEndpoint {
  /** The maximum number of Compute Units. */
  @JsonProperty("autoscaling_limit_max_cu")
  private Double autoscalingLimitMaxCu;

  /** The minimum number of Compute Units. */
  @JsonProperty("autoscaling_limit_min_cu")
  private Double autoscalingLimitMinCu;

  /** */
  @JsonProperty("branch_id")
  private String branchId;

  /** A timestamp indicating when the compute endpoint was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** */
  @JsonProperty("current_state")
  private DatabaseEndpointState currentState;

  /**
   * Whether to restrict connections to the compute endpoint. Enabling this option schedules a
   * suspend compute operation. A disabled compute endpoint cannot be enabled by a connection or
   * console action.
   */
  @JsonProperty("disabled")
  private Boolean disabled;

  /** */
  @JsonProperty("endpoint_id")
  private String endpointId;

  /**
   * The hostname of the compute endpoint. This is the hostname specified when connecting to a
   * database.
   */
  @JsonProperty("host")
  private String host;

  /** A timestamp indicating when the compute endpoint was last active. */
  @JsonProperty("last_active_time")
  private String lastActiveTime;

  /** */
  @JsonProperty("pending_state")
  private DatabaseEndpointState pendingState;

  /** */
  @JsonProperty("pooler_mode")
  private DatabaseEndpointPoolerMode poolerMode;

  /** */
  @JsonProperty("project_id")
  private String projectId;

  /** */
  @JsonProperty("settings")
  private DatabaseEndpointSettings settings;

  /** A timestamp indicating when the compute endpoint was last started. */
  @JsonProperty("start_time")
  private String startTime;

  /** A timestamp indicating when the compute endpoint was last suspended. */
  @JsonProperty("suspend_time")
  private String suspendTime;

  /** Duration of inactivity after which the compute endpoint is automatically suspended. */
  @JsonProperty("suspend_timeout_duration")
  private String suspendTimeoutDuration;

  /**
   * NOTE: if want type to default to some value set the server then an effective_type field OR make
   * this field REQUIRED
   */
  @JsonProperty("type")
  private DatabaseEndpointType typeValue;

  /** A timestamp indicating when the compute endpoint was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public DatabaseEndpoint setAutoscalingLimitMaxCu(Double autoscalingLimitMaxCu) {
    this.autoscalingLimitMaxCu = autoscalingLimitMaxCu;
    return this;
  }

  public Double getAutoscalingLimitMaxCu() {
    return autoscalingLimitMaxCu;
  }

  public DatabaseEndpoint setAutoscalingLimitMinCu(Double autoscalingLimitMinCu) {
    this.autoscalingLimitMinCu = autoscalingLimitMinCu;
    return this;
  }

  public Double getAutoscalingLimitMinCu() {
    return autoscalingLimitMinCu;
  }

  public DatabaseEndpoint setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public DatabaseEndpoint setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public DatabaseEndpoint setCurrentState(DatabaseEndpointState currentState) {
    this.currentState = currentState;
    return this;
  }

  public DatabaseEndpointState getCurrentState() {
    return currentState;
  }

  public DatabaseEndpoint setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public DatabaseEndpoint setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public DatabaseEndpoint setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public DatabaseEndpoint setLastActiveTime(String lastActiveTime) {
    this.lastActiveTime = lastActiveTime;
    return this;
  }

  public String getLastActiveTime() {
    return lastActiveTime;
  }

  public DatabaseEndpoint setPendingState(DatabaseEndpointState pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public DatabaseEndpointState getPendingState() {
    return pendingState;
  }

  public DatabaseEndpoint setPoolerMode(DatabaseEndpointPoolerMode poolerMode) {
    this.poolerMode = poolerMode;
    return this;
  }

  public DatabaseEndpointPoolerMode getPoolerMode() {
    return poolerMode;
  }

  public DatabaseEndpoint setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public DatabaseEndpoint setSettings(DatabaseEndpointSettings settings) {
    this.settings = settings;
    return this;
  }

  public DatabaseEndpointSettings getSettings() {
    return settings;
  }

  public DatabaseEndpoint setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public String getStartTime() {
    return startTime;
  }

  public DatabaseEndpoint setSuspendTime(String suspendTime) {
    this.suspendTime = suspendTime;
    return this;
  }

  public String getSuspendTime() {
    return suspendTime;
  }

  public DatabaseEndpoint setSuspendTimeoutDuration(String suspendTimeoutDuration) {
    this.suspendTimeoutDuration = suspendTimeoutDuration;
    return this;
  }

  public String getSuspendTimeoutDuration() {
    return suspendTimeoutDuration;
  }

  public DatabaseEndpoint setType(DatabaseEndpointType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public DatabaseEndpointType getType() {
    return typeValue;
  }

  public DatabaseEndpoint setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseEndpoint that = (DatabaseEndpoint) o;
    return Objects.equals(autoscalingLimitMaxCu, that.autoscalingLimitMaxCu)
        && Objects.equals(autoscalingLimitMinCu, that.autoscalingLimitMinCu)
        && Objects.equals(branchId, that.branchId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(currentState, that.currentState)
        && Objects.equals(disabled, that.disabled)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(host, that.host)
        && Objects.equals(lastActiveTime, that.lastActiveTime)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(poolerMode, that.poolerMode)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(settings, that.settings)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(suspendTime, that.suspendTime)
        && Objects.equals(suspendTimeoutDuration, that.suspendTimeoutDuration)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscalingLimitMaxCu,
        autoscalingLimitMinCu,
        branchId,
        createTime,
        currentState,
        disabled,
        endpointId,
        host,
        lastActiveTime,
        pendingState,
        poolerMode,
        projectId,
        settings,
        startTime,
        suspendTime,
        suspendTimeoutDuration,
        typeValue,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseEndpoint.class)
        .add("autoscalingLimitMaxCu", autoscalingLimitMaxCu)
        .add("autoscalingLimitMinCu", autoscalingLimitMinCu)
        .add("branchId", branchId)
        .add("createTime", createTime)
        .add("currentState", currentState)
        .add("disabled", disabled)
        .add("endpointId", endpointId)
        .add("host", host)
        .add("lastActiveTime", lastActiveTime)
        .add("pendingState", pendingState)
        .add("poolerMode", poolerMode)
        .add("projectId", projectId)
        .add("settings", settings)
        .add("startTime", startTime)
        .add("suspendTime", suspendTime)
        .add("suspendTimeoutDuration", suspendTimeoutDuration)
        .add("typeValue", typeValue)
        .add("updateTime", updateTime)
        .toString();
  }
}
