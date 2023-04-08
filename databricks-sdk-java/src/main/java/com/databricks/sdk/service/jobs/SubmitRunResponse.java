// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubmitRunResponse {
  /** The canonical identifier for the newly submitted run. */
  @JsonProperty("run_id")
  private Long runId;

  public SubmitRunResponse setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
}
