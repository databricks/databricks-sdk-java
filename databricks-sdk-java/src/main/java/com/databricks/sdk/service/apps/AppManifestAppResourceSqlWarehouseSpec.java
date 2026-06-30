// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppManifestAppResourceSqlWarehouseSpec {
  /**
   * Permission to grant on the SQL warehouse. Supported permissions are: "CAN_MANAGE", "CAN_USE",
   * "IS_OWNER".
   */
  @JsonProperty("permission")
  private AppManifestAppResourceSqlWarehouseSpecSqlWarehousePermission permission;

  public AppManifestAppResourceSqlWarehouseSpec setPermission(
      AppManifestAppResourceSqlWarehouseSpecSqlWarehousePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppManifestAppResourceSqlWarehouseSpecSqlWarehousePermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceSqlWarehouseSpec that = (AppManifestAppResourceSqlWarehouseSpec) o;
    return Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceSqlWarehouseSpec.class)
        .add("permission", permission)
        .toString();
  }
}
