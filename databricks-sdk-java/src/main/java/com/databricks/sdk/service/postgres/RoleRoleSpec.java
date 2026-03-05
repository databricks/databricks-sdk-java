// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RoleRoleSpec {
  /** The desired API-exposed Postgres role attribute to associate with the role. Optional. */
  @JsonProperty("attributes")
  private RoleAttributes attributes;

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

  /**
   * The type of role. When specifying a managed-identity, the chosen role_id must be a valid:
   *
   * <p>* application ID for SERVICE_PRINCIPAL * user email for USER * group name for GROUP
   */
  @JsonProperty("identity_type")
  private RoleIdentityType identityType;

  /** An enum value for a standard role that this role is a member of. */
  @JsonProperty("membership_roles")
  private Collection<RoleMembershipRole> membershipRoles;

  /**
   * The name of the Postgres role.
   *
   * <p>This expects a valid Postgres identifier as specified in the link below.
   * https://www.postgresql.org/docs/current/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
   *
   * <p>Required when creating the Role.
   *
   * <p>If you wish to create a Postgres Role backed by a managed Databricks identity, then
   * postgres_role must be one of the following:
   *
   * <p>1. user email for IdentityType.USER 2. app ID for IdentityType.SERVICE_PRINCIPAL 2. group
   * name for IdentityType.GROUP
   */
  @JsonProperty("postgres_role")
  private String postgresRole;

  public RoleRoleSpec setAttributes(RoleAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public RoleAttributes getAttributes() {
    return attributes;
  }

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

  public RoleRoleSpec setMembershipRoles(Collection<RoleMembershipRole> membershipRoles) {
    this.membershipRoles = membershipRoles;
    return this;
  }

  public Collection<RoleMembershipRole> getMembershipRoles() {
    return membershipRoles;
  }

  public RoleRoleSpec setPostgresRole(String postgresRole) {
    this.postgresRole = postgresRole;
    return this;
  }

  public String getPostgresRole() {
    return postgresRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoleRoleSpec that = (RoleRoleSpec) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(authMethod, that.authMethod)
        && Objects.equals(identityType, that.identityType)
        && Objects.equals(membershipRoles, that.membershipRoles)
        && Objects.equals(postgresRole, that.postgresRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, authMethod, identityType, membershipRoles, postgresRole);
  }

  @Override
  public String toString() {
    return new ToStringer(RoleRoleSpec.class)
        .add("attributes", attributes)
        .add("authMethod", authMethod)
        .add("identityType", identityType)
        .add("membershipRoles", membershipRoles)
        .add("postgresRole", postgresRole)
        .toString();
  }
}
