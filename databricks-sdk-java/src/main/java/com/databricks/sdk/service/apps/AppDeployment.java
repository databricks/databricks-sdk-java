// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A deployment of an app's source code, taken from a workspace path or a Git reference. When a
 * deployment succeeds, it becomes the app's active deployment. See
 * https://docs.databricks.com/aws/en/dev-tools/databricks-apps/deploy.
 */
@Generated
public class AppDeployment {
  /**
   * The command with which to run the app. This will override the command specified in the app.yaml
   * file.
   */
  @JsonProperty("command")
  private Collection<String> command;

  /** The creation time of the deployment. Formatted timestamp in ISO 8601. */
  @JsonProperty("create_time")
  private String createTime;

  /** The email of the user that created the deployment. */
  @JsonProperty("creator")
  private String creator;

  /** The deployment artifacts for an app. */
  @JsonProperty("deployment_artifacts")
  private AppDeploymentArtifacts deploymentArtifacts;

  /**
   * The unique ID of the deployment. Databricks generates the ID when the deployment is created.
   */
  @JsonProperty("deployment_id")
  private String deploymentId;

  /**
   * The environment variables to set in the app runtime environment. This will override the
   * environment variables specified in the app.yaml file. Responses return only the variable names,
   * not their values.
   */
  @JsonProperty("env_vars")
  private Collection<EnvVar> envVars;

  /**
   * Git repository to use as the source for the app deployment. The repository itself is configured
   * on the app, so set only the branch, tag or commit here, and optionally `source_code_path`.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /**
   * Deploy-time health check for the app. Verifies the app is responding to HTTP requests before
   * considering the deployment successful.
   */
  @JsonProperty("health_check")
  private AppHealthCheck healthCheck;

  /**
   * The mode in which the deployment manages the source code. The mode defaults to `SNAPSHOT`,
   * which is the only supported mode.
   */
  @JsonProperty("mode")
  private AppDeploymentMode mode;

  /**
   * Whether `scan_omitted_findings_count` is a lower bound rather than an exact count, because the
   * scanner itself stopped counting.
   */
  @JsonProperty("scan_omitted_count_is_lower_bound")
  private Boolean scanOmittedCountIsLowerBound;

  /**
   * The number of findings the scan reported but did not store, because the deployment hit the
   * per-deployment findings cap. Non-zero means the listed findings are incomplete.
   */
  @JsonProperty("scan_omitted_findings_count")
  private Long scanOmittedFindingsCount;

  /**
   * The security scan outcome for this deployment. UNSPECIFIED means no scan result has been
   * recorded: the scan may still be in flight, or it ended without recording one, so don't wait
   * indefinitely for it to change. The other values are terminal.
   */
  @JsonProperty("scan_status")
  private AppDeploymentScanStatus scanStatus;

  /**
   * The workspace file system path of the source code used to create the app deployment. This is
   * different from `deployment_artifacts.source_code_path`, which is the path used by the deployed
   * app. The former refers to the original source code location of the app in the workspace during
   * deployment creation, whereas the latter provides a system generated stable snapshotted source
   * code path used by the deployment. Set either `source_code_path` or `git_source`, not both. If
   * neither is set, the deployment reuses the source of the app's active deployment.
   */
  @JsonProperty("source_code_path")
  private String sourceCodePath;

  /** The current state of the deployment and a message that describes its progress or failure. */
  @JsonProperty("status")
  private AppDeploymentStatus status;

  /** The update time of the deployment. Formatted timestamp in ISO 8601. */
  @JsonProperty("update_time")
  private String updateTime;

  public AppDeployment setCommand(Collection<String> command) {
    this.command = command;
    return this;
  }

  public Collection<String> getCommand() {
    return command;
  }

  public AppDeployment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public AppDeployment setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public AppDeployment setDeploymentArtifacts(AppDeploymentArtifacts deploymentArtifacts) {
    this.deploymentArtifacts = deploymentArtifacts;
    return this;
  }

  public AppDeploymentArtifacts getDeploymentArtifacts() {
    return deploymentArtifacts;
  }

  public AppDeployment setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public AppDeployment setEnvVars(Collection<EnvVar> envVars) {
    this.envVars = envVars;
    return this;
  }

  public Collection<EnvVar> getEnvVars() {
    return envVars;
  }

  public AppDeployment setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public AppDeployment setHealthCheck(AppHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

  public AppHealthCheck getHealthCheck() {
    return healthCheck;
  }

  public AppDeployment setMode(AppDeploymentMode mode) {
    this.mode = mode;
    return this;
  }

  public AppDeploymentMode getMode() {
    return mode;
  }

  public AppDeployment setScanOmittedCountIsLowerBound(Boolean scanOmittedCountIsLowerBound) {
    this.scanOmittedCountIsLowerBound = scanOmittedCountIsLowerBound;
    return this;
  }

  public Boolean getScanOmittedCountIsLowerBound() {
    return scanOmittedCountIsLowerBound;
  }

  public AppDeployment setScanOmittedFindingsCount(Long scanOmittedFindingsCount) {
    this.scanOmittedFindingsCount = scanOmittedFindingsCount;
    return this;
  }

  public Long getScanOmittedFindingsCount() {
    return scanOmittedFindingsCount;
  }

  public AppDeployment setScanStatus(AppDeploymentScanStatus scanStatus) {
    this.scanStatus = scanStatus;
    return this;
  }

  public AppDeploymentScanStatus getScanStatus() {
    return scanStatus;
  }

  public AppDeployment setSourceCodePath(String sourceCodePath) {
    this.sourceCodePath = sourceCodePath;
    return this;
  }

  public String getSourceCodePath() {
    return sourceCodePath;
  }

  public AppDeployment setStatus(AppDeploymentStatus status) {
    this.status = status;
    return this;
  }

  public AppDeploymentStatus getStatus() {
    return status;
  }

  public AppDeployment setUpdateTime(String updateTime) {
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
    AppDeployment that = (AppDeployment) o;
    return Objects.equals(command, that.command)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(deploymentArtifacts, that.deploymentArtifacts)
        && Objects.equals(deploymentId, that.deploymentId)
        && Objects.equals(envVars, that.envVars)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(healthCheck, that.healthCheck)
        && Objects.equals(mode, that.mode)
        && Objects.equals(scanOmittedCountIsLowerBound, that.scanOmittedCountIsLowerBound)
        && Objects.equals(scanOmittedFindingsCount, that.scanOmittedFindingsCount)
        && Objects.equals(scanStatus, that.scanStatus)
        && Objects.equals(sourceCodePath, that.sourceCodePath)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        command,
        createTime,
        creator,
        deploymentArtifacts,
        deploymentId,
        envVars,
        gitSource,
        healthCheck,
        mode,
        scanOmittedCountIsLowerBound,
        scanOmittedFindingsCount,
        scanStatus,
        sourceCodePath,
        status,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeployment.class)
        .add("command", command)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("deploymentArtifacts", deploymentArtifacts)
        .add("deploymentId", deploymentId)
        .add("envVars", envVars)
        .add("gitSource", gitSource)
        .add("healthCheck", healthCheck)
        .add("mode", mode)
        .add("scanOmittedCountIsLowerBound", scanOmittedCountIsLowerBound)
        .add("scanOmittedFindingsCount", scanOmittedFindingsCount)
        .add("scanStatus", scanStatus)
        .add("sourceCodePath", sourceCodePath)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
