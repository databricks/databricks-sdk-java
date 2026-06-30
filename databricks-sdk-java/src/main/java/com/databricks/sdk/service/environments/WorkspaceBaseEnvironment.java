// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A WorkspaceBaseEnvironment defines a workspace-level environment configuration consisting of an
 * environment version and a list of dependencies.
 */
@Generated
public class WorkspaceBaseEnvironment {
  /** The type of base environment (CPU or GPU). */
  @JsonProperty("base_environment_type")
  private BaseEnvironmentType baseEnvironmentType;

  /** Timestamp when the environment was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** User ID of the creator. */
  @JsonProperty("creator_user_id")
  private String creatorUserId;

  /** Human-readable display name for the workspace base environment. */
  @JsonProperty("display_name")
  private String displayName;

  /** The WSFS or UC Volumes path to the environment YAML file. */
  @JsonProperty("filepath")
  private String filepath;

  /** Whether this is the default environment for the workspace. */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /** User ID of the last user who updated the environment. */
  @JsonProperty("last_updated_user_id")
  private String lastUpdatedUserId;

  /** Status message providing additional details about the environment status. */
  @JsonProperty("message")
  private String message;

  /**
   * The resource name of the workspace base environment. Format:
   * workspace-base-environments/{workspace-base-environment}
   */
  @JsonProperty("name")
  private String name;

  /** The status of the materialized workspace base environment. */
  @JsonProperty("status")
  private WorkspaceBaseEnvironmentCacheStatus status;

  /** Timestamp when the environment was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public WorkspaceBaseEnvironment setBaseEnvironmentType(BaseEnvironmentType baseEnvironmentType) {
    this.baseEnvironmentType = baseEnvironmentType;
    return this;
  }

  public BaseEnvironmentType getBaseEnvironmentType() {
    return baseEnvironmentType;
  }

  public WorkspaceBaseEnvironment setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public WorkspaceBaseEnvironment setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  public String getCreatorUserId() {
    return creatorUserId;
  }

  public WorkspaceBaseEnvironment setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public WorkspaceBaseEnvironment setFilepath(String filepath) {
    this.filepath = filepath;
    return this;
  }

  public String getFilepath() {
    return filepath;
  }

  public WorkspaceBaseEnvironment setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  public Boolean getIsDefault() {
    return isDefault;
  }

  public WorkspaceBaseEnvironment setLastUpdatedUserId(String lastUpdatedUserId) {
    this.lastUpdatedUserId = lastUpdatedUserId;
    return this;
  }

  public String getLastUpdatedUserId() {
    return lastUpdatedUserId;
  }

  public WorkspaceBaseEnvironment setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public WorkspaceBaseEnvironment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public WorkspaceBaseEnvironment setStatus(WorkspaceBaseEnvironmentCacheStatus status) {
    this.status = status;
    return this;
  }

  public WorkspaceBaseEnvironmentCacheStatus getStatus() {
    return status;
  }

  public WorkspaceBaseEnvironment setUpdateTime(Timestamp updateTime) {
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
    WorkspaceBaseEnvironment that = (WorkspaceBaseEnvironment) o;
    return Objects.equals(baseEnvironmentType, that.baseEnvironmentType)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(creatorUserId, that.creatorUserId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(filepath, that.filepath)
        && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(lastUpdatedUserId, that.lastUpdatedUserId)
        && Objects.equals(message, that.message)
        && Objects.equals(name, that.name)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baseEnvironmentType,
        createTime,
        creatorUserId,
        displayName,
        filepath,
        isDefault,
        lastUpdatedUserId,
        message,
        name,
        status,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceBaseEnvironment.class)
        .add("baseEnvironmentType", baseEnvironmentType)
        .add("createTime", createTime)
        .add("creatorUserId", creatorUserId)
        .add("displayName", displayName)
        .add("filepath", filepath)
        .add("isDefault", isDefault)
        .add("lastUpdatedUserId", lastUpdatedUserId)
        .add("message", message)
        .add("name", name)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
