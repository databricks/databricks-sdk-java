// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDefaultWarehouseOverrideRequest {
  /**
   * If set to true, and the override is not found, a new override will be created. In this
   * situation, `update_mask` is ignored and all fields are applied. Defaults to false.
   */
  @JsonIgnore
  @QueryParam("allow_missing")
  private Boolean allowMissing;

  /**
   * Required. The default warehouse override to update. The name field must be set in the format:
   * default-warehouse-overrides/{default_warehouse_override_id} The default_warehouse_override_id
   * can be a numeric user ID or the literal string "me" for the current user.
   */
  @JsonProperty("default_warehouse_override")
  private DefaultWarehouseOverride defaultWarehouseOverride;

  /**
   * The resource name of the default warehouse override. Format:
   * default-warehouse-overrides/{default_warehouse_override_id}
   */
  @JsonIgnore private String name;

  /**
   * Required. Field mask specifying which fields to update. Only the fields specified in the mask
   * will be updated. Use "*" to update all fields. When allow_missing is true, this field is
   * ignored and all fields are applied.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDefaultWarehouseOverrideRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdateDefaultWarehouseOverrideRequest setDefaultWarehouseOverride(
      DefaultWarehouseOverride defaultWarehouseOverride) {
    this.defaultWarehouseOverride = defaultWarehouseOverride;
    return this;
  }

  public DefaultWarehouseOverride getDefaultWarehouseOverride() {
    return defaultWarehouseOverride;
  }

  public UpdateDefaultWarehouseOverrideRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDefaultWarehouseOverrideRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDefaultWarehouseOverrideRequest that = (UpdateDefaultWarehouseOverrideRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(defaultWarehouseOverride, that.defaultWarehouseOverride)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, defaultWarehouseOverride, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDefaultWarehouseOverrideRequest.class)
        .add("allowMissing", allowMissing)
        .add("defaultWarehouseOverride", defaultWarehouseOverride)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
