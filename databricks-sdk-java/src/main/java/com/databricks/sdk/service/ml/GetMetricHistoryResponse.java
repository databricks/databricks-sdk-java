// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetMetricHistoryResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetMetricHistoryResponse {
  /** All logged values for this metric. */
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  /** Token that can be used to retrieve the next page of metric history results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * <p>Setter for the field <code>metrics</code>.</p>
   *
   * @param metrics a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.GetMetricHistoryResponse} object
   */
  public GetMetricHistoryResponse setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * <p>Getter for the field <code>metrics</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Metric> getMetrics() {
    return metrics;
  }

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetMetricHistoryResponse} object
   */
  public GetMetricHistoryResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetricHistoryResponse that = (GetMetricHistoryResponse) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(metrics, nextPageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetMetricHistoryResponse.class)
        .add("metrics", metrics)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
