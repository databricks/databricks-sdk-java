// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** List directory contents or file details */
public class List {
  /** The path of the file or directory. The path should be the absolute DBFS path. */
  @QueryParam("path")
  private String path;

  public List setPath(String path) {
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
    List that = (List) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(List.class).add("path", path).toString();
  }
}
