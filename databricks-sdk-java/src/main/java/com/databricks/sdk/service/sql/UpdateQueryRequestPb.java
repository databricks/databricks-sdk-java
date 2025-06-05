// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateQueryRequestPb {
  @JsonProperty("auto_resolve_display_name")
  private Boolean autoResolveDisplayName;

  @JsonIgnore private String id;

  @JsonProperty("query")
  private UpdateQueryRequestQuery query;

  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateQueryRequestPb setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  public UpdateQueryRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateQueryRequestPb setQuery(UpdateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  public UpdateQueryRequestQuery getQuery() {
    return query;
  }

  public UpdateQueryRequestPb setUpdateMask(String updateMask) {
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
    UpdateQueryRequestPb that = (UpdateQueryRequestPb) o;
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
    return new ToStringer(UpdateQueryRequestPb.class)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("id", id)
        .add("query", query)
        .add("updateMask", updateMask)
        .toString();
  }
}
