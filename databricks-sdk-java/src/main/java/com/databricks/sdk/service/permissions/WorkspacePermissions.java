// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkspacePermissions {
  /** Array of permissions defined for a workspace. */
  @JsonProperty("permissions")
  private java.util.List<PermissionOutput> permissions;

  public WorkspacePermissions setPermissions(java.util.List<PermissionOutput> permissions) {
    this.permissions = permissions;
    return this;
  }

  public java.util.List<PermissionOutput> getPermissions() {
    return permissions;
  }
}
