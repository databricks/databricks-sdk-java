// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List Queries
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListQueryHistoryRequest {
  /** A filter to limit query history results. This field is optional. */
  @QueryParam("filter_by")
  private QueryFilter filterBy;

  /** Whether to include metrics about query. */
  @QueryParam("include_metrics")
  private Boolean includeMetrics;

  /** Limit the number of results returned in one page. The default is 100. */
  @QueryParam("max_results")
  private Long maxResults;

  /** A token that can be used to get the next page of results. */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * <p>Setter for the field <code>filterBy</code>.</p>
   *
   * @param filterBy a {@link com.databricks.sdk.service.sql.QueryFilter} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueryHistoryRequest} object
   */
  public ListQueryHistoryRequest setFilterBy(QueryFilter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>filterBy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.QueryFilter} object
   */
  public QueryFilter getFilterBy() {
    return filterBy;
  }

  /**
   * <p>Setter for the field <code>includeMetrics</code>.</p>
   *
   * @param includeMetrics a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueryHistoryRequest} object
   */
  public ListQueryHistoryRequest setIncludeMetrics(Boolean includeMetrics) {
    this.includeMetrics = includeMetrics;
    return this;
  }

  /**
   * <p>Getter for the field <code>includeMetrics</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIncludeMetrics() {
    return includeMetrics;
  }

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueryHistoryRequest} object
   */
  public ListQueryHistoryRequest setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.sql.ListQueryHistoryRequest} object
   */
  public ListQueryHistoryRequest setPageToken(String pageToken) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueryHistoryRequest that = (ListQueryHistoryRequest) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(includeMetrics, that.includeMetrics)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(filterBy, includeMetrics, maxResults, pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListQueryHistoryRequest.class)
        .add("filterBy", filterBy)
        .add("includeMetrics", includeMetrics)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
