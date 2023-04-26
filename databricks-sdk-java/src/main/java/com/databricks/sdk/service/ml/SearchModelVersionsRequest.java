// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/**
 * Searches model versions
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>filter</code>.</p>
   *
   * @param filter a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelVersionsRequest} object
   */
  public SearchModelVersionsRequest setFilter(String filter) {
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
   * @return a {@link com.databricks.sdk.service.ml.SearchModelVersionsRequest} object
   */
  public SearchModelVersionsRequest setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.ml.SearchModelVersionsRequest} object
   */
  public SearchModelVersionsRequest setOrderBy(Collection<String> orderBy) {
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
   * @return a {@link com.databricks.sdk.service.ml.SearchModelVersionsRequest} object
   */
  public SearchModelVersionsRequest setPageToken(String pageToken) {
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
    SearchModelVersionsRequest that = (SearchModelVersionsRequest) o;
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
    return new ToStringer(SearchModelVersionsRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }
}
