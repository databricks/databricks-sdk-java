// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class WorkspaceObjectPermissionPb {
  @JsonProperty("inherited")
  private Boolean inherited;

  @JsonProperty("inherited_from_object")
  private Collection<String> inheritedFromObject;

  @JsonProperty("permission_level")
  private WorkspaceObjectPermissionLevel permissionLevel;

  public WorkspaceObjectPermissionPb setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public WorkspaceObjectPermissionPb setInheritedFromObject(
      Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public WorkspaceObjectPermissionPb setPermissionLevel(
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
    WorkspaceObjectPermissionPb that = (WorkspaceObjectPermissionPb) o;
    return Objects.equals(inherited, that.inherited)
        && Objects.equals(inheritedFromObject, that.inheritedFromObject)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, inheritedFromObject, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissionPb.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
