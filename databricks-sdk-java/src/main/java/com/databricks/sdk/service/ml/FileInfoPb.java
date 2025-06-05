// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata of a single artifact file or directory. */
@Generated
class FileInfoPb {
  @JsonProperty("file_size")
  private Long fileSize;

  @JsonProperty("is_dir")
  private Boolean isDir;

  @JsonProperty("path")
  private String path;

  public FileInfoPb setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  public FileInfoPb setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public FileInfoPb setPath(String path) {
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
    FileInfoPb that = (FileInfoPb) o;
    return Objects.equals(fileSize, that.fileSize)
        && Objects.equals(isDir, that.isDir)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, path);
  }

  @Override
  public String toString() {
    return new ToStringer(FileInfoPb.class)
        .add("fileSize", fileSize)
        .add("isDir", isDir)
        .add("path", path)
        .toString();
  }
}
