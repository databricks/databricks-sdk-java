// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = LogMetric.LogMetricSerializer.class)
@JsonDeserialize(using = LogMetric.LogMetricDeserializer.class)
public class LogMetric {
  /**
   * Dataset digest of the dataset associated with the metric, e.g. an md5 hash of the dataset that
   * uniquely identifies it within datasets of the same name.
   */
  private String datasetDigest;

  /**
   * The name of the dataset associated with the metric. E.g. “my.uc.table@2” “nyc-taxi-dataset”,
   * “fantastic-elk-3”
   */
  private String datasetName;

  /** Name of the metric. */
  private String key;

  /** ID of the logged model associated with the metric, if applicable */
  private String modelId;

  /** ID of the run under which to log the metric. Must be provided. */
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run under which to log the metric. This field will
   * be removed in a future MLflow version.
   */
  private String runUuid;

  /** Step at which to log the metric */
  private Long step;

  /** Unix timestamp in milliseconds at the time metric was logged. */
  private Long timestamp;

  /** Double value of the metric being logged. */
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

  LogMetricPb toPb() {
    LogMetricPb pb = new LogMetricPb();
    pb.setDatasetDigest(datasetDigest);
    pb.setDatasetName(datasetName);
    pb.setKey(key);
    pb.setModelId(modelId);
    pb.setRunId(runId);
    pb.setRunUuid(runUuid);
    pb.setStep(step);
    pb.setTimestamp(timestamp);
    pb.setValue(value);

    return pb;
  }

  static LogMetric fromPb(LogMetricPb pb) {
    LogMetric model = new LogMetric();
    model.setDatasetDigest(pb.getDatasetDigest());
    model.setDatasetName(pb.getDatasetName());
    model.setKey(pb.getKey());
    model.setModelId(pb.getModelId());
    model.setRunId(pb.getRunId());
    model.setRunUuid(pb.getRunUuid());
    model.setStep(pb.getStep());
    model.setTimestamp(pb.getTimestamp());
    model.setValue(pb.getValue());

    return model;
  }

  public static class LogMetricSerializer extends JsonSerializer<LogMetric> {
    @Override
    public void serialize(LogMetric value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogMetricPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogMetricDeserializer extends JsonDeserializer<LogMetric> {
    @Override
    public LogMetric deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogMetricPb pb = mapper.readValue(p, LogMetricPb.class);
      return LogMetric.fromPb(pb);
    }
  }
}
