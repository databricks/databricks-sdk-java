// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListUsagePoliciesRequest {
  /** A filter to apply to the list of policies. */
  @JsonIgnore
  @QueryParam("filter_by")
  private Filter filterBy;

  /** The maximum number of usage policies to return. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** A page token, received from a previous `ListUsagePolicies` call. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The sort specification. */
  @JsonIgnore
  @QueryParam("sort_spec")
  private SortSpec sortSpec;

  public ListUsagePoliciesRequest setFilterBy(Filter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public Filter getFilterBy() {
    return filterBy;
  }

  public ListUsagePoliciesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListUsagePoliciesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListUsagePoliciesRequest setSortSpec(SortSpec sortSpec) {
    this.sortSpec = sortSpec;
    return this;
  }

  public SortSpec getSortSpec() {
    return sortSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUsagePoliciesRequest that = (ListUsagePoliciesRequest) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(sortSpec, that.sortSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, pageSize, pageToken, sortSpec);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUsagePoliciesRequest.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortSpec", sortSpec)
        .toString();
  }
}
