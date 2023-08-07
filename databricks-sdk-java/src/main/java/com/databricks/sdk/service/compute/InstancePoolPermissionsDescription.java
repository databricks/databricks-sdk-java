// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InstancePoolPermissionsDescription {
  /** */
  @JsonProperty("description")
  private String description;

  /** Permission level */
  @JsonProperty("permission_level")
  private InstancePoolPermissionLevel permissionLevel;

  public InstancePoolPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public InstancePoolPermissionsDescription setPermissionLevel(
      InstancePoolPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public InstancePoolPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolPermissionsDescription that = (InstancePoolPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
