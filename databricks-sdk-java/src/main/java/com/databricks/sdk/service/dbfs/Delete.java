// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Delete {
  /** The path of the file or directory to delete. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  /**
   * Whether or not to recursively delete the directory's contents. Deleting empty directories can
   * be done without providing the recursive flag.
   */
  @JsonProperty("recursive")
  private Boolean recursive;

  public Delete setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public Delete setRecursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

  public Boolean getRecursive() {
    return recursive;
  }
}
