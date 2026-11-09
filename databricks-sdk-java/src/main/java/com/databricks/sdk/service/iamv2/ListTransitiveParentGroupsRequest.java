// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListTransitiveParentGroupsRequest {
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
   * The user, service principal, or group whose parent groups to list, in the format
   * `accounts/{account_id}/principals/{principal_id}`.
   */
  @JsonIgnore private String parent;

  public ListTransitiveParentGroupsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListTransitiveParentGroupsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListTransitiveParentGroupsRequest setParent(String parent) {
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
    ListTransitiveParentGroupsRequest that = (ListTransitiveParentGroupsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitiveParentGroupsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
