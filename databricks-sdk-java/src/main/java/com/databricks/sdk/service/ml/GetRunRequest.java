// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunRequest that = (GetRunRequest) o;
    return Objects.equals(runId, that.runId) && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunRequest.class)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
