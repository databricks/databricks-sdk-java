// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AppResourceJobPb {
  @JsonProperty("id")
  private String id;

  @JsonProperty("permission")
  private AppResourceJobJobPermission permission;

  public AppResourceJobPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AppResourceJobPb setPermission(AppResourceJobJobPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceJobJobPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceJobPb that = (AppResourceJobPb) o;
    return Objects.equals(id, that.id) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceJobPb.class)
        .add("id", id)
        .add("permission", permission)
        .toString();
  }
}
