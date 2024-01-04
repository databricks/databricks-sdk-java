// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List Model Versions */
@Generated
public class ListModelVersionsRequest {
  /** The full three-level name of the registered model under which to list model versions */
  private String fullName;

  /**
   * Maximum number of model versions to return. If not set, the page length is set to a server
   * configured value (100, as of 1/3/2024). - when set to a value greater than 0, the page length
   * is the minimum of this value and a server configured value(1000, as of 1/3/2024); - when set to
   * 0, the page length is set to a server configured value (100, as of 1/3/2024) (recommended); -
   * when set to a value less than 0, an invalid parameter error is returned;
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @QueryParam("page_token")
  private String pageToken;

  public ListModelVersionsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ListModelVersionsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListModelVersionsRequest setPageToken(String pageToken) {
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
    ListModelVersionsRequest that = (ListModelVersionsRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelVersionsRequest.class)
        .add("fullName", fullName)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
