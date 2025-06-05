// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetEventsResponsePb {
  @JsonProperty("events")
  private Collection<ClusterEvent> events;

  @JsonProperty("next_page")
  private GetEvents nextPage;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("prev_page_token")
  private String prevPageToken;

  @JsonProperty("total_count")
  private Long totalCount;

  public GetEventsResponsePb setEvents(Collection<ClusterEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<ClusterEvent> getEvents() {
    return events;
  }

  public GetEventsResponsePb setNextPage(GetEvents nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  public GetEvents getNextPage() {
    return nextPage;
  }

  public GetEventsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetEventsResponsePb setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public GetEventsResponsePb setTotalCount(Long totalCount) {
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
    GetEventsResponsePb that = (GetEventsResponsePb) o;
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
    return new ToStringer(GetEventsResponsePb.class)
        .add("events", events)
        .add("nextPage", nextPage)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("totalCount", totalCount)
        .toString();
  }
}
