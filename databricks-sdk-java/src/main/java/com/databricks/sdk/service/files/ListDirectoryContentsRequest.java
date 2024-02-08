// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List directory contents */
@Generated
public class ListDirectoryContentsRequest {
  /** The absolute path of a directory. */
  private String directoryPath;

  /**
   * The maximum number of directory entries to return. The API may return fewer than this value.
   * Receiving fewer results does not imply there are no more results. As long as the response
   * contains a next_page_token, there may be more results.
   *
   * <p>If unspecified, at most 1000 directory entries will be returned. The maximum value is 1000.
   * Values above 1000 will be coerced to 1000.
   */
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `list` call. Provide this to retrieve the subsequent
   * page. When paginating, all other parameters provided to `list` must match the call that
   * provided the page token.
   */
  @QueryParam("page_token")
  private String pageToken;

  public ListDirectoryContentsRequest setDirectoryPath(String directoryPath) {
    this.directoryPath = directoryPath;
    return this;
  }

  public String getDirectoryPath() {
    return directoryPath;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDirectoryContentsRequest that = (ListDirectoryContentsRequest) o;
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
    return new ToStringer(ListDirectoryContentsRequest.class)
        .add("directoryPath", directoryPath)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
