// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DirectoryEntry {
  /** The length of the file in bytes. This field is omitted for directories. */
  @JsonProperty("file_size")
  private Long fileSize;

  /** True if the path is a directory. */
  @JsonProperty("is_directory")
  private Boolean isDirectory;

  /** Last modification time of given file in milliseconds since unix epoch. */
  @JsonProperty("last_modified")
  private Long lastModified;

  /** The name of the file or directory. This is the last component of the path. */
  @JsonProperty("name")
  private String name;

  /** The absolute path of the file or directory. */
  @JsonProperty("path")
  private String path;

  public DirectoryEntry setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  public DirectoryEntry setIsDirectory(Boolean isDirectory) {
    this.isDirectory = isDirectory;
    return this;
  }

  public Boolean getIsDirectory() {
    return isDirectory;
  }

  public DirectoryEntry setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public Long getLastModified() {
    return lastModified;
  }

  public DirectoryEntry setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DirectoryEntry setPath(String path) {
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
    DirectoryEntry that = (DirectoryEntry) o;
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
    return new ToStringer(DirectoryEntry.class)
        .add("fileSize", fileSize)
        .add("isDirectory", isDirectory)
        .add("lastModified", lastModified)
        .add("name", name)
        .add("path", path)
        .toString();
  }
}
