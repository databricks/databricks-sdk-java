// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/**
 * List pipeline events
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListPipelineEventsRequest {
  /**
   * Criteria to select a subset of results, expressed using a SQL-like syntax. The supported
   * filters are:
   *
   * <p>1. level='INFO' (or WARN or ERROR)
   *
   * <p>2. level in ('INFO', 'WARN')
   *
   * <p>3. id='[event-id]'
   *
   * <p>4. timestamp > 'TIMESTAMP' (or >=,<,<=,=)
   *
   * <p>Composite expressions are supported, for example: level in ('ERROR', 'WARN') AND timestamp>
   * '2021-07-22T06:37:33.083Z'
   */
  @QueryParam("filter")
  private String filter;

  /**
   * Max number of entries to return in a single page. The system may return fewer than max_results
   * events in a response, even if there are more events available.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * A string indicating a sort order by timestamp for the results, for example, ["timestamp asc"].
   * The sort order can be ascending or descending. By default, events are returned in descending
   * order by timestamp.
   */
  @QueryParam("order_by")
  private Collection<String> orderBy;

  /**
   * Page token returned by previous call. This field is mutually exclusive with all fields in this
   * request except max_results. An error is returned if any fields other than max_results are set
   * when this field is set.
   */
  @QueryParam("page_token")
  private String pageToken;

  /** */
  private String pipelineId;

  /**
   * <p>Setter for the field <code>filter</code>.</p>
   *
   * @param filter a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsRequest} object
   */
  public ListPipelineEventsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * <p>Getter for the field <code>filter</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFilter() {
    return filter;
  }

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsRequest} object
   */
  public ListPipelineEventsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxResults</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxResults() {
    return maxResults;
  }

  /**
   * <p>Setter for the field <code>orderBy</code>.</p>
   *
   * @param orderBy a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsRequest} object
   */
  public ListPipelineEventsRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>orderBy</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getOrderBy() {
    return orderBy;
  }

  /**
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsRequest} object
   */
  public ListPipelineEventsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>pageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPageToken() {
    return pageToken;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsRequest} object
   */
  public ListPipelineEventsRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPipelineId() {
    return pipelineId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken, pipelineId);
  }

  /** {@inheritDoc} */
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
