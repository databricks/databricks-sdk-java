// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = ListPipelineEventsResponse.ListPipelineEventsResponseSerializer.class)
@JsonDeserialize(using = ListPipelineEventsResponse.ListPipelineEventsResponseDeserializer.class)
public class ListPipelineEventsResponse {
  /** The list of events matching the request criteria. */
  private Collection<PipelineEvent> events;

  /** If present, a token to fetch the next page of events. */
  private String nextPageToken;

  /** If present, a token to fetch the previous page of events. */
  private String prevPageToken;

  public ListPipelineEventsResponse setEvents(Collection<PipelineEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<PipelineEvent> getEvents() {
    return events;
  }

  public ListPipelineEventsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPipelineEventsResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelineEventsResponse that = (ListPipelineEventsResponse) o;
    return Objects.equals(events, that.events)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPipelineEventsResponse.class)
        .add("events", events)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }

  ListPipelineEventsResponsePb toPb() {
    ListPipelineEventsResponsePb pb = new ListPipelineEventsResponsePb();
    pb.setEvents(events);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);

    return pb;
  }

  static ListPipelineEventsResponse fromPb(ListPipelineEventsResponsePb pb) {
    ListPipelineEventsResponse model = new ListPipelineEventsResponse();
    model.setEvents(pb.getEvents());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());

    return model;
  }

  public static class ListPipelineEventsResponseSerializer
      extends JsonSerializer<ListPipelineEventsResponse> {
    @Override
    public void serialize(
        ListPipelineEventsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPipelineEventsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPipelineEventsResponseDeserializer
      extends JsonDeserializer<ListPipelineEventsResponse> {
    @Override
    public ListPipelineEventsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPipelineEventsResponsePb pb = mapper.readValue(p, ListPipelineEventsResponsePb.class);
      return ListPipelineEventsResponse.fromPb(pb);
    }
  }
}
