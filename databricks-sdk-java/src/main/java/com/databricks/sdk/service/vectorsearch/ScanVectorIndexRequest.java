// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request payload for scanning data from a vector index. */
@Generated
public class ScanVectorIndexRequest {
  /** Name of the vector index to scan. */
  @JsonIgnore private String indexName;

  /** Primary key of the last entry returned in the previous scan. */
  @JsonProperty("last_primary_key")
  private String lastPrimaryKey;

  /** Number of results to return. Defaults to 10. */
  @JsonProperty("num_results")
  private Long numResults;

  public ScanVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public ScanVectorIndexRequest setLastPrimaryKey(String lastPrimaryKey) {
    this.lastPrimaryKey = lastPrimaryKey;
    return this;
  }

  public String getLastPrimaryKey() {
    return lastPrimaryKey;
  }

  public ScanVectorIndexRequest setNumResults(Long numResults) {
    this.numResults = numResults;
    return this;
  }

  public Long getNumResults() {
    return numResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScanVectorIndexRequest that = (ScanVectorIndexRequest) o;
    return Objects.equals(indexName, that.indexName)
        && Objects.equals(lastPrimaryKey, that.lastPrimaryKey)
        && Objects.equals(numResults, that.numResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, lastPrimaryKey, numResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ScanVectorIndexRequest.class)
        .add("indexName", indexName)
        .add("lastPrimaryKey", lastPrimaryKey)
        .add("numResults", numResults)
        .toString();
  }
}
