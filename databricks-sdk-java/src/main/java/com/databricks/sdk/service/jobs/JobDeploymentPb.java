// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class JobDeploymentPb {
  @JsonProperty("kind")
  private JobDeploymentKind kind;

  @JsonProperty("metadata_file_path")
  private String metadataFilePath;

  public JobDeploymentPb setKind(JobDeploymentKind kind) {
    this.kind = kind;
    return this;
  }

  public JobDeploymentKind getKind() {
    return kind;
  }

  public JobDeploymentPb setMetadataFilePath(String metadataFilePath) {
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
    JobDeploymentPb that = (JobDeploymentPb) o;
    return Objects.equals(kind, that.kind)
        && Objects.equals(metadataFilePath, that.metadataFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, metadataFilePath);
  }

  @Override
  public String toString() {
    return new ToStringer(JobDeploymentPb.class)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .toString();
  }
}
