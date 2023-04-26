// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/**
 * Search models
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>filter</code>.</p>
   *
   * @param filter a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelsRequest} object
   */
  public SearchModelsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * <p>Getter for the field <code>filter</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFilter() {
    return filter;
  }

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelsRequest} object
   */
  public SearchModelsRequest setMaxResults(Long maxResults) {
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
   * <p>Setter for the field <code>orderBy</code>.</p>
   *
   * @param orderBy a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelsRequest} object
   */
  public SearchModelsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>orderBy</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getOrderBy() {
    return orderBy;
  }

  /**
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelsRequest} object
   */
  public SearchModelsRequest setPageToken(String pageToken) {
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
    SearchModelsRequest that = (SearchModelsRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken);
  }

  /** {@inheritDoc} */
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
