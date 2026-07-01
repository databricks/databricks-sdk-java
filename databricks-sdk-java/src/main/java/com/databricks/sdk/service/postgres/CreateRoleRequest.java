// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateRoleRequest {
  /** The Branch where this Role is created. Format: projects/{project_id}/branches/{branch_id} */
  @JsonIgnore private String parent;

  /**
   * If true, update the role if it already exists instead of returning an error.
   *
   * <p>When the role already exists, the provided `role` spec fully replaces the existing one:
   * `membership_roles` is overwritten, not merged. Leaving `membership_roles` empty clears all of
   * the role's existing memberships, including `DATABRICKS_SUPERUSER`. Always send the complete
   * desired list of memberships when using this field.
   */
  @JsonIgnore
  @QueryParam("replace_existing")
  private Boolean replaceExisting;

  /** The desired specification of a Role. */
  @JsonProperty("role")
  private Role role;

  /**
   * The ID to use for the Role, which will become the final component of the role's resource name.
   * This ID becomes the role in Postgres.
   *
   * <p>This value should be 4-63 characters, and valid characters are lowercase letters, numbers,
   * and hyphens, as defined by RFC 1123.
   *
   * <p>If role_id is not specified in the request, it is generated automatically.
   */
  @JsonIgnore
  @QueryParam("role_id")
  private String roleId;

  public CreateRoleRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateRoleRequest setReplaceExisting(Boolean replaceExisting) {
    this.replaceExisting = replaceExisting;
    return this;
  }

  public Boolean getReplaceExisting() {
    return replaceExisting;
  }

  public CreateRoleRequest setRole(Role role) {
    this.role = role;
    return this;
  }

  public Role getRole() {
    return role;
  }

  public CreateRoleRequest setRoleId(String roleId) {
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
    CreateRoleRequest that = (CreateRoleRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(replaceExisting, that.replaceExisting)
        && Objects.equals(role, that.role)
        && Objects.equals(roleId, that.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, replaceExisting, role, roleId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRoleRequest.class)
        .add("parent", parent)
        .add("replaceExisting", replaceExisting)
        .add("role", role)
        .add("roleId", roleId)
        .toString();
  }
}
