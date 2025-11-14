// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing user-visible metrics */
@Generated
public class RetrieveUserVisibleMetricsResponse {
  /** Collection of metric values */
  @JsonProperty("metric_values")
  private Collection<MetricValues> metricValues;

  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public RetrieveUserVisibleMetricsResponse setMetricValues(Collection<MetricValues> metricValues) {
    this.metricValues = metricValues;
    return this;
  }

  public Collection<MetricValues> getMetricValues() {
    return metricValues;
  }

  public RetrieveUserVisibleMetricsResponse setNextPageToken(String nextPageToken) {
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
    RetrieveUserVisibleMetricsResponse that = (RetrieveUserVisibleMetricsResponse) o;
    return Objects.equals(metricValues, that.metricValues)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricValues, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(RetrieveUserVisibleMetricsResponse.class)
        .add("metricValues", metricValues)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
