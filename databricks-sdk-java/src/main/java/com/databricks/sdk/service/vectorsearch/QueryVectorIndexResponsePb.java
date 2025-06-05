// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class QueryVectorIndexResponsePb {
  @JsonProperty("manifest")
  private ResultManifest manifest;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("result")
  private ResultData result;

  public QueryVectorIndexResponsePb setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public ResultManifest getManifest() {
    return manifest;
  }

  public QueryVectorIndexResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public QueryVectorIndexResponsePb setResult(ResultData result) {
    this.result = result;
    return this;
  }

  public ResultData getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryVectorIndexResponsePb that = (QueryVectorIndexResponsePb) o;
    return Objects.equals(manifest, that.manifest)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, nextPageToken, result);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexResponsePb.class)
        .add("manifest", manifest)
        .add("nextPageToken", nextPageToken)
        .add("result", result)
        .toString();
  }
}
