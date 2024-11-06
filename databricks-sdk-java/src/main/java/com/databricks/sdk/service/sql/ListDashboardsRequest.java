// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get dashboard objects */
@Generated
public class ListDashboardsRequest {
  /** Name of dashboard attribute to order by. */
  @JsonIgnore
  @QueryParam("order")
  private ListOrder order;

  /** Page number to retrieve. */
  @JsonIgnore
  @QueryParam("page")
  private Long page;

  /** Number of dashboards to return per page. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Full text search term. */
  @JsonIgnore
  @QueryParam("q")
  private String q;

  public ListDashboardsRequest setOrder(ListOrder order) {
    this.order = order;
    return this;
  }

  public ListOrder getOrder() {
    return order;
  }

  public ListDashboardsRequest setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public ListDashboardsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDashboardsRequest setQ(String q) {
    this.q = q;
    return this;
  }

  public String getQ() {
    return q;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDashboardsRequest that = (ListDashboardsRequest) o;
    return Objects.equals(order, that.order)
        && Objects.equals(page, that.page)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(q, that.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, page, pageSize, q);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsRequest.class)
        .add("order", order)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("q", q)
        .toString();
  }
}
