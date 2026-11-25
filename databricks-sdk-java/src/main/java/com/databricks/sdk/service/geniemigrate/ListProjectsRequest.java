// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListProjectsRequest {
  /**
   * The folder to list, as `folder = "folders/{folder_id}"`. For example, `folder = "folders/456"`.
   * No other filter is supported. Defaults to the caller's home folder.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * The maximum number of projects to return, at most 500. Defaults to 100 if omitted, zero, or
   * negative. A page can have fewer projects than requested, or none, even when more pages follow.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * The `next_page_token` from a previous response. Omit it for the first page. Use the same
   * `filter` for every page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListProjectsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListProjectsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListProjectsRequest setPageToken(String pageToken) {
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
    ListProjectsRequest that = (ListProjectsRequest) o;
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
    return new ToStringer(ListProjectsRequest.class)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
