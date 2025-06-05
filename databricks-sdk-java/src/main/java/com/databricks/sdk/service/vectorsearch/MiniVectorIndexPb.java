// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MiniVectorIndexPb {
  @JsonProperty("creator")
  private String creator;

  @JsonProperty("endpoint_name")
  private String endpointName;

  @JsonProperty("index_type")
  private VectorIndexType indexType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("primary_key")
  private String primaryKey;

  public MiniVectorIndexPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public MiniVectorIndexPb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public MiniVectorIndexPb setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public MiniVectorIndexPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MiniVectorIndexPb setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MiniVectorIndexPb that = (MiniVectorIndexPb) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, endpointName, indexType, name, primaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(MiniVectorIndexPb.class)
        .add("creator", creator)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .toString();
  }
}
