// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ScanVectorIndexRequestPb {
  @JsonIgnore private String indexName;

  @JsonProperty("last_primary_key")
  private String lastPrimaryKey;

  @JsonProperty("num_results")
  private Long numResults;

  public ScanVectorIndexRequestPb setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public ScanVectorIndexRequestPb setLastPrimaryKey(String lastPrimaryKey) {
    this.lastPrimaryKey = lastPrimaryKey;
    return this;
  }

  public String getLastPrimaryKey() {
    return lastPrimaryKey;
  }

  public ScanVectorIndexRequestPb setNumResults(Long numResults) {
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
    ScanVectorIndexRequestPb that = (ScanVectorIndexRequestPb) o;
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
    return new ToStringer(ScanVectorIndexRequestPb.class)
        .add("indexName", indexName)
        .add("lastPrimaryKey", lastPrimaryKey)
        .add("numResults", numResults)
        .toString();
  }
}
