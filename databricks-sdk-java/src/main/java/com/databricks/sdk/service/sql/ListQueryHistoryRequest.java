// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListQueryHistoryRequest {
  /**
   * An optional filter object to limit query history results. Accepts parameters such as user IDs,
   * endpoint IDs, and statuses to narrow the returned data. In a URL, the parameters of this filter
   * are specified with dot notation. For example: `filter_by.statement_ids`.
   */
  @JsonIgnore
  @QueryParam("filter_by")
  private QueryFilter filterBy;

  /**
   * Whether to include the query metrics with each query. Only use this for a small subset of
   * queries (max_results). Defaults to false.
   */
  @JsonIgnore
  @QueryParam("include_metrics")
  private Boolean includeMetrics;

  /**
   * Limit the number of results returned in one page. Must be less than 1000 and the default is
   * 100.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * A token that can be used to get the next page of results. The token can contains characters
   * that need to be encoded before using it in a URL. For example, the character '+' needs to be
   * replaced by %2B. This field is optional.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListQueryHistoryRequest setFilterBy(QueryFilter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public QueryFilter getFilterBy() {
    return filterBy;
  }

  public ListQueryHistoryRequest setIncludeMetrics(Boolean includeMetrics) {
    this.includeMetrics = includeMetrics;
    return this;
  }

  public Boolean getIncludeMetrics() {
    return includeMetrics;
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
        && Objects.equals(includeMetrics, that.includeMetrics)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, includeMetrics, maxResults, pageToken);
  }

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
