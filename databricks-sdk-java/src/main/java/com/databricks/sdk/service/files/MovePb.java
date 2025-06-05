// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MovePb {
  @JsonProperty("destination_path")
  private String destinationPath;

  @JsonProperty("source_path")
  private String sourcePath;

  public MovePb setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
    return this;
  }

  public String getDestinationPath() {
    return destinationPath;
  }

  public MovePb setSourcePath(String sourcePath) {
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
    MovePb that = (MovePb) o;
    return Objects.equals(destinationPath, that.destinationPath)
        && Objects.equals(sourcePath, that.sourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPath, sourcePath);
  }

  @Override
  public String toString() {
    return new ToStringer(MovePb.class)
        .add("destinationPath", destinationPath)
        .add("sourcePath", sourcePath)
        .toString();
  }
}
