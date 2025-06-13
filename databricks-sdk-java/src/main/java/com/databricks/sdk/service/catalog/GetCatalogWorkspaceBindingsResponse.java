// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetCatalogWorkspaceBindingsResponse {
  /** A list of workspace IDs */
  @JsonProperty("workspaces")
  private Collection<Long> workspaces;

  public GetCatalogWorkspaceBindingsResponse setWorkspaces(Collection<Long> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  public Collection<Long> getWorkspaces() {
    return workspaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCatalogWorkspaceBindingsResponse that = (GetCatalogWorkspaceBindingsResponse) o;
    return Objects.equals(workspaces, that.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaces);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCatalogWorkspaceBindingsResponse.class)
        .add("workspaces", workspaces)
        .toString();
  }
}
