// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class WarehousePermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<WarehouseAccessControlRequest> accessControlList;

  /** The SQL warehouse for which to get or manage permissions. */
  @JsonIgnore private String warehouseId;

  public WarehousePermissionsRequest setAccessControlList(
      Collection<WarehouseAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<WarehouseAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public WarehousePermissionsRequest setWarehouseId(String warehouseId) {
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
    WarehousePermissionsRequest that = (WarehousePermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(WarehousePermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
