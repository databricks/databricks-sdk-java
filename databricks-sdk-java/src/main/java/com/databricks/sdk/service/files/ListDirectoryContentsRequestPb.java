// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List directory contents */
@Generated
class ListDirectoryContentsRequestPb {
  @JsonIgnore private String directoryPath;

  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListDirectoryContentsRequestPb setDirectoryPath(String directoryPath) {
    this.directoryPath = directoryPath;
    return this;
  }

  public String getDirectoryPath() {
    return directoryPath;
  }

  public ListDirectoryContentsRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDirectoryContentsRequestPb setPageToken(String pageToken) {
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
    ListDirectoryContentsRequestPb that = (ListDirectoryContentsRequestPb) o;
    return Objects.equals(directoryPath, that.directoryPath)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectoryContentsRequestPb.class)
        .add("directoryPath", directoryPath)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
