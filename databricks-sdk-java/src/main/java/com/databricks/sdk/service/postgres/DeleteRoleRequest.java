// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteRoleRequest {
  /**
   * The full resource path of the role to delete. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   */
  @JsonIgnore private String name;

  /**
   * Reassign objects. If this is set, all objects owned by the role are reassigned to the role
   * specified in this parameter.
   *
   * <p>NOTE: setting this requires spinning up a compute to succeed, since it involves running SQL
   * queries.
   *
   * <p>TODO: #LKB-7187 implement reassign_owned_to on LBM side. This might end-up being a
   * synchronous query when this parameter is used.
   */
  @JsonIgnore
  @QueryParam("reassign_owned_to")
  private String reassignOwnedTo;

  public DeleteRoleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteRoleRequest setReassignOwnedTo(String reassignOwnedTo) {
    this.reassignOwnedTo = reassignOwnedTo;
    return this;
  }

  public String getReassignOwnedTo() {
    return reassignOwnedTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRoleRequest that = (DeleteRoleRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(reassignOwnedTo, that.reassignOwnedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reassignOwnedTo);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRoleRequest.class)
        .add("name", name)
        .add("reassignOwnedTo", reassignOwnedTo)
        .toString();
  }
}
