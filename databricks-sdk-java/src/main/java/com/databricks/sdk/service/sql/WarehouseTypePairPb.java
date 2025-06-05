// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class WarehouseTypePairPb {
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("warehouse_type")
  private WarehouseTypePairWarehouseType warehouseType;

  public WarehouseTypePairPb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public WarehouseTypePairPb setWarehouseType(WarehouseTypePairWarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public WarehouseTypePairWarehouseType getWarehouseType() {
    return warehouseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WarehouseTypePairPb that = (WarehouseTypePairPb) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(warehouseType, that.warehouseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, warehouseType);
  }

  @Override
  public String toString() {
    return new ToStringer(WarehouseTypePairPb.class)
        .add("enabled", enabled)
        .add("warehouseType", warehouseType)
        .toString();
  }
}
