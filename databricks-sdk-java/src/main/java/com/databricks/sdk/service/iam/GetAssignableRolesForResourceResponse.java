// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetAssignableRolesForResourceResponse {
  /** */
  @JsonProperty("roles")
  private Collection<String> roles;

  public GetAssignableRolesForResourceResponse setRoles(Collection<String> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<String> getRoles() {
    return roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAssignableRolesForResourceResponse that = (GetAssignableRolesForResourceResponse) o;
    return Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAssignableRolesForResourceResponse.class)
        .add("roles", roles)
        .toString();
  }
}
