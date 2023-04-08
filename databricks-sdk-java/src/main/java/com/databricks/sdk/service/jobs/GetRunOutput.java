// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunOutput that = (GetRunOutput) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunOutput.class).add("runId", runId).toString();
  }
}
