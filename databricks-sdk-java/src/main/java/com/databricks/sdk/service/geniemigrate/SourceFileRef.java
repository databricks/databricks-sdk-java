// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A reference to a source file in the workspace. Set `workspace.path` or `workspace.object_id`. For
 * example, `{"workspace": {"path": "/Workspace/Shared/migration/source.sql"}}`.
 */
@Generated
public class SourceFileRef {
  /**
   * The location of the asset that this file was derived from, if any. Used only by
   * `AddProjectFiles`, and can't be changed after the file is added.
   */
  @JsonProperty("derived_from")
  private Location derivedFrom;

  /** The source file in the workspace. Must identify an existing file the caller can read. */
  @JsonProperty("workspace")
  private WorkspaceLocation workspace;

  public SourceFileRef setDerivedFrom(Location derivedFrom) {
    this.derivedFrom = derivedFrom;
    return this;
  }

  public Location getDerivedFrom() {
    return derivedFrom;
  }

  public SourceFileRef setWorkspace(WorkspaceLocation workspace) {
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
    SourceFileRef that = (SourceFileRef) o;
    return Objects.equals(derivedFrom, that.derivedFrom)
        && Objects.equals(workspace, that.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(derivedFrom, workspace);
  }

  @Override
  public String toString() {
    return new ToStringer(SourceFileRef.class)
        .add("derivedFrom", derivedFrom)
        .add("workspace", workspace)
        .toString();
  }
}
