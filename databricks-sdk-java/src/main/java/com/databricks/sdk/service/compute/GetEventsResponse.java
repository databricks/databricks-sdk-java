// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetEventsResponse {
  /** */
  @JsonProperty("events")
  private Collection<ClusterEvent> events;

  /**
   * Deprecated: use next_page_token or prev_page_token instead.
   *
   * <p>The parameters required to retrieve the next page of events. Omitted if there are no more
   * events to read.
   */
  @JsonProperty("next_page")
  private GetEvents nextPage;

  /**
   * This field represents the pagination token to retrieve the next page of results. If the value
   * is "", it means no further results for the request.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * This field represents the pagination token to retrieve the previous page of results. If the
   * value is "", it means no further results for the request.
   */
  @JsonProperty("prev_page_token")
  private String prevPageToken;

  /**
   * Deprecated: Returns 0 when request uses page_token. Will start returning zero when request uses
   * offset/limit soon.
   *
   * <p>The total number of events filtered by the start_time, end_time, and event_types.
   */
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
}
