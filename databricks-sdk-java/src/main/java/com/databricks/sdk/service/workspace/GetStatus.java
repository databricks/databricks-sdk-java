// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.annotation.QueryParam;

/** Get status */
public class GetStatus {
  /** The absolute path of the notebook or directory. */
  @QueryParam("path")
  private String path;

  public GetStatus setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
