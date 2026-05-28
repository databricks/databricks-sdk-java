// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response to a ListStreamsRequest. */
@Generated
public class ListStreamsResponse {
  /** Pagination token to request the next page of results for this query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of Streams. */
  @JsonProperty("streams")
  private Collection<Stream> streams;

  public ListStreamsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListStreamsResponse setStreams(Collection<Stream> streams) {
    this.streams = streams;
    return this;
  }

  public Collection<Stream> getStreams() {
    return streams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStreamsResponse that = (ListStreamsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(streams, that.streams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, streams);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStreamsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("streams", streams)
        .toString();
  }
}
