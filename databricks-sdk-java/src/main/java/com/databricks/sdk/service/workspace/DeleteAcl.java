// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DeleteAcl class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteAcl {
  /** The principal to remove an existing ACL from. */
  @JsonProperty("principal")
  private String principal;

  /** The name of the scope to remove permissions from. */
  @JsonProperty("scope")
  private String scope;

  /**
   * <p>Setter for the field <code>principal</code>.</p>
   *
   * @param principal a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.DeleteAcl} object
   */
  public DeleteAcl setPrincipal(String principal) {
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
   * @return a {@link com.databricks.sdk.service.workspace.DeleteAcl} object
   */
  public DeleteAcl setScope(String scope) {
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
    DeleteAcl that = (DeleteAcl) o;
    return Objects.equals(principal, that.principal) && Objects.equals(scope, that.scope);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(principal, scope);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteAcl.class)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }
}
