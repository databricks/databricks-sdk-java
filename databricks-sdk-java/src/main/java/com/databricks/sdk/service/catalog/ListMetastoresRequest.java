// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List metastores */
@Generated
public class ListMetastoresRequest {
  /**
   * Maximum number of metastores to return. - when set to a value greater than 0, the page length
   * is the minimum of this value and a server configured value; - when set to 0, the page length is
   * set to a server configured value (recommended); - when set to a value less than 0, an invalid
   * parameter error is returned; - If not set, all the metastores are returned (not recommended). -
   * Note: The number of returned metastores might be less than the specified max_results size, even
   * zero. The only definitive indication that no further metastores can be fetched is when the
   * next_page_token is unset from the response.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListMetastoresRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListMetastoresRequest setPageToken(String pageToken) {
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
    ListMetastoresRequest that = (ListMetastoresRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMetastoresRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
