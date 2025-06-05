// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PipelineDeploymentPb {
  @JsonProperty("kind")
  private DeploymentKind kind;

  @JsonProperty("metadata_file_path")
  private String metadataFilePath;

  public PipelineDeploymentPb setKind(DeploymentKind kind) {
    this.kind = kind;
    return this;
  }

  public DeploymentKind getKind() {
    return kind;
  }

  public PipelineDeploymentPb setMetadataFilePath(String metadataFilePath) {
    this.metadataFilePath = metadataFilePath;
    return this;
  }

  public String getMetadataFilePath() {
    return metadataFilePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineDeploymentPb that = (PipelineDeploymentPb) o;
    return Objects.equals(kind, that.kind)
        && Objects.equals(metadataFilePath, that.metadataFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, metadataFilePath);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineDeploymentPb.class)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .toString();
  }
}
