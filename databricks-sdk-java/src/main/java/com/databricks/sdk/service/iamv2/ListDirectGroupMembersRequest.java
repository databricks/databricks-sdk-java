// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDirectGroupMembersRequest {
  /** Required. Internal ID of the group in Databricks whose direct members are being listed. */
  @JsonIgnore private Long groupId;

  /**
   * The maximum number of members to return. The service may return fewer than this value. If not
   * provided, defaults to 1000, which is also the maximum allowed. Requests for more than the
   * maximum are clamped to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous ListDirectGroupMembers call. Provide this to retrieve
   * the subsequent page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListDirectGroupMembersRequest setGroupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public Long getGroupId() {
    return groupId;
  }

  public ListDirectGroupMembersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDirectGroupMembersRequest setPageToken(String pageToken) {
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
    ListDirectGroupMembersRequest that = (ListDirectGroupMembersRequest) o;
    return Objects.equals(groupId, that.groupId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectGroupMembersRequest.class)
        .add("groupId", groupId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
