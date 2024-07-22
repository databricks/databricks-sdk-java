// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List Queries */
@Generated
public class ListQueryHistoryRequest {
  /** A filter to limit query history results. This field is optional. */
  @QueryParam("filter_by")
  private QueryFilter filterBy;

  /**
   * Limit the number of results returned in one page. Must be less than 1000 and the default is
   * 100.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * A token that can be used to get the next page of results. The token can contains characters
   * that need to be encoded before using it in a URL. For example, the character '+' needs to be
   * replaced by %2B. This field is optional.
   */
  @QueryParam("page_token")
  private String pageToken;

  public ListQueryHistoryRequest setFilterBy(QueryFilter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public QueryFilter getFilterBy() {
    return filterBy;
  }

  public ListQueryHistoryRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListQueryHistoryRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueryHistoryRequest that = (ListQueryHistoryRequest) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueryHistoryRequest.class)
        .add("filterBy", filterBy)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
