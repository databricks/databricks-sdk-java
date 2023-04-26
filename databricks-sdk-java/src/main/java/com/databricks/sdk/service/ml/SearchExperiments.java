// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SearchExperiments class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SearchExperiments {
  /** String representing a SQL filter condition (e.g. "name ILIKE 'my-experiment%'") */
  @JsonProperty("filter")
  private String filter;

  /** Maximum number of experiments desired. Max threshold is 3000. */
  @JsonProperty("max_results")
  private Long maxResults;

  /**
   * List of columns for ordering search results, which can include experiment name and last updated
   * timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks
   * are done by experiment id DESC.
   */
  @JsonProperty("order_by")
  private Collection<String> orderBy;

  /** Token indicating the page of experiments to fetch */
  @JsonProperty("page_token")
  private String pageToken;

  /**
   * Qualifier for type of experiments to be returned. If unspecified, return only active
   * experiments.
   */
  @JsonProperty("view_type")
  private SearchExperimentsViewType viewType;

  /**
   * <p>Setter for the field <code>filter</code>.</p>
   *
   * @param filter a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SearchExperiments} object
   */
  public SearchExperiments setFilter(String filter) {
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
   * @return a {@link com.databricks.sdk.service.ml.SearchExperiments} object
   */
  public SearchExperiments setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.ml.SearchExperiments} object
   */
  public SearchExperiments setOrderBy(Collection<String> orderBy) {
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
   * @return a {@link com.databricks.sdk.service.ml.SearchExperiments} object
   */
  public SearchExperiments setPageToken(String pageToken) {
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
   * <p>Setter for the field <code>viewType</code>.</p>
   *
   * @param viewType a {@link com.databricks.sdk.service.ml.SearchExperimentsViewType} object
   * @return a {@link com.databricks.sdk.service.ml.SearchExperiments} object
   */
  public SearchExperiments setViewType(SearchExperimentsViewType viewType) {
    this.viewType = viewType;
    return this;
  }

  /**
   * <p>Getter for the field <code>viewType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.SearchExperimentsViewType} object
   */
  public SearchExperimentsViewType getViewType() {
    return viewType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchExperiments that = (SearchExperiments) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(viewType, that.viewType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken, viewType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SearchExperiments.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .add("viewType", viewType)
        .toString();
  }
}
