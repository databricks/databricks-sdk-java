// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSessionItemsRequest {
  /**
   * Sort order. Supported values are `create_time asc` and `create_time desc`. The default is
   * `create_time desc`, which returns the most recently appended items first. Equal timestamps are
   * resolved by committed append order in the requested direction.
   */
  @JsonIgnore
  @QueryParam("order_by")
  private String orderBy;

  /** Maximum number of items to return. Defaults to 10; must be between 1 and 100. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Token returned by a previous list request. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Resource name of the containing session, in the form
   * `session-stores/{session_store_id}/sessions/{session_id}`.
   */
  @JsonIgnore private String parent;

  public ListSessionItemsRequest setOrderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public String getOrderBy() {
    return orderBy;
  }

  public ListSessionItemsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSessionItemsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSessionItemsRequest setParent(String parent) {
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
    ListSessionItemsRequest that = (ListSessionItemsRequest) o;
    return Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSessionItemsRequest.class)
        .add("orderBy", orderBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
