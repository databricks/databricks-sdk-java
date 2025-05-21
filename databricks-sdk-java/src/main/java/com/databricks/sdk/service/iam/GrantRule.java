// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GrantRule {
  /**
   * Principals this grant rule applies to. A principal can be a user (for end users), a service
   * principal (for applications and compute workloads), or an account group. Each principal has its
   * own identifier format: * users/<USERNAME> * groups/<GROUP_NAME> *
   * servicePrincipals/<SERVICE_PRINCIPAL_APPLICATION_ID>
   */
  @JsonProperty("principals")
  private Collection<String> principals;

  /** Role that is assigned to the list of principals. */
  @JsonProperty("role")
  private String role;

  public GrantRule setPrincipals(Collection<String> principals) {
    this.principals = principals;
    return this;
  }

  public Collection<String> getPrincipals() {
    return principals;
  }

  public GrantRule setRole(String role) {
    this.role = role;
    return this;
  }

  public String getRole() {
    return role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GrantRule that = (GrantRule) o;
    return Objects.equals(principals, that.principals) && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principals, role);
  }

  @Override
  public String toString() {
    return new ToStringer(GrantRule.class)
        .add("principals", principals)
        .add("role", role)
        .toString();
  }
}
