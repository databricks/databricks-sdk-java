// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Selects a sandbox path to delete and whether to delete its contents. */
@Generated
public class DeletePathRequest {
  /** */
  @JsonIgnore private String parent;

  /** Absolute UTF-8 path of the entry to delete. */
  @JsonProperty("path")
  private String path;

  /** Required for a non-empty directory. */
  @JsonProperty("recursive")
  private Boolean recursive;

  public DeletePathRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public DeletePathRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public DeletePathRequest setRecursive(Boolean recursive) {
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
    DeletePathRequest that = (DeletePathRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(path, that.path)
        && Objects.equals(recursive, that.recursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, path, recursive);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePathRequest.class)
        .add("parent", parent)
        .add("path", path)
        .add("recursive", recursive)
        .toString();
  }
}
