// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/** Search models */
public class SearchModelsRequest {
  /**
   * String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend
   * automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values
   * wrapped in single quotes.
   */
  @QueryParam("filter")
  private String filter;

  /** Maximum number of models desired. Default is 100. Max threshold is 1000. */
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * List of columns for ordering search results, which can include model name and last updated
   * timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks
   * are done by model name ASC.
   */
  @QueryParam("order_by")
  private Collection<String> orderBy;

  /** Pagination token to go to the next page based on a previous search query. */
  @QueryParam("page_token")
  private String pageToken;

  public SearchModelsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchModelsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchModelsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchModelsRequest setPageToken(String pageToken) {
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
    SearchModelsRequest that = (SearchModelsRequest) o;
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
    return new ToStringer(SearchModelsRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }
}
