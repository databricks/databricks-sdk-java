// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateWorkspaceBindings {
  /** A list of workspace IDs. */
  @JsonProperty("assign_workspaces")
  private Collection<Long> assignWorkspaces;

  /** The name of the catalog. */
  private String name;

  /** A list of workspace IDs. */
  @JsonProperty("unassign_workspaces")
  private Collection<Long> unassignWorkspaces;

  public UpdateWorkspaceBindings setAssignWorkspaces(Collection<Long> assignWorkspaces) {
    this.assignWorkspaces = assignWorkspaces;
    return this;
  }

  public Collection<Long> getAssignWorkspaces() {
    return assignWorkspaces;
  }

  public UpdateWorkspaceBindings setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateWorkspaceBindings setUnassignWorkspaces(Collection<Long> unassignWorkspaces) {
    this.unassignWorkspaces = unassignWorkspaces;
    return this;
  }

  public Collection<Long> getUnassignWorkspaces() {
    return unassignWorkspaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBindings that = (UpdateWorkspaceBindings) o;
    return Objects.equals(assignWorkspaces, that.assignWorkspaces)
        && Objects.equals(name, that.name)
        && Objects.equals(unassignWorkspaces, that.unassignWorkspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignWorkspaces, name, unassignWorkspaces);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBindings.class)
        .add("assignWorkspaces", assignWorkspaces)
        .add("name", name)
        .add("unassignWorkspaces", unassignWorkspaces)
        .toString();
  }
}
