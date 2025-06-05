// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List providers */
@Generated
class ListProvidersRequestPb {
  @JsonIgnore
  @QueryParam("data_provider_global_metastore_id")
  private String dataProviderGlobalMetastoreId;

  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListProvidersRequestPb setDataProviderGlobalMetastoreId(
      String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  public ListProvidersRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListProvidersRequestPb setPageToken(String pageToken) {
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
    ListProvidersRequestPb that = (ListProvidersRequestPb) o;
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
    return new ToStringer(ListProvidersRequestPb.class)
        .add("dataProviderGlobalMetastoreId", dataProviderGlobalMetastoreId)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
