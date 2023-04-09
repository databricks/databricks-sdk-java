// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class EffectivePrivilegeAssignment {
  /** The principal (user email address or group name). */
  @JsonProperty("principal")
  private String principal;

  /** The privileges conveyed to the principal (either directly or via inheritance). */
  @JsonProperty("privileges")
  private Collection<EffectivePrivilege> privileges;

  public EffectivePrivilegeAssignment setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public EffectivePrivilegeAssignment setPrivileges(Collection<EffectivePrivilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Collection<EffectivePrivilege> getPrivileges() {
    return privileges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePrivilegeAssignment that = (EffectivePrivilegeAssignment) o;
    return Objects.equals(principal, that.principal) && Objects.equals(privileges, that.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, privileges);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilegeAssignment.class)
        .add("principal", principal)
        .add("privileges", privileges)
        .toString();
  }
}
