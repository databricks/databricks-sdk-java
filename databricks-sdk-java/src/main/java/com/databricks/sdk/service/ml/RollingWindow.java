// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/**
 * A rolling time window with an optional delay. This is the SQL-spec-aligned replacement for
 * ContinuousWindow: `delay` is the non-negative counterpart of the legacy non-positive
 * `ContinuousWindow.offset`.
 */
@Generated
public class RollingWindow {
  /**
   * The delay applied to the end of the rolling window (must be non-negative). For example,
   * delay=1d shifts the window end 1 day before the evaluation time.
   */
  @JsonProperty("delay")
  private Duration delay;

  /** The duration of the rolling window (must be positive). */
  @JsonProperty("window_duration")
  private Duration windowDuration;

  public RollingWindow setDelay(Duration delay) {
    this.delay = delay;
    return this;
  }

  public Duration getDelay() {
    return delay;
  }

  public RollingWindow setWindowDuration(Duration windowDuration) {
    this.windowDuration = windowDuration;
    return this;
  }

  public Duration getWindowDuration() {
    return windowDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RollingWindow that = (RollingWindow) o;
    return Objects.equals(delay, that.delay) && Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(RollingWindow.class)
        .add("delay", delay)
        .add("windowDuration", windowDuration)
        .toString();
  }
}
