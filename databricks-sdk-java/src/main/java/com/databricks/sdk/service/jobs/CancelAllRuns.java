// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelAllRuns {
  /** The canonical identifier of the job to cancel all runs of. This field is required. */
  @JsonProperty("job_id")
  private Long jobId;

  public CancelAllRuns setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }
}
