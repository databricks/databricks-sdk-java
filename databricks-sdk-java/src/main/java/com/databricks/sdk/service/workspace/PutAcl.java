// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PutAcl class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PutAcl {
  /** The permission level applied to the principal. */
  @JsonProperty("permission")
  private AclPermission permission;

  /** The principal in which the permission is applied. */
  @JsonProperty("principal")
  private String principal;

  /** The name of the scope to apply permissions to. */
  @JsonProperty("scope")
  private String scope;

  /**
   * <p>Setter for the field <code>permission</code>.</p>
   *
   * @param permission a {@link com.databricks.sdk.service.workspace.AclPermission} object
   * @return a {@link com.databricks.sdk.service.workspace.PutAcl} object
   */
  public PutAcl setPermission(AclPermission permission) {
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
   * @return a {@link com.databricks.sdk.service.workspace.PutAcl} object
   */
  public PutAcl setPrincipal(String principal) {
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

  /**
   * <p>Setter for the field <code>scope</code>.</p>
   *
   * @param scope a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.PutAcl} object
   */
  public PutAcl setScope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>Getter for the field <code>scope</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScope() {
    return scope;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PutAcl that = (PutAcl) o;
    return Objects.equals(permission, that.permission)
        && Objects.equals(principal, that.principal)
        && Objects.equals(scope, that.scope);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permission, principal, scope);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PutAcl.class)
        .add("permission", permission)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }
}
