// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Request payload for deleting data from a vector index. */
@Generated
public class DeleteDataVectorIndexRequest {
  /** Name of the vector index where data is to be deleted. Must be a Direct Vector Access Index. */
  private String name;

  /** List of primary keys for the data to be deleted. */
  @JsonProperty("primary_keys")
  private Collection<String> primaryKeys;

  public DeleteDataVectorIndexRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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
    return Objects.equals(name, that.name) && Objects.equals(primaryKeys, that.primaryKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, primaryKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataVectorIndexRequest.class)
        .add("name", name)
        .add("primaryKeys", primaryKeys)
        .toString();
  }
}
