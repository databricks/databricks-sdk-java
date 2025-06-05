// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SearchRunsPb {
  @JsonProperty("experiment_ids")
  private Collection<String> experimentIds;

  @JsonProperty("filter")
  private String filter;

  @JsonProperty("max_results")
  private Long maxResults;

  @JsonProperty("order_by")
  private Collection<String> orderBy;

  @JsonProperty("page_token")
  private String pageToken;

  @JsonProperty("run_view_type")
  private ViewType runViewType;

  public SearchRunsPb setExperimentIds(Collection<String> experimentIds) {
    this.experimentIds = experimentIds;
    return this;
  }

  public Collection<String> getExperimentIds() {
    return experimentIds;
  }

  public SearchRunsPb setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchRunsPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchRunsPb setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public SearchRunsPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchRunsPb setRunViewType(ViewType runViewType) {
    this.runViewType = runViewType;
    return this;
  }

  public ViewType getRunViewType() {
    return runViewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchRunsPb that = (SearchRunsPb) o;
    return Objects.equals(experimentIds, that.experimentIds)
        && Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runViewType, that.runViewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentIds, filter, maxResults, orderBy, pageToken, runViewType);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchRunsPb.class)
        .add("experimentIds", experimentIds)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .add("runViewType", runViewType)
        .toString();
  }
}
