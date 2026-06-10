// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response for QueryIndex carrying the matched rows and their column metadata. */
@Generated
public class QueryIndexResponse {
  /** Facet aggregation rows, when facets were requested. */
  @JsonProperty("facet_result")
  private FacetResultData facetResult;

  /** Metadata describing the result columns. */
  @JsonProperty("manifest")
  private ResultManifest manifest;

  /** The matched result rows. */
  @JsonProperty("result")
  private ResultData result;

  public QueryIndexResponse setFacetResult(FacetResultData facetResult) {
    this.facetResult = facetResult;
    return this;
  }

  public FacetResultData getFacetResult() {
    return facetResult;
  }

  public QueryIndexResponse setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public ResultManifest getManifest() {
    return manifest;
  }

  public QueryIndexResponse setResult(ResultData result) {
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
    QueryIndexResponse that = (QueryIndexResponse) o;
    return Objects.equals(facetResult, that.facetResult)
        && Objects.equals(manifest, that.manifest)
        && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetResult, manifest, result);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryIndexResponse.class)
        .add("facetResult", facetResult)
        .add("manifest", manifest)
        .add("result", result)
        .toString();
  }
}
