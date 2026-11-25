// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A file or folder in the workspace. On input, set `path` or `object_id`; if both are set,
 * `object_id` is used. Responses set both when known.
 */
@Generated
public class WorkspaceLocation {
  /**
   * The workspace object ID, as returned in `object_id` by the Workspace API. For example, `12345`.
   */
  @JsonProperty("object_id")
  private Long objectId;

  /** The absolute workspace path. For example, `/Workspace/Shared/migration/source.sql`. */
  @JsonProperty("path")
  private String path;

  public WorkspaceLocation setObjectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

  public Long getObjectId() {
    return objectId;
  }

  public WorkspaceLocation setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceLocation that = (WorkspaceLocation) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, path);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceLocation.class)
        .add("objectId", objectId)
        .add("path", path)
        .toString();
  }
}
