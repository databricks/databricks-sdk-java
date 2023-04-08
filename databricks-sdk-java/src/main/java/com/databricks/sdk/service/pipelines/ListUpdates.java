// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** List pipeline updates */
public class ListUpdates {
  /** Max number of entries to return in a single page. */
  @QueryParam("max_results")
  private Long maxResults;

  /** Page token returned by previous call */
  @QueryParam("page_token")
  private String pageToken;

  /** The pipeline to return updates for. */
  private String pipelineId;

  /** If present, returns updates until and including this update_id. */
  @QueryParam("until_update_id")
  private String untilUpdateId;

  public ListUpdates setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListUpdates setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListUpdates setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public ListUpdates setUntilUpdateId(String untilUpdateId) {
    this.untilUpdateId = untilUpdateId;
    return this;
  }

  public String getUntilUpdateId() {
    return untilUpdateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUpdates that = (ListUpdates) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(untilUpdateId, that.untilUpdateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, pipelineId, untilUpdateId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUpdates.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("pipelineId", pipelineId)
        .add("untilUpdateId", untilUpdateId)
        .toString();
  }
}
