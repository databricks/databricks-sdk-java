// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SlidingWindow {
  /**
   * The slide duration (interval by which windows advance, must be positive and less than
   * duration).
   */
  @JsonProperty("slide_duration")
  private String slideDuration;

  /** The duration of the sliding window. */
  @JsonProperty("window_duration")
  private String windowDuration;

  public SlidingWindow setSlideDuration(String slideDuration) {
    this.slideDuration = slideDuration;
    return this;
  }

  public String getSlideDuration() {
    return slideDuration;
  }

  public SlidingWindow setWindowDuration(String windowDuration) {
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
    SlidingWindow that = (SlidingWindow) o;
    return Objects.equals(slideDuration, that.slideDuration)
        && Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slideDuration, windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(SlidingWindow.class)
        .add("slideDuration", slideDuration)
        .add("windowDuration", windowDuration)
        .toString();
  }
}
