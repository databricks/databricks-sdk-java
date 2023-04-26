// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListPipelineEventsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>events</code>.</p>
   *
   * @param events a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsResponse} object
   */
  public ListPipelineEventsResponse setEvents(Collection<PipelineEvent> events) {
    this.events = events;
    return this;
  }

  /**
   * <p>Getter for the field <code>events</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PipelineEvent> getEvents() {
    return events;
  }

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsResponse} object
   */
  public ListPipelineEventsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>prevPageToken</code>.</p>
   *
   * @param prevPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsResponse} object
   */
  public ListPipelineEventsResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>prevPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrevPageToken() {
    return prevPageToken;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelineEventsResponse that = (ListPipelineEventsResponse) o;
    return Objects.equals(events, that.events)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(events, nextPageToken, prevPageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListPipelineEventsResponse.class)
        .add("events", events)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }
}
