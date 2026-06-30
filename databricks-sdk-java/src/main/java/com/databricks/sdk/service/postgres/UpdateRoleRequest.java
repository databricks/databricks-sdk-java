// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateRoleRequest {
  /**
   * Output only. The full resource path of the role. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   */
  @JsonIgnore private String name;

  /**
   * The Postgres Role to update.
   *
   * <p>The role's `name` field is used to identify the role to update. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   */
  @JsonProperty("role")
  private Role role;

  /**
   * The list of fields to update in Postgres Role. If unspecified, all fields will be updated when
   * possible.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateRoleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRoleRequest setRole(Role role) {
    this.role = role;
    return this;
  }

  public Role getRole() {
    return role;
  }

  public UpdateRoleRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRoleRequest that = (UpdateRoleRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(role, that.role)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, role, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRoleRequest.class)
        .add("name", name)
        .add("role", role)
        .add("updateMask", updateMask)
        .toString();
  }
}
