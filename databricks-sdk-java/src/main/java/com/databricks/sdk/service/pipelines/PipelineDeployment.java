// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PipelineDeployment {
  /**
   * ID of the deployment that manages this pipeline. Only set when {@code kind} is {@code BUNDLE}.
   * Used to look up deployment metadata from the Deployment Metadata service.
   */
  @JsonProperty("deployment_id")
  private String deploymentId;

  /** The deployment method that manages the pipeline. */
  @JsonProperty("kind")
  private DeploymentKind kind;

  /** The path to the file containing metadata about the deployment. */
  @JsonProperty("metadata_file_path")
  private String metadataFilePath;

  /**
   * ID of the version of the deployment that produced this pipeline. Only set when {@code kind} is
   * {@code BUNDLE}. Identifies a specific snapshot of the deployment in the Deployment Metadata
   * service.
   */
  @JsonProperty("version_id")
  private String versionId;

  public PipelineDeployment setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public PipelineDeployment setKind(DeploymentKind kind) {
    this.kind = kind;
    return this;
  }

  public DeploymentKind getKind() {
    return kind;
  }

  public PipelineDeployment setMetadataFilePath(String metadataFilePath) {
    this.metadataFilePath = metadataFilePath;
    return this;
  }

  public String getMetadataFilePath() {
    return metadataFilePath;
  }

  public PipelineDeployment setVersionId(String versionId) {
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
    PipelineDeployment that = (PipelineDeployment) o;
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
    return new ToStringer(PipelineDeployment.class)
        .add("deploymentId", deploymentId)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .add("versionId", versionId)
        .toString();
  }
}
