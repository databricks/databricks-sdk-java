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

/** Get a run */
@Generated
@JsonSerialize(using = GetRunRequest.GetRunRequestSerializer.class)
@JsonDeserialize(using = GetRunRequest.GetRunRequestDeserializer.class)
public class GetRunRequest {
  /** ID of the run to fetch. Must be provided. */
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run to fetch. This field will be removed in a
   * future MLflow version.
   */
  private String runUuid;

  public GetRunRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public GetRunRequest setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunRequest that = (GetRunRequest) o;
    return Objects.equals(runId, that.runId) && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunRequest.class)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }

  GetRunRequestPb toPb() {
    GetRunRequestPb pb = new GetRunRequestPb();
    pb.setRunId(runId);
    pb.setRunUuid(runUuid);

    return pb;
  }

  static GetRunRequest fromPb(GetRunRequestPb pb) {
    GetRunRequest model = new GetRunRequest();
    model.setRunId(pb.getRunId());
    model.setRunUuid(pb.getRunUuid());

    return model;
  }

  public static class GetRunRequestSerializer extends JsonSerializer<GetRunRequest> {
    @Override
    public void serialize(GetRunRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRunRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRunRequestDeserializer extends JsonDeserializer<GetRunRequest> {
    @Override
    public GetRunRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRunRequestPb pb = mapper.readValue(p, GetRunRequestPb.class);
      return GetRunRequest.fromPb(pb);
    }
  }
}
