// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class WarehouseTypePair {
  /**
   * If set to false the specific warehouse type will not be be allowed as a value for
   * warehouse_type in CreateWarehouse and EditWarehouse
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  /**
   * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute, you must set to
   * `PRO` and also set the field `enable_serverless_compute` to `true`.
   */
  @JsonProperty("warehouse_type")
  private WarehouseType warehouseType;

  public WarehouseTypePair setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public WarehouseTypePair setWarehouseType(WarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public WarehouseType getWarehouseType() {
    return warehouseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WarehouseTypePair that = (WarehouseTypePair) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(warehouseType, that.warehouseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, warehouseType);
  }

  @Override
  public String toString() {
    return new ToStringer(WarehouseTypePair.class)
        .add("enabled", enabled)
        .add("warehouseType", warehouseType)
        .toString();
  }
}
