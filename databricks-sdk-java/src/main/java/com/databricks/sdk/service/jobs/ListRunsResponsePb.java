// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** List of runs was retrieved successfully. */
@Generated
class ListRunsResponsePb {
  @JsonProperty("has_more")
  private Boolean hasMore;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("prev_page_token")
  private String prevPageToken;

  @JsonProperty("runs")
  private Collection<BaseRun> runs;

  public ListRunsResponsePb setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListRunsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRunsResponsePb setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public ListRunsResponsePb setRuns(Collection<BaseRun> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<BaseRun> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRunsResponsePb that = (ListRunsResponsePb) o;
    return Objects.equals(hasMore, that.hasMore)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken)
        && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, nextPageToken, prevPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRunsResponsePb.class)
        .add("hasMore", hasMore)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("runs", runs)
        .toString();
  }
}
