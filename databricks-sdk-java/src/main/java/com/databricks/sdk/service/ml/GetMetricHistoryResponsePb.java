// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetMetricHistoryResponsePb {
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetMetricHistoryResponsePb setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public GetMetricHistoryResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetricHistoryResponsePb that = (GetMetricHistoryResponsePb) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetricHistoryResponsePb.class)
        .add("metrics", metrics)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
