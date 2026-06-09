// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateIndexRequest {
  /**
   * The Index resource to create. Fields other than `index.name` carry the desired configuration;
   * `index.name` is server-assigned from `parent` and `index_id`.
   */
  @JsonProperty("index")
  private Index index;

  /**
   * The user-supplied Unity Catalog table name for the Index, per AIP-133. The server composes the
   * full `Index.name` as `{parent}/indexes/{index_id}`. AIP-133 does not list `index_id` as a
   * fields-may-be-required entry, so we annotate it OPTIONAL on the wire; the server still rejects
   * empty values with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("index_id")
  private String indexId;

  /**
   * The Endpoint where this Index will be created. Format:
   * `workspaces/{workspace_id}/endpoints/{endpoint_id}`
   */
  @JsonIgnore private String parent;

  public CreateIndexRequest setIndex(Index index) {
    this.index = index;
    return this;
  }

  public Index getIndex() {
    return index;
  }

  public CreateIndexRequest setIndexId(String indexId) {
    this.indexId = indexId;
    return this;
  }

  public String getIndexId() {
    return indexId;
  }

  public CreateIndexRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateIndexRequest that = (CreateIndexRequest) o;
    return Objects.equals(index, that.index)
        && Objects.equals(indexId, that.indexId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, indexId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateIndexRequest.class)
        .add("index", index)
        .add("indexId", indexId)
        .add("parent", parent)
        .toString();
  }
}
