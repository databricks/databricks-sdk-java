// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** Format of response retrieved from dbt Cloud, for inclusion in output */
@Generated
@JsonSerialize(using = DbtCloudJobRunStep.DbtCloudJobRunStepSerializer.class)
@JsonDeserialize(using = DbtCloudJobRunStep.DbtCloudJobRunStepDeserializer.class)
public class DbtCloudJobRunStep {
  /** Orders the steps in the job */
  private Long index;

  /** Output of the step */
  private String logs;

  /** Name of the step in the job */
  private String name;

  /** State of the step */
  private DbtCloudRunStatus status;

  public DbtCloudJobRunStep setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public DbtCloudJobRunStep setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  public String getLogs() {
    return logs;
  }

  public DbtCloudJobRunStep setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DbtCloudJobRunStep setStatus(DbtCloudRunStatus status) {
    this.status = status;
    return this;
  }

  public DbtCloudRunStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtCloudJobRunStep that = (DbtCloudJobRunStep) o;
    return Objects.equals(index, that.index)
        && Objects.equals(logs, that.logs)
        && Objects.equals(name, that.name)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, logs, name, status);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtCloudJobRunStep.class)
        .add("index", index)
        .add("logs", logs)
        .add("name", name)
        .add("status", status)
        .toString();
  }

  DbtCloudJobRunStepPb toPb() {
    DbtCloudJobRunStepPb pb = new DbtCloudJobRunStepPb();
    pb.setIndex(index);
    pb.setLogs(logs);
    pb.setName(name);
    pb.setStatus(status);

    return pb;
  }

  static DbtCloudJobRunStep fromPb(DbtCloudJobRunStepPb pb) {
    DbtCloudJobRunStep model = new DbtCloudJobRunStep();
    model.setIndex(pb.getIndex());
    model.setLogs(pb.getLogs());
    model.setName(pb.getName());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class DbtCloudJobRunStepSerializer extends JsonSerializer<DbtCloudJobRunStep> {
    @Override
    public void serialize(DbtCloudJobRunStep value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DbtCloudJobRunStepPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DbtCloudJobRunStepDeserializer extends JsonDeserializer<DbtCloudJobRunStep> {
    @Override
    public DbtCloudJobRunStep deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DbtCloudJobRunStepPb pb = mapper.readValue(p, DbtCloudJobRunStepPb.class);
      return DbtCloudJobRunStep.fromPb(pb);
    }
  }
}
