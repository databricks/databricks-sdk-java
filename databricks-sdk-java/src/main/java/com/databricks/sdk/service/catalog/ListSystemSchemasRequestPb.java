// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List system schemas */
@Generated
class ListSystemSchemasRequestPb {
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore private String metastoreId;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListSystemSchemasRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSystemSchemasRequestPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ListSystemSchemasRequestPb setPageToken(String pageToken) {
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
    ListSystemSchemasRequestPb that = (ListSystemSchemasRequestPb) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, metastoreId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasRequestPb.class)
        .add("maxResults", maxResults)
        .add("metastoreId", metastoreId)
        .add("pageToken", pageToken)
        .toString();
  }
}
