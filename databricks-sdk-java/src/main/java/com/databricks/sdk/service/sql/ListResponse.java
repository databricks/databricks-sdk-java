// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListResponse {
  /**
   * The total number of dashboards.
   */
  @JsonProperty("count")
  private Long count;
  
  /**
   * The current page being displayed.
   */
  @JsonProperty("page")
  private Long page;
  
  /**
   * The number of dashboards per page.
   */
  @JsonProperty("page_size")
  private Long pageSize;
  
  /**
   * List of dashboards returned.
   */
  @JsonProperty("results")
  private Collection<Dashboard> results;
  
  public ListResponse setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }
  
  public ListResponse setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }
  
  public ListResponse setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }
  
  public ListResponse setResults(Collection<Dashboard> results) {
    this.results = results;
    return this;
  }

  public Collection<Dashboard> getResults() {
    return results;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(count, that.count)
    && Objects.equals(page, that.page)
    && Objects.equals(pageSize, that.pageSize)
    && Objects.equals(results, that.results)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, page, pageSize, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResponse.class)
      .add("count", count)
      .add("page", page)
      .add("pageSize", pageSize)
      .add("results", results).toString();
  }
}
