// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListPipelineEventsRequest {
  /**
   * Criteria to select a subset of results, expressed using a SQL-like syntax. The supported
   * filters are: 1. level='INFO' (or WARN or ERROR) 2. level in ('INFO', 'WARN') 3. id='[event-id]'
   * 4. timestamp > 'TIMESTAMP' (or >=,<,<=,=)
   *
   * <p>Composite expressions are supported, for example: level in ('ERROR', 'WARN') AND timestamp>
   * '2021-07-22T06:37:33.083Z'
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * Max number of entries to return in a single page. The system may return fewer than max_results
   * events in a response, even if there are more events available.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * A string indicating a sort order by timestamp for the results, for example, ["timestamp asc"].
   * The sort order can be ascending or descending. By default, events are returned in descending
   * order by timestamp.
   */
  @JsonIgnore
  @QueryParam("order_by")
  private Collection<String> orderBy;

  /**
   * Page token returned by previous call. This field is mutually exclusive with all fields in this
   * request except max_results. An error is returned if any fields other than max_results are set
   * when this field is set.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The pipeline to return events for. */
  @JsonIgnore private String pipelineId;

  public ListPipelineEventsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListPipelineEventsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListPipelineEventsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public ListPipelineEventsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListPipelineEventsRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelineEventsRequest that = (ListPipelineEventsRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPipelineEventsRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
