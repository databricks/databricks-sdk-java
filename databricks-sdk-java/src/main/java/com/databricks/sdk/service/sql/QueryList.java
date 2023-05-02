// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryList {
  /** The total number of queries. */
  @JsonProperty("count")
  private Long count;

  /** The page number that is currently displayed. */
  @JsonProperty("page")
  private Long page;

  /** The number of queries per page. */
  @JsonProperty("page_size")
  private Long pageSize;

  /** List of queries returned. */
  @JsonProperty("results")
  private Collection<Query> results;

  public QueryList setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public QueryList setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public QueryList setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public QueryList setResults(Collection<Query> results) {
    this.results = results;
    return this;
  }

  public Collection<Query> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryList that = (QueryList) o;
    return Objects.equals(count, that.count)
        && Objects.equals(page, that.page)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, page, pageSize, results);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryList.class)
        .add("count", count)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("results", results)
        .toString();
  }
}
