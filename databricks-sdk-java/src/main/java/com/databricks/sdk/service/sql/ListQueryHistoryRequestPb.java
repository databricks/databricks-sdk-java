// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List Queries */
@Generated
class ListQueryHistoryRequestPb {
  @JsonIgnore
  @QueryParam("filter_by")
  private QueryFilter filterBy;

  @JsonIgnore
  @QueryParam("include_metrics")
  private Boolean includeMetrics;

  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListQueryHistoryRequestPb setFilterBy(QueryFilter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public QueryFilter getFilterBy() {
    return filterBy;
  }

  public ListQueryHistoryRequestPb setIncludeMetrics(Boolean includeMetrics) {
    this.includeMetrics = includeMetrics;
    return this;
  }

  public Boolean getIncludeMetrics() {
    return includeMetrics;
  }

  public ListQueryHistoryRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListQueryHistoryRequestPb setPageToken(String pageToken) {
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
    ListQueryHistoryRequestPb that = (ListQueryHistoryRequestPb) o;
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
    return new ToStringer(ListQueryHistoryRequestPb.class)
        .add("filterBy", filterBy)
        .add("includeMetrics", includeMetrics)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
