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
  /**
   * One time series for each requested metric and each combination of label values it was broken
   * down by.
   */
  @JsonProperty("metric_values")
  private Collection<MetricValues> metricValues;

  /** Not set. The response returns all data points in one page. */
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
