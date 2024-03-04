// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PermissionMigrationResponse {
  /** Number of permissions migrated. */
  @JsonProperty("permissions_migrated")
  private Long permissionsMigrated;

  public PermissionMigrationResponse setPermissionsMigrated(Long permissionsMigrated) {
    this.permissionsMigrated = permissionsMigrated;
    return this;
  }

  public Long getPermissionsMigrated() {
    return permissionsMigrated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionMigrationResponse that = (PermissionMigrationResponse) o;
    return Objects.equals(permissionsMigrated, that.permissionsMigrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsMigrated);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionMigrationResponse.class)
        .add("permissionsMigrated", permissionsMigrated)
        .toString();
  }
}
