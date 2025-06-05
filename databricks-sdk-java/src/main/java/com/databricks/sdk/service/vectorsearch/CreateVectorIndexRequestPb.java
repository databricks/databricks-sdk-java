// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateVectorIndexRequestPb {
  @JsonProperty("delta_sync_index_spec")
  private DeltaSyncVectorIndexSpecRequest deltaSyncIndexSpec;

  @JsonProperty("direct_access_index_spec")
  private DirectAccessVectorIndexSpec directAccessIndexSpec;

  @JsonProperty("endpoint_name")
  private String endpointName;

  @JsonProperty("index_type")
  private VectorIndexType indexType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("primary_key")
  private String primaryKey;

  public CreateVectorIndexRequestPb setDeltaSyncIndexSpec(
      DeltaSyncVectorIndexSpecRequest deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecRequest getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public CreateVectorIndexRequestPb setDirectAccessIndexSpec(
      DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public CreateVectorIndexRequestPb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public CreateVectorIndexRequestPb setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public CreateVectorIndexRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateVectorIndexRequestPb setPrimaryKey(String primaryKey) {
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
    CreateVectorIndexRequestPb that = (CreateVectorIndexRequestPb) o;
    return Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deltaSyncIndexSpec, directAccessIndexSpec, endpointName, indexType, name, primaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVectorIndexRequestPb.class)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .toString();
  }
}
