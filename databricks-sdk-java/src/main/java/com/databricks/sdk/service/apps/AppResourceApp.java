// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceApp {
  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("permission")
  private AppResourceAppAppPermission permission;

  public AppResourceApp setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppResourceApp setPermission(AppResourceAppAppPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceAppAppPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceApp that = (AppResourceApp) o;
    return Objects.equals(name, that.name) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceApp.class)
        .add("name", name)
        .add("permission", permission)
        .toString();
  }
}
