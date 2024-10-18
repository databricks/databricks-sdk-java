// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceSqlWarehouse {
  /** Id of the SQL warehouse to grant permission on. */
  @JsonProperty("id")
  private String id;

  /**
   * Permission to grant on the SQL warehouse. Supported permissions are: "CAN_MANAGE", "CAN_USE",
   * "IS_OWNER".
   */
  @JsonProperty("permission")
  private AppResourceSqlWarehouseSqlWarehousePermission permission;

  public AppResourceSqlWarehouse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AppResourceSqlWarehouse setPermission(
      AppResourceSqlWarehouseSqlWarehousePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceSqlWarehouseSqlWarehousePermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceSqlWarehouse that = (AppResourceSqlWarehouse) o;
    return Objects.equals(id, that.id) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceSqlWarehouse.class)
        .add("id", id)
        .add("permission", permission)
        .toString();
  }
}
