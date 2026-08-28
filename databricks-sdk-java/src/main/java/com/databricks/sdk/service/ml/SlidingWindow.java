// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

@Generated
public class SlidingWindow {
  /**
   * Non-negative analytic lag that evaluates the window this far in the past. Use this for timing
   * variations unrelated to source lateness, such as a 30-day count as of one week ago. If unset,
   * the analytic lag is zero. It composes with source.lateness when both are set.
   */
  @JsonProperty("delay")
  private Duration delay;

  /**
   * Non-negative phase shift from the default midnight UTC alignment. For example, offset=22h on a
   * 24h slide produces boundaries at 22:00 UTC (17:00 New York in standard time) instead of
   * midnight UTC. If unset, the offset is zero. Must be shorter than slide_duration (and therefore
   * window_duration).
   */
  @JsonProperty("offset")
  private Duration offset;

  /**
   * The slide duration (interval by which windows advance, must be positive and less than
   * duration).
   */
  @JsonProperty("slide_duration")
  private String slideDuration;

  /**
   * The duration of the sliding window. Must be positive when set; absent means lifetime (aggregate
   * over the entity's entire history).
   */
  @JsonProperty("window_duration")
  private String windowDuration;

  public SlidingWindow setDelay(Duration delay) {
    this.delay = delay;
    return this;
  }

  public Duration getDelay() {
    return delay;
  }

  public SlidingWindow setOffset(Duration offset) {
    this.offset = offset;
    return this;
  }

  public Duration getOffset() {
    return offset;
  }

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
    return Objects.equals(delay, that.delay)
        && Objects.equals(offset, that.offset)
        && Objects.equals(slideDuration, that.slideDuration)
        && Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, offset, slideDuration, windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(SlidingWindow.class)
        .add("delay", delay)
        .add("offset", offset)
        .add("slideDuration", slideDuration)
        .add("windowDuration", windowDuration)
        .toString();
  }
}
