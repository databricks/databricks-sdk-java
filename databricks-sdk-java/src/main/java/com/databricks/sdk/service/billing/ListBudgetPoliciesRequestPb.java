// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List policies */
@Generated
class ListBudgetPoliciesRequestPb {
  @JsonIgnore
  @QueryParam("filter_by")
  private Filter filterBy;

  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("sort_spec")
  private SortSpec sortSpec;

  public ListBudgetPoliciesRequestPb setFilterBy(Filter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public Filter getFilterBy() {
    return filterBy;
  }

  public ListBudgetPoliciesRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListBudgetPoliciesRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListBudgetPoliciesRequestPb setSortSpec(SortSpec sortSpec) {
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
    ListBudgetPoliciesRequestPb that = (ListBudgetPoliciesRequestPb) o;
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
    return new ToStringer(ListBudgetPoliciesRequestPb.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortSpec", sortSpec)
        .toString();
  }
}
