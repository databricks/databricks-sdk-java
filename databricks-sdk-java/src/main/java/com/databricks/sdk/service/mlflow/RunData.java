// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class RunData {
  /** Run metrics. */
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  /** Run parameters. */
  @JsonProperty("params")
  private Collection<Param> params;

  /** Additional metadata key-value pairs. */
  @JsonProperty("tags")
  private Collection<RunTag> tags;

  public RunData setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public RunData setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  public Collection<Param> getParams() {
    return params;
  }

  public RunData setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RunTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunData that = (RunData) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(params, that.params)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(RunData.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("tags", tags)
        .toString();
  }
}
