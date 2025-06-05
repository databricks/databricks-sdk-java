// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class LogMetricPb {
  @JsonProperty("dataset_digest")
  private String datasetDigest;

  @JsonProperty("dataset_name")
  private String datasetName;

  @JsonProperty("key")
  private String key;

  @JsonProperty("model_id")
  private String modelId;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("run_uuid")
  private String runUuid;

  @JsonProperty("step")
  private Long step;

  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("value")
  private Double value;

  public LogMetricPb setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public LogMetricPb setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public LogMetricPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public LogMetricPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public LogMetricPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogMetricPb setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public LogMetricPb setStep(Long step) {
    this.step = step;
    return this;
  }

  public Long getStep() {
    return step;
  }

  public LogMetricPb setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public LogMetricPb setValue(Double value) {
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
    LogMetricPb that = (LogMetricPb) o;
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
    return new ToStringer(LogMetricPb.class)
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
