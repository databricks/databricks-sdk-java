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
@JsonSerialize(
    using =
        CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput
            .CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputSerializer.class)
@JsonDeserialize(
    using =
        CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput
            .CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputDeserializer.class)
public class CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput {
  /** The run state of the clean rooms notebook task. */
  private CleanRoomTaskRunState cleanRoomJobRunState;

  /** The notebook output for the clean room run */
  private NotebookOutput notebookOutput;

  /** Information on how to access the output schema for the clean room run */
  private OutputSchemaInfo outputSchemaInfo;

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput setCleanRoomJobRunState(
      CleanRoomTaskRunState cleanRoomJobRunState) {
    this.cleanRoomJobRunState = cleanRoomJobRunState;
    return this;
  }

  public CleanRoomTaskRunState getCleanRoomJobRunState() {
    return cleanRoomJobRunState;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput setNotebookOutput(
      NotebookOutput notebookOutput) {
    this.notebookOutput = notebookOutput;
    return this;
  }

  public NotebookOutput getNotebookOutput() {
    return notebookOutput;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput setOutputSchemaInfo(
      OutputSchemaInfo outputSchemaInfo) {
    this.outputSchemaInfo = outputSchemaInfo;
    return this;
  }

  public OutputSchemaInfo getOutputSchemaInfo() {
    return outputSchemaInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput that =
        (CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput) o;
    return Objects.equals(cleanRoomJobRunState, that.cleanRoomJobRunState)
        && Objects.equals(notebookOutput, that.notebookOutput)
        && Objects.equals(outputSchemaInfo, that.outputSchemaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomJobRunState, notebookOutput, outputSchemaInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput.class)
        .add("cleanRoomJobRunState", cleanRoomJobRunState)
        .add("notebookOutput", notebookOutput)
        .add("outputSchemaInfo", outputSchemaInfo)
        .toString();
  }

  CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb toPb() {
    CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb pb =
        new CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb();
    pb.setCleanRoomJobRunState(cleanRoomJobRunState);
    pb.setNotebookOutput(notebookOutput);
    pb.setOutputSchemaInfo(outputSchemaInfo);

    return pb;
  }

  static CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput fromPb(
      CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb pb) {
    CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput model =
        new CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput();
    model.setCleanRoomJobRunState(pb.getCleanRoomJobRunState());
    model.setNotebookOutput(pb.getNotebookOutput());
    model.setOutputSchemaInfo(pb.getOutputSchemaInfo());

    return model;
  }

  public static class CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputSerializer
      extends JsonSerializer<CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput> {
    @Override
    public void serialize(
        CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputDeserializer
      extends JsonDeserializer<CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput> {
    @Override
    public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb pb =
          mapper.readValue(p, CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb.class);
      return CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput.fromPb(pb);
    }
  }
}
