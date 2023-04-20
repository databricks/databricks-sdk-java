// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Delete that = (Delete) o;
    return Objects.equals(path, that.path) && Objects.equals(recursive, that.recursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, recursive);
  }

  @Override
  public String toString() {
    return new ToStringer(Delete.class).add("path", path).add("recursive", recursive).toString();
  }
}
