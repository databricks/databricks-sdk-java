// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCredentialsRequest {
  /**
   * Whether to include credentials not bound to the workspace. Effective only if the user has
   * permission to update the credential–workspace binding.
   */
  @JsonIgnore
  @QueryParam("include_unbound")
  private Boolean includeUnbound;

  /**
   * Maximum number of credentials to return. - If not set, the default max page size is used. -
   * When set to a value greater than 0, the page length is the minimum of this value and a
   * server-configured value. - When set to 0, the page length is set to a server-configured value
   * (recommended). - When set to a value less than 0, an invalid parameter error is returned.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token to retrieve the next page of results. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Return only credentials for the specified purpose. */
  @JsonIgnore
  @QueryParam("purpose")
  private CredentialPurpose purpose;

  public ListCredentialsRequest setIncludeUnbound(Boolean includeUnbound) {
    this.includeUnbound = includeUnbound;
    return this;
  }

  public Boolean getIncludeUnbound() {
    return includeUnbound;
  }

  public ListCredentialsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListCredentialsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListCredentialsRequest setPurpose(CredentialPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public CredentialPurpose getPurpose() {
    return purpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCredentialsRequest that = (ListCredentialsRequest) o;
    return Objects.equals(includeUnbound, that.includeUnbound)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(purpose, that.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeUnbound, maxResults, pageToken, purpose);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsRequest.class)
        .add("includeUnbound", includeUnbound)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("purpose", purpose)
        .toString();
  }
}
