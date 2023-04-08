// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** Get a run */
public class GetRunRequest {
  /** ID of the run to fetch. Must be provided. */
  @QueryParam("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run to fetch. This field will be removed in a future
   * MLflow version.
   */
  @QueryParam("run_uuid")
  private String runUuid;

  public GetRunRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public GetRunRequest setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }
}
