// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Collection;
import java.util.Objects;

/** Facet aggregation rows returned by a query. */
@Generated
public class FacetResultData {
  /** Facet rows; each row is {@code [facet_column_name, value_or_range, count]}. */
  @JsonProperty("facet_array")
  private Collection<Collection<JsonNode>> facetArray;

  /** Number of facet rows returned. */
  @JsonProperty("facet_row_count")
  private Long facetRowCount;

  public FacetResultData setFacetArray(Collection<Collection<JsonNode>> facetArray) {
    this.facetArray = facetArray;
    return this;
  }

  public Collection<Collection<JsonNode>> getFacetArray() {
    return facetArray;
  }

  public FacetResultData setFacetRowCount(Long facetRowCount) {
    this.facetRowCount = facetRowCount;
    return this;
  }

  public Long getFacetRowCount() {
    return facetRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FacetResultData that = (FacetResultData) o;
    return Objects.equals(facetArray, that.facetArray)
        && Objects.equals(facetRowCount, that.facetRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetArray, facetRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(FacetResultData.class)
        .add("facetArray", facetArray)
        .add("facetRowCount", facetRowCount)
        .toString();
  }
}
