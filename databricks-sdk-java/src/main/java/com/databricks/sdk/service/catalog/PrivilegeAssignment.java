// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PrivilegeAssignment {
  /**
   * The principal (user email address or group name). For deleted principals, `principal` is empty
   * while `principal_id` is populated.
   */
  @JsonProperty("principal")
  private String principal;

  /**
   * Unique identifier of the principal. For active principals, both `principal` and `principal_id`
   * are present.
   */
  @JsonProperty("principal_id")
  private Long principalId;

  /** The privileges assigned to the principal. */
  @JsonProperty("privileges")
  private Collection<Privilege> privileges;

  public PrivilegeAssignment setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PrivilegeAssignment setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public PrivilegeAssignment setPrivileges(Collection<Privilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Collection<Privilege> getPrivileges() {
    return privileges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivilegeAssignment that = (PrivilegeAssignment) o;
    return Objects.equals(principal, that.principal)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(privileges, that.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, principalId, privileges);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivilegeAssignment.class)
        .add("principal", principal)
        .add("principalId", principalId)
        .add("privileges", privileges)
        .toString();
  }
}
