// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List pipeline updates
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesRequest} object
   */
  public ListUpdatesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxResults</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxResults() {
    return maxResults;
  }

  /**
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesRequest} object
   */
  public ListUpdatesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>pageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPageToken() {
    return pageToken;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesRequest} object
   */
  public ListUpdatesRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPipelineId() {
    return pipelineId;
  }

  /**
   * <p>Setter for the field <code>untilUpdateId</code>.</p>
   *
   * @param untilUpdateId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesRequest} object
   */
  public ListUpdatesRequest setUntilUpdateId(String untilUpdateId) {
    this.untilUpdateId = untilUpdateId;
    return this;
  }

  /**
   * <p>Getter for the field <code>untilUpdateId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUntilUpdateId() {
    return untilUpdateId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, pipelineId, untilUpdateId);
  }

  /** {@inheritDoc} */
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
