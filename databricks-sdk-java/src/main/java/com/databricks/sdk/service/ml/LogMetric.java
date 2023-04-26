// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>LogMetric class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class LogMetric {
  /** Name of the metric. */
  @JsonProperty("key")
  private String key;

  /** ID of the run under which to log the metric. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run under which to log the metric. This field will
   * be removed in a future MLflow version.
   */
  @JsonProperty("run_uuid")
  private String runUuid;

  /** Step at which to log the metric */
  @JsonProperty("step")
  private Long step;

  /** Unix timestamp in milliseconds at the time metric was logged. */
  @JsonProperty("timestamp")
  private Long timestamp;

  /** Double value of the metric being logged. */
  @JsonProperty("value")
  private Float value;

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogMetric} object
   */
  public LogMetric setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogMetric} object
   */
  public LogMetric setRunId(String runId) {
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
   * <p>Setter for the field <code>runUuid</code>.</p>
   *
   * @param runUuid a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogMetric} object
   */
  public LogMetric setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  /**
   * <p>Getter for the field <code>runUuid</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunUuid() {
    return runUuid;
  }

  /**
   * <p>Setter for the field <code>step</code>.</p>
   *
   * @param step a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.LogMetric} object
   */
  public LogMetric setStep(Long step) {
    this.step = step;
    return this;
  }

  /**
   * <p>Getter for the field <code>step</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStep() {
    return step;
  }

  /**
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.LogMetric} object
   */
  public LogMetric setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>timestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.ml.LogMetric} object
   */
  public LogMetric setValue(Float value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getValue() {
    return value;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogMetric that = (LogMetric) o;
    return Objects.equals(key, that.key)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(step, that.step)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, runId, runUuid, step, timestamp, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogMetric.class)
        .add("key", key)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("step", step)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}
