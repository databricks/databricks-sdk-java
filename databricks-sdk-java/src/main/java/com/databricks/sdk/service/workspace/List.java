// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.annotation.QueryParam;

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
}
