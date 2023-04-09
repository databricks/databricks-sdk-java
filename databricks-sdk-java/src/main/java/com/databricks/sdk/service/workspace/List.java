// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** List contents */
public class List {
  /** <content needed> */
  @QueryParam("notebooks_modified_after")
  private Long notebooksModifiedAfter;

  /** The absolute path of the notebook or directory. */
  @QueryParam("path")
  private String path;

  public List setNotebooksModifiedAfter(Long notebooksModifiedAfter) {
    this.notebooksModifiedAfter = notebooksModifiedAfter;
    return this;
  }

  public Long getNotebooksModifiedAfter() {
    return notebooksModifiedAfter;
  }

  public List setPath(String path) {
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
    List that = (List) o;
    return Objects.equals(notebooksModifiedAfter, that.notebooksModifiedAfter)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebooksModifiedAfter, path);
  }

  @Override
  public String toString() {
    return new ToStringer(List.class)
        .add("notebooksModifiedAfter", notebooksModifiedAfter)
        .add("path", path)
        .toString();
  }
}
