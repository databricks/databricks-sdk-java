// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListStorageCredentialsRequest {
  /**
   * Whether to include credentials not bound to the workspace. Effective only if the user has
   * permission to update the credential–workspace binding.
   */
  @JsonIgnore
  @QueryParam("include_unbound")
  private Boolean includeUnbound;

  /**
   * Maximum number of storage credentials to return. If not set, all the storage credentials are
   * returned (not recommended). - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to 0, the page length is set to
   * a server configured value (recommended); - when set to a value less than 0, an invalid
   * parameter error is returned;
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListStorageCredentialsRequest setIncludeUnbound(Boolean includeUnbound) {
    this.includeUnbound = includeUnbound;
    return this;
  }

  public Boolean getIncludeUnbound() {
    return includeUnbound;
  }

  public ListStorageCredentialsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListStorageCredentialsRequest setPageToken(String pageToken) {
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
    ListStorageCredentialsRequest that = (ListStorageCredentialsRequest) o;
    return Objects.equals(includeUnbound, that.includeUnbound)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeUnbound, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStorageCredentialsRequest.class)
        .add("includeUnbound", includeUnbound)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
