// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetPermissionLevelsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPermissionLevelsResponse {
  /** Specific permission levels */
  @JsonProperty("permission_levels")
  private Collection<PermissionsDescription> permissionLevels;

  /**
   * <p>Setter for the field <code>permissionLevels</code>.</p>
   *
   * @param permissionLevels a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.GetPermissionLevelsResponse} object
   */
  public GetPermissionLevelsResponse setPermissionLevels(
      Collection<PermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionLevels</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionLevelsResponse that = (GetPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }
}
