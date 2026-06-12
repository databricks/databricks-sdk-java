// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An AI Search index — a searchable collection of vectors and metadata hosted on an AI Search
 * endpoint. Indexes are children of endpoints; customers create, get, list, and delete them. The
 * {@code {index}} segment of the resource name is the index's Unity Catalog table name.
 */
@Generated
public class Index {
  /** Creator of the index. */
  @JsonProperty("creator")
  private String creator;

  /** Specification for a Delta Sync index. Set when {@code index_type} is {@code DELTA_SYNC}. */
  @JsonProperty("delta_sync_index_spec")
  private DeltaSyncIndexSpec deltaSyncIndexSpec;

  /**
   * Specification for a Direct Access index. Set when {@code index_type} is {@code DIRECT_ACCESS}.
   */
  @JsonProperty("direct_access_index_spec")
  private DirectAccessIndexSpec directAccessIndexSpec;

  /**
   * Name of the endpoint associated with the index. Ignored on create — the endpoint is taken from
   * {@code CreateIndexRequest.parent}; populated only on output.
   */
  @JsonProperty("endpoint")
  private String endpoint;

  /** The subtype of the index. Set on create and immutable thereafter. */
  @JsonProperty("index_subtype")
  private IndexSubtype indexSubtype;

  /** Type of index. Required on create and immutable thereafter. */
  @JsonProperty("index_type")
  private IndexType indexType;

  /**
   * Name of the AI Search index. Server-assigned full resource path ({@code
   * workspaces/{workspace}/endpoints/{endpoint}/indexes/{index}}) on output, where {@code {index}}
   * is the index's Unity Catalog table name. On create, the user-supplied UC table name is conveyed
   * via {@code CreateIndexRequest.index_id}; the server composes the full {@code name} and returns
   * it on the response.
   */
  @JsonProperty("name")
  private String name;

  /** Primary key of the index. Set on create and immutable thereafter. */
  @JsonProperty("primary_key")
  private String primaryKey;

  /** Current status of the index. */
  @JsonProperty("status")
  private IndexStatus status;

  public Index setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public Index setDeltaSyncIndexSpec(DeltaSyncIndexSpec deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncIndexSpec getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public Index setDirectAccessIndexSpec(DirectAccessIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public Index setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public Index setIndexSubtype(IndexSubtype indexSubtype) {
    this.indexSubtype = indexSubtype;
    return this;
  }

  public IndexSubtype getIndexSubtype() {
    return indexSubtype;
  }

  public Index setIndexType(IndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public IndexType getIndexType() {
    return indexType;
  }

  public Index setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Index setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  public Index setStatus(IndexStatus status) {
    this.status = status;
    return this;
  }

  public IndexStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Index that = (Index) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpoint, that.endpoint)
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
        endpoint,
        indexSubtype,
        indexType,
        name,
        primaryKey,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(Index.class)
        .add("creator", creator)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpoint", endpoint)
        .add("indexSubtype", indexSubtype)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .add("status", status)
        .toString();
  }
}
