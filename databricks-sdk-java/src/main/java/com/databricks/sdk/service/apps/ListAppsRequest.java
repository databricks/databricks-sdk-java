// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListAppsRequest {
  /** Upper bound for items returned. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page of apps. Requests first page if absent. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Filter apps by app space name. When specified, only apps belonging to this space are returned.
   */
  @JsonIgnore
  @QueryParam("space")
  private String space;

  public ListAppsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAppsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListAppsRequest setSpace(String space) {
    this.space = space;
    return this;
  }

  public String getSpace() {
    return space;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAppsRequest that = (ListAppsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(space, that.space);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, space);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("space", space)
        .toString();
  }
}
