// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobDeployment {
  /**
   * The kind of deployment that manages the job.
   *
   * <p>* `BUNDLE`: The job is managed by Databricks Asset Bundle. * `SYSTEM_MANAGED`: The job is
   * managed by Databricks and is read-only.
   */
  @JsonProperty("kind")
  private JobDeploymentKind kind;

  /** Path of the file that contains deployment metadata. */
  @JsonProperty("metadata_file_path")
  private String metadataFilePath;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobDeployment that = (JobDeployment) o;
    return Objects.equals(kind, that.kind)
        && Objects.equals(metadataFilePath, that.metadataFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, metadataFilePath);
  }

  @Override
  public String toString() {
    return new ToStringer(JobDeployment.class)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .toString();
  }
}
