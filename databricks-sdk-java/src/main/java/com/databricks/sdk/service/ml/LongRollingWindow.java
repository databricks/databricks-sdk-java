// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/**
 * A long (multi-day) rolling window served via the hybrid batch + streaming path. The batch
 * pipeline maintains daily partial aggregates for the bulk of the window while the streaming
 * pipeline maintains the most recent day(s), and serving merges them on read. Distinct from
 * RollingWindow so the control plane can explicitly identify long rolling window features rather
 * than inferring hybrid behavior from window_duration.
 */
@Generated
public class LongRollingWindow {
  /**
   * The delay applied to the end of the rolling window (must be non-negative). For example,
   * delay=1d shifts the window end 1 day before the evaluation time.
   */
  @JsonProperty("delay")
  private Duration delay;

  /**
   * The duration of the rolling window. Must be positive and span more than two days, so that both
   * the batch (N-1 day) and stale-path (N-2 day) partial aggregates are well defined. The duration
   * need not be a whole number of days (e.g. 3 days 15 minutes is allowed).
   */
  @JsonProperty("window_duration")
  private Duration windowDuration;

  public LongRollingWindow setDelay(Duration delay) {
    this.delay = delay;
    return this;
  }

  public Duration getDelay() {
    return delay;
  }

  public LongRollingWindow setWindowDuration(Duration windowDuration) {
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
    LongRollingWindow that = (LongRollingWindow) o;
    return Objects.equals(delay, that.delay) && Objects.equals(windowDuration, that.windowDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, windowDuration);
  }

  @Override
  public String toString() {
    return new ToStringer(LongRollingWindow.class)
        .add("delay", delay)
        .add("windowDuration", windowDuration)
        .toString();
  }
}
