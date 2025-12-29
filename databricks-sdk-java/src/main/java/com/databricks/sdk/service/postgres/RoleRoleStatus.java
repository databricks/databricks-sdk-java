// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RoleRoleStatus {
  /** */
  @JsonProperty("auth_method")
  private RoleAuthMethod authMethod;

  /** The type of the role. */
  @JsonProperty("identity_type")
  private RoleIdentityType identityType;

  public RoleRoleStatus setAuthMethod(RoleAuthMethod authMethod) {
    this.authMethod = authMethod;
    return this;
  }

  public RoleAuthMethod getAuthMethod() {
    return authMethod;
  }

  public RoleRoleStatus setIdentityType(RoleIdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

  public RoleIdentityType getIdentityType() {
    return identityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoleRoleStatus that = (RoleRoleStatus) o;
    return Objects.equals(authMethod, that.authMethod)
        && Objects.equals(identityType, that.identityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethod, identityType);
  }

  @Override
  public String toString() {
    return new ToStringer(RoleRoleStatus.class)
        .add("authMethod", authMethod)
        .add("identityType", identityType)
        .toString();
  }
}
