// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class LogBatch {
  /**
   * Metrics to log. A single request can contain up to 1000 metrics, and up to 1000 metrics,
   * params, and tags in total.
   */
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  /**
   * Params to log. A single request can contain up to 100 params, and up to 1000 metrics, params,
   * and tags in total.
   */
  @JsonProperty("params")
  private Collection<Param> params;

  /** ID of the run to log under */
  @JsonProperty("run_id")
  private String runId;

  /**
   * Tags to log. A single request can contain up to 100 tags, and up to 1000 metrics, params, and
   * tags in total.
   */
  @JsonProperty("tags")
  private Collection<RunTag> tags;

  public LogBatch setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public LogBatch setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  public Collection<Param> getParams() {
    return params;
  }

  public LogBatch setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogBatch setTags(Collection<RunTag> tags) {
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
    LogBatch that = (LogBatch) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(params, that.params)
        && Objects.equals(runId, that.runId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, runId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(LogBatch.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("runId", runId)
        .add("tags", tags)
        .toString();
  }
}
