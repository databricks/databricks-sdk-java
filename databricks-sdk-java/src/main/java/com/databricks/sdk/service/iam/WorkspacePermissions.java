// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>WorkspacePermissions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WorkspacePermissions {
  /** Array of permissions defined for a workspace. */
  @JsonProperty("permissions")
  private Collection<PermissionOutput> permissions;

  /**
   * <p>Setter for the field <code>permissions</code>.</p>
   *
   * @param permissions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.WorkspacePermissions} object
   */
  public WorkspacePermissions setPermissions(Collection<PermissionOutput> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PermissionOutput> getPermissions() {
    return permissions;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspacePermissions that = (WorkspacePermissions) o;
    return Objects.equals(permissions, that.permissions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WorkspacePermissions.class).add("permissions", permissions).toString();
  }
}
