// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/** List notebook task runs */
@Generated
@JsonSerialize(
    using =
        ListCleanRoomNotebookTaskRunsRequest.ListCleanRoomNotebookTaskRunsRequestSerializer.class)
@JsonDeserialize(
    using =
        ListCleanRoomNotebookTaskRunsRequest.ListCleanRoomNotebookTaskRunsRequestDeserializer.class)
public class ListCleanRoomNotebookTaskRunsRequest {
  /** Name of the clean room. */
  private String cleanRoomName;

  /** Notebook name */
  private String notebookName;

  /** The maximum number of task runs to return. Currently ignored - all runs will be returned. */
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListCleanRoomNotebookTaskRunsRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomNotebookTaskRunsRequest setNotebookName(String notebookName) {
    this.notebookName = notebookName;
    return this;
  }

  public String getNotebookName() {
    return notebookName;
  }

  public ListCleanRoomNotebookTaskRunsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCleanRoomNotebookTaskRunsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomNotebookTaskRunsRequest that = (ListCleanRoomNotebookTaskRunsRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(notebookName, that.notebookName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, notebookName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomNotebookTaskRunsRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("notebookName", notebookName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListCleanRoomNotebookTaskRunsRequestPb toPb() {
    ListCleanRoomNotebookTaskRunsRequestPb pb = new ListCleanRoomNotebookTaskRunsRequestPb();
    pb.setCleanRoomName(cleanRoomName);
    pb.setNotebookName(notebookName);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListCleanRoomNotebookTaskRunsRequest fromPb(ListCleanRoomNotebookTaskRunsRequestPb pb) {
    ListCleanRoomNotebookTaskRunsRequest model = new ListCleanRoomNotebookTaskRunsRequest();
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setNotebookName(pb.getNotebookName());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListCleanRoomNotebookTaskRunsRequestSerializer
      extends JsonSerializer<ListCleanRoomNotebookTaskRunsRequest> {
    @Override
    public void serialize(
        ListCleanRoomNotebookTaskRunsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCleanRoomNotebookTaskRunsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCleanRoomNotebookTaskRunsRequestDeserializer
      extends JsonDeserializer<ListCleanRoomNotebookTaskRunsRequest> {
    @Override
    public ListCleanRoomNotebookTaskRunsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCleanRoomNotebookTaskRunsRequestPb pb =
          mapper.readValue(p, ListCleanRoomNotebookTaskRunsRequestPb.class);
      return ListCleanRoomNotebookTaskRunsRequest.fromPb(pb);
    }
  }
}
