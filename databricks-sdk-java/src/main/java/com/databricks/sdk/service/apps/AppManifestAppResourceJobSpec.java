// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppManifestAppResourceJobSpec {
  /**
   * Permissions to grant on the Job. Supported permissions are: "CAN_MANAGE", "IS_OWNER",
   * "CAN_MANAGE_RUN", "CAN_VIEW".
   */
  @JsonProperty("permission")
  private AppManifestAppResourceJobSpecJobPermission permission;

  public AppManifestAppResourceJobSpec setPermission(
      AppManifestAppResourceJobSpecJobPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppManifestAppResourceJobSpecJobPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceJobSpec that = (AppManifestAppResourceJobSpec) o;
    return Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceJobSpec.class)
        .add("permission", permission)
        .toString();
  }
}
