// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EffectivePrivilegeAssignmentPb {
  @JsonProperty("principal")
  private String principal;

  @JsonProperty("privileges")
  private Collection<EffectivePrivilege> privileges;

  public EffectivePrivilegeAssignmentPb setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public EffectivePrivilegeAssignmentPb setPrivileges(Collection<EffectivePrivilege> privileges) {
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
    EffectivePrivilegeAssignmentPb that = (EffectivePrivilegeAssignmentPb) o;
    return Objects.equals(principal, that.principal) && Objects.equals(privileges, that.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, privileges);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilegeAssignmentPb.class)
        .add("principal", principal)
        .add("privileges", privileges)
        .toString();
  }
}
