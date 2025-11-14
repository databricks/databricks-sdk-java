// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobContext {
  /** The job ID where this API invoked. */
  @JsonProperty("job_id")
  private Long jobId;

  /** The job run ID where this API was invoked. */
  @JsonProperty("job_run_id")
  private Long jobRunId;

  public JobContext setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public JobContext setJobRunId(Long jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public Long getJobRunId() {
    return jobRunId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobContext that = (JobContext) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(jobRunId, that.jobRunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobRunId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobContext.class)
        .add("jobId", jobId)
        .add("jobRunId", jobRunId)
        .toString();
  }
}
