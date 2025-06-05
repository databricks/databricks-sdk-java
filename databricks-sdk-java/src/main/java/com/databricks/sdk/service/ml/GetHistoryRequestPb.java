// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get metric history for a run */
@Generated
class GetHistoryRequestPb {
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("metric_key")
  private String metricKey;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("run_id")
  private String runId;

  @JsonIgnore
  @QueryParam("run_uuid")
  private String runUuid;

  public GetHistoryRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public GetHistoryRequestPb setMetricKey(String metricKey) {
    this.metricKey = metricKey;
    return this;
  }

  public String getMetricKey() {
    return metricKey;
  }

  public GetHistoryRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetHistoryRequestPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public GetHistoryRequestPb setRunUuid(String runUuid) {
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
    GetHistoryRequestPb that = (GetHistoryRequestPb) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(metricKey, that.metricKey)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, metricKey, pageToken, runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(GetHistoryRequestPb.class)
        .add("maxResults", maxResults)
        .add("metricKey", metricKey)
        .add("pageToken", pageToken)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
