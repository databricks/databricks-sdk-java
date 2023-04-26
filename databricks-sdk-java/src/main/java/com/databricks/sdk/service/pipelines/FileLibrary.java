// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FileLibrary class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class FileLibrary {
  /** The absolute path of the file. */
  @JsonProperty("path")
  private String path;

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.FileLibrary} object
   */
  public FileLibrary setPath(String path) {
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
    FileLibrary that = (FileLibrary) o;
    return Objects.equals(path, that.path);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(FileLibrary.class).add("path", path).toString();
  }
}
