// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PermissionAssignment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionAssignment {
  /** Error response associated with a workspace permission assignment, if any. */
  @JsonProperty("error")
  private String error;

  /** The permissions level of the principal. */
  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  /** Information about the principal assigned to the workspace. */
  @JsonProperty("principal")
  private PrincipalOutput principal;

  /**
   * <p>Setter for the field <code>error</code>.</p>
   *
   * @param error a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionAssignment} object
   */
  public PermissionAssignment setError(String error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Getter for the field <code>error</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getError() {
    return error;
  }

  /**
   * <p>Setter for the field <code>permissions</code>.</p>
   *
   * @param permissions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionAssignment} object
   */
  public PermissionAssignment setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  /**
   * <p>Setter for the field <code>principal</code>.</p>
   *
   * @param principal a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionAssignment} object
   */
  public PermissionAssignment setPrincipal(PrincipalOutput principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <p>Getter for the field <code>principal</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   */
  public PrincipalOutput getPrincipal() {
    return principal;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionAssignment that = (PermissionAssignment) o;
    return Objects.equals(error, that.error)
        && Objects.equals(permissions, that.permissions)
        && Objects.equals(principal, that.principal);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(error, permissions, principal);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermissionAssignment.class)
        .add("error", error)
        .add("permissions", permissions)
        .add("principal", principal)
        .toString();
  }
}
