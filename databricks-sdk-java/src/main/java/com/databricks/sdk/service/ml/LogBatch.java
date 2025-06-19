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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = LogBatch.LogBatchSerializer.class)
@JsonDeserialize(using = LogBatch.LogBatchDeserializer.class)
public class LogBatch {
  /**
   * Metrics to log. A single request can contain up to 1000 metrics, and up to 1000 metrics,
   * params, and tags in total.
   */
  private Collection<Metric> metrics;

  /**
   * Params to log. A single request can contain up to 100 params, and up to 1000 metrics, params,
   * and tags in total.
   */
  private Collection<Param> params;

  /** ID of the run to log under */
  private String runId;

  /**
   * Tags to log. A single request can contain up to 100 tags, and up to 1000 metrics, params, and
   * tags in total.
   */
  private Collection<RunTag> tags;

  public LogBatch setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public LogBatch setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  public Collection<Param> getParams() {
    return params;
  }

  public LogBatch setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public LogBatch setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RunTag> getTags() {
    return tags;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, runId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(LogBatch.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("runId", runId)
        .add("tags", tags)
        .toString();
  }

  LogBatchPb toPb() {
    LogBatchPb pb = new LogBatchPb();
    pb.setMetrics(metrics);
    pb.setParams(params);
    pb.setRunId(runId);
    pb.setTags(tags);

    return pb;
  }

  static LogBatch fromPb(LogBatchPb pb) {
    LogBatch model = new LogBatch();
    model.setMetrics(pb.getMetrics());
    model.setParams(pb.getParams());
    model.setRunId(pb.getRunId());
    model.setTags(pb.getTags());

    return model;
  }

  public static class LogBatchSerializer extends JsonSerializer<LogBatch> {
    @Override
    public void serialize(LogBatch value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogBatchPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogBatchDeserializer extends JsonDeserializer<LogBatch> {
    @Override
    public LogBatch deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogBatchPb pb = mapper.readValue(p, LogBatchPb.class);
      return LogBatch.fromPb(pb);
    }
  }
}
