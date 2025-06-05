// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class LogBatchPb {
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  @JsonProperty("params")
  private Collection<Param> params;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("tags")
  private Collection<RunTag> tags;

  public LogBatchPb setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public LogBatchPb setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  public Collection<Param> getParams() {
    return params;
  }

  public LogBatchPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogBatchPb setTags(Collection<RunTag> tags) {
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
    LogBatchPb that = (LogBatchPb) o;
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
    return new ToStringer(LogBatchPb.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("runId", runId)
        .add("tags", tags)
        .toString();
  }
}
