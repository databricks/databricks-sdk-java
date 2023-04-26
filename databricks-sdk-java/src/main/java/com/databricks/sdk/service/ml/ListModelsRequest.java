// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List models
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListModelsRequest {
  /** Maximum number of registered models desired. Max threshold is 1000. */
  @QueryParam("max_results")
  private Long maxResults;

  /** Pagination token to go to the next page based on a previous query. */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.ListModelsRequest} object
   */
  public ListModelsRequest setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.ml.ListModelsRequest} object
   */
  public ListModelsRequest setPageToken(String pageToken) {
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
    ListModelsRequest that = (ListModelsRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListModelsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
