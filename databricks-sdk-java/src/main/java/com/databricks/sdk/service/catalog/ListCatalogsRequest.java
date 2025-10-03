// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCatalogsRequest {
  /**
   * Whether to include catalogs in the response for which the principal can only access selective
   * metadata for
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /**
   * Whether to include catalogs not bound to the workspace. Effective only if the user has
   * permission to update the catalog–workspace binding.
   */
  @JsonIgnore
  @QueryParam("include_unbound")
  private Boolean includeUnbound;

  /**
   * Maximum number of catalogs to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid catalogs are returned (not
   * recommended). - Note: The number of returned catalogs might be less than the specified
   * max_results size, even zero. The only definitive indication that no further catalogs can be
   * fetched is when the next_page_token is unset from the response.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCatalogsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListCatalogsRequest setIncludeUnbound(Boolean includeUnbound) {
    this.includeUnbound = includeUnbound;
    return this;
  }

  public Boolean getIncludeUnbound() {
    return includeUnbound;
  }

  public ListCatalogsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListCatalogsRequest setPageToken(String pageToken) {
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
    ListCatalogsRequest that = (ListCatalogsRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeUnbound, that.includeUnbound)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, includeUnbound, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCatalogsRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("includeUnbound", includeUnbound)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
