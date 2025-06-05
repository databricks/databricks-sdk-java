// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List contents */
@Generated
class ListWorkspaceRequestPb {
  @JsonIgnore
  @QueryParam("notebooks_modified_after")
  private Long notebooksModifiedAfter;

  @JsonIgnore
  @QueryParam("path")
  private String path;

  public ListWorkspaceRequestPb setNotebooksModifiedAfter(Long notebooksModifiedAfter) {
    this.notebooksModifiedAfter = notebooksModifiedAfter;
    return this;
  }

  public Long getNotebooksModifiedAfter() {
    return notebooksModifiedAfter;
  }

  public ListWorkspaceRequestPb setPath(String path) {
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
    ListWorkspaceRequestPb that = (ListWorkspaceRequestPb) o;
    return Objects.equals(notebooksModifiedAfter, that.notebooksModifiedAfter)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebooksModifiedAfter, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceRequestPb.class)
        .add("notebooksModifiedAfter", notebooksModifiedAfter)
        .add("path", path)
        .toString();
  }
}
