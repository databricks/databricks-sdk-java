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

/** Get the output for a single run */
@Generated
@JsonSerialize(using = GetRunOutputRequest.GetRunOutputRequestSerializer.class)
@JsonDeserialize(using = GetRunOutputRequest.GetRunOutputRequestDeserializer.class)
public class GetRunOutputRequest {
  /** The canonical identifier for the run. */
  private Long runId;

  public GetRunOutputRequest setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunOutputRequest that = (GetRunOutputRequest) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunOutputRequest.class).add("runId", runId).toString();
  }

  GetRunOutputRequestPb toPb() {
    GetRunOutputRequestPb pb = new GetRunOutputRequestPb();
    pb.setRunId(runId);

    return pb;
  }

  static GetRunOutputRequest fromPb(GetRunOutputRequestPb pb) {
    GetRunOutputRequest model = new GetRunOutputRequest();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class GetRunOutputRequestSerializer extends JsonSerializer<GetRunOutputRequest> {
    @Override
    public void serialize(GetRunOutputRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRunOutputRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRunOutputRequestDeserializer
      extends JsonDeserializer<GetRunOutputRequest> {
    @Override
    public GetRunOutputRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRunOutputRequestPb pb = mapper.readValue(p, GetRunOutputRequestPb.class);
      return GetRunOutputRequest.fromPb(pb);
    }
  }
}
