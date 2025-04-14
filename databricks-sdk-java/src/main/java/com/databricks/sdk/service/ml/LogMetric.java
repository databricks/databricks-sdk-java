// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class LogMetric {
  /**
   * Dataset digest of the dataset associated with the metric, e.g. an md5 hash of the dataset that
   * uniquely identifies it within datasets of the same name.
   */
  @JsonProperty("dataset_digest")
  private String datasetDigest;

  /**
   * The name of the dataset associated with the metric. E.g. “my.uc.table@2” “nyc-taxi-dataset”,
   * “fantastic-elk-3”
   */
  @JsonProperty("dataset_name")
  private String datasetName;

  /** Name of the metric. */
  @JsonProperty("key")
  private String key;

  /** ID of the logged model associated with the metric, if applicable */
  @JsonProperty("model_id")
  private String modelId;

  /** ID of the run under which to log the metric. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run under which to log the metric. This field will
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
  private Double value;

  public LogMetric setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public LogMetric setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public LogMetric setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public LogMetric setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
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

  public LogMetric setValue(Double value) {
    this.value = value;
    return this;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogMetric that = (LogMetric) o;
    return Objects.equals(datasetDigest, that.datasetDigest)
        && Objects.equals(datasetName, that.datasetName)
        && Objects.equals(key, that.key)
        && Objects.equals(modelId, that.modelId)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(step, that.step)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datasetDigest, datasetName, key, modelId, runId, runUuid, step, timestamp, value);
  }

  @Override
  public String toString() {
    return new ToStringer(LogMetric.class)
        .add("datasetDigest", datasetDigest)
        .add("datasetName", datasetName)
        .add("key", key)
        .add("modelId", modelId)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("step", step)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}
