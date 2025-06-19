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

/** The current status of the run */
@Generated
@JsonSerialize(using = RunStatus.RunStatusSerializer.class)
@JsonDeserialize(using = RunStatus.RunStatusDeserializer.class)
public class RunStatus {
  /** If the run was queued, details about the reason for queuing the run. */
  private QueueDetails queueDetails;

  /** The current state of the run. */
  private RunLifecycleStateV2State state;

  /**
   * If the run is in a TERMINATING or TERMINATED state, details about the reason for terminating
   * the run.
   */
  private TerminationDetails terminationDetails;

  public RunStatus setQueueDetails(QueueDetails queueDetails) {
    this.queueDetails = queueDetails;
    return this;
  }

  public QueueDetails getQueueDetails() {
    return queueDetails;
  }

  public RunStatus setState(RunLifecycleStateV2State state) {
    this.state = state;
    return this;
  }

  public RunLifecycleStateV2State getState() {
    return state;
  }

  public RunStatus setTerminationDetails(TerminationDetails terminationDetails) {
    this.terminationDetails = terminationDetails;
    return this;
  }

  public TerminationDetails getTerminationDetails() {
    return terminationDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunStatus that = (RunStatus) o;
    return Objects.equals(queueDetails, that.queueDetails)
        && Objects.equals(state, that.state)
        && Objects.equals(terminationDetails, that.terminationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueDetails, state, terminationDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(RunStatus.class)
        .add("queueDetails", queueDetails)
        .add("state", state)
        .add("terminationDetails", terminationDetails)
        .toString();
  }

  RunStatusPb toPb() {
    RunStatusPb pb = new RunStatusPb();
    pb.setQueueDetails(queueDetails);
    pb.setState(state);
    pb.setTerminationDetails(terminationDetails);

    return pb;
  }

  static RunStatus fromPb(RunStatusPb pb) {
    RunStatus model = new RunStatus();
    model.setQueueDetails(pb.getQueueDetails());
    model.setState(pb.getState());
    model.setTerminationDetails(pb.getTerminationDetails());

    return model;
  }

  public static class RunStatusSerializer extends JsonSerializer<RunStatus> {
    @Override
    public void serialize(RunStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunStatusDeserializer extends JsonDeserializer<RunStatus> {
    @Override
    public RunStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunStatusPb pb = mapper.readValue(p, RunStatusPb.class);
      return RunStatus.fromPb(pb);
    }
  }
}
