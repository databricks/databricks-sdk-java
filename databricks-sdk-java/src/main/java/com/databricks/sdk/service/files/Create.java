// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Create class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Create {
  /** The flag that specifies whether to overwrite existing file/files. */
  @JsonProperty("overwrite")
  private Boolean overwrite;

  /** The path of the new file. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  /**
   * <p>Setter for the field <code>overwrite</code>.</p>
   *
   * @param overwrite a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.files.Create} object
   */
  public Create setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  /**
   * <p>Getter for the field <code>overwrite</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getOverwrite() {
    return overwrite;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.Create} object
   */
  public Create setPath(String path) {
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
    Create that = (Create) o;
    return Objects.equals(overwrite, that.overwrite) && Objects.equals(path, that.path);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(overwrite, path);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Create.class).add("overwrite", overwrite).add("path", path).toString();
  }
}
