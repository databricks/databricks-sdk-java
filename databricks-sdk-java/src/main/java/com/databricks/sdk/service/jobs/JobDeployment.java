// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobDeployment {
  /**
   * ID of the deployment that manages this job. Only set when {@code kind} is {@code BUNDLE}. Used
   * to look up deployment metadata from the Deployment Metadata service.
   */
  @JsonProperty("deployment_id")
  private String deploymentId;

  /**
   * The kind of deployment that manages the job.
   *
   * <ul>
   *   <li>{@code BUNDLE}: The job is managed by Databricks Asset Bundle.
   *   <li>{@code SYSTEM_MANAGED}: The job is managed by Databricks and is read-only.
   * </ul>
   */
  @JsonProperty("kind")
  private JobDeploymentKind kind;

  /** Path of the file that contains deployment metadata. */
  @JsonProperty("metadata_file_path")
  private String metadataFilePath;

  /**
   * ID of the version of the deployment that produced this job. Only set when {@code kind} is
   * {@code BUNDLE}. Identifies a specific snapshot of the deployment in the Deployment Metadata
   * service.
   */
  @JsonProperty("version_id")
  private String versionId;

  public JobDeployment setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public JobDeployment setKind(JobDeploymentKind kind) {
    this.kind = kind;
    return this;
  }

  public JobDeploymentKind getKind() {
    return kind;
  }

  public JobDeployment setMetadataFilePath(String metadataFilePath) {
    this.metadataFilePath = metadataFilePath;
    return this;
  }

  public String getMetadataFilePath() {
    return metadataFilePath;
  }

  public JobDeployment setVersionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  public String getVersionId() {
    return versionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobDeployment that = (JobDeployment) o;
    return Objects.equals(deploymentId, that.deploymentId)
        && Objects.equals(kind, that.kind)
        && Objects.equals(metadataFilePath, that.metadataFilePath)
        && Objects.equals(versionId, that.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, kind, metadataFilePath, versionId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobDeployment.class)
        .add("deploymentId", deploymentId)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .add("versionId", versionId)
        .toString();
  }
}
