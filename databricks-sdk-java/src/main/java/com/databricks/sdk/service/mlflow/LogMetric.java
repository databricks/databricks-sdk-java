// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
