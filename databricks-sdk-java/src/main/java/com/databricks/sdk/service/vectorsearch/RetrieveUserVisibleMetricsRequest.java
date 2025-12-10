// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Request to retrieve user-visible metrics */
@Generated
public class RetrieveUserVisibleMetricsRequest {
  /** End time for metrics query */
  @JsonProperty("end_time")
  private String endTime;

  /** Granularity in seconds */
  @JsonProperty("granularity_in_seconds")
  private Long granularityInSeconds;

  /** List of metrics to retrieve */
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  /** Vector search endpoint name */
  @JsonIgnore private String name;

  /** Token for pagination */
  @JsonProperty("page_token")
  private String pageToken;

  /** Start time for metrics query */
  @JsonProperty("start_time")
  private String startTime;

  public RetrieveUserVisibleMetricsRequest setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public String getEndTime() {
    return endTime;
  }

  public RetrieveUserVisibleMetricsRequest setGranularityInSeconds(Long granularityInSeconds) {
    this.granularityInSeconds = granularityInSeconds;
    return this;
  }

  public Long getGranularityInSeconds() {
    return granularityInSeconds;
  }

  public RetrieveUserVisibleMetricsRequest setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public RetrieveUserVisibleMetricsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RetrieveUserVisibleMetricsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public RetrieveUserVisibleMetricsRequest setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public String getStartTime() {
    return startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RetrieveUserVisibleMetricsRequest that = (RetrieveUserVisibleMetricsRequest) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(granularityInSeconds, that.granularityInSeconds)
        && Objects.equals(metrics, that.metrics)
        && Objects.equals(name, that.name)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, granularityInSeconds, metrics, name, pageToken, startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(RetrieveUserVisibleMetricsRequest.class)
        .add("endTime", endTime)
        .add("granularityInSeconds", granularityInSeconds)
        .add("metrics", metrics)
        .add("name", name)
        .add("pageToken", pageToken)
        .add("startTime", startTime)
        .toString();
  }
}
