// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class SyncIndexRequest {
  /** Name of the vector index to synchronize. Must be a Delta Sync Index. */
  @JsonIgnore private String indexName;

  public SyncIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncIndexRequest that = (SyncIndexRequest) o;
    return Objects.equals(indexName, that.indexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncIndexRequest.class).add("indexName", indexName).toString();
  }
}
