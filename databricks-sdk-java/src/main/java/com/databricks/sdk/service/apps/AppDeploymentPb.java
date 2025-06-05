// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AppDeploymentPb {
  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("deployment_artifacts")
  private AppDeploymentArtifacts deploymentArtifacts;

  @JsonProperty("deployment_id")
  private String deploymentId;

  @JsonProperty("mode")
  private AppDeploymentMode mode;

  @JsonProperty("source_code_path")
  private String sourceCodePath;

  @JsonProperty("status")
  private AppDeploymentStatus status;

  @JsonProperty("update_time")
  private String updateTime;

  public AppDeploymentPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public AppDeploymentPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public AppDeploymentPb setDeploymentArtifacts(AppDeploymentArtifacts deploymentArtifacts) {
    this.deploymentArtifacts = deploymentArtifacts;
    return this;
  }

  public AppDeploymentArtifacts getDeploymentArtifacts() {
    return deploymentArtifacts;
  }

  public AppDeploymentPb setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public AppDeploymentPb setMode(AppDeploymentMode mode) {
    this.mode = mode;
    return this;
  }

  public AppDeploymentMode getMode() {
    return mode;
  }

  public AppDeploymentPb setSourceCodePath(String sourceCodePath) {
    this.sourceCodePath = sourceCodePath;
    return this;
  }

  public String getSourceCodePath() {
    return sourceCodePath;
  }

  public AppDeploymentPb setStatus(AppDeploymentStatus status) {
    this.status = status;
    return this;
  }

  public AppDeploymentStatus getStatus() {
    return status;
  }

  public AppDeploymentPb setUpdateTime(String updateTime) {
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
    AppDeploymentPb that = (AppDeploymentPb) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(deploymentArtifacts, that.deploymentArtifacts)
        && Objects.equals(deploymentId, that.deploymentId)
        && Objects.equals(mode, that.mode)
        && Objects.equals(sourceCodePath, that.sourceCodePath)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        creator,
        deploymentArtifacts,
        deploymentId,
        mode,
        sourceCodePath,
        status,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeploymentPb.class)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("deploymentArtifacts", deploymentArtifacts)
        .add("deploymentId", deploymentId)
        .add("mode", mode)
        .add("sourceCodePath", sourceCodePath)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
