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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        ListCleanRoomNotebookTaskRunsResponse.ListCleanRoomNotebookTaskRunsResponseSerializer.class)
@JsonDeserialize(
    using =
        ListCleanRoomNotebookTaskRunsResponse.ListCleanRoomNotebookTaskRunsResponseDeserializer
            .class)
public class ListCleanRoomNotebookTaskRunsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** Name of the clean room. */
  private Collection<CleanRoomNotebookTaskRun> runs;

  public ListCleanRoomNotebookTaskRunsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListCleanRoomNotebookTaskRunsResponse setRuns(Collection<CleanRoomNotebookTaskRun> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<CleanRoomNotebookTaskRun> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomNotebookTaskRunsResponse that = (ListCleanRoomNotebookTaskRunsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomNotebookTaskRunsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("runs", runs)
        .toString();
  }

  ListCleanRoomNotebookTaskRunsResponsePb toPb() {
    ListCleanRoomNotebookTaskRunsResponsePb pb = new ListCleanRoomNotebookTaskRunsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRuns(runs);

    return pb;
  }

  static ListCleanRoomNotebookTaskRunsResponse fromPb(ListCleanRoomNotebookTaskRunsResponsePb pb) {
    ListCleanRoomNotebookTaskRunsResponse model = new ListCleanRoomNotebookTaskRunsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRuns(pb.getRuns());

    return model;
  }

  public static class ListCleanRoomNotebookTaskRunsResponseSerializer
      extends JsonSerializer<ListCleanRoomNotebookTaskRunsResponse> {
    @Override
    public void serialize(
        ListCleanRoomNotebookTaskRunsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCleanRoomNotebookTaskRunsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCleanRoomNotebookTaskRunsResponseDeserializer
      extends JsonDeserializer<ListCleanRoomNotebookTaskRunsResponse> {
    @Override
    public ListCleanRoomNotebookTaskRunsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCleanRoomNotebookTaskRunsResponsePb pb =
          mapper.readValue(p, ListCleanRoomNotebookTaskRunsResponsePb.class);
      return ListCleanRoomNotebookTaskRunsResponse.fromPb(pb);
    }
  }
}
