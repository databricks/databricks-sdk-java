// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Databricks job or pipeline created during conversion. */
@Generated
public class DestinationResource {
  /** The ID of the job that conversion created, if any. */
  @JsonProperty("job_id")
  private Long jobId;

  /** The ID (a UUID) of the pipeline that conversion created, if any. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  public DestinationResource setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public DestinationResource setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DestinationResource that = (DestinationResource) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(DestinationResource.class)
        .add("jobId", jobId)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
