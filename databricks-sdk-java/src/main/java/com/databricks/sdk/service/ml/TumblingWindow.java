// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TumblingWindow {
  /** The duration of each tumbling window (non-overlapping, fixed-duration windows). */
  @JsonProperty("window_duration")
  private String windowDuration;

  public TumblingWindow setWindowDuration(String windowDuration) {
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
    TumblingWindow that = (TumblingWindow) o;
    return Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(TumblingWindow.class).add("windowDuration", windowDuration).toString();
  }
}
