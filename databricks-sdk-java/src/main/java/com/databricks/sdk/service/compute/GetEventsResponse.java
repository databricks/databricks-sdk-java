// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = GetEventsResponse.GetEventsResponseSerializer.class)
@JsonDeserialize(using = GetEventsResponse.GetEventsResponseDeserializer.class)
public class GetEventsResponse {
  /** */
  private Collection<ClusterEvent> events;

  /**
   * Deprecated: use next_page_token or prev_page_token instead.
   *
   * <p>The parameters required to retrieve the next page of events. Omitted if there are no more
   * events to read.
   */
  private GetEvents nextPage;

  /**
   * This field represents the pagination token to retrieve the next page of results. If the value
   * is "", it means no further results for the request.
   */
  private String nextPageToken;

  /**
   * This field represents the pagination token to retrieve the previous page of results. If the
   * value is "", it means no further results for the request.
   */
  private String prevPageToken;

  /**
   * Deprecated: Returns 0 when request uses page_token. Will start returning zero when request uses
   * offset/limit soon.
   *
   * <p>The total number of events filtered by the start_time, end_time, and event_types.
   */
  private Long totalCount;

  public GetEventsResponse setEvents(Collection<ClusterEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<ClusterEvent> getEvents() {
    return events;
  }

  public GetEventsResponse setNextPage(GetEvents nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  public GetEvents getNextPage() {
    return nextPage;
  }

  public GetEventsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetEventsResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public GetEventsResponse setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEventsResponse that = (GetEventsResponse) o;
    return Objects.equals(events, that.events)
        && Objects.equals(nextPage, that.nextPage)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken)
        && Objects.equals(totalCount, that.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, nextPage, nextPageToken, prevPageToken, totalCount);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEventsResponse.class)
        .add("events", events)
        .add("nextPage", nextPage)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("totalCount", totalCount)
        .toString();
  }

  GetEventsResponsePb toPb() {
    GetEventsResponsePb pb = new GetEventsResponsePb();
    pb.setEvents(events);
    pb.setNextPage(nextPage);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);
    pb.setTotalCount(totalCount);

    return pb;
  }

  static GetEventsResponse fromPb(GetEventsResponsePb pb) {
    GetEventsResponse model = new GetEventsResponse();
    model.setEvents(pb.getEvents());
    model.setNextPage(pb.getNextPage());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());
    model.setTotalCount(pb.getTotalCount());

    return model;
  }

  public static class GetEventsResponseSerializer extends JsonSerializer<GetEventsResponse> {
    @Override
    public void serialize(GetEventsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetEventsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetEventsResponseDeserializer extends JsonDeserializer<GetEventsResponse> {
    @Override
    public GetEventsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetEventsResponsePb pb = mapper.readValue(p, GetEventsResponsePb.class);
      return GetEventsResponse.fromPb(pb);
    }
  }
}
