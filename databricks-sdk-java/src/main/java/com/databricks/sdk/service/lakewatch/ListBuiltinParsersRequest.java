// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListBuiltinParsersRequest {
  /**
   * AIP-160 filter expression. Built-ins are filterable by their `tags`; the exact tag-filter
   * grammar is defined by the server.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * Maximum number of results to return in one page. This is a best-effort upper bound, not a
   * guarantee: the server may return fewer items than requested (even zero) while more results
   * still exist. If unset or 0, the server picks a default.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Page token from a previous `ListBuiltinParsers` response, used to fetch the next page of
   * results.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListBuiltinParsersRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListBuiltinParsersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListBuiltinParsersRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListBuiltinParsersRequest that = (ListBuiltinParsersRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBuiltinParsersRequest.class)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
