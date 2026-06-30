// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListStreamsRequest {
  /** The maximum number of results to return. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page based on a previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Two-part name (catalog.schema) of the parent under which to list Streams. */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public ListStreamsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListStreamsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListStreamsRequest setParent(String parent) {
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
    ListStreamsRequest that = (ListStreamsRequest) o;
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
    return new ToStringer(ListStreamsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
