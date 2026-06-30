// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of workspace IDs that are bound to the securable */
@Generated
public class UpdateWorkspaceBindingsResponse {
  /** List of workspace bindings. */
  @JsonProperty("bindings")
  private Collection<WorkspaceBinding> bindings;

  public UpdateWorkspaceBindingsResponse setBindings(Collection<WorkspaceBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Collection<WorkspaceBinding> getBindings() {
    return bindings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBindingsResponse that = (UpdateWorkspaceBindingsResponse) o;
    return Objects.equals(bindings, that.bindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBindingsResponse.class)
        .add("bindings", bindings)
        .toString();
  }
}
