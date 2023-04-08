// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.annotation.QueryParam;

/** Get dashboard objects */
public class ListDashboardsRequest {
  /** Name of dashboard attribute to order by. */
  @QueryParam("order")
  private ListOrder order;

  /** Page number to retrieve. */
  @QueryParam("page")
  private Long page;

  /** Number of dashboards to return per page. */
  @QueryParam("page_size")
  private Long pageSize;

  /** Full text search term. */
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
}
