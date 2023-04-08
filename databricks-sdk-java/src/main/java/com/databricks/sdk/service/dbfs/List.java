// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.annotation.QueryParam;

/** List directory contents or file details */
public class List {
  /** The path of the file or directory. The path should be the absolute DBFS path. */
  @QueryParam("path")
  private String path;

  public List setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
