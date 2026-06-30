// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metric associated with a run, represented as a key-value pair. */
@Generated
public class Metric {
  /**
   * The dataset digest of the dataset associated with the metric, e.g. an md5 hash of the dataset
   * that uniquely identifies it within datasets of the same name.
   */
  @JsonProperty("dataset_digest")
  private String datasetDigest;

  /**
   * The name of the dataset associated with the metric. E.g. “my.uc.table@2” “nyc-taxi-dataset”,
   * “fantastic-elk-3”
   */
  @JsonProperty("dataset_name")
  private String datasetName;

  /** The key identifying the metric. */
  @JsonProperty("key")
  private String key;

  /**
   * The ID of the logged model or registered model version associated with the metric, if
   * applicable.
   */
  @JsonProperty("model_id")
  private String modelId;

  /** The ID of the run containing the metric. */
  @JsonProperty("run_id")
  private String runId;

  /** The step at which the metric was logged. */
  @JsonProperty("step")
  private Long step;

  /** The timestamp at which the metric was recorded. */
  @JsonProperty("timestamp")
  private Long timestamp;

  /** The value of the metric. */
  @JsonProperty("value")
  private Double value;

  public Metric setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public Metric setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public Metric setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public Metric setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public Metric setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public Metric setStep(Long step) {
    this.step = step;
    return this;
  }

  public Long getStep() {
    return step;
  }

  public Metric setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public Metric setValue(Double value) {
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
    Metric that = (Metric) o;
    return Objects.equals(datasetDigest, that.datasetDigest)
        && Objects.equals(datasetName, that.datasetName)
        && Objects.equals(key, that.key)
        && Objects.equals(modelId, that.modelId)
        && Objects.equals(runId, that.runId)
        && Objects.equals(step, that.step)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetDigest, datasetName, key, modelId, runId, step, timestamp, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Metric.class)
        .add("datasetDigest", datasetDigest)
        .add("datasetName", datasetName)
        .add("key", key)
        .add("modelId", modelId)
        .add("runId", runId)
        .add("step", step)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}
