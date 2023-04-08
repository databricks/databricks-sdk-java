// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class FileInfo {
  /** The length of the file in bytes or zero if the path is a directory. */
  @JsonProperty("file_size")
  private Long fileSize;

  /** True if the path is a directory. */
  @JsonProperty("is_dir")
  private Boolean isDir;

  /** Last modification time of given file/dir in milliseconds since Epoch. */
  @JsonProperty("modification_time")
  private Long modificationTime;

  /** The path of the file or directory. */
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

  public FileInfo setModificationTime(Long modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }

  public Long getModificationTime() {
    return modificationTime;
  }

  public FileInfo setPath(String path) {
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
    FileInfo that = (FileInfo) o;
    return Objects.equals(fileSize, that.fileSize)
        && Objects.equals(isDir, that.isDir)
        && Objects.equals(modificationTime, that.modificationTime)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, modificationTime, path);
  }

  @Override
  public String toString() {
    return new ToStringer(FileInfo.class)
        .add("fileSize", fileSize)
        .add("isDir", isDir)
        .add("modificationTime", modificationTime)
        .add("path", path)
        .toString();
  }
}
