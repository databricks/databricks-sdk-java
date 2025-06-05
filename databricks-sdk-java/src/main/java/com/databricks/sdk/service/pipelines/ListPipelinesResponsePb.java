// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListPipelinesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("statuses")
  private Collection<PipelineStateInfo> statuses;

  public ListPipelinesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPipelinesResponsePb setStatuses(Collection<PipelineStateInfo> statuses) {
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
    ListPipelinesResponsePb that = (ListPipelinesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(statuses, that.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, statuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPipelinesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("statuses", statuses)
        .toString();
  }
}
