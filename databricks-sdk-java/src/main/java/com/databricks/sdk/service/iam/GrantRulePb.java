// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GrantRulePb {
  @JsonProperty("principals")
  private Collection<String> principals;

  @JsonProperty("role")
  private String role;

  public GrantRulePb setPrincipals(Collection<String> principals) {
    this.principals = principals;
    return this;
  }

  public Collection<String> getPrincipals() {
    return principals;
  }

  public GrantRulePb setRole(String role) {
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
    GrantRulePb that = (GrantRulePb) o;
    return Objects.equals(principals, that.principals) && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principals, role);
  }

  @Override
  public String toString() {
    return new ToStringer(GrantRulePb.class)
        .add("principals", principals)
        .add("role", role)
        .toString();
  }
}
