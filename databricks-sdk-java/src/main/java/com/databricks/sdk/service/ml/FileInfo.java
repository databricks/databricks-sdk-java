// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class FileInfo {
  /**
   * Size in bytes. Unset for directories.
   */
  @JsonProperty("file_size")
  private Long fileSize;
  
  /**
   * Whether the path is a directory.
   */
  @JsonProperty("is_dir")
  private Boolean isDir;
  
  /**
   * Path relative to the root artifact directory run.
   */
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileInfo that = (FileInfo) o;
    return Objects.equals(fileSize, that.fileSize)
    && Objects.equals(isDir, that.isDir)
    && Objects.equals(path, that.path)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, path);
  }

  @Override
  public String toString() {
    return new ToStringer(FileInfo.class)
      .add("fileSize", fileSize)
      .add("isDir", isDir)
      .add("path", path).toString();
  }
}
