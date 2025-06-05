// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateWorkspaceBindingsPb {
  @JsonProperty("assign_workspaces")
  private Collection<Long> assignWorkspaces;

  @JsonIgnore private String name;

  @JsonProperty("unassign_workspaces")
  private Collection<Long> unassignWorkspaces;

  public UpdateWorkspaceBindingsPb setAssignWorkspaces(Collection<Long> assignWorkspaces) {
    this.assignWorkspaces = assignWorkspaces;
    return this;
  }

  public Collection<Long> getAssignWorkspaces() {
    return assignWorkspaces;
  }

  public UpdateWorkspaceBindingsPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateWorkspaceBindingsPb setUnassignWorkspaces(Collection<Long> unassignWorkspaces) {
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
    UpdateWorkspaceBindingsPb that = (UpdateWorkspaceBindingsPb) o;
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
    return new ToStringer(UpdateWorkspaceBindingsPb.class)
        .add("assignWorkspaces", assignWorkspaces)
        .add("name", name)
        .add("unassignWorkspaces", unassignWorkspaces)
        .toString();
  }
}
