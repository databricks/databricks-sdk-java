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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = CleanRoomsNotebookTask.CleanRoomsNotebookTaskSerializer.class)
@JsonDeserialize(using = CleanRoomsNotebookTask.CleanRoomsNotebookTaskDeserializer.class)
public class CleanRoomsNotebookTask {
  /** The clean room that the notebook belongs to. */
  private String cleanRoomName;

  /**
   * Checksum to validate the freshness of the notebook resource (i.e. the notebook being run is the
   * latest version). It can be fetched by calling the :method:cleanroomassets/get API.
   */
  private String etag;

  /** Base parameters to be used for the clean room notebook job. */
  private Map<String, String> notebookBaseParameters;

  /** Name of the notebook being run. */
  private String notebookName;

  public CleanRoomsNotebookTask setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CleanRoomsNotebookTask setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomsNotebookTask setNotebookBaseParameters(
      Map<String, String> notebookBaseParameters) {
    this.notebookBaseParameters = notebookBaseParameters;
    return this;
  }

  public Map<String, String> getNotebookBaseParameters() {
    return notebookBaseParameters;
  }

  public CleanRoomsNotebookTask setNotebookName(String notebookName) {
    this.notebookName = notebookName;
    return this;
  }

  public String getNotebookName() {
    return notebookName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomsNotebookTask that = (CleanRoomsNotebookTask) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(notebookBaseParameters, that.notebookBaseParameters)
        && Objects.equals(notebookName, that.notebookName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, etag, notebookBaseParameters, notebookName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomsNotebookTask.class)
        .add("cleanRoomName", cleanRoomName)
        .add("etag", etag)
        .add("notebookBaseParameters", notebookBaseParameters)
        .add("notebookName", notebookName)
        .toString();
  }

  CleanRoomsNotebookTaskPb toPb() {
    CleanRoomsNotebookTaskPb pb = new CleanRoomsNotebookTaskPb();
    pb.setCleanRoomName(cleanRoomName);
    pb.setEtag(etag);
    pb.setNotebookBaseParameters(notebookBaseParameters);
    pb.setNotebookName(notebookName);

    return pb;
  }

  static CleanRoomsNotebookTask fromPb(CleanRoomsNotebookTaskPb pb) {
    CleanRoomsNotebookTask model = new CleanRoomsNotebookTask();
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setEtag(pb.getEtag());
    model.setNotebookBaseParameters(pb.getNotebookBaseParameters());
    model.setNotebookName(pb.getNotebookName());

    return model;
  }

  public static class CleanRoomsNotebookTaskSerializer
      extends JsonSerializer<CleanRoomsNotebookTask> {
    @Override
    public void serialize(
        CleanRoomsNotebookTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomsNotebookTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomsNotebookTaskDeserializer
      extends JsonDeserializer<CleanRoomsNotebookTask> {
    @Override
    public CleanRoomsNotebookTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomsNotebookTaskPb pb = mapper.readValue(p, CleanRoomsNotebookTaskPb.class);
      return CleanRoomsNotebookTask.fromPb(pb);
    }
  }
}
