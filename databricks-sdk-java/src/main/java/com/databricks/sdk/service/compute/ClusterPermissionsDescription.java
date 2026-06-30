// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ClusterPermissionsDescription {
  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("permission_level")
  private ClusterPermissionLevel permissionLevel;

  public ClusterPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ClusterPermissionsDescription setPermissionLevel(ClusterPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ClusterPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPermissionsDescription that = (ClusterPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
