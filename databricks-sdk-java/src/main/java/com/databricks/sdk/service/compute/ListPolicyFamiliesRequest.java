// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * <p>ListPolicyFamiliesRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListPolicyFamiliesRequest {
  /** The max number of policy families to return. */
  @QueryParam("max_results")
  private Long maxResults;

  /** A token that can be used to get the next page of results. */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesRequest} object
   */
  public ListPolicyFamiliesRequest setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesRequest} object
   */
  public ListPolicyFamiliesRequest setPageToken(String pageToken) {
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
    ListPolicyFamiliesRequest that = (ListPolicyFamiliesRequest) o;
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
    return new ToStringer(ListPolicyFamiliesRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
