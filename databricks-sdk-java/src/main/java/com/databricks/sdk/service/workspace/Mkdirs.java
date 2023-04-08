// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mkdirs {
  /**
   * The absolute path of the directory. If the parent directories do not exist, it will also create
   * them. If the directory already exists, this command will do nothing and succeed.
   */
  @JsonProperty("path")
  private String path;

  public Mkdirs setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
