// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QueryVectorIndexResponse {
  /** Metadata about the result set. */
  @JsonProperty("manifest")
  private ResultManifest manifest;

  /** Data returned in the query result. */
  @JsonProperty("result")
  private ResultData result;

  public QueryVectorIndexResponse setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public ResultManifest getManifest() {
    return manifest;
  }

  public QueryVectorIndexResponse setResult(ResultData result) {
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
    QueryVectorIndexResponse that = (QueryVectorIndexResponse) o;
    return Objects.equals(manifest, that.manifest) && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, result);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryVectorIndexResponse.class)
        .add("manifest", manifest)
        .add("result", result)
        .toString();
  }
}
