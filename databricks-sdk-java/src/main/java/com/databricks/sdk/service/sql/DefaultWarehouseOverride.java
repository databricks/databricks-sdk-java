// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents a per-user default warehouse override configuration. This resource allows users or
 * administrators to customize how a user's default warehouse is selected for SQL operations. If no
 * override exists for a user, the workspace default warehouse will be used.
 */
@Generated
public class DefaultWarehouseOverride {
  /** The ID component of the resource name (user ID). */
  @JsonProperty("default_warehouse_override_id")
  private String defaultWarehouseOverrideId;

  /**
   * The resource name of the default warehouse override. Format:
   * default-warehouse-overrides/{default_warehouse_override_id}
   */
  @JsonProperty("name")
  private String name;

  /** The type of override behavior. */
  @JsonProperty("type")
  private DefaultWarehouseOverrideType typeValue;

  /** The specific warehouse ID when type is CUSTOM. Not set for LAST_SELECTED type. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DefaultWarehouseOverride setDefaultWarehouseOverrideId(String defaultWarehouseOverrideId) {
    this.defaultWarehouseOverrideId = defaultWarehouseOverrideId;
    return this;
  }

  public String getDefaultWarehouseOverrideId() {
    return defaultWarehouseOverrideId;
  }

  public DefaultWarehouseOverride setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DefaultWarehouseOverride setType(DefaultWarehouseOverrideType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public DefaultWarehouseOverrideType getType() {
    return typeValue;
  }

  public DefaultWarehouseOverride setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultWarehouseOverride that = (DefaultWarehouseOverride) o;
    return Objects.equals(defaultWarehouseOverrideId, that.defaultWarehouseOverrideId)
        && Objects.equals(name, that.name)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWarehouseOverrideId, name, typeValue, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultWarehouseOverride.class)
        .add("defaultWarehouseOverrideId", defaultWarehouseOverrideId)
        .add("name", name)
        .add("typeValue", typeValue)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
