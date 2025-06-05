// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DeletePb {
  @JsonProperty("path")
  private String path;

  @JsonProperty("recursive")
  private Boolean recursive;

  public DeletePb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public DeletePb setRecursive(Boolean recursive) {
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
    DeletePb that = (DeletePb) o;
    return Objects.equals(path, that.path) && Objects.equals(recursive, that.recursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, recursive);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePb.class).add("path", path).add("recursive", recursive).toString();
  }
}
