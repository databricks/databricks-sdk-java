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

  /** Max number of model versions to return */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token to send for the next page of results (pagination). */
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
