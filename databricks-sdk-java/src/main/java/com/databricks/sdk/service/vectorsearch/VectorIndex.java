// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An AI Search index stores vectors and metadata on an endpoint and serves vector similarity,
 * full-text and hybrid search queries over them. A Delta Sync index is kept in sync with a source
 * table, with embeddings either computed by Databricks from a text column or supplied by you in a
 * vector column; a Direct Vector Access index holds rows that you write through the upsert and
 * delete data APIs. See https://docs.databricks.com/aws/en/ai-search/create-ai-search for how to
 * choose between them.
 */
@Generated
public class VectorIndex {
  /** The user who created the index. */
  @JsonProperty("creator")
  private String creator;

  /** Specification of a Delta Sync index. Present only when `index_type` is `DELTA_SYNC`. */
  @JsonProperty("delta_sync_index_spec")
  private DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec;

  /**
   * Specification of a Direct Vector Access index. Present only when `index_type` is
   * `DIRECT_ACCESS`.
   */
  @JsonProperty("direct_access_index_spec")
  private DirectAccessVectorIndexSpec directAccessIndexSpec;

  /** ID of the endpoint associated with the index. */
  @JsonProperty("endpoint_id")
  private String endpointId;

  /** Name of the endpoint that serves the index. */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /**
   * Subtype of the index. A `HYBRID` index supports vector similarity, full-text and hybrid
   * queries; a `FULL_TEXT` index has no embeddings and supports only full-text queries.
   */
  @JsonProperty("index_subtype")
  private IndexSubtype indexSubtype;

  /**
   * Type of the index, which determines whether `delta_sync_index_spec` or
   * `direct_access_index_spec` describes it.
   */
  @JsonProperty("index_type")
  private VectorIndexType indexType;

  /** Three-level Unity Catalog name of the index. */
  @JsonProperty("name")
  private String name;

  /** Name of the column that uniquely identifies each row of the index. */
  @JsonProperty("primary_key")
  private String primaryKey;

  /**
   * Current status of the index, including whether it is ready to serve queries and how many rows
   * it holds.
   */
  @JsonProperty("status")
  private VectorIndexStatus status;

  public VectorIndex setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public VectorIndex setDeltaSyncIndexSpec(DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecResponse getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public VectorIndex setDirectAccessIndexSpec(DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public VectorIndex setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public VectorIndex setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public VectorIndex setIndexSubtype(IndexSubtype indexSubtype) {
    this.indexSubtype = indexSubtype;
    return this;
  }

  public IndexSubtype getIndexSubtype() {
    return indexSubtype;
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
        && Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexSubtype, that.indexSubtype)
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
        endpointId,
        endpointName,
        indexSubtype,
        indexType,
        name,
        primaryKey,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndex.class)
        .add("creator", creator)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointId", endpointId)
        .add("endpointName", endpointName)
        .add("indexSubtype", indexSubtype)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .add("status", status)
        .toString();
  }
}
