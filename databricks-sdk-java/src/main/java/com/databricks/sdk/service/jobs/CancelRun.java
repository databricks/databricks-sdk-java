// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelRun {
  /** This field is required. */
  @JsonProperty("run_id")
  private Long runId;

  public CancelRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
}
