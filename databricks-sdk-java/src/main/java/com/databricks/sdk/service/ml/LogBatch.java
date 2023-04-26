// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>LogBatch class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>metrics</code>.</p>
   *
   * @param metrics a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.LogBatch} object
   */
  public LogBatch setMetrics(Collection<Metric> metrics) {
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
   * <p>Setter for the field <code>params</code>.</p>
   *
   * @param params a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.LogBatch} object
   */
  public LogBatch setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  /**
   * <p>Getter for the field <code>params</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Param> getParams() {
    return params;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogBatch} object
   */
  public LogBatch setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.LogBatch} object
   */
  public LogBatch setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RunTag> getTags() {
    return tags;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, runId, tags);
  }

  /** {@inheritDoc} */
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
