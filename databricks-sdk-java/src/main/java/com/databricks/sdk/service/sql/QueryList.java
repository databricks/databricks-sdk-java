// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

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
  private java.util.List<Query> results;

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

  public QueryList setResults(java.util.List<Query> results) {
    this.results = results;
    return this;
  }

  public java.util.List<Query> getResults() {
    return results;
  }
}
