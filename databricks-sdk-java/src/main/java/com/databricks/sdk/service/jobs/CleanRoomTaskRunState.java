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

/** Stores the run state of the clean rooms notebook task. */
@Generated
@JsonSerialize(using = CleanRoomTaskRunState.CleanRoomTaskRunStateSerializer.class)
@JsonDeserialize(using = CleanRoomTaskRunState.CleanRoomTaskRunStateDeserializer.class)
public class CleanRoomTaskRunState {
  /**
   * A value indicating the run's current lifecycle state. This field is always available in the
   * response. Note: Additional states might be introduced in future releases.
   */
  private CleanRoomTaskRunLifeCycleState lifeCycleState;

  /**
   * A value indicating the run's result. This field is only available for terminal lifecycle
   * states. Note: Additional states might be introduced in future releases.
   */
  private CleanRoomTaskRunResultState resultState;

  public CleanRoomTaskRunState setLifeCycleState(CleanRoomTaskRunLifeCycleState lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

  public CleanRoomTaskRunLifeCycleState getLifeCycleState() {
    return lifeCycleState;
  }

  public CleanRoomTaskRunState setResultState(CleanRoomTaskRunResultState resultState) {
    this.resultState = resultState;
    return this;
  }

  public CleanRoomTaskRunResultState getResultState() {
    return resultState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomTaskRunState that = (CleanRoomTaskRunState) o;
    return Objects.equals(lifeCycleState, that.lifeCycleState)
        && Objects.equals(resultState, that.resultState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeCycleState, resultState);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomTaskRunState.class)
        .add("lifeCycleState", lifeCycleState)
        .add("resultState", resultState)
        .toString();
  }

  CleanRoomTaskRunStatePb toPb() {
    CleanRoomTaskRunStatePb pb = new CleanRoomTaskRunStatePb();
    pb.setLifeCycleState(lifeCycleState);
    pb.setResultState(resultState);

    return pb;
  }

  static CleanRoomTaskRunState fromPb(CleanRoomTaskRunStatePb pb) {
    CleanRoomTaskRunState model = new CleanRoomTaskRunState();
    model.setLifeCycleState(pb.getLifeCycleState());
    model.setResultState(pb.getResultState());

    return model;
  }

  public static class CleanRoomTaskRunStateSerializer
      extends JsonSerializer<CleanRoomTaskRunState> {
    @Override
    public void serialize(
        CleanRoomTaskRunState value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomTaskRunStatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomTaskRunStateDeserializer
      extends JsonDeserializer<CleanRoomTaskRunState> {
    @Override
    public CleanRoomTaskRunState deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomTaskRunStatePb pb = mapper.readValue(p, CleanRoomTaskRunStatePb.class);
      return CleanRoomTaskRunState.fromPb(pb);
    }
  }
}
