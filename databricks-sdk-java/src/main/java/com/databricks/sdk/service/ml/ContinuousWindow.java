// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ContinuousWindow {
  /** The offset of the continuous window (must be non-positive). */
  @JsonProperty("offset")
  private String offset;

  /** The duration of the continuous window (must be positive). */
  @JsonProperty("window_duration")
  private String windowDuration;

  public ContinuousWindow setOffset(String offset) {
    this.offset = offset;
    return this;
  }

  public String getOffset() {
    return offset;
  }

  public ContinuousWindow setWindowDuration(String windowDuration) {
    this.windowDuration = windowDuration;
    return this;
  }

  public String getWindowDuration() {
    return windowDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContinuousWindow that = (ContinuousWindow) o;
    return Objects.equals(offset, that.offset)
        && Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(ContinuousWindow.class)
        .add("offset", offset)
        .add("windowDuration", windowDuration)
        .toString();
  }
}
