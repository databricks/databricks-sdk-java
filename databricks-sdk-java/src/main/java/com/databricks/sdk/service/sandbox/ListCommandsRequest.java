// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCommandsRequest {
  /**
   * Maximum number of commands to return. The server may return fewer. If unspecified, the server
   * returns all commands.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Page token returned by a previous ListCommands call. Use this to retrieve the next page of
   * results.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The sandbox whose commands to list, in the form `sandboxes/{sandbox_id}`. */
  @JsonIgnore private String parent;

  public ListCommandsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCommandsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListCommandsRequest setParent(String parent) {
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
    ListCommandsRequest that = (ListCommandsRequest) o;
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
    return new ToStringer(ListCommandsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
