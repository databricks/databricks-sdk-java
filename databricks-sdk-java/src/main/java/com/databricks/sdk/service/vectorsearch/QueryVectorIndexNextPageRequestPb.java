// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request payload for getting next page of results. */
@Generated
class QueryVectorIndexNextPageRequestPb {
  @JsonProperty("endpoint_name")
  private String endpointName;

  @JsonIgnore private String indexName;

  @JsonProperty("page_token")
  private String pageToken;

  public QueryVectorIndexNextPageRequestPb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public QueryVectorIndexNextPageRequestPb setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public QueryVectorIndexNextPageRequestPb setPageToken(String pageToken) {
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
    QueryVectorIndexNextPageRequestPb that = (QueryVectorIndexNextPageRequestPb) o;
    return Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexName, that.indexName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, indexName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexNextPageRequestPb.class)
        .add("endpointName", endpointName)
        .add("indexName", indexName)
        .add("pageToken", pageToken)
        .toString();
  }
}
