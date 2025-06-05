// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List clusters */
@Generated
class ListClustersRequestPb {
  @JsonIgnore
  @QueryParam("filter_by")
  private ListClustersFilterBy filterBy;

  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("sort_by")
  private ListClustersSortBy sortBy;

  public ListClustersRequestPb setFilterBy(ListClustersFilterBy filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public ListClustersFilterBy getFilterBy() {
    return filterBy;
  }

  public ListClustersRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListClustersRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListClustersRequestPb setSortBy(ListClustersSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public ListClustersSortBy getSortBy() {
    return sortBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersRequestPb that = (ListClustersRequestPb) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(sortBy, that.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, pageSize, pageToken, sortBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersRequestPb.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortBy", sortBy)
        .toString();
  }
}
