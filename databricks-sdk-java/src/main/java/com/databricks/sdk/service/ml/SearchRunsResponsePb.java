// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SearchRunsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("runs")
  private Collection<Run> runs;

  public SearchRunsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchRunsResponsePb setRuns(Collection<Run> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<Run> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchRunsResponsePb that = (SearchRunsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchRunsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("runs", runs)
        .toString();
  }
}
