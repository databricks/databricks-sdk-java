// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AppDeployment {
  /**
   * The command with which to run the app. This will override the command specified in the app.yaml
   * file.
   */
  @JsonProperty("command")
  private Collection<String> command;

  /** The creation time of the deployment. Formatted timestamp in ISO 6801. */
  @JsonProperty("create_time")
  private String createTime;

  /** The email of the user creates the deployment. */
  @JsonProperty("creator")
  private String creator;

  /** The deployment artifacts for an app. */
  @JsonProperty("deployment_artifacts")
  private AppDeploymentArtifacts deploymentArtifacts;

  /** The unique id of the deployment. */
  @JsonProperty("deployment_id")
  private String deploymentId;

  /**
   * The environment variables to set in the app runtime environment. This will override the
   * environment variables specified in the app.yaml file.
   */
  @JsonProperty("env_vars")
  private Collection<EnvVar> envVars;

  /** Git repository to use as the source for the app deployment. */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /** The mode of which the deployment will manage the source code. */
  @JsonProperty("mode")
  private AppDeploymentMode mode;

  /**
   * The workspace file system path of the source code used to create the app deployment. This is
   * different from `deployment_artifacts.source_code_path`, which is the path used by the deployed
   * app. The former refers to the original source code location of the app in the workspace during
   * deployment creation, whereas the latter provides a system generated stable snapshotted source
   * code path used by the deployment.
   */
  @JsonProperty("source_code_path")
  private String sourceCodePath;

  /** Status and status message of the deployment */
  @JsonProperty("status")
  private AppDeploymentStatus status;

  /** The update time of the deployment. Formatted timestamp in ISO 6801. */
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

  public AppDeployment setMode(AppDeploymentMode mode) {
    this.mode = mode;
    return this;
  }

  public AppDeploymentMode getMode() {
    return mode;
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
        && Objects.equals(mode, that.mode)
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
        mode,
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
        .add("mode", mode)
        .add("sourceCodePath", sourceCodePath)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
