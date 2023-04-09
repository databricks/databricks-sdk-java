// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListPipelinesResponse {
  /** If present, a token to fetch the next page of events. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of events matching the request criteria. */
  @JsonProperty("statuses")
  private Collection<PipelineStateInfo> statuses;

  public ListPipelinesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPipelinesResponse setStatuses(Collection<PipelineStateInfo> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<PipelineStateInfo> getStatuses() {
    return statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelinesResponse that = (ListPipelinesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(statuses, that.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, statuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPipelinesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("statuses", statuses)
        .toString();
  }
}
