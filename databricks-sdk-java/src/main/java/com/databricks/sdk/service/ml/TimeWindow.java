// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class TimeWindow {
  /** */
  @JsonProperty("rolling")
  private RollingWindow rolling;

  /** A sawtooth window served via the hybrid batch + streaming path. */
  @JsonProperty("sawtooth")
  private SawtoothWindow sawtooth;

  /** */
  @JsonProperty("sliding")
  private SlidingWindow sliding;

  /**
   * Earliest event-time boundary at which the Feature may emit an output. This gates outputs, not
   * the historical inputs read by a window. For example, a 365-day window with
   * start_time=2026-01-01 begins emitting partial-window values on that date instead of waiting for
   * 365 days of data; a lifetime window produces no output before start_time. If unset, tumbling
   * and fixed-duration sliding windows first emit at an offset-aligned boundary after a full window
   * can be formed. If unset, lifetime sliding windows and rolling windows emit as soon as eligible
   * source data exists.
   */
  @JsonProperty("start_time")
  private Timestamp startTime;

  /** */
  @JsonProperty("tumbling")
  private TumblingWindow tumbling;

  public TimeWindow setRolling(RollingWindow rolling) {
    this.rolling = rolling;
    return this;
  }

  public RollingWindow getRolling() {
    return rolling;
  }

  public TimeWindow setSawtooth(SawtoothWindow sawtooth) {
    this.sawtooth = sawtooth;
    return this;
  }

  public SawtoothWindow getSawtooth() {
    return sawtooth;
  }

  public TimeWindow setSliding(SlidingWindow sliding) {
    this.sliding = sliding;
    return this;
  }

  public SlidingWindow getSliding() {
    return sliding;
  }

  public TimeWindow setStartTime(Timestamp startTime) {
    this.startTime = startTime;
    return this;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  public TimeWindow setTumbling(TumblingWindow tumbling) {
    this.tumbling = tumbling;
    return this;
  }

  public TumblingWindow getTumbling() {
    return tumbling;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeWindow that = (TimeWindow) o;
    return Objects.equals(rolling, that.rolling)
        && Objects.equals(sawtooth, that.sawtooth)
        && Objects.equals(sliding, that.sliding)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(tumbling, that.tumbling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rolling, sawtooth, sliding, startTime, tumbling);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeWindow.class)
        .add("rolling", rolling)
        .add("sawtooth", sawtooth)
        .add("sliding", sliding)
        .add("startTime", startTime)
        .add("tumbling", tumbling)
        .toString();
  }
}
