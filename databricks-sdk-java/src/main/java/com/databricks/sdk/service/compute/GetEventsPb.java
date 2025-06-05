// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetEventsPb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("event_types")
  private Collection<EventType> eventTypes;

  @JsonProperty("limit")
  private Long limit;

  @JsonProperty("offset")
  private Long offset;

  @JsonProperty("order")
  private GetEventsOrder order;

  @JsonProperty("page_size")
  private Long pageSize;

  @JsonProperty("page_token")
  private String pageToken;

  @JsonProperty("start_time")
  private Long startTime;

  public GetEventsPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public GetEventsPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public GetEventsPb setEventTypes(Collection<EventType> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public Collection<EventType> getEventTypes() {
    return eventTypes;
  }

  public GetEventsPb setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public GetEventsPb setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public GetEventsPb setOrder(GetEventsOrder order) {
    this.order = order;
    return this;
  }

  public GetEventsOrder getOrder() {
    return order;
  }

  public GetEventsPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GetEventsPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetEventsPb setStartTime(Long startTime) {
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
    GetEventsPb that = (GetEventsPb) o;
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
    return new ToStringer(GetEventsPb.class)
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
}
