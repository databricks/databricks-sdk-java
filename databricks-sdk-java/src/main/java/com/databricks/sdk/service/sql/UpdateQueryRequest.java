// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateQueryRequest {
  /** */
  @JsonIgnore private String id;

  /** */
  @JsonProperty("query")
  private UpdateQueryRequestQuery query;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateQueryRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateQueryRequest setQuery(UpdateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  public UpdateQueryRequestQuery getQuery() {
    return query;
  }

  public UpdateQueryRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateQueryRequest that = (UpdateQueryRequest) o;
    return Objects.equals(id, that.id)
        && Objects.equals(query, that.query)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, query, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateQueryRequest.class)
        .add("id", id)
        .add("query", query)
        .add("updateMask", updateMask)
        .toString();
  }
}
