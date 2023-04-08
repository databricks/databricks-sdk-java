// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogBatch {
  /**
   * Metrics to log. A single request can contain up to 1000 metrics, and up to 1000 metrics,
   * params, and tags in total.
   */
  @JsonProperty("metrics")
  private java.util.List<Metric> metrics;

  /**
   * Params to log. A single request can contain up to 100 params, and up to 1000 metrics, params,
   * and tags in total.
   */
  @JsonProperty("params")
  private java.util.List<Param> params;

  /** ID of the run to log under */
  @JsonProperty("run_id")
  private String runId;

  /**
   * Tags to log. A single request can contain up to 100 tags, and up to 1000 metrics, params, and
   * tags in total.
   */
  @JsonProperty("tags")
  private java.util.List<RunTag> tags;

  public LogBatch setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  public LogBatch setParams(java.util.List<Param> params) {
    this.params = params;
    return this;
  }

  public java.util.List<Param> getParams() {
    return params;
  }

  public LogBatch setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogBatch setTags(java.util.List<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  public java.util.List<RunTag> getTags() {
    return tags;
  }
}
