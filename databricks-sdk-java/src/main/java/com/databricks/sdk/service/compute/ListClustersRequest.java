// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List clusters */
@Generated
public class ListClustersRequest {
  /** Filters to apply to the list of clusters. */
  @JsonIgnore
  @QueryParam("filter_by")
  private ListClustersFilterBy filterBy;

  /**
   * Use this field to specify the maximum number of results to be returned by the server. The
   * server may further constrain the maximum number of results returned in a single page.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Use next_page_token or prev_page_token returned from the previous request to list the next or
   * previous page of clusters respectively.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Sort the list of clusters by a specific criteria. */
  @JsonIgnore
  @QueryParam("sort_by")
  private ListClustersSortBy sortBy;

  public ListClustersRequest setFilterBy(ListClustersFilterBy filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public ListClustersFilterBy getFilterBy() {
    return filterBy;
  }

  public ListClustersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListClustersRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListClustersRequest setSortBy(ListClustersSortBy sortBy) {
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
    ListClustersRequest that = (ListClustersRequest) o;
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
    return new ToStringer(ListClustersRequest.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortBy", sortBy)
        .toString();
  }
}
