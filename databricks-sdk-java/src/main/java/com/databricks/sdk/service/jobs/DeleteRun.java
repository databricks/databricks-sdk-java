// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteRun {
  /** The canonical identifier of the run for which to retrieve the metadata. */
  @JsonProperty("run_id")
  private Long runId;

  public DeleteRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
}
