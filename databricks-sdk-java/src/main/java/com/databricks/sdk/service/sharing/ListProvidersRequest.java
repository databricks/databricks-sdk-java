// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListProvidersRequest {
  /**
   * If not provided, all providers will be returned. If no providers exist with this ID, no results
   * will be returned.
   */
  @JsonIgnore
  @QueryParam("data_provider_global_metastore_id")
  private String dataProviderGlobalMetastoreId;

  /**
   * Maximum number of providers to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid providers are returned (not
   * recommended). - Note: The number of returned providers might be less than the specified
   * max_results size, even zero. The only definitive indication that no further providers can be
   * fetched is when the next_page_token is unset from the response.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListProvidersRequest setDataProviderGlobalMetastoreId(
      String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  public ListProvidersRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListProvidersRequest setPageToken(String pageToken) {
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
    ListProvidersRequest that = (ListProvidersRequest) o;
    return Objects.equals(dataProviderGlobalMetastoreId, that.dataProviderGlobalMetastoreId)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataProviderGlobalMetastoreId, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersRequest.class)
        .add("dataProviderGlobalMetastoreId", dataProviderGlobalMetastoreId)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
