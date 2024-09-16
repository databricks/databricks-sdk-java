// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List directory contents or file details */
@Generated
public class ListDbfsRequest {
  /** The path of the file or directory. The path should be the absolute DBFS path. */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  public ListDbfsRequest setPath(String path) {
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
    ListDbfsRequest that = (ListDbfsRequest) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDbfsRequest.class).add("path", path).toString();
  }
}
