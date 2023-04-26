// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AclItem class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AclItem {
  /** The permission level applied to the principal. */
  @JsonProperty("permission")
  private AclPermission permission;

  /** The principal in which the permission is applied. */
  @JsonProperty("principal")
  private String principal;

  /**
   * <p>Setter for the field <code>permission</code>.</p>
   *
   * @param permission a {@link com.databricks.sdk.service.workspace.AclPermission} object
   * @return a {@link com.databricks.sdk.service.workspace.AclItem} object
   */
  public AclItem setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  /**
   * <p>Getter for the field <code>permission</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.AclPermission} object
   */
  public AclPermission getPermission() {
    return permission;
  }

  /**
   * <p>Setter for the field <code>principal</code>.</p>
   *
   * @param principal a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.AclItem} object
   */
  public AclItem setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <p>Getter for the field <code>principal</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrincipal() {
    return principal;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AclItem that = (AclItem) o;
    return Objects.equals(permission, that.permission) && Objects.equals(principal, that.principal);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permission, principal);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AclItem.class)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }
}
