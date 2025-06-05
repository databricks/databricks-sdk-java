// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get SQL warehouse permission levels */
@Generated
class GetWarehousePermissionLevelsRequestPb {
  @JsonIgnore private String warehouseId;

  public GetWarehousePermissionLevelsRequestPb setWarehouseId(String warehouseId) {
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
    GetWarehousePermissionLevelsRequestPb that = (GetWarehousePermissionLevelsRequestPb) o;
    return Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWarehousePermissionLevelsRequestPb.class)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
