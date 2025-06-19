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
@JsonSerialize(using = LogModel.LogModelSerializer.class)
@JsonDeserialize(using = LogModel.LogModelDeserializer.class)
public class LogModel {
  /** MLmodel file in json format. */
  private String modelJson;

  /** ID of the run to log under */
  private String runId;

  public LogModel setModelJson(String modelJson) {
    this.modelJson = modelJson;
    return this;
  }

  public String getModelJson() {
    return modelJson;
  }

  public LogModel setRunId(String runId) {
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
    LogModel that = (LogModel) o;
    return Objects.equals(modelJson, that.modelJson) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelJson, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogModel.class)
        .add("modelJson", modelJson)
        .add("runId", runId)
        .toString();
  }

  LogModelPb toPb() {
    LogModelPb pb = new LogModelPb();
    pb.setModelJson(modelJson);
    pb.setRunId(runId);

    return pb;
  }

  static LogModel fromPb(LogModelPb pb) {
    LogModel model = new LogModel();
    model.setModelJson(pb.getModelJson());
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class LogModelSerializer extends JsonSerializer<LogModel> {
    @Override
    public void serialize(LogModel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogModelDeserializer extends JsonDeserializer<LogModel> {
    @Override
    public LogModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogModelPb pb = mapper.readValue(p, LogModelPb.class);
      return LogModel.fromPb(pb);
    }
  }
}
