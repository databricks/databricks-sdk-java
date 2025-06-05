// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SearchLoggedModelsRequestPb {
  @JsonProperty("datasets")
  private Collection<SearchLoggedModelsDataset> datasets;

  @JsonProperty("experiment_ids")
  private Collection<String> experimentIds;

  @JsonProperty("filter")
  private String filter;

  @JsonProperty("max_results")
  private Long maxResults;

  @JsonProperty("order_by")
  private Collection<SearchLoggedModelsOrderBy> orderBy;

  @JsonProperty("page_token")
  private String pageToken;

  public SearchLoggedModelsRequestPb setDatasets(Collection<SearchLoggedModelsDataset> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<SearchLoggedModelsDataset> getDatasets() {
    return datasets;
  }

  public SearchLoggedModelsRequestPb setExperimentIds(Collection<String> experimentIds) {
    this.experimentIds = experimentIds;
    return this;
  }

  public Collection<String> getExperimentIds() {
    return experimentIds;
  }

  public SearchLoggedModelsRequestPb setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public SearchLoggedModelsRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SearchLoggedModelsRequestPb setOrderBy(Collection<SearchLoggedModelsOrderBy> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<SearchLoggedModelsOrderBy> getOrderBy() {
    return orderBy;
  }

  public SearchLoggedModelsRequestPb setPageToken(String pageToken) {
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
    SearchLoggedModelsRequestPb that = (SearchLoggedModelsRequestPb) o;
    return Objects.equals(datasets, that.datasets)
        && Objects.equals(experimentIds, that.experimentIds)
        && Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, experimentIds, filter, maxResults, orderBy, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchLoggedModelsRequestPb.class)
        .add("datasets", datasets)
        .add("experimentIds", experimentIds)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }
}
