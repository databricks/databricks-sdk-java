// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RoleRoleStatus {
  /** The PG role attributes associated with the role. */
  @JsonProperty("attributes")
  private RoleAttributes attributes;

  /** */
  @JsonProperty("auth_method")
  private RoleAuthMethod authMethod;

  /** The type of the role. */
  @JsonProperty("identity_type")
  private RoleIdentityType identityType;

  /** An enum value for a standard role that this role is a member of. */
  @JsonProperty("membership_roles")
  private Collection<RoleMembershipRole> membershipRoles;

  /** The name of the Postgres role. */
  @JsonProperty("postgres_role")
  private String postgresRole;

  /**
   * The short identifier of the role, suitable for showing to the users. For a role with name
   * `projects/my-project/branches/my-branch/roles/my-role`, the role_id is `my-role`.
   *
   * <p>Use this field when building UI components that display roles to users (e.g., a drop-down
   * selector). Prefer showing `role_id` instead of the full resource name from `Role.name`, which
   * follows the `projects/{project_id}/branches/{branch_id}/roles/{role_id}` format and is not
   * user-friendly.
   */
  @JsonProperty("role_id")
  private String roleId;

  public RoleRoleStatus setAttributes(RoleAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public RoleAttributes getAttributes() {
    return attributes;
  }

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

  public RoleRoleStatus setMembershipRoles(Collection<RoleMembershipRole> membershipRoles) {
    this.membershipRoles = membershipRoles;
    return this;
  }

  public Collection<RoleMembershipRole> getMembershipRoles() {
    return membershipRoles;
  }

  public RoleRoleStatus setPostgresRole(String postgresRole) {
    this.postgresRole = postgresRole;
    return this;
  }

  public String getPostgresRole() {
    return postgresRole;
  }

  public RoleRoleStatus setRoleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  public String getRoleId() {
    return roleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoleRoleStatus that = (RoleRoleStatus) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(authMethod, that.authMethod)
        && Objects.equals(identityType, that.identityType)
        && Objects.equals(membershipRoles, that.membershipRoles)
        && Objects.equals(postgresRole, that.postgresRole)
        && Objects.equals(roleId, that.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes, authMethod, identityType, membershipRoles, postgresRole, roleId);
  }

  @Override
  public String toString() {
    return new ToStringer(RoleRoleStatus.class)
        .add("attributes", attributes)
        .add("authMethod", authMethod)
        .add("identityType", identityType)
        .add("membershipRoles", membershipRoles)
        .add("postgresRole", postgresRole)
        .add("roleId", roleId)
        .toString();
  }
}
