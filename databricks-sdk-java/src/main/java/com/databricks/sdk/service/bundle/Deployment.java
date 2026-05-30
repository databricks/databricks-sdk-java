// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundle;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A bundle deployment registered with the control plane. */
@Generated
public class Deployment {
  /** When the deployment was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The user who created the deployment (email or principal name). */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * When the deployment was destroyed (i.e. `bundle destroy` completed). Unset if the deployment
   * has not been destroyed. Named destroy_time (not delete_time) because this tracks the
   * `databricks bundle destroy` command, not the API-level deletion.
   */
  @JsonProperty("destroy_time")
  private Timestamp destroyTime;

  /**
   * The user who destroyed the deployment (email or principal name). Unset if the deployment has
   * not been destroyed.
   */
  @JsonProperty("destroyed_by")
  private String destroyedBy;

  /** Human-readable name for the deployment. */
  @JsonProperty("display_name")
  private String displayName;

  /** The version_id of the most recent deployment version. */
  @JsonProperty("last_version_id")
  private String lastVersionId;

  /** Resource name of the deployment. Format: deployments/{deployment_id} */
  @JsonProperty("name")
  private String name;

  /** Current status of the deployment. */
  @JsonProperty("status")
  private DeploymentStatus status;

  /** The bundle target name associated with this deployment. */
  @JsonProperty("target_name")
  private String targetName;

  /** When the deployment was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Deployment setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Deployment setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Deployment setDestroyTime(Timestamp destroyTime) {
    this.destroyTime = destroyTime;
    return this;
  }

  public Timestamp getDestroyTime() {
    return destroyTime;
  }

  public Deployment setDestroyedBy(String destroyedBy) {
    this.destroyedBy = destroyedBy;
    return this;
  }

  public String getDestroyedBy() {
    return destroyedBy;
  }

  public Deployment setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Deployment setLastVersionId(String lastVersionId) {
    this.lastVersionId = lastVersionId;
    return this;
  }

  public String getLastVersionId() {
    return lastVersionId;
  }

  public Deployment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Deployment setStatus(DeploymentStatus status) {
    this.status = status;
    return this;
  }

  public DeploymentStatus getStatus() {
    return status;
  }

  public Deployment setTargetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

  public String getTargetName() {
    return targetName;
  }

  public Deployment setUpdateTime(Timestamp updateTime) {
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
    Deployment that = (Deployment) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(destroyTime, that.destroyTime)
        && Objects.equals(destroyedBy, that.destroyedBy)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(lastVersionId, that.lastVersionId)
        && Objects.equals(name, that.name)
        && Objects.equals(status, that.status)
        && Objects.equals(targetName, that.targetName)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        createdBy,
        destroyTime,
        destroyedBy,
        displayName,
        lastVersionId,
        name,
        status,
        targetName,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Deployment.class)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("destroyTime", destroyTime)
        .add("destroyedBy", destroyedBy)
        .add("displayName", displayName)
        .add("lastVersionId", lastVersionId)
        .add("name", name)
        .add("status", status)
        .add("targetName", targetName)
        .add("updateTime", updateTime)
        .toString();
  }
}
