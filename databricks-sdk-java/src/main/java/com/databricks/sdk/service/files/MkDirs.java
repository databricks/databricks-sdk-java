// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>MkDirs class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class MkDirs {
  /** The path of the new directory. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.MkDirs} object
   */
  public MkDirs setPath(String path) {
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
    MkDirs that = (MkDirs) o;
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
    return new ToStringer(MkDirs.class).add("path", path).toString();
  }
}
