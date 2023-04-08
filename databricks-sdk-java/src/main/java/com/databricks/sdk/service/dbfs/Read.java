// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.annotation.QueryParam;

/** Get the contents of a file */
public class Read {
  /**
   * The number of bytes to read starting from the offset. This has a limit of 1 MB, and a default
   * value of 0.5 MB.
   */
  @QueryParam("length")
  private Long length;

  /** The offset to read from in bytes. */
  @QueryParam("offset")
  private Long offset;

  /** The path of the file to read. The path should be the absolute DBFS path. */
  @QueryParam("path")
  private String path;

  public Read setLength(Long length) {
    this.length = length;
    return this;
  }

  public Long getLength() {
    return length;
  }

  public Read setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public Read setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
