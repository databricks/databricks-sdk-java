// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Move {
  /** The destination path of the file or directory. The path should be the absolute DBFS path. */
  @JsonProperty("destination_path")
  private String destinationPath;

  /** The source path of the file or directory. The path should be the absolute DBFS path. */
  @JsonProperty("source_path")
  private String sourcePath;

  public Move setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
    return this;
  }

  public String getDestinationPath() {
    return destinationPath;
  }

  public Move setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  public String getSourcePath() {
    return sourcePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Move that = (Move) o;
    return Objects.equals(destinationPath, that.destinationPath)
        && Objects.equals(sourcePath, that.sourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPath, sourcePath);
  }

  @Override
  public String toString() {
    return new ToStringer(Move.class)
        .add("destinationPath", destinationPath)
        .add("sourcePath", sourcePath)
        .toString();
  }
}
