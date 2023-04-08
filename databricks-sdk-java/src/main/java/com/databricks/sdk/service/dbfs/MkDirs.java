// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MkDirs {
  /** The path of the new directory. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  public MkDirs setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
