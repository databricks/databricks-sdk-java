// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FileInfoPb {
  @JsonProperty("file_size")
  private Long fileSize;

  @JsonProperty("is_dir")
  private Boolean isDir;

  @JsonProperty("modification_time")
  private Long modificationTime;

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

  public FileInfoPb setModificationTime(Long modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }

  public Long getModificationTime() {
    return modificationTime;
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
        && Objects.equals(modificationTime, that.modificationTime)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, modificationTime, path);
  }

  @Override
  public String toString() {
    return new ToStringer(FileInfoPb.class)
        .add("fileSize", fileSize)
        .add("isDir", isDir)
        .add("modificationTime", modificationTime)
        .add("path", path)
        .toString();
  }
}
