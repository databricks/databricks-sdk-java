// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetClusterPolicyPermissionLevelsResponsePb {
  @JsonProperty("permission_levels")
  private Collection<ClusterPolicyPermissionsDescription> permissionLevels;

  public GetClusterPolicyPermissionLevelsResponsePb setPermissionLevels(
      Collection<ClusterPolicyPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<ClusterPolicyPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetClusterPolicyPermissionLevelsResponsePb that =
        (GetClusterPolicyPermissionLevelsResponsePb) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyPermissionLevelsResponsePb.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }
}
