// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetEvents class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetEvents {
  /** The ID of the cluster to retrieve events about. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The end time in epoch milliseconds. If empty, returns events up to the current time. */
  @JsonProperty("end_time")
  private Long endTime;

  /** An optional set of event types to filter on. If empty, all event types are returned. */
  @JsonProperty("event_types")
  private Collection<EventType> eventTypes;

  /**
   * The maximum number of events to include in a page of events. Defaults to 50, and maximum
   * allowed value is 500.
   */
  @JsonProperty("limit")
  private Long limit;

  /**
   * The offset in the result set. Defaults to 0 (no offset). When an offset is specified and the
   * results are requested in descending order, the end_time field is required.
   */
  @JsonProperty("offset")
  private Long offset;

  /** The order to list events in; either "ASC" or "DESC". Defaults to "DESC". */
  @JsonProperty("order")
  private GetEventsOrder order;

  /**
   * The start time in epoch milliseconds. If empty, returns events starting from the beginning of
   * time.
   */
  @JsonProperty("start_time")
  private Long startTime;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>eventTypes</code>.</p>
   *
   * @param eventTypes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setEventTypes(Collection<EventType> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  /**
   * <p>Getter for the field <code>eventTypes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EventType> getEventTypes() {
    return eventTypes;
  }

  /**
   * <p>Setter for the field <code>limit</code>.</p>
   *
   * @param limit a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Getter for the field <code>limit</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * <p>Setter for the field <code>offset</code>.</p>
   *
   * @param offset a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <p>Getter for the field <code>offset</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * <p>Setter for the field <code>order</code>.</p>
   *
   * @param order a {@link com.databricks.sdk.service.compute.GetEventsOrder} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setOrder(GetEventsOrder order) {
    this.order = order;
    return this;
  }

  /**
   * <p>Getter for the field <code>order</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.GetEventsOrder} object
   */
  public GetEventsOrder getOrder() {
    return order;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /** {@inheritDoc} */
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
        && Objects.equals(startTime, that.startTime);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, endTime, eventTypes, limit, offset, order, startTime);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetEvents.class)
        .add("clusterId", clusterId)
        .add("endTime", endTime)
        .add("eventTypes", eventTypes)
        .add("limit", limit)
        .add("offset", offset)
        .add("order", order)
        .add("startTime", startTime)
        .toString();
  }
}
