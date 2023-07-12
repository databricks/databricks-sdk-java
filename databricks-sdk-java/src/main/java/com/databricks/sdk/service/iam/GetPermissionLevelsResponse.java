// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class GetPermissionLevelsResponse {
  /**
   * Specific permission levels
   */
  @JsonProperty("permission_levels")
  private Collection<PermissionsDescription> permissionLevels;
  
  public GetPermissionLevelsResponse setPermissionLevels(Collection<PermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<PermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionLevelsResponse that = (GetPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPermissionLevelsResponse.class)
      .add("permissionLevels", permissionLevels).toString();
  }
}
