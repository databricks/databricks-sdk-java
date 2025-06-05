// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class VectorIndexPb {
  @JsonProperty("creator")
  private String creator;

  @JsonProperty("delta_sync_index_spec")
  private DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec;

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

  @JsonProperty("status")
  private VectorIndexStatus status;

  public VectorIndexPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public VectorIndexPb setDeltaSyncIndexSpec(DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecResponse getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public VectorIndexPb setDirectAccessIndexSpec(DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public VectorIndexPb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public VectorIndexPb setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public VectorIndexPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VectorIndexPb setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  public VectorIndexPb setStatus(VectorIndexStatus status) {
    this.status = status;
    return this;
  }

  public VectorIndexStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VectorIndexPb that = (VectorIndexPb) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creator,
        deltaSyncIndexSpec,
        directAccessIndexSpec,
        endpointName,
        indexType,
        name,
        primaryKey,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndexPb.class)
        .add("creator", creator)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .add("status", status)
        .toString();
  }
}
