// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public LogMetric setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public LogMetric setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogMetric setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public LogMetric setStep(Long step) {
    this.step = step;
    return this;
  }

  public Long getStep() {
    return step;
  }

  public LogMetric setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public LogMetric setValue(Float value) {
    this.value = value;
    return this;
  }

  public Float getValue() {
    return value;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(key, runId, runUuid, step, timestamp, value);
  }

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
