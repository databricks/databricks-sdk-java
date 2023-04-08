// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.annotation.QueryParam;

/** List pipelines */
public class ListPipelines {
  /**
   * Select a subset of results based on the specified criteria. The supported filters are:
   *
   * <p>* `notebook='<path>'` to select pipelines that reference the provided notebook path. * `name
   * LIKE '[pattern]'` to select pipelines with a name that matches pattern. Wildcards are
   * supported, for example: `name LIKE '%shopping%'`
   *
   * <p>Composite filters are not supported. This field is optional.
   */
  @QueryParam("filter")
  private String filter;

  /**
   * The maximum number of entries to return in a single page. The system may return fewer than
   * max_results events in a response, even if there are more events available. This field is
   * optional. The default value is 25. The maximum value is 100. An error is returned if the value
   * of max_results is greater than 100.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * A list of strings specifying the order of results. Supported order_by fields are id and name.
   * The default is id asc. This field is optional.
   */
  @QueryParam("order_by")
  private java.util.List<String> orderBy;

  /** Page token returned by previous call */
  @QueryParam("page_token")
  private String pageToken;

  public ListPipelines setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListPipelines setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListPipelines setOrderBy(java.util.List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public java.util.List<String> getOrderBy() {
    return orderBy;
  }

  public ListPipelines setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }
}
