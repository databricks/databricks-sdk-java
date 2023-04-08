// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileInfo {
  /** Size in bytes. Unset for directories. */
  @JsonProperty("file_size")
  private Long fileSize;

  /** Whether the path is a directory. */
  @JsonProperty("is_dir")
  private Boolean isDir;

  /** Path relative to the root artifact directory run. */
  @JsonProperty("path")
  private String path;

  public FileInfo setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  public FileInfo setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public FileInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
