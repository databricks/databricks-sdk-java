// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List external locations */
@Generated
public class ListExternalLocationsRequest {
  /**
   * Whether to include external locations in the response for which the principal can only access
   * selective metadata for
   */
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /**
   * Maximum number of external locations to return. If not set, all the external locations are
   * returned (not recommended). - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to 0, the page length is set to
   * a server configured value (recommended); - when set to a value less than 0, an invalid
   * parameter error is returned;
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @QueryParam("page_token")
  private String pageToken;

  public ListExternalLocationsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListExternalLocationsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListExternalLocationsRequest setPageToken(String pageToken) {
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
    ListExternalLocationsRequest that = (ListExternalLocationsRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLocationsRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
