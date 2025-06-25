// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetWarehousePermissionLevelsRequest {
  /** The SQL warehouse for which to get or manage permissions. */
  @JsonIgnore private String warehouseId;

  public GetWarehousePermissionLevelsRequest setWarehouseId(String warehouseId) {
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
    GetWarehousePermissionLevelsRequest that = (GetWarehousePermissionLevelsRequest) o;
    return Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWarehousePermissionLevelsRequest.class)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
