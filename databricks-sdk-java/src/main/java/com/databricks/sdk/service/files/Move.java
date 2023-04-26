// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Move class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Move {
  /** The destination path of the file or directory. The path should be the absolute DBFS path. */
  @JsonProperty("destination_path")
  private String destinationPath;

  /** The source path of the file or directory. The path should be the absolute DBFS path. */
  @JsonProperty("source_path")
  private String sourcePath;

  /**
   * <p>Setter for the field <code>destinationPath</code>.</p>
   *
   * @param destinationPath a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.Move} object
   */
  public Move setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
    return this;
  }

  /**
   * <p>Getter for the field <code>destinationPath</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDestinationPath() {
    return destinationPath;
  }

  /**
   * <p>Setter for the field <code>sourcePath</code>.</p>
   *
   * @param sourcePath a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.Move} object
   */
  public Move setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  /**
   * <p>Getter for the field <code>sourcePath</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourcePath() {
    return sourcePath;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Move that = (Move) o;
    return Objects.equals(destinationPath, that.destinationPath)
        && Objects.equals(sourcePath, that.sourcePath);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(destinationPath, sourcePath);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Move.class)
        .add("destinationPath", destinationPath)
        .add("sourcePath", sourcePath)
        .toString();
  }
}
