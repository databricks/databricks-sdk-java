// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListResponse {
  /** The total number of dashboards. */
  @JsonProperty("count")
  private Long count;

  /** The current page being displayed. */
  @JsonProperty("page")
  private Long page;

  /** The number of dashboards per page. */
  @JsonProperty("page_size")
  private Long pageSize;

  /** List of dashboards returned. */
  @JsonProperty("results")
  private Collection<Dashboard> results;

  /**
   * <p>Setter for the field <code>count</code>.</p>
   *
   * @param count a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ListResponse} object
   */
  public ListResponse setCount(Long count) {
    this.count = count;
    return this;
  }

  /**
   * <p>Getter for the field <code>count</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCount() {
    return count;
  }

  /**
   * <p>Setter for the field <code>page</code>.</p>
   *
   * @param page a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ListResponse} object
   */
  public ListResponse setPage(Long page) {
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
   * @return a {@link com.databricks.sdk.service.sql.ListResponse} object
   */
  public ListResponse setPageSize(Long pageSize) {
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
   * <p>Setter for the field <code>results</code>.</p>
   *
   * @param results a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.ListResponse} object
   */
  public ListResponse setResults(Collection<Dashboard> results) {
    this.results = results;
    return this;
  }

  /**
   * <p>Getter for the field <code>results</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Dashboard> getResults() {
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(count, that.count)
        && Objects.equals(page, that.page)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(results, that.results);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(count, page, pageSize, results);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListResponse.class)
        .add("count", count)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("results", results)
        .toString();
  }
}
