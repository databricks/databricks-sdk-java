// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>RunData class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>metrics</code>.</p>
   *
   * @param metrics a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.RunData} object
   */
  public RunData setMetrics(Collection<Metric> metrics) {
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
   * @return a {@link com.databricks.sdk.service.ml.RunData} object
   */
  public RunData setParams(Collection<Param> params) {
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
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.RunData} object
   */
  public RunData setTags(Collection<RunTag> tags) {
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
    RunData that = (RunData) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(params, that.params)
        && Objects.equals(tags, that.tags);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, tags);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RunData.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("tags", tags)
        .toString();
  }
}
