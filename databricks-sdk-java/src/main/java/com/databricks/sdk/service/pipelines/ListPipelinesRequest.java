// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/**
 * List pipelines
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListPipelinesRequest {
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
  private Collection<String> orderBy;

  /** Page token returned by previous call */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * <p>Setter for the field <code>filter</code>.</p>
   *
   * @param filter a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelinesRequest} object
   */
  public ListPipelinesRequest setFilter(String filter) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelinesRequest} object
   */
  public ListPipelinesRequest setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelinesRequest} object
   */
  public ListPipelinesRequest setOrderBy(Collection<String> orderBy) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelinesRequest} object
   */
  public ListPipelinesRequest setPageToken(String pageToken) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelinesRequest that = (ListPipelinesRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListPipelinesRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }
}
