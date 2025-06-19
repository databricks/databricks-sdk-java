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

/** Metric associated with a run, represented as a key-value pair. */
@Generated
@JsonSerialize(using = Metric.MetricSerializer.class)
@JsonDeserialize(using = Metric.MetricDeserializer.class)
public class Metric {
  /**
   * The dataset digest of the dataset associated with the metric, e.g. an md5 hash of the dataset
   * that uniquely identifies it within datasets of the same name.
   */
  private String datasetDigest;

  /**
   * The name of the dataset associated with the metric. E.g. “my.uc.table@2” “nyc-taxi-dataset”,
   * “fantastic-elk-3”
   */
  private String datasetName;

  /** The key identifying the metric. */
  private String key;

  /**
   * The ID of the logged model or registered model version associated with the metric, if
   * applicable.
   */
  private String modelId;

  /** The ID of the run containing the metric. */
  private String runId;

  /** The step at which the metric was logged. */
  private Long step;

  /** The timestamp at which the metric was recorded. */
  private Long timestamp;

  /** The value of the metric. */
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

  MetricPb toPb() {
    MetricPb pb = new MetricPb();
    pb.setDatasetDigest(datasetDigest);
    pb.setDatasetName(datasetName);
    pb.setKey(key);
    pb.setModelId(modelId);
    pb.setRunId(runId);
    pb.setStep(step);
    pb.setTimestamp(timestamp);
    pb.setValue(value);

    return pb;
  }

  static Metric fromPb(MetricPb pb) {
    Metric model = new Metric();
    model.setDatasetDigest(pb.getDatasetDigest());
    model.setDatasetName(pb.getDatasetName());
    model.setKey(pb.getKey());
    model.setModelId(pb.getModelId());
    model.setRunId(pb.getRunId());
    model.setStep(pb.getStep());
    model.setTimestamp(pb.getTimestamp());
    model.setValue(pb.getValue());

    return model;
  }

  public static class MetricSerializer extends JsonSerializer<Metric> {
    @Override
    public void serialize(Metric value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MetricPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MetricDeserializer extends JsonDeserializer<Metric> {
    @Override
    public Metric deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MetricPb pb = mapper.readValue(p, MetricPb.class);
      return Metric.fromPb(pb);
    }
  }
}
