// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

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
   * Bundle target deployment mode (development or production), derived from the most recent
   * version's mode.
   */
  @JsonProperty("deployment_mode")
  private DeploymentMode deploymentMode;

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

  /**
   * Human-readable name for the deployment. Output only: it is denormalized from the latest
   * version, not set directly on the deployment.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** Git provenance of the deployment's source, derived from the latest version. */
  @JsonProperty("git_info")
  private GitInfo gitInfo;

  /**
   * The workspace path of the folder where the deployment is initially created. Includes a leading
   * slash and no trailing slash. On create, the deployment is registered as a typed
   * BUNDLE_DEPLOYMENT tree node under this folder, which must already exist. This field is input
   * only and is not returned in create, get, or list responses. The service rejects create requests
   * that omit it.
   */
  @JsonProperty("initial_parent_path")
  private String initialParentPath;

  /** The version_id of the most recent deployment version. */
  @JsonProperty("last_version_id")
  private String lastVersionId;

  /** Resource name of the deployment. Format: deployments/{deployment_id} */
  @JsonProperty("name")
  private String name;

  /** Current status of the deployment. */
  @JsonProperty("status")
  private DeploymentStatus status;

  /**
   * The bundle target name associated with this deployment. Output only: it is denormalized from
   * the latest version, not set directly on the deployment.
   */
  @JsonProperty("target_name")
  private String targetName;

  /** When the deployment was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Workspace location of the deployment, derived from the latest version. */
  @JsonProperty("workspace_info")
  private WorkspaceInfo workspaceInfo;

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

  public Deployment setDeploymentMode(DeploymentMode deploymentMode) {
    this.deploymentMode = deploymentMode;
    return this;
  }

  public DeploymentMode getDeploymentMode() {
    return deploymentMode;
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

  public Deployment setGitInfo(GitInfo gitInfo) {
    this.gitInfo = gitInfo;
    return this;
  }

  public GitInfo getGitInfo() {
    return gitInfo;
  }

  public Deployment setInitialParentPath(String initialParentPath) {
    this.initialParentPath = initialParentPath;
    return this;
  }

  public String getInitialParentPath() {
    return initialParentPath;
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

  public Deployment setWorkspaceInfo(WorkspaceInfo workspaceInfo) {
    this.workspaceInfo = workspaceInfo;
    return this;
  }

  public WorkspaceInfo getWorkspaceInfo() {
    return workspaceInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Deployment that = (Deployment) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(deploymentMode, that.deploymentMode)
        && Objects.equals(destroyTime, that.destroyTime)
        && Objects.equals(destroyedBy, that.destroyedBy)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(gitInfo, that.gitInfo)
        && Objects.equals(initialParentPath, that.initialParentPath)
        && Objects.equals(lastVersionId, that.lastVersionId)
        && Objects.equals(name, that.name)
        && Objects.equals(status, that.status)
        && Objects.equals(targetName, that.targetName)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(workspaceInfo, that.workspaceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        createdBy,
        deploymentMode,
        destroyTime,
        destroyedBy,
        displayName,
        gitInfo,
        initialParentPath,
        lastVersionId,
        name,
        status,
        targetName,
        updateTime,
        workspaceInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(Deployment.class)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("deploymentMode", deploymentMode)
        .add("destroyTime", destroyTime)
        .add("destroyedBy", destroyedBy)
        .add("displayName", displayName)
        .add("gitInfo", gitInfo)
        .add("initialParentPath", initialParentPath)
        .add("lastVersionId", lastVersionId)
        .add("name", name)
        .add("status", status)
        .add("targetName", targetName)
        .add("updateTime", updateTime)
        .add("workspaceInfo", workspaceInfo)
        .toString();
  }
}
