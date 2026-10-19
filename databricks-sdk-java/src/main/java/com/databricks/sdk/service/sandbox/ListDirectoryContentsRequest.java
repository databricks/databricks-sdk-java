// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDirectoryContentsRequest {
  /** Zero uses the default of 1000; values above 1000 are clamped to 1000. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** The token from a prior response. Keep parent and path unchanged between pages. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** */
  @JsonIgnore private String parent;

  /** Absolute UTF-8 path of the directory. */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  public ListDirectoryContentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDirectoryContentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDirectoryContentsRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ListDirectoryContentsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDirectoryContentsRequest that = (ListDirectoryContentsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectoryContentsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("path", path)
        .toString();
  }
}
