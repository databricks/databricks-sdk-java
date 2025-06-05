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
class DeleteDataVectorIndexRequestPb {
  @JsonIgnore private String indexName;

  @JsonIgnore
  @QueryParam("primary_keys")
  private Collection<String> primaryKeys;

  public DeleteDataVectorIndexRequestPb setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public DeleteDataVectorIndexRequestPb setPrimaryKeys(Collection<String> primaryKeys) {
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
    DeleteDataVectorIndexRequestPb that = (DeleteDataVectorIndexRequestPb) o;
    return Objects.equals(indexName, that.indexName)
        && Objects.equals(primaryKeys, that.primaryKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, primaryKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataVectorIndexRequestPb.class)
        .add("indexName", indexName)
        .add("primaryKeys", primaryKeys)
        .toString();
  }
}
