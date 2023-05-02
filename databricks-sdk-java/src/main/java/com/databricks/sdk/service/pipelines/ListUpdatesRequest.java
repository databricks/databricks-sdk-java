// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List pipeline updates */
@Generated
public class ListUpdatesRequest {
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

  public ListUpdatesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListUpdatesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListUpdatesRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public ListUpdatesRequest setUntilUpdateId(String untilUpdateId) {
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
    ListUpdatesRequest that = (ListUpdatesRequest) o;
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
    return new ToStringer(ListUpdatesRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("pipelineId", pipelineId)
        .add("untilUpdateId", untilUpdateId)
        .toString();
  }
}
