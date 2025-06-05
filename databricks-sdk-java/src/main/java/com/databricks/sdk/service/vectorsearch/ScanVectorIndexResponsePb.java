// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response to a scan vector index request. */
@Generated
class ScanVectorIndexResponsePb {
  @JsonProperty("data")
  private Collection<Struct> data;

  @JsonProperty("last_primary_key")
  private String lastPrimaryKey;

  public ScanVectorIndexResponsePb setData(Collection<Struct> data) {
    this.data = data;
    return this;
  }

  public Collection<Struct> getData() {
    return data;
  }

  public ScanVectorIndexResponsePb setLastPrimaryKey(String lastPrimaryKey) {
    this.lastPrimaryKey = lastPrimaryKey;
    return this;
  }

  public String getLastPrimaryKey() {
    return lastPrimaryKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScanVectorIndexResponsePb that = (ScanVectorIndexResponsePb) o;
    return Objects.equals(data, that.data) && Objects.equals(lastPrimaryKey, that.lastPrimaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastPrimaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(ScanVectorIndexResponsePb.class)
        .add("data", data)
        .add("lastPrimaryKey", lastPrimaryKey)
        .toString();
  }
}
