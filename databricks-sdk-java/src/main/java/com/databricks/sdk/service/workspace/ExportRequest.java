// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ExportRequest {
  /**
   * This specifies the format of the exported file. By default, this is `SOURCE`.
   *
   * <p>The value is case sensitive.
   *
   * <p>- `SOURCE`: The notebook is exported as source code. Directory exports will not include
   * non-notebook entries. - `HTML`: The notebook is exported as an HTML file. - `JUPYTER`: The
   * notebook is exported as a Jupyter/IPython Notebook file. - `DBC`: The notebook is exported in
   * Databricks archive format. Directory exports will not include non-notebook entries. -
   * `R_MARKDOWN`: The notebook is exported to R Markdown format. - `AUTO`: The object or directory
   * is exported depending on the objects type. Directory exports will include notebooks and
   * workspace files.
   */
  @JsonIgnore
  @QueryParam("format")
  private ExportFormat format;

  /**
   * The absolute path of the object or directory. Exporting a directory is only supported for the
   * `DBC`, `SOURCE`, and `AUTO` format.
   */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  public ExportRequest setFormat(ExportFormat format) {
    this.format = format;
    return this;
  }

  public ExportFormat getFormat() {
    return format;
  }

  public ExportRequest setPath(String path) {
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
    ExportRequest that = (ExportRequest) o;
    return Objects.equals(format, that.format) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRequest.class).add("format", format).add("path", path).toString();
  }
}
