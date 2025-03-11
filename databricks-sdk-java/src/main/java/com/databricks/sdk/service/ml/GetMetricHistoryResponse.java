// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetMetricHistoryResponse {
  /**
   * All logged values for this metric if `max_results` is not specified in the request or if the
   * total count of metrics returned is less than the service level pagination threshold. Otherwise,
   * this is one page of results.
   */
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  /**
   * A token that can be used to issue a query for the next page of metric history values. A missing
   * token indicates that no additional metrics are available to fetch.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetMetricHistoryResponse setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public GetMetricHistoryResponse setNextPageToken(String nextPageToken) {
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
    GetMetricHistoryResponse that = (GetMetricHistoryResponse) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetricHistoryResponse.class)
        .add("metrics", metrics)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
