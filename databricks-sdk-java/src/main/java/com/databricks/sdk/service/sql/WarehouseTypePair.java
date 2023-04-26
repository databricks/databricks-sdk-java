// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WarehouseTypePair class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>enabled</code>.</p>
   *
   * @param enabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.WarehouseTypePair} object
   */
  public WarehouseTypePair setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>enabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * <p>Setter for the field <code>warehouseType</code>.</p>
   *
   * @param warehouseType a {@link com.databricks.sdk.service.sql.WarehouseType} object
   * @return a {@link com.databricks.sdk.service.sql.WarehouseTypePair} object
   */
  public WarehouseTypePair setWarehouseType(WarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.WarehouseType} object
   */
  public WarehouseType getWarehouseType() {
    return warehouseType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WarehouseTypePair that = (WarehouseTypePair) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(warehouseType, that.warehouseType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(enabled, warehouseType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WarehouseTypePair.class)
        .add("enabled", enabled)
        .add("warehouseType", warehouseType)
        .toString();
  }
}
