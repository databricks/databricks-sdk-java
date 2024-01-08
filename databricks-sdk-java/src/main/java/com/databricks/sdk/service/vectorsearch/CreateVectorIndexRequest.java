// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateVectorIndexRequest {
  /** Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`. */
  @JsonProperty("delta_sync_vector_index_spec")
  private DeltaSyncVectorIndexSpecRequest deltaSyncVectorIndexSpec;

  /** Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`. */
  @JsonProperty("direct_access_index_spec")
  private DirectAccessVectorIndexSpec directAccessIndexSpec;

  /** Name of the endpoint to be used for serving the index */
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

  public CreateVectorIndexRequest setDeltaSyncVectorIndexSpec(
      DeltaSyncVectorIndexSpecRequest deltaSyncVectorIndexSpec) {
    this.deltaSyncVectorIndexSpec = deltaSyncVectorIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecRequest getDeltaSyncVectorIndexSpec() {
    return deltaSyncVectorIndexSpec;
  }

  public CreateVectorIndexRequest setDirectAccessIndexSpec(
      DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public CreateVectorIndexRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public CreateVectorIndexRequest setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public CreateVectorIndexRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateVectorIndexRequest setPrimaryKey(String primaryKey) {
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
    CreateVectorIndexRequest that = (CreateVectorIndexRequest) o;
    return Objects.equals(deltaSyncVectorIndexSpec, that.deltaSyncVectorIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deltaSyncVectorIndexSpec, directAccessIndexSpec, endpointName, indexType, name, primaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVectorIndexRequest.class)
        .add("deltaSyncVectorIndexSpec", deltaSyncVectorIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .toString();
  }
}
