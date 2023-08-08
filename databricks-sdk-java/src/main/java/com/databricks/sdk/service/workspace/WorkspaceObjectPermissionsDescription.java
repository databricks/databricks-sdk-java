// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class WorkspaceObjectPermissionsDescription {
  /** */
  @JsonProperty("description")
  private String description;

  /** Permission level */
  @JsonProperty("permission_level")
  private WorkspaceObjectPermissionLevel permissionLevel;

  public WorkspaceObjectPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public WorkspaceObjectPermissionsDescription setPermissionLevel(
      WorkspaceObjectPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public WorkspaceObjectPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceObjectPermissionsDescription that = (WorkspaceObjectPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
