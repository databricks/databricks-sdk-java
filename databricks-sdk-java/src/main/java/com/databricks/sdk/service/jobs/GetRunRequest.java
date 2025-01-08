// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a single job run */
@Generated
public class GetRunRequest {
  /** Whether to include the repair history in the response. */
  @JsonIgnore
  @QueryParam("include_history")
  private Boolean includeHistory;

  /** Whether to include resolved parameter values in the response. */
  @JsonIgnore
  @QueryParam("include_resolved_values")
  private Boolean includeResolvedValues;

  /**
   * Use `next_page_token` returned from the previous GetRun to request the next page of the run's
   * sub-resources.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The canonical identifier of the run for which to retrieve the metadata. This field is required.
   */
  @JsonIgnore
  @QueryParam("run_id")
  private Long runId;

  public GetRunRequest setIncludeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
    return this;
  }

  public Boolean getIncludeHistory() {
    return includeHistory;
  }

  public GetRunRequest setIncludeResolvedValues(Boolean includeResolvedValues) {
    this.includeResolvedValues = includeResolvedValues;
    return this;
  }

  public Boolean getIncludeResolvedValues() {
    return includeResolvedValues;
  }

  public GetRunRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetRunRequest setRunId(Long runId) {
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
    GetRunRequest that = (GetRunRequest) o;
    return Objects.equals(includeHistory, that.includeHistory)
        && Objects.equals(includeResolvedValues, that.includeResolvedValues)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeHistory, includeResolvedValues, pageToken, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunRequest.class)
        .add("includeHistory", includeHistory)
        .add("includeResolvedValues", includeResolvedValues)
        .add("pageToken", pageToken)
        .add("runId", runId)
        .toString();
  }
}
