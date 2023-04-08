// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListRunsResponse {
  /** If true, additional runs matching the provided filter are available for listing. */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** A list of runs, from most recently started to least. */
  @JsonProperty("runs")
  private java.util.List<BaseRun> runs;

  public ListRunsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListRunsResponse setRuns(java.util.List<BaseRun> runs) {
    this.runs = runs;
    return this;
  }

  public java.util.List<BaseRun> getRuns() {
    return runs;
  }
}
