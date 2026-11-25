// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The location of a file or folder. Exactly one location type is set. More location types can be
 * added later, so clients should ignore types they don't recognize.
 */
@Generated
public class Location {
  /** A file or folder in the workspace. */
  @JsonProperty("workspace")
  private WorkspaceLocation workspace;

  public Location setWorkspace(WorkspaceLocation workspace) {
    this.workspace = workspace;
    return this;
  }

  public WorkspaceLocation getWorkspace() {
    return workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Location that = (Location) o;
    return Objects.equals(workspace, that.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspace);
  }

  @Override
  public String toString() {
    return new ToStringer(Location.class).add("workspace", workspace).toString();
  }
}
