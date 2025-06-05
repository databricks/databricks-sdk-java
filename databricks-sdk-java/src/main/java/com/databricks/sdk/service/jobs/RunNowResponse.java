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

/** Run was started successfully. */
@Generated
@JsonSerialize(using = RunNowResponse.RunNowResponseSerializer.class)
@JsonDeserialize(using = RunNowResponse.RunNowResponseDeserializer.class)
public class RunNowResponse {
  /** A unique identifier for this job run. This is set to the same value as `run_id`. */
  private Long numberInJob;

  /** The globally unique ID of the newly triggered run. */
  private Long runId;

  public RunNowResponse setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  public Long getNumberInJob() {
    return numberInJob;
  }

  public RunNowResponse setRunId(Long runId) {
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
    RunNowResponse that = (RunNowResponse) o;
    return Objects.equals(numberInJob, that.numberInJob) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberInJob, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(RunNowResponse.class)
        .add("numberInJob", numberInJob)
        .add("runId", runId)
        .toString();
  }

  RunNowResponsePb toPb() {
    RunNowResponsePb pb = new RunNowResponsePb();
    pb.setNumberInJob(numberInJob);
    pb.setRunId(runId);

    return pb;
  }

  static RunNowResponse fromPb(RunNowResponsePb pb) {
    RunNowResponse model = new RunNowResponse();
    model.setNumberInJob(pb.getNumberInJob());
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class RunNowResponseSerializer extends JsonSerializer<RunNowResponse> {
    @Override
    public void serialize(RunNowResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunNowResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunNowResponseDeserializer extends JsonDeserializer<RunNowResponse> {
    @Override
    public RunNowResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunNowResponsePb pb = mapper.readValue(p, RunNowResponsePb.class);
      return RunNowResponse.fromPb(pb);
    }
  }
}
