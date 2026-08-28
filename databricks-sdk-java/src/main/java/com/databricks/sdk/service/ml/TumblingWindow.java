// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

@Generated
public class TumblingWindow {
  /**
   * Non-negative analytic lag that evaluates the window this far in the past. Use this for timing
   * variations unrelated to source lateness, such as a 30-day count as of one week ago. If unset,
   * the analytic lag is zero. It composes with source.lateness when both are set.
   */
  @JsonProperty("delay")
  private Duration delay;

  /**
   * Non-negative phase shift from the default midnight UTC alignment. For example, offset=22h on a
   * 24h window produces boundaries at 22:00 UTC (17:00 New York in standard time) instead of
   * midnight UTC. If unset, the offset is zero. Must be shorter than window_duration.
   */
  @JsonProperty("offset")
  private Duration offset;

  /** The duration of each tumbling window (non-overlapping, fixed-duration windows). */
  @JsonProperty("window_duration")
  private String windowDuration;

  public TumblingWindow setDelay(Duration delay) {
    this.delay = delay;
    return this;
  }

  public Duration getDelay() {
    return delay;
  }

  public TumblingWindow setOffset(Duration offset) {
    this.offset = offset;
    return this;
  }

  public Duration getOffset() {
    return offset;
  }

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
    return Objects.equals(delay, that.delay)
        && Objects.equals(offset, that.offset)
        && Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, offset, windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(TumblingWindow.class)
        .add("delay", delay)
        .add("offset", offset)
        .add("windowDuration", windowDuration)
        .toString();
  }
}
