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
@JsonSerialize(using = UpdateRun.UpdateRunSerializer.class)
@JsonDeserialize(using = UpdateRun.UpdateRunDeserializer.class)
public class UpdateRun {
  /** Unix timestamp in milliseconds of when the run ended. */
  private Long endTime;

  /** ID of the run to update. Must be provided. */
  private String runId;

  /** Updated name of the run. */
  private String runName;

  /**
   * [Deprecated, use `run_id` instead] ID of the run to update. This field will be removed in a
   * future MLflow version.
   */
  private String runUuid;

  /** Updated status of the run. */
  private UpdateRunStatus status;

  public UpdateRun setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public UpdateRun setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public UpdateRun setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public UpdateRun setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public UpdateRun setStatus(UpdateRunStatus status) {
    this.status = status;
    return this;
  }

  public UpdateRunStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRun that = (UpdateRun) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, runId, runName, runUuid, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRun.class)
        .add("endTime", endTime)
        .add("runId", runId)
        .add("runName", runName)
        .add("runUuid", runUuid)
        .add("status", status)
        .toString();
  }

  UpdateRunPb toPb() {
    UpdateRunPb pb = new UpdateRunPb();
    pb.setEndTime(endTime);
    pb.setRunId(runId);
    pb.setRunName(runName);
    pb.setRunUuid(runUuid);
    pb.setStatus(status);

    return pb;
  }

  static UpdateRun fromPb(UpdateRunPb pb) {
    UpdateRun model = new UpdateRun();
    model.setEndTime(pb.getEndTime());
    model.setRunId(pb.getRunId());
    model.setRunName(pb.getRunName());
    model.setRunUuid(pb.getRunUuid());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class UpdateRunSerializer extends JsonSerializer<UpdateRun> {
    @Override
    public void serialize(UpdateRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRunDeserializer extends JsonDeserializer<UpdateRun> {
    @Override
    public UpdateRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRunPb pb = mapper.readValue(p, UpdateRunPb.class);
      return UpdateRun.fromPb(pb);
    }
  }
}
