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
@JsonSerialize(using = LogInputs.LogInputsSerializer.class)
@JsonDeserialize(using = LogInputs.LogInputsDeserializer.class)
public class LogInputs {
  /** Dataset inputs */
  private Collection<DatasetInput> datasets;

  /** Model inputs */
  private Collection<ModelInput> models;

  /** ID of the run to log under */
  private String runId;

  public LogInputs setDatasets(Collection<DatasetInput> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<DatasetInput> getDatasets() {
    return datasets;
  }

  public LogInputs setModels(Collection<ModelInput> models) {
    this.models = models;
    return this;
  }

  public Collection<ModelInput> getModels() {
    return models;
  }

  public LogInputs setRunId(String runId) {
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
    LogInputs that = (LogInputs) o;
    return Objects.equals(datasets, that.datasets)
        && Objects.equals(models, that.models)
        && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, models, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogInputs.class)
        .add("datasets", datasets)
        .add("models", models)
        .add("runId", runId)
        .toString();
  }

  LogInputsPb toPb() {
    LogInputsPb pb = new LogInputsPb();
    pb.setDatasets(datasets);
    pb.setModels(models);
    pb.setRunId(runId);

    return pb;
  }

  static LogInputs fromPb(LogInputsPb pb) {
    LogInputs model = new LogInputs();
    model.setDatasets(pb.getDatasets());
    model.setModels(pb.getModels());
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class LogInputsSerializer extends JsonSerializer<LogInputs> {
    @Override
    public void serialize(LogInputs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogInputsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogInputsDeserializer extends JsonDeserializer<LogInputs> {
    @Override
    public LogInputs deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogInputsPb pb = mapper.readValue(p, LogInputsPb.class);
      return LogInputs.fromPb(pb);
    }
  }
}
