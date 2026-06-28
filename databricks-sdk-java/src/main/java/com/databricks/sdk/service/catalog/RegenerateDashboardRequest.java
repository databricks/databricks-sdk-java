// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RegenerateDashboardRequest {
  /**
   * UC table name in format `catalog.schema.table_name`. This field corresponds to the
   * {full_table_name_arg} arg in the endpoint path.
   */
  @JsonIgnore private String tableName;

  /**
   * Optional argument to specify the warehouse for dashboard regeneration. If not specified, the
   * first running warehouse will be used.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public RegenerateDashboardRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public RegenerateDashboardRequest setWarehouseId(String warehouseId) {
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
    RegenerateDashboardRequest that = (RegenerateDashboardRequest) o;
    return Objects.equals(tableName, that.tableName)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(RegenerateDashboardRequest.class)
        .add("tableName", tableName)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
