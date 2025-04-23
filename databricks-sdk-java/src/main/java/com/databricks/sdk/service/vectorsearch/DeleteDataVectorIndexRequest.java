// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

/** Delete data from index */
@Generated
public class DeleteDataVectorIndexRequest {
  /** Name of the vector index where data is to be deleted. Must be a Direct Vector Access Index. */
  @JsonIgnore private String indexName;

  /** List of primary keys for the data to be deleted. */
  @JsonIgnore
  @QueryParam("primary_keys")
  private Collection<String> primaryKeys;

  public DeleteDataVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public DeleteDataVectorIndexRequest setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDataVectorIndexRequest that = (DeleteDataVectorIndexRequest) o;
    return Objects.equals(indexName, that.indexName)
        && Objects.equals(primaryKeys, that.primaryKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, primaryKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataVectorIndexRequest.class)
        .add("indexName", indexName)
        .add("primaryKeys", primaryKeys)
        .toString();
  }
}
