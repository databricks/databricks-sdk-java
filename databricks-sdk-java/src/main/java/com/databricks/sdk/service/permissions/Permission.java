// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class Permission {
  /** */
  @JsonProperty("inherited")
  private Boolean inherited;

  /** */
  @JsonProperty("inherited_from_object")
  private Collection<String> inheritedFromObject;

  /** Permission level */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  public Permission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public Permission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public Permission setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Permission that = (Permission) o;
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
    return new ToStringer(Permission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
