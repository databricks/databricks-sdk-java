// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteWorkspaceAssignmentRequest {
  /**
   * The resource name of the assignment, in the format
   * `accounts/{account_id}/workspaces/{workspace_id}/workspace-assignments/{principal_id}`.
   */
  @JsonIgnore private String name;

  public DeleteWorkspaceAssignmentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteWorkspaceAssignmentRequest that = (DeleteWorkspaceAssignmentRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceAssignmentRequest.class).add("name", name).toString();
  }
}
