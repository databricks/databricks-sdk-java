// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Role represents a Postgres role within a Branch. */
@Generated
public class Role {
  /** */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Output only. The full resource path of the role. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   */
  @JsonProperty("name")
  private String name;

  /** The Branch where this Role exists. Format: projects/{project_id}/branches/{branch_id} */
  @JsonProperty("parent")
  private String parent;

  /**
   * The spec contains the role configuration, including identity type, authentication method, and
   * role attributes.
   */
  @JsonProperty("spec")
  private RoleRoleSpec spec;

  /**
   * Current status of the role, including its identity type, authentication method, and role
   * attributes.
   */
  @JsonProperty("status")
  private RoleRoleStatus status;

  /** */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Role setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Role setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Role setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public Role setSpec(RoleRoleSpec spec) {
    this.spec = spec;
    return this;
  }

  public RoleRoleSpec getSpec() {
    return spec;
  }

  public Role setStatus(RoleRoleStatus status) {
    this.status = status;
    return this;
  }

  public RoleRoleStatus getStatus() {
    return status;
  }

  public Role setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Role that = (Role) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, parent, spec, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Role.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("parent", parent)
        .add("spec", spec)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
