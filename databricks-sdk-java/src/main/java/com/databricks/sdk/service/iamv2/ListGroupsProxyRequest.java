// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListGroupsProxyRequest {
  /**
   * Filters groups by `group_name` or `external_id`, for example `group_name eq "Data engineers"`.
   * Put the value in quotes.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * The maximum number of groups to return, up to 1000. The default is 1000. A page can contain
   * fewer groups.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** The `next_page_token` from a previous response, to get the next page. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The resource name of the account to list groups in, in the format `accounts/{account_id}`.
   * Defaults to the account that contains this workspace. Any other account is rejected.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public ListGroupsProxyRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListGroupsProxyRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListGroupsProxyRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListGroupsProxyRequest setParent(String parent) {
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
    ListGroupsProxyRequest that = (ListGroupsProxyRequest) o;
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
    return new ToStringer(ListGroupsProxyRequest.class)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
