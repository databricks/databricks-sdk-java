// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class SearchRunsResponse {
  /** Token for the next page of runs. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Runs that match the search criteria. */
  @JsonProperty("runs")
  private Collection<Run> runs;

  public SearchRunsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchRunsResponse setRuns(Collection<Run> runs) {
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
    SearchRunsResponse that = (SearchRunsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchRunsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("runs", runs)
        .toString();
  }
}
