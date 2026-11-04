// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Unwraps a JSON array of events into one row per array element. */
@Generated
public class JsonArrayEnvelope {
  /**
   * Name of the root-level key that holds the array of events, for example `Records`. Nested paths
   * are not supported.
   */
  @JsonProperty("path")
  private String path;

  public JsonArrayEnvelope setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JsonArrayEnvelope that = (JsonArrayEnvelope) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(JsonArrayEnvelope.class).add("path", path).toString();
  }
}
