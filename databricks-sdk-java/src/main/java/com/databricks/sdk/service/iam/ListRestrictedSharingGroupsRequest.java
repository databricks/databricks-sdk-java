// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListRestrictedSharingGroupsRequest {
  /**
   * The maximum number of groups to return. The service may return fewer. If unspecified or 0, at
   * most 100 groups are returned. Values above 100 are coerced to 100. Negative values are
   * rejected.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token from a previous ListRestrictedSharingGroups call. Provide this to retrieve the
   * subsequent page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListRestrictedSharingGroupsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListRestrictedSharingGroupsRequest setPageToken(String pageToken) {
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
    ListRestrictedSharingGroupsRequest that = (ListRestrictedSharingGroupsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRestrictedSharingGroupsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
