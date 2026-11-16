// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A workspace location that holds pipeline tests. */
@Generated
public class PipelineTestSource {
  /** An absolute workspace path to a test file, or to a folder followed by `/**`. */
  @JsonProperty("glob")
  private PathPattern glob;

  public PipelineTestSource setGlob(PathPattern glob) {
    this.glob = glob;
    return this;
  }

  public PathPattern getGlob() {
    return glob;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTestSource that = (PipelineTestSource) o;
    return Objects.equals(glob, that.glob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(glob);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTestSource.class).add("glob", glob).toString();
  }
}
