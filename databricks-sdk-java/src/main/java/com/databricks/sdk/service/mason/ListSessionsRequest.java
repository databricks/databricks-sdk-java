// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSessionsRequest {
  /**
   * Filter expression. Supported fields include `actor_id` and `metadata`; for example, `actor_id =
   * "support-customer-123"`.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * Sort order. Defaults to `last_activity_time desc`. Page-token continuation is exactly-once when
   * ordering by `create_time` (immutable); ordering by `last_activity_time` is best-effort, because
   * that value changes as a session gains activity, so a session updated between page requests may
   * be repeated or skipped. To enumerate every session exactly once, order by `create_time`.
   */
  @JsonIgnore
  @QueryParam("order_by")
  private String orderBy;

  /** Maximum number of sessions to return. Defaults to 10; must be between 1 and 100. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Token returned by a previous list request. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Resource name of the containing session store, in the form `session-stores/{session_store_id}`.
   */
  @JsonIgnore private String parent;

  public ListSessionsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListSessionsRequest setOrderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public String getOrderBy() {
    return orderBy;
  }

  public ListSessionsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSessionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSessionsRequest setParent(String parent) {
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
    ListSessionsRequest that = (ListSessionsRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, orderBy, pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSessionsRequest.class)
        .add("filter", filter)
        .add("orderBy", orderBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
