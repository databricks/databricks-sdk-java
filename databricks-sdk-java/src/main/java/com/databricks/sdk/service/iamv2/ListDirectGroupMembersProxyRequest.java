// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDirectGroupMembersProxyRequest {
  /**
   * The maximum number of members to return, up to 1000. The default is 1000. A page can contain
   * fewer members.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** The `next_page_token` from a previous response, to get the next page. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The resource name of the group, in the format `groups/{group_id}`. */
  @JsonIgnore private String parent;

  public ListDirectGroupMembersProxyRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDirectGroupMembersProxyRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDirectGroupMembersProxyRequest setParent(String parent) {
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
    ListDirectGroupMembersProxyRequest that = (ListDirectGroupMembersProxyRequest) o;
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
    return new ToStringer(ListDirectGroupMembersProxyRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
