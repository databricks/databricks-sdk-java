// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceGenieSpace {
  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("permission")
  private AppResourceGenieSpaceGenieSpacePermission permission;

  /** */
  @JsonProperty("space_id")
  private String spaceId;

  public AppResourceGenieSpace setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppResourceGenieSpace setPermission(AppResourceGenieSpaceGenieSpacePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceGenieSpaceGenieSpacePermission getPermission() {
    return permission;
  }

  public AppResourceGenieSpace setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceGenieSpace that = (AppResourceGenieSpace) o;
    return Objects.equals(name, that.name)
        && Objects.equals(permission, that.permission)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permission, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceGenieSpace.class)
        .add("name", name)
        .add("permission", permission)
        .add("spaceId", spaceId)
        .toString();
  }
}
