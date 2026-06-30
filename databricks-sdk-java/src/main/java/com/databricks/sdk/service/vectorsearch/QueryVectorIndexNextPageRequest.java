// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request payload for getting next page of results. */
@Generated
public class QueryVectorIndexNextPageRequest {
  /** Name of the endpoint. */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** Name of the vector index to query. */
  @JsonIgnore private String indexName;

  /** Page token returned from previous `QueryVectorIndex` or `QueryVectorIndexNextPage` API. */
  @JsonProperty("page_token")
  private String pageToken;

  public QueryVectorIndexNextPageRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public QueryVectorIndexNextPageRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public QueryVectorIndexNextPageRequest setPageToken(String pageToken) {
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
    QueryVectorIndexNextPageRequest that = (QueryVectorIndexNextPageRequest) o;
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
    return new ToStringer(QueryVectorIndexNextPageRequest.class)
        .add("endpointName", endpointName)
        .add("indexName", indexName)
        .add("pageToken", pageToken)
        .toString();
  }
}
