// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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
        && Objects.equals(totalCount, that.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, nextPage, totalCount);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEventsResponse.class)
        .add("events", events)
        .add("nextPage", nextPage)
        .add("totalCount", totalCount)
        .toString();
  }
}
