// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListUsersProxyRequest {
  /** Optional. Allows filtering users by username or external id. */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * The maximum number of users to return. The service may return fewer than this value. If not
   * provided, defaults to 1000, which is also the maximum allowed. Requests for more than the
   * maximum are clamped to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous ListUsers call. Provide this to retrieve the subsequent
   * page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListUsersProxyRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListUsersProxyRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListUsersProxyRequest setPageToken(String pageToken) {
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
    ListUsersProxyRequest that = (ListUsersProxyRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUsersProxyRequest.class)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
