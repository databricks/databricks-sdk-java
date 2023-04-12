// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get history of a given metric within a run */
public class GetHistoryRequest {
  /**
   * Maximum number of Metric records to return per paginated request. Default is set to 25,000. If
   * set higher than 25,000, a request Exception will be raised.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Name of the metric. */
  @QueryParam("metric_key")
  private String metricKey;

  /** Token indicating the page of metric histories to fetch. */
  @QueryParam("page_token")
  private String pageToken;

  /** ID of the run from which to fetch metric values. Must be provided. */
  @QueryParam("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run from which to fetch metric values. This field
   * will be removed in a future MLflow version.
   */
  @QueryParam("run_uuid")
  private String runUuid;

  public GetHistoryRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public GetHistoryRequest setMetricKey(String metricKey) {
    this.metricKey = metricKey;
    return this;
  }

  public String getMetricKey() {
    return metricKey;
  }

  public GetHistoryRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetHistoryRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public GetHistoryRequest setRunUuid(String runUuid) {
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
    GetHistoryRequest that = (GetHistoryRequest) o;
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
    return new ToStringer(GetHistoryRequest.class)
        .add("maxResults", maxResults)
        .add("metricKey", metricKey)
        .add("pageToken", pageToken)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
