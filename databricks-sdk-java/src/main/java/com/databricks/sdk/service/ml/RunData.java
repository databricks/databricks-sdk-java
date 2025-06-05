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

/** Run data (metrics, params, and tags). */
@Generated
@JsonSerialize(using = RunData.RunDataSerializer.class)
@JsonDeserialize(using = RunData.RunDataDeserializer.class)
public class RunData {
  /** Run metrics. */
  private Collection<Metric> metrics;

  /** Run parameters. */
  private Collection<Param> params;

  /** Additional metadata key-value pairs. */
  private Collection<RunTag> tags;

  public RunData setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public RunData setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  public Collection<Param> getParams() {
    return params;
  }

  public RunData setTags(Collection<RunTag> tags) {
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
    RunData that = (RunData) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(params, that.params)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(RunData.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("tags", tags)
        .toString();
  }

  RunDataPb toPb() {
    RunDataPb pb = new RunDataPb();
    pb.setMetrics(metrics);
    pb.setParams(params);
    pb.setTags(tags);

    return pb;
  }

  static RunData fromPb(RunDataPb pb) {
    RunData model = new RunData();
    model.setMetrics(pb.getMetrics());
    model.setParams(pb.getParams());
    model.setTags(pb.getTags());

    return model;
  }

  public static class RunDataSerializer extends JsonSerializer<RunData> {
    @Override
    public void serialize(RunData value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunDataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunDataDeserializer extends JsonDeserializer<RunData> {
    @Override
    public RunData deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunDataPb pb = mapper.readValue(p, RunDataPb.class);
      return RunData.fromPb(pb);
    }
  }
}
