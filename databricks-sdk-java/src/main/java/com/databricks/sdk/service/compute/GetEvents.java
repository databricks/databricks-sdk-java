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
@JsonSerialize(using = GetEvents.GetEventsSerializer.class)
@JsonDeserialize(using = GetEvents.GetEventsDeserializer.class)
public class GetEvents {
  /** The ID of the cluster to retrieve events about. */
  private String clusterId;

  /** The end time in epoch milliseconds. If empty, returns events up to the current time. */
  private Long endTime;

  /** An optional set of event types to filter on. If empty, all event types are returned. */
  private Collection<EventType> eventTypes;

  /**
   * Deprecated: use page_token in combination with page_size instead.
   *
   * <p>The maximum number of events to include in a page of events. Defaults to 50, and maximum
   * allowed value is 500.
   */
  private Long limit;

  /**
   * Deprecated: use page_token in combination with page_size instead.
   *
   * <p>The offset in the result set. Defaults to 0 (no offset). When an offset is specified and the
   * results are requested in descending order, the end_time field is required.
   */
  private Long offset;

  /** The order to list events in; either "ASC" or "DESC". Defaults to "DESC". */
  private GetEventsOrder order;

  /**
   * The maximum number of events to include in a page of events. The server may further constrain
   * the maximum number of results returned in a single page. If the page_size is empty or 0, the
   * server will decide the number of results to be returned. The field has to be in the range
   * [0,500]. If the value is outside the range, the server enforces 0 or 500.
   */
  private Long pageSize;

  /**
   * Use next_page_token or prev_page_token returned from the previous request to list the next or
   * previous page of events respectively. If page_token is empty, the first page is returned.
   */
  private String pageToken;

  /**
   * The start time in epoch milliseconds. If empty, returns events starting from the beginning of
   * time.
   */
  private Long startTime;

  public GetEvents setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public GetEvents setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public GetEvents setEventTypes(Collection<EventType> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public Collection<EventType> getEventTypes() {
    return eventTypes;
  }

  public GetEvents setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public GetEvents setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public GetEvents setOrder(GetEventsOrder order) {
    this.order = order;
    return this;
  }

  public GetEventsOrder getOrder() {
    return order;
  }

  public GetEvents setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GetEvents setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetEvents setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEvents that = (GetEvents) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(eventTypes, that.eventTypes)
        && Objects.equals(limit, that.limit)
        && Objects.equals(offset, that.offset)
        && Objects.equals(order, that.order)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusterId, endTime, eventTypes, limit, offset, order, pageSize, pageToken, startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEvents.class)
        .add("clusterId", clusterId)
        .add("endTime", endTime)
        .add("eventTypes", eventTypes)
        .add("limit", limit)
        .add("offset", offset)
        .add("order", order)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("startTime", startTime)
        .toString();
  }

  GetEventsPb toPb() {
    GetEventsPb pb = new GetEventsPb();
    pb.setClusterId(clusterId);
    pb.setEndTime(endTime);
    pb.setEventTypes(eventTypes);
    pb.setLimit(limit);
    pb.setOffset(offset);
    pb.setOrder(order);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setStartTime(startTime);

    return pb;
  }

  static GetEvents fromPb(GetEventsPb pb) {
    GetEvents model = new GetEvents();
    model.setClusterId(pb.getClusterId());
    model.setEndTime(pb.getEndTime());
    model.setEventTypes(pb.getEventTypes());
    model.setLimit(pb.getLimit());
    model.setOffset(pb.getOffset());
    model.setOrder(pb.getOrder());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setStartTime(pb.getStartTime());

    return model;
  }

  public static class GetEventsSerializer extends JsonSerializer<GetEvents> {
    @Override
    public void serialize(GetEvents value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetEventsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetEventsDeserializer extends JsonDeserializer<GetEvents> {
    @Override
    public GetEvents deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetEventsPb pb = mapper.readValue(p, GetEventsPb.class);
      return GetEvents.fromPb(pb);
    }
  }
}
