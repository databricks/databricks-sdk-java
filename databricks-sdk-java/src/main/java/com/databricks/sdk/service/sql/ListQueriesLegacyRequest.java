// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a list of queries */
@Generated
public class ListQueriesLegacyRequest {
  /**
   * Name of query attribute to order by. Default sort order is ascending. Append a dash (`-`) to
   * order descending instead.
   *
   * <p>- `name`: The name of the query.
   *
   * <p>- `created_at`: The timestamp the query was created.
   *
   * <p>- `runtime`: The time it took to run this query. This is blank for parameterized queries. A
   * blank value is treated as the highest value for sorting.
   *
   * <p>- `executed_at`: The timestamp when the query was last run.
   *
   * <p>- `created_by`: The user name of the user that created the query.
   */
  @JsonIgnore
  @QueryParam("order")
  private String order;

  /** Page number to retrieve. */
  @JsonIgnore
  @QueryParam("page")
  private Long page;

  /** Number of queries to return per page. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Full text search term */
  @JsonIgnore
  @QueryParam("q")
  private String q;

  public ListQueriesLegacyRequest setOrder(String order) {
    this.order = order;
    return this;
  }

  public String getOrder() {
    return order;
  }

  public ListQueriesLegacyRequest setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public ListQueriesLegacyRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListQueriesLegacyRequest setQ(String q) {
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
    ListQueriesLegacyRequest that = (ListQueriesLegacyRequest) o;
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
    return new ToStringer(ListQueriesLegacyRequest.class)
        .add("order", order)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("q", q)
        .toString();
  }
}
