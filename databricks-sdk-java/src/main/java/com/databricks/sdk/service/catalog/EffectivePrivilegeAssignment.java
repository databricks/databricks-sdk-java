// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EffectivePrivilegeAssignment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EffectivePrivilegeAssignment {
  /** The principal (user email address or group name). */
  @JsonProperty("principal")
  private String principal;

  /** The privileges conveyed to the principal (either directly or via inheritance). */
  @JsonProperty("privileges")
  private Collection<EffectivePrivilege> privileges;

  /**
   * <p>Setter for the field <code>principal</code>.</p>
   *
   * @param principal a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePrivilegeAssignment} object
   */
  public EffectivePrivilegeAssignment setPrincipal(String principal) {
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
   * <p>Setter for the field <code>privileges</code>.</p>
   *
   * @param privileges a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePrivilegeAssignment} object
   */
  public EffectivePrivilegeAssignment setPrivileges(Collection<EffectivePrivilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  /**
   * <p>Getter for the field <code>privileges</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EffectivePrivilege> getPrivileges() {
    return privileges;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePrivilegeAssignment that = (EffectivePrivilegeAssignment) o;
    return Objects.equals(principal, that.principal) && Objects.equals(privileges, that.privileges);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(principal, privileges);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilegeAssignment.class)
        .add("principal", principal)
        .add("privileges", privileges)
        .toString();
  }
}
