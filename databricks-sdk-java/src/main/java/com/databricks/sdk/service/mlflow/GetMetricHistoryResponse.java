// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMetricHistoryResponse {
  /** All logged values for this metric. */
  @JsonProperty("metrics")
  private java.util.List<Metric> metrics;

  /** Token that can be used to retrieve the next page of metric history results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetMetricHistoryResponse setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  public GetMetricHistoryResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }
}
