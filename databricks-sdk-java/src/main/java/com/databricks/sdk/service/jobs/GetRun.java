// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRun that = (GetRun) o;
    return Objects.equals(includeHistory, that.includeHistory) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeHistory, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRun.class)
        .add("includeHistory", includeHistory)
        .add("runId", runId)
        .toString();
  }
}
