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

/** A LoggedModelData message includes logged model params and linked metrics. */
@Generated
@JsonSerialize(using = LoggedModelData.LoggedModelDataSerializer.class)
@JsonDeserialize(using = LoggedModelData.LoggedModelDataDeserializer.class)
public class LoggedModelData {
  /** Performance metrics linked to the model. */
  private Collection<Metric> metrics;

  /** Immutable string key-value pairs of the model. */
  private Collection<LoggedModelParameter> params;

  public LoggedModelData setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public LoggedModelData setParams(Collection<LoggedModelParameter> params) {
    this.params = params;
    return this;
  }

  public Collection<LoggedModelParameter> getParams() {
    return params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LoggedModelData that = (LoggedModelData) o;
    return Objects.equals(metrics, that.metrics) && Objects.equals(params, that.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModelData.class)
        .add("metrics", metrics)
        .add("params", params)
        .toString();
  }

  LoggedModelDataPb toPb() {
    LoggedModelDataPb pb = new LoggedModelDataPb();
    pb.setMetrics(metrics);
    pb.setParams(params);

    return pb;
  }

  static LoggedModelData fromPb(LoggedModelDataPb pb) {
    LoggedModelData model = new LoggedModelData();
    model.setMetrics(pb.getMetrics());
    model.setParams(pb.getParams());

    return model;
  }

  public static class LoggedModelDataSerializer extends JsonSerializer<LoggedModelData> {
    @Override
    public void serialize(LoggedModelData value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LoggedModelDataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LoggedModelDataDeserializer extends JsonDeserializer<LoggedModelData> {
    @Override
    public LoggedModelData deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LoggedModelDataPb pb = mapper.readValue(p, LoggedModelDataPb.class);
      return LoggedModelData.fromPb(pb);
    }
  }
}
