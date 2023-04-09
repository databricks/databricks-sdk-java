// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get status */
public class GetStatus {
  /** The absolute path of the notebook or directory. */
  @QueryParam("path")
  private String path;

  public GetStatus setPath(String path) {
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
    GetStatus that = (GetStatus) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatus.class).add("path", path).toString();
  }
}
