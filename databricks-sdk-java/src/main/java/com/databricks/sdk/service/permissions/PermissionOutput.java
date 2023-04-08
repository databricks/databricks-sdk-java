// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
