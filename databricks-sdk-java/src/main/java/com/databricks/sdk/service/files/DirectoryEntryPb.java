// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DirectoryEntryPb {
  @JsonProperty("file_size")
  private Long fileSize;

  @JsonProperty("is_directory")
  private Boolean isDirectory;

  @JsonProperty("last_modified")
  private Long lastModified;

  @JsonProperty("name")
  private String name;

  @JsonProperty("path")
  private String path;

  public DirectoryEntryPb setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  public DirectoryEntryPb setIsDirectory(Boolean isDirectory) {
    this.isDirectory = isDirectory;
    return this;
  }

  public Boolean getIsDirectory() {
    return isDirectory;
  }

  public DirectoryEntryPb setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public Long getLastModified() {
    return lastModified;
  }

  public DirectoryEntryPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DirectoryEntryPb setPath(String path) {
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
    DirectoryEntryPb that = (DirectoryEntryPb) o;
    return Objects.equals(fileSize, that.fileSize)
        && Objects.equals(isDirectory, that.isDirectory)
        && Objects.equals(lastModified, that.lastModified)
        && Objects.equals(name, that.name)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDirectory, lastModified, name, path);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectoryEntryPb.class)
        .add("fileSize", fileSize)
        .add("isDirectory", isDirectory)
        .add("lastModified", lastModified)
        .add("name", name)
        .add("path", path)
        .toString();
  }
}
