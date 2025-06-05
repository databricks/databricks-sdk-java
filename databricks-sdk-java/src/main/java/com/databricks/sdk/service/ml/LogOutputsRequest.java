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
@JsonSerialize(using = LogOutputsRequest.LogOutputsRequestSerializer.class)
@JsonDeserialize(using = LogOutputsRequest.LogOutputsRequestDeserializer.class)
public class LogOutputsRequest {
  /** The model outputs from the Run. */
  private Collection<ModelOutput> models;

  /** The ID of the Run from which to log outputs. */
  private String runId;

  public LogOutputsRequest setModels(Collection<ModelOutput> models) {
    this.models = models;
    return this;
  }

  public Collection<ModelOutput> getModels() {
    return models;
  }

  public LogOutputsRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogOutputsRequest that = (LogOutputsRequest) o;
    return Objects.equals(models, that.models) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogOutputsRequest.class)
        .add("models", models)
        .add("runId", runId)
        .toString();
  }

  LogOutputsRequestPb toPb() {
    LogOutputsRequestPb pb = new LogOutputsRequestPb();
    pb.setModels(models);
    pb.setRunId(runId);

    return pb;
  }

  static LogOutputsRequest fromPb(LogOutputsRequestPb pb) {
    LogOutputsRequest model = new LogOutputsRequest();
    model.setModels(pb.getModels());
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class LogOutputsRequestSerializer extends JsonSerializer<LogOutputsRequest> {
    @Override
    public void serialize(LogOutputsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogOutputsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogOutputsRequestDeserializer extends JsonDeserializer<LogOutputsRequest> {
    @Override
    public LogOutputsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogOutputsRequestPb pb = mapper.readValue(p, LogOutputsRequestPb.class);
      return LogOutputsRequest.fromPb(pb);
    }
  }
}
