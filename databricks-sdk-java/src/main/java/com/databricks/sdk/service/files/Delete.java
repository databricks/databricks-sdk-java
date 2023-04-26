// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Delete class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Delete {
  /** The path of the file or directory to delete. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  /**
   * Whether or not to recursively delete the directory's contents. Deleting empty directories can
   * be done without providing the recursive flag.
   */
  @JsonProperty("recursive")
  private Boolean recursive;

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.Delete} object
   */
  public Delete setPath(String path) {
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

  /**
   * <p>Setter for the field <code>recursive</code>.</p>
   *
   * @param recursive a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.files.Delete} object
   */
  public Delete setRecursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

  /**
   * <p>Getter for the field <code>recursive</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getRecursive() {
    return recursive;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Delete that = (Delete) o;
    return Objects.equals(path, that.path) && Objects.equals(recursive, that.recursive);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(path, recursive);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Delete.class).add("path", path).add("recursive", recursive).toString();
  }
}
