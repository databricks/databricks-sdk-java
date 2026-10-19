// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Selects a sandbox directory to create and whether to create its parents. */
@Generated
public class CreateDirectoryRequest {
  /** */
  @JsonIgnore private String parent;

  /** Defaults to true, which also succeeds when the directory already exists. */
  @JsonProperty("parents")
  private Boolean parents;

  /** Absolute UTF-8 path of the directory. */
  @JsonProperty("path")
  private String path;

  public CreateDirectoryRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateDirectoryRequest setParents(Boolean parents) {
    this.parents = parents;
    return this;
  }

  public Boolean getParents() {
    return parents;
  }

  public CreateDirectoryRequest setPath(String path) {
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
    CreateDirectoryRequest that = (CreateDirectoryRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(parents, that.parents)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, parents, path);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDirectoryRequest.class)
        .add("parent", parent)
        .add("parents", parents)
        .add("path", path)
        .toString();
  }
}
