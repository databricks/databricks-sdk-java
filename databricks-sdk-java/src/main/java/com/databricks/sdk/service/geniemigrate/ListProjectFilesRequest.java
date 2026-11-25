// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListProjectFilesRequest {
  /**
   * The maximum number of files to return, at most 500. If omitted, zero, or negative, the server
   * chooses. The server can return a different number of files than requested, so keep requesting
   * pages until `next_page_token` is empty.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * The `next_page_token` from a previous response. Omit it for the first page. Use it only with
   * the same `parent`.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The resource name of the project, in the format `projects/{project_id}`. For example,
   * `projects/123`.
   */
  @JsonIgnore private String parent;

  public ListProjectFilesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListProjectFilesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListProjectFilesRequest setParent(String parent) {
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
    ListProjectFilesRequest that = (ListProjectFilesRequest) o;
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
    return new ToStringer(ListProjectFilesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
