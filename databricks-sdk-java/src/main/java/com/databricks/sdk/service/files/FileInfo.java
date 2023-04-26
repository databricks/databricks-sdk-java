// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FileInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>fileSize</code>.</p>
   *
   * @param fileSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.FileInfo} object
   */
  public FileInfo setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>fileSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getFileSize() {
    return fileSize;
  }

  /**
   * <p>Setter for the field <code>isDir</code>.</p>
   *
   * @param isDir a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.files.FileInfo} object
   */
  public FileInfo setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDir</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDir() {
    return isDir;
  }

  /**
   * <p>Setter for the field <code>modificationTime</code>.</p>
   *
   * @param modificationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.FileInfo} object
   */
  public FileInfo setModificationTime(Long modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>modificationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getModificationTime() {
    return modificationTime;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.FileInfo} object
   */
  public FileInfo setPath(String path) {
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
    FileInfo that = (FileInfo) o;
    return Objects.equals(fileSize, that.fileSize)
        && Objects.equals(isDir, that.isDir)
        && Objects.equals(modificationTime, that.modificationTime)
        && Objects.equals(path, that.path);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, modificationTime, path);
  }

  /** {@inheritDoc} */
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
