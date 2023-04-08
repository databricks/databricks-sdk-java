// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
