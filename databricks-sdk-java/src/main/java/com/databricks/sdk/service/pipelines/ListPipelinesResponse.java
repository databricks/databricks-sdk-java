// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPipelinesResponse {
  /** If present, a token to fetch the next page of events. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of events matching the request criteria. */
  @JsonProperty("statuses")
  private java.util.List<PipelineStateInfo> statuses;

  public ListPipelinesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPipelinesResponse setStatuses(java.util.List<PipelineStateInfo> statuses) {
    this.statuses = statuses;
    return this;
  }

  public java.util.List<PipelineStateInfo> getStatuses() {
    return statuses;
  }
}
