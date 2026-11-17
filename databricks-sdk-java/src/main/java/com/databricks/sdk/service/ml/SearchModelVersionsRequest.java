// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SearchModelVersionsRequest {
  /**
   * Filter condition on `name`, `run_id`, `source` or `tags.<key>`. The filter must constrain at
   * least one of `name`, `run_id` or `source`. Conditions use `=`, `!=`, `LIKE` or `ILIKE`, and
   * `run_id` also supports `IN`. String values are wrapped in single quotes, and several conditions
   * can be combined with `AND`.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /** Maximum number of models desired. Max threshold is 10K. */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * Columns to order the results by, each given as `name`, `version`, `current_stage` or
   * `last_updated_timestamp` with an optional `ASC` or `DESC` suffix, where `ASC` is the default.
   * Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by
   * version DESC.
   */
  @JsonIgnore
  @QueryParam("order_by")
  private Collection<String> orderBy;

  /** Pagination token to go to next page based on previous search query. */
  @JsonIgnore
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
