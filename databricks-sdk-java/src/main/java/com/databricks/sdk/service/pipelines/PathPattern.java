// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PathPattern {
  /** The source code to include for pipelines */
  @JsonProperty("include")
  private String include;

  public PathPattern setInclude(String include) {
    this.include = include;
    return this;
  }

  public String getInclude() {
    return include;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PathPattern that = (PathPattern) o;
    return Objects.equals(include, that.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include);
  }

  @Override
  public String toString() {
    return new ToStringer(PathPattern.class).add("include", include).toString();
  }
}
