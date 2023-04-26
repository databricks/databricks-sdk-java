// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Export a workspace object
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExportRequest {
  /**
   * Flag to enable direct download. If it is `true`, the response will be the exported file itself.
   * Otherwise, the response contains content as base64 encoded string.
   */
  @QueryParam("direct_download")
  private Boolean directDownload;

  /**
   * This specifies the format of the exported file. By default, this is `SOURCE`. However it may be
   * one of: `SOURCE`, `HTML`, `JUPYTER`, `DBC`.
   *
   * <p>The value is case sensitive.
   */
  @QueryParam("format")
  private ExportFormat format;

  /**
   * The absolute path of the object or directory. Exporting a directory is only supported for the
   * `DBC` format.
   */
  @QueryParam("path")
  private String path;

  /**
   * <p>Setter for the field <code>directDownload</code>.</p>
   *
   * @param directDownload a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.workspace.ExportRequest} object
   */
  public ExportRequest setDirectDownload(Boolean directDownload) {
    this.directDownload = directDownload;
    return this;
  }

  /**
   * <p>Getter for the field <code>directDownload</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDirectDownload() {
    return directDownload;
  }

  /**
   * <p>Setter for the field <code>format</code>.</p>
   *
   * @param format a {@link com.databricks.sdk.service.workspace.ExportFormat} object
   * @return a {@link com.databricks.sdk.service.workspace.ExportRequest} object
   */
  public ExportRequest setFormat(ExportFormat format) {
    this.format = format;
    return this;
  }

  /**
   * <p>Getter for the field <code>format</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.ExportFormat} object
   */
  public ExportFormat getFormat() {
    return format;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ExportRequest} object
   */
  public ExportRequest setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRequest that = (ExportRequest) o;
    return Objects.equals(directDownload, that.directDownload)
        && Objects.equals(format, that.format)
        && Objects.equals(path, that.path);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(directDownload, format, path);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExportRequest.class)
        .add("directDownload", directDownload)
        .add("format", format)
        .add("path", path)
        .toString();
  }
}
