// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.annotation.QueryParam;

/** Get a single job */
public class Get {
  /** The canonical identifier of the job to retrieve information about. This field is required. */
  @QueryParam("job_id")
  private Long jobId;

  public Get setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }
}
