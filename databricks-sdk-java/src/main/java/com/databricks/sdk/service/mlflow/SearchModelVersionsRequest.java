// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/** Searches model versions */
public class SearchModelVersionsRequest {
  /**
   * String filter condition, like "name='my-model-name'". Must be a single boolean condition, with
   * string values wrapped in single quotes.
   */
  @QueryParam("filter")
  private String filter;

  /** Maximum number of models desired. Max threshold is 10K. */
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * List of columns to be ordered by including model name, version, stage with an optional "DESC"
   * or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition
   * timestamp, followed by name ASC, followed by version DESC.
   */
  @QueryParam("order_by")
  private Collection<String> orderBy;

  /** Pagination token to go to next page based on previous search query. */
  @QueryParam("page_token")
  private String pageToken;

  public SearchModelVersionsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchModelVersionsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchModelVersionsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchModelVersionsRequest setPageToken(String pageToken) {
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
    SearchModelVersionsRequest that = (SearchModelVersionsRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchModelVersionsRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }
}
