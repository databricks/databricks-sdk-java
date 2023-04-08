// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Delete {
  /** The absolute path of the notebook or directory. */
  @JsonProperty("path")
  private String path;

  /**
   * The flag that specifies whether to delete the object recursively. It is `false` by default.
   * Please note this deleting directory is not atomic. If it fails in the middle, some of objects
   * under this directory may be deleted and cannot be undone.
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
