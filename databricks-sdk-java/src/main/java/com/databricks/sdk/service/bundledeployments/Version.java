// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A single invocation of a deploy or destroy command against a deployment. Creating a version
 * acquires an exclusive lock on the parent deployment.
 */
@Generated
public class Version {
  /** CLI version used to initiate the version. */
  @JsonProperty("cli_version")
  private String cliVersion;

  /** When the version completed. Unset while the version is in progress. */
  @JsonProperty("complete_time")
  private Timestamp completeTime;

  /**
   * The user who completed the version (email or principal name). May differ from `created_by` when
   * another user force-completes the version.
   */
  @JsonProperty("completed_by")
  private String completedBy;

  /**
   * Why the version was completed. Unset while in progress. Set when status transitions to
   * COMPLETED.
   */
  @JsonProperty("completion_reason")
  private VersionComplete completionReason;

  /** When the version was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The user who created the version (email or principal name). */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * Bundle target deployment mode (development or production), captured at the time of this
   * version.
   */
  @JsonProperty("deployment_mode")
  private DeploymentMode deploymentMode;

  /** Display name for the deployment, captured at the time of this version. */
  @JsonProperty("display_name")
  private String displayName;

  /** Git provenance of the source, captured at the time of this version. */
  @JsonProperty("git_info")
  private GitInfo gitInfo;

  /** Resource name of the version. Format: deployments/{deployment_id}/versions/{version_id} */
  @JsonProperty("name")
  private String name;

  /** Status of the version: IN_PROGRESS or COMPLETED. */
  @JsonProperty("status")
  private VersionStatus status;

  /** Target name of the deployment, captured at the time of this version. */
  @JsonProperty("target_name")
  private String targetName;

  /**
   * Version identifier within the parent deployment, assigned by the client on creation. A numeric
   * string (base-10, fits in a signed 64-bit integer) that is greater than or equal to 1. Version
   * IDs are strictly increasing within a deployment but are not required to start at 1 or to be
   * contiguous.
   */
  @JsonProperty("version_id")
  private String versionId;

  /** Type of version (deploy or destroy). */
  @JsonProperty("version_type")
  private VersionType versionType;

  /** Workspace location of the deployment, captured at the time of this version. */
  @JsonProperty("workspace_info")
  private WorkspaceInfo workspaceInfo;

  public Version setCliVersion(String cliVersion) {
    this.cliVersion = cliVersion;
    return this;
  }

  public String getCliVersion() {
    return cliVersion;
  }

  public Version setCompleteTime(Timestamp completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  public Timestamp getCompleteTime() {
    return completeTime;
  }

  public Version setCompletedBy(String completedBy) {
    this.completedBy = completedBy;
    return this;
  }

  public String getCompletedBy() {
    return completedBy;
  }

  public Version setCompletionReason(VersionComplete completionReason) {
    this.completionReason = completionReason;
    return this;
  }

  public VersionComplete getCompletionReason() {
    return completionReason;
  }

  public Version setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Version setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Version setDeploymentMode(DeploymentMode deploymentMode) {
    this.deploymentMode = deploymentMode;
    return this;
  }

  public DeploymentMode getDeploymentMode() {
    return deploymentMode;
  }

  public Version setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Version setGitInfo(GitInfo gitInfo) {
    this.gitInfo = gitInfo;
    return this;
  }

  public GitInfo getGitInfo() {
    return gitInfo;
  }

  public Version setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Version setStatus(VersionStatus status) {
    this.status = status;
    return this;
  }

  public VersionStatus getStatus() {
    return status;
  }

  public Version setTargetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

  public String getTargetName() {
    return targetName;
  }

  public Version setVersionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  public String getVersionId() {
    return versionId;
  }

  public Version setVersionType(VersionType versionType) {
    this.versionType = versionType;
    return this;
  }

  public VersionType getVersionType() {
    return versionType;
  }

  public Version setWorkspaceInfo(WorkspaceInfo workspaceInfo) {
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
    Version that = (Version) o;
    return Objects.equals(cliVersion, that.cliVersion)
        && Objects.equals(completeTime, that.completeTime)
        && Objects.equals(completedBy, that.completedBy)
        && Objects.equals(completionReason, that.completionReason)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(deploymentMode, that.deploymentMode)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(gitInfo, that.gitInfo)
        && Objects.equals(name, that.name)
        && Objects.equals(status, that.status)
        && Objects.equals(targetName, that.targetName)
        && Objects.equals(versionId, that.versionId)
        && Objects.equals(versionType, that.versionType)
        && Objects.equals(workspaceInfo, that.workspaceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cliVersion,
        completeTime,
        completedBy,
        completionReason,
        createTime,
        createdBy,
        deploymentMode,
        displayName,
        gitInfo,
        name,
        status,
        targetName,
        versionId,
        versionType,
        workspaceInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(Version.class)
        .add("cliVersion", cliVersion)
        .add("completeTime", completeTime)
        .add("completedBy", completedBy)
        .add("completionReason", completionReason)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("deploymentMode", deploymentMode)
        .add("displayName", displayName)
        .add("gitInfo", gitInfo)
        .add("name", name)
        .add("status", status)
        .add("targetName", targetName)
        .add("versionId", versionId)
        .add("versionType", versionType)
        .add("workspaceInfo", workspaceInfo)
        .toString();
  }
}
