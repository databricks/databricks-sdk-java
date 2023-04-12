// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListPipelineEventsResponse {
  /** The list of events matching the request criteria. */
  @JsonProperty("events")
  private Collection<PipelineEvent> events;

  /** If present, a token to fetch the next page of events. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** If present, a token to fetch the previous page of events. */
  @JsonProperty("prev_page_token")
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
}
