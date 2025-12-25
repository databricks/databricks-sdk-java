// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RoleRoleSpec {
  /**
   * If auth_method is left unspecified, a meaningful authentication method is derived from the
   * identity_type: * For the managed identities, OAUTH is used. * For the regular postgres roles,
   * authentication based on postgres passwords is used.
   *
   * <p>NOTE: this is ignored for the Databricks identity type GROUP, and NO_LOGIN is implicitly
   * assumed instead for the GROUP identity type.
   */
  @JsonProperty("auth_method")
  private RoleAuthMethod authMethod;

  /** The type of the role. */
  @JsonProperty("identity_type")
  private RoleIdentityType identityType;

  public RoleRoleSpec setAuthMethod(RoleAuthMethod authMethod) {
    this.authMethod = authMethod;
    return this;
  }

  public RoleAuthMethod getAuthMethod() {
    return authMethod;
  }

  public RoleRoleSpec setIdentityType(RoleIdentityType identityType) {
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
    RoleRoleSpec that = (RoleRoleSpec) o;
    return Objects.equals(authMethod, that.authMethod)
        && Objects.equals(identityType, that.identityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethod, identityType);
  }

  @Override
  public String toString() {
    return new ToStringer(RoleRoleSpec.class)
        .add("authMethod", authMethod)
        .add("identityType", identityType)
        .toString();
  }
}
