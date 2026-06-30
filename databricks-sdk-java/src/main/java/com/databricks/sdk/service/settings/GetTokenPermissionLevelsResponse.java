// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetTokenPermissionLevelsResponse {
  /** Specific permission levels */
  @JsonProperty("permission_levels")
  private Collection<TokenPermissionsDescription> permissionLevels;

  public GetTokenPermissionLevelsResponse setPermissionLevels(
      Collection<TokenPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<TokenPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTokenPermissionLevelsResponse that = (GetTokenPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTokenPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }
}
