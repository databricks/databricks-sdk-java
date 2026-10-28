// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListBudgetSpendStatusesRequest {
  /**
   * A filter expression that narrows the returned budgets by workspace. Only `workspace_id` is
   * supported, in lower case with numeric workspace IDs, for example `workspace_id = 123` or
   * `workspace_id IN (123, 456)`. Matches budgets that apply to any of the listed workspaces,
   * including budgets that apply to all workspaces. Any other expression, such as an empty `IN ()`
   * list, fails with INVALID_PARAMETER_VALUE. If empty, returns every budget in the account that
   * has a blocking threshold.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * The maximum number of spend statuses to return per page. If unspecified or 0, at most 100 are
   * returned. The maximum value is 100; values above 100 are coerced to 100. Negative values fail
   * with INVALID_PARAMETER_VALUE. The server may return fewer results than requested, including
   * zero, even when more pages remain; page until `next_page_token` is absent.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token from a previous `ListBudgetSpendStatuses` response, used to fetch the next page.
   * Requests the first page if absent. All other request parameters except `page_size` must match
   * the request that returned the token; otherwise the request fails with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The parent account whose budget spend statuses to list, of the form `accounts/{account_id}`.
   */
  @JsonIgnore private String parent;

  public ListBudgetSpendStatusesRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListBudgetSpendStatusesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListBudgetSpendStatusesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListBudgetSpendStatusesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListBudgetSpendStatusesRequest that = (ListBudgetSpendStatusesRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetSpendStatusesRequest.class)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
