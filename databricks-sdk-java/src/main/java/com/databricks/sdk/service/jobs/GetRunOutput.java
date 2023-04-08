// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.annotation.QueryParam;

/** Get the output for a single run */
public class GetRunOutput {
  /** The canonical identifier for the run. This field is required. */
  @QueryParam("run_id")
  private Long runId;

  public GetRunOutput setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
}
