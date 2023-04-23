// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PermissionOutput {
  /** The results of a permissions query. */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("permission_level")
  private WorkspacePermission permissionLevel;

  public PermissionOutput setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PermissionOutput setPermissionLevel(WorkspacePermission permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public WorkspacePermission getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionOutput that = (PermissionOutput) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionOutput.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
