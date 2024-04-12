// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List files */
@Generated
public class ListFilesRequest {
  /** */
  @QueryParam("file_parent")
  private FileParent fileParent;

  /** */
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @QueryParam("page_token")
  private String pageToken;

  public ListFilesRequest setFileParent(FileParent fileParent) {
    this.fileParent = fileParent;
    return this;
  }

  public FileParent getFileParent() {
    return fileParent;
  }

  public ListFilesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListFilesRequest setPageToken(String pageToken) {
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
    ListFilesRequest that = (ListFilesRequest) o;
    return Objects.equals(fileParent, that.fileParent)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParent, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFilesRequest.class)
        .add("fileParent", fileParent)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
