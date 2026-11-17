// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SearchExperiments {
  /**
   * Filter condition on the experiment name and tags. The `name` attribute and `tags.<key>` support
   * the operators `=`, `!=`, `LIKE` and `ILIKE` (case-insensitive `LIKE`), string values are
   * wrapped in single quotes, and several conditions can be combined with `AND`. No wildcard is
   * added automatically, so include `%` in a `LIKE` pattern where you need one.
   */
  @JsonProperty("filter")
  private String filter;

  /**
   * Maximum number of experiments to return per page. Larger values are capped by the server, so
   * use `page_token` to retrieve further pages.
   */
  @JsonProperty("max_results")
  private Long maxResults;

  /**
   * Columns to order the results by, each given as `name`, `basename` (the last segment of the
   * name), `experiment_id`, `creation_time` or `last_update_time` with an optional `ASC` or `DESC`
   * suffix, where `ASC` is the default. If omitted, results are ordered by last update time with
   * the most recently updated experiment first. Tiebreaks are done by experiment id DESC.
   */
  @JsonProperty("order_by")
  private Collection<String> orderBy;

  /**
   * Page token returned as `next_page_token` by a previous call. Omit it to fetch the first page.
   */
  @JsonProperty("page_token")
  private String pageToken;

  /**
   * Qualifier for type of experiments to be returned. If unspecified, return only active
   * experiments.
   */
  @JsonProperty("view_type")
  private ViewType viewType;

  public SearchExperiments setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchExperiments setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchExperiments setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchExperiments setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchExperiments setViewType(ViewType viewType) {
    this.viewType = viewType;
    return this;
  }

  public ViewType getViewType() {
    return viewType;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken, viewType);
  }

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
