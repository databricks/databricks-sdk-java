// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListRunsResponse {
  /** If true, additional runs matching the provided filter are available for listing. */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** A list of runs, from most recently started to least. */
  @JsonProperty("runs")
  private Collection<BaseRun> runs;

  public ListRunsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListRunsResponse setRuns(Collection<BaseRun> runs) {
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
    ListRunsResponse that = (ListRunsResponse) o;
    return Objects.equals(hasMore, that.hasMore) && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRunsResponse.class)
        .add("hasMore", hasMore)
        .add("runs", runs)
        .toString();
  }
}
