// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List recipient federation policies */
@Generated
class ListFederationPoliciesRequestPb {
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore private String recipientName;

  public ListFederationPoliciesRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListFederationPoliciesRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListFederationPoliciesRequestPb setRecipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  public String getRecipientName() {
    return recipientName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFederationPoliciesRequestPb that = (ListFederationPoliciesRequestPb) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFederationPoliciesRequestPb.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("recipientName", recipientName)
        .toString();
  }
}
