// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetVectorSearchEndpointPermissionLevelsResponse {
  /** Specific permission levels */
  @JsonProperty("permission_levels")
  private Collection<VectorSearchEndpointPermissionsDescription> permissionLevels;

  public GetVectorSearchEndpointPermissionLevelsResponse setPermissionLevels(
      Collection<VectorSearchEndpointPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<VectorSearchEndpointPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetVectorSearchEndpointPermissionLevelsResponse that =
        (GetVectorSearchEndpointPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetVectorSearchEndpointPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }
}
