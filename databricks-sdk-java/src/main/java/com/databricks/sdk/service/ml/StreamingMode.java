// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The streaming mode configuration for a streaming materialization pipeline. */
@Generated
public class StreamingMode {
  /** The type of streaming mode used by the materialization pipeline. */
  @JsonProperty("mode")
  private StreamingModeStreamingModeType mode;

  public StreamingMode setMode(StreamingModeStreamingModeType mode) {
    this.mode = mode;
    return this;
  }

  public StreamingModeStreamingModeType getMode() {
    return mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamingMode that = (StreamingMode) o;
    return Objects.equals(mode, that.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamingMode.class).add("mode", mode).toString();
  }
}
