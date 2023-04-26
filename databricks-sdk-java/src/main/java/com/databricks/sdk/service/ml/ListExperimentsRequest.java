// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List experiments
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListExperimentsRequest {
  /**
   * Maximum number of experiments desired. If `max_results` is unspecified, return all experiments.
   * If `max_results` is too large, it'll be automatically capped at 1000. Callers of this endpoint
   * are encouraged to pass max_results explicitly and leverage page_token to iterate through
   * experiments.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Token indicating the page of experiments to fetch */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Qualifier for type of experiments to be returned. If unspecified, return only active
   * experiments.
   */
  @QueryParam("view_type")
  private String viewType;

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.ListExperimentsRequest} object
   */
  public ListExperimentsRequest setMaxResults(Long maxResults) {
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
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListExperimentsRequest} object
   */
  public ListExperimentsRequest setPageToken(String pageToken) {
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
   * <p>Setter for the field <code>viewType</code>.</p>
   *
   * @param viewType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListExperimentsRequest} object
   */
  public ListExperimentsRequest setViewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

  /**
   * <p>Getter for the field <code>viewType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getViewType() {
    return viewType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExperimentsRequest that = (ListExperimentsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(viewType, that.viewType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, viewType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListExperimentsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("viewType", viewType)
        .toString();
  }
}
