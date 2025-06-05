// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Export a workspace object */
@Generated
class ExportRequestPb {
  @JsonIgnore
  @QueryParam("format")
  private ExportFormat format;

  @JsonIgnore
  @QueryParam("path")
  private String path;

  public ExportRequestPb setFormat(ExportFormat format) {
    this.format = format;
    return this;
  }

  public ExportFormat getFormat() {
    return format;
  }

  public ExportRequestPb setPath(String path) {
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
    ExportRequestPb that = (ExportRequestPb) o;
    return Objects.equals(format, that.format) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRequestPb.class).add("format", format).add("path", path).toString();
  }
}
