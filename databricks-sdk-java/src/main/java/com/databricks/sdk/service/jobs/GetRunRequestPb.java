// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a single job run */
@Generated
class GetRunRequestPb {
  @JsonIgnore
  @QueryParam("include_history")
  private Boolean includeHistory;

  @JsonIgnore
  @QueryParam("include_resolved_values")
  private Boolean includeResolvedValues;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("run_id")
  private Long runId;

  public GetRunRequestPb setIncludeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
    return this;
  }

  public Boolean getIncludeHistory() {
    return includeHistory;
  }

  public GetRunRequestPb setIncludeResolvedValues(Boolean includeResolvedValues) {
    this.includeResolvedValues = includeResolvedValues;
    return this;
  }

  public Boolean getIncludeResolvedValues() {
    return includeResolvedValues;
  }

  public GetRunRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetRunRequestPb setRunId(Long runId) {
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
    GetRunRequestPb that = (GetRunRequestPb) o;
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
    return new ToStringer(GetRunRequestPb.class)
        .add("includeHistory", includeHistory)
        .add("includeResolvedValues", includeResolvedValues)
        .add("pageToken", pageToken)
        .add("runId", runId)
        .toString();
  }
}
