// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateQueryRequest {
  /**
   * If true, automatically resolve query display name conflicts. Otherwise, fail the request if the
   * query's display name conflicts with an existing query's display name.
   */
  @JsonProperty("auto_resolve_display_name")
  private Boolean autoResolveDisplayName;

  /** UUID of the query to update. */
  @JsonIgnore private String id;

  /** Query fields to update. Only the fields named in `update_mask` are changed. */
  @JsonProperty("query")
  private UpdateQueryRequestQuery query;

  /**
   * Comma-separated list of the query fields to update, such as the display name or query text.
   * Fields not listed keep their current values.
   *
   * <p>The field mask must be a single string, with multiple fields separated by commas (no
   * spaces). The field path is relative to the resource object, using a dot (`.`) to navigate
   * sub-fields (e.g., `author.given_name`). Specification of elements in sequence or map fields is
   * not allowed, as only the entire collection field can be specified. Field names must exactly
   * match the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateQueryRequest setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

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
    return Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName)
        && Objects.equals(id, that.id)
        && Objects.equals(query, that.query)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoResolveDisplayName, id, query, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateQueryRequest.class)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("id", id)
        .add("query", query)
        .add("updateMask", updateMask)
        .toString();
  }
}
