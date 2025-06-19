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

@Generated
@JsonSerialize(using = RunJobOutput.RunJobOutputSerializer.class)
@JsonDeserialize(using = RunJobOutput.RunJobOutputDeserializer.class)
public class RunJobOutput {
  /** The run id of the triggered job run */
  private Long runId;

  public RunJobOutput setRunId(Long runId) {
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
    RunJobOutput that = (RunJobOutput) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(RunJobOutput.class).add("runId", runId).toString();
  }

  RunJobOutputPb toPb() {
    RunJobOutputPb pb = new RunJobOutputPb();
    pb.setRunId(runId);

    return pb;
  }

  static RunJobOutput fromPb(RunJobOutputPb pb) {
    RunJobOutput model = new RunJobOutput();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class RunJobOutputSerializer extends JsonSerializer<RunJobOutput> {
    @Override
    public void serialize(RunJobOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunJobOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunJobOutputDeserializer extends JsonDeserializer<RunJobOutput> {
    @Override
    public RunJobOutput deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunJobOutputPb pb = mapper.readValue(p, RunJobOutputPb.class);
      return RunJobOutput.fromPb(pb);
    }
  }
}
