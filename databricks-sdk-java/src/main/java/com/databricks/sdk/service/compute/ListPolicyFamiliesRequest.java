// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListPolicyFamiliesRequest {
  /** Maximum number of policy families to return. */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** A token that can be used to get the next page of results. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListPolicyFamiliesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListPolicyFamiliesRequest setPageToken(String pageToken) {
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
    ListPolicyFamiliesRequest that = (ListPolicyFamiliesRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPolicyFamiliesRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
