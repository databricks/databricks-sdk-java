// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListBudgetPoliciesRequest {
  /** A filter to apply to the list of policies. */
  @JsonIgnore
  @QueryParam("filter_by")
  private Filter filterBy;

  /**
   * The maximum number of budget policies to return. If unspecified, at most 100 budget policies
   * will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListServerlessPolicies` call. Provide this to retrieve
   * the subsequent page. If unspecified, the first page will be returned.
   *
   * <p>When paginating, all other parameters provided to `ListServerlessPoliciesRequest` must match
   * the call that provided the page token.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The sort specification. */
  @JsonIgnore
  @QueryParam("sort_spec")
  private SortSpec sortSpec;

  public ListBudgetPoliciesRequest setFilterBy(Filter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public Filter getFilterBy() {
    return filterBy;
  }

  public ListBudgetPoliciesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListBudgetPoliciesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListBudgetPoliciesRequest setSortSpec(SortSpec sortSpec) {
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
    ListBudgetPoliciesRequest that = (ListBudgetPoliciesRequest) o;
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
    return new ToStringer(ListBudgetPoliciesRequest.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortSpec", sortSpec)
        .toString();
  }
}
