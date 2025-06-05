// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class QueryListPb {
  @JsonProperty("count")
  private Long count;

  @JsonProperty("page")
  private Long page;

  @JsonProperty("page_size")
  private Long pageSize;

  @JsonProperty("results")
  private Collection<LegacyQuery> results;

  public QueryListPb setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public QueryListPb setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public QueryListPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public QueryListPb setResults(Collection<LegacyQuery> results) {
    this.results = results;
    return this;
  }

  public Collection<LegacyQuery> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryListPb that = (QueryListPb) o;
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
    return new ToStringer(QueryListPb.class)
        .add("count", count)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("results", results)
        .toString();
  }
}
