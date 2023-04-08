// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.annotation.QueryParam;

/** Get a single job run */
public class GetRun {
  /** Whether to include the repair history in the response. */
  @QueryParam("include_history")
  private Boolean includeHistory;

  /**
   * The canonical identifier of the run for which to retrieve the metadata. This field is required.
   */
  @QueryParam("run_id")
  private Long runId;

  public GetRun setIncludeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
    return this;
  }

  public Boolean getIncludeHistory() {
    return includeHistory;
  }

  public GetRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
}
