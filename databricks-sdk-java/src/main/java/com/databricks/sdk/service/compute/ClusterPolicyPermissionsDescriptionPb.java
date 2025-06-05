// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClusterPolicyPermissionsDescriptionPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("permission_level")
  private ClusterPolicyPermissionLevel permissionLevel;

  public ClusterPolicyPermissionsDescriptionPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ClusterPolicyPermissionsDescriptionPb setPermissionLevel(
      ClusterPolicyPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ClusterPolicyPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPolicyPermissionsDescriptionPb that = (ClusterPolicyPermissionsDescriptionPb) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPolicyPermissionsDescriptionPb.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
