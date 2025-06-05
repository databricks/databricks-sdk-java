// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AppResourceServingEndpointPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("permission")
  private AppResourceServingEndpointServingEndpointPermission permission;

  public AppResourceServingEndpointPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppResourceServingEndpointPb setPermission(
      AppResourceServingEndpointServingEndpointPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceServingEndpointServingEndpointPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceServingEndpointPb that = (AppResourceServingEndpointPb) o;
    return Objects.equals(name, that.name) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceServingEndpointPb.class)
        .add("name", name)
        .add("permission", permission)
        .toString();
  }
}
