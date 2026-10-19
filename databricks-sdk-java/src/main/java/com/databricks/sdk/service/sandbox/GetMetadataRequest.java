// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetMetadataRequest {
  /** */
  @JsonIgnore private String parent;

  /** Absolute UTF-8 path of the entry to inspect. */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  public GetMetadataRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public GetMetadataRequest setPath(String path) {
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
    GetMetadataRequest that = (GetMetadataRequest) o;
    return Objects.equals(parent, that.parent) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, path);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetadataRequest.class)
        .add("parent", parent)
        .add("path", path)
        .toString();
  }
}
