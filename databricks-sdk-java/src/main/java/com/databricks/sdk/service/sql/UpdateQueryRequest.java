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
   * Field mask is required to be passed into the PATCH request. Field mask specifies which fields
   * of the setting payload will be updated. The field mask needs to be supplied as single string.
   * To specify multiple fields in the field mask, use comma as the separator (no space).
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
