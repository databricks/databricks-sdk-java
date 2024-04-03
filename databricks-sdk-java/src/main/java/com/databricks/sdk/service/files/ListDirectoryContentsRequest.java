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
   * The maximum number of directory entries to return. The response may contain fewer entries. If
   * the response contains a `next_page_token`, there may be more entries, even if fewer than
   * `page_size` entries are in the response.
   *
   * <p>We recommend not to set this value unless you are intentionally listing less than the
   * complete directory contents.
   *
   * <p>If unspecified, at most 1000 directory entries will be returned. The maximum value is 1000.
   * Values above 1000 will be coerced to 1000.
   */
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * An opaque page token which was the `next_page_token` in the response of the previous request to
   * list the contents of this directory. Provide this token to retrieve the next page of directory
   * entries. When providing a `page_token`, all other parameters provided to the request must match
   * the previous request. To list all of the entries in a directory, it is necessary to continue
   * requesting pages of entries until the response contains no `next_page_token`. Note that the
   * number of entries returned must not be used to determine when the listing is complete.
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
