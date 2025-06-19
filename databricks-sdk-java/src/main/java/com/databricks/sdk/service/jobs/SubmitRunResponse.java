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

/** Run was created and started successfully. */
@Generated
@JsonSerialize(using = SubmitRunResponse.SubmitRunResponseSerializer.class)
@JsonDeserialize(using = SubmitRunResponse.SubmitRunResponseDeserializer.class)
public class SubmitRunResponse {
  /** The canonical identifier for the newly submitted run. */
  private Long runId;

  public SubmitRunResponse setRunId(Long runId) {
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
    SubmitRunResponse that = (SubmitRunResponse) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(SubmitRunResponse.class).add("runId", runId).toString();
  }

  SubmitRunResponsePb toPb() {
    SubmitRunResponsePb pb = new SubmitRunResponsePb();
    pb.setRunId(runId);

    return pb;
  }

  static SubmitRunResponse fromPb(SubmitRunResponsePb pb) {
    SubmitRunResponse model = new SubmitRunResponse();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class SubmitRunResponseSerializer extends JsonSerializer<SubmitRunResponse> {
    @Override
    public void serialize(SubmitRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubmitRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubmitRunResponseDeserializer extends JsonDeserializer<SubmitRunResponse> {
    @Override
    public SubmitRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubmitRunResponsePb pb = mapper.readValue(p, SubmitRunResponsePb.class);
      return SubmitRunResponse.fromPb(pb);
    }
  }
}
