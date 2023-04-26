// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a list of queries
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListQueriesRequest {
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
  @QueryParam("order")
  private String order;

  /** Page number to retrieve. */
  @QueryParam("page")
  private Long page;

  /** Number of queries to return per page. */
  @QueryParam("page_size")
  private Long pageSize;

  /** Full text search term */
  @QueryParam("q")
  private String q;

  /**
   * <p>Setter for the field <code>order</code>.</p>
   *
   * @param order a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesRequest} object
   */
  public ListQueriesRequest setOrder(String order) {
    this.order = order;
    return this;
  }

  /**
   * <p>Getter for the field <code>order</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrder() {
    return order;
  }

  /**
   * <p>Setter for the field <code>page</code>.</p>
   *
   * @param page a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesRequest} object
   */
  public ListQueriesRequest setPage(Long page) {
    this.page = page;
    return this;
  }

  /**
   * <p>Getter for the field <code>page</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPage() {
    return page;
  }

  /**
   * <p>Setter for the field <code>pageSize</code>.</p>
   *
   * @param pageSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesRequest} object
   */
  public ListQueriesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>pageSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPageSize() {
    return pageSize;
  }

  /**
   * <p>Setter for the field <code>q</code>.</p>
   *
   * @param q a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesRequest} object
   */
  public ListQueriesRequest setQ(String q) {
    this.q = q;
    return this;
  }

  /**
   * <p>Getter for the field <code>q</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQ() {
    return q;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueriesRequest that = (ListQueriesRequest) o;
    return Objects.equals(order, that.order)
        && Objects.equals(page, that.page)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(q, that.q);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(order, page, pageSize, q);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListQueriesRequest.class)
        .add("order", order)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("q", q)
        .toString();
  }
}
