// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class VectorIndex {
  /** The user who created the index. */
  @JsonProperty("creator")
  private String creator;

  /** */
  @JsonProperty("delta_sync_vector_index_spec")
  private DeltaSyncVectorIndexSpecResponse deltaSyncVectorIndexSpec;

  /** */
  @JsonProperty("direct_access_vector_index_spec")
  private DirectAccessVectorIndexSpec directAccessVectorIndexSpec;

  /** Name of the endpoint associated with the index */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /**
   * There are 2 types of Vector Search indexes:
   *
   * <p>- `DELTA_SYNC`: An index that automatically syncs with a source Delta Table, automatically
   * and incrementally updating the index as the underlying data in the Delta Table changes. -
   * `DIRECT_ACCESS`: An index that supports direct read and write of vectors and metadata through
   * our REST and SDK APIs. With this model, the user manages index updates.
   */
  @JsonProperty("index_type")
  private VectorIndexType indexType;

  /** Name of the index */
  @JsonProperty("name")
  private String name;

  /** Primary key of the index */
  @JsonProperty("primary_key")
  private String primaryKey;

  /** */
  @JsonProperty("status")
  private VectorIndexStatus status;

  public VectorIndex setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public VectorIndex setDeltaSyncVectorIndexSpec(
      DeltaSyncVectorIndexSpecResponse deltaSyncVectorIndexSpec) {
    this.deltaSyncVectorIndexSpec = deltaSyncVectorIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecResponse getDeltaSyncVectorIndexSpec() {
    return deltaSyncVectorIndexSpec;
  }

  public VectorIndex setDirectAccessVectorIndexSpec(
      DirectAccessVectorIndexSpec directAccessVectorIndexSpec) {
    this.directAccessVectorIndexSpec = directAccessVectorIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessVectorIndexSpec() {
    return directAccessVectorIndexSpec;
  }

  public VectorIndex setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public VectorIndex setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public VectorIndex setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VectorIndex setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  public VectorIndex setStatus(VectorIndexStatus status) {
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
    VectorIndex that = (VectorIndex) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(deltaSyncVectorIndexSpec, that.deltaSyncVectorIndexSpec)
        && Objects.equals(directAccessVectorIndexSpec, that.directAccessVectorIndexSpec)
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
        deltaSyncVectorIndexSpec,
        directAccessVectorIndexSpec,
        endpointName,
        indexType,
        name,
        primaryKey,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndex.class)
        .add("creator", creator)
        .add("deltaSyncVectorIndexSpec", deltaSyncVectorIndexSpec)
        .add("directAccessVectorIndexSpec", directAccessVectorIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .add("status", status)
        .toString();
  }
}
