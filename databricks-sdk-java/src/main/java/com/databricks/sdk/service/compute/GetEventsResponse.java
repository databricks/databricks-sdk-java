// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetEventsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetEventsResponse {
  /** <content needs to be added> */
  @JsonProperty("events")
  private Collection<ClusterEvent> events;

  /**
   * The parameters required to retrieve the next page of events. Omitted if there are no more
   * events to read.
   */
  @JsonProperty("next_page")
  private GetEvents nextPage;

  /** The total number of events filtered by the start_time, end_time, and event_types. */
  @JsonProperty("total_count")
  private Long totalCount;

  /**
   * <p>Setter for the field <code>events</code>.</p>
   *
   * @param events a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.GetEventsResponse} object
   */
  public GetEventsResponse setEvents(Collection<ClusterEvent> events) {
    this.events = events;
    return this;
  }

  /**
   * <p>Getter for the field <code>events</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ClusterEvent> getEvents() {
    return events;
  }

  /**
   * <p>Setter for the field <code>nextPage</code>.</p>
   *
   * @param nextPage a {@link com.databricks.sdk.service.compute.GetEvents} object
   * @return a {@link com.databricks.sdk.service.compute.GetEventsResponse} object
   */
  public GetEventsResponse setNextPage(GetEvents nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPage</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.GetEvents} object
   */
  public GetEvents getNextPage() {
    return nextPage;
  }

  /**
   * <p>Setter for the field <code>totalCount</code>.</p>
   *
   * @param totalCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GetEventsResponse} object
   */
  public GetEventsResponse setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>totalCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEventsResponse that = (GetEventsResponse) o;
    return Objects.equals(events, that.events)
        && Objects.equals(nextPage, that.nextPage)
        && Objects.equals(totalCount, that.totalCount);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(events, nextPage, totalCount);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetEventsResponse.class)
        .add("events", events)
        .add("nextPage", nextPage)
        .add("totalCount", totalCount)
        .toString();
  }
}
