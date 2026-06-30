// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppManifestAppResourceServingEndpointSpec {
  /**
   * Permission to grant on the serving endpoint. Supported permissions are: "CAN_MANAGE",
   * "CAN_QUERY", "CAN_VIEW".
   */
  @JsonProperty("permission")
  private AppManifestAppResourceServingEndpointSpecServingEndpointPermission permission;

  public AppManifestAppResourceServingEndpointSpec setPermission(
      AppManifestAppResourceServingEndpointSpecServingEndpointPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppManifestAppResourceServingEndpointSpecServingEndpointPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceServingEndpointSpec that = (AppManifestAppResourceServingEndpointSpec) o;
    return Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceServingEndpointSpec.class)
        .add("permission", permission)
        .toString();
  }
}
