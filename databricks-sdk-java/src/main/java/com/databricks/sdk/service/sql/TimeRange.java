// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TimeRange {
  /** Limit results to queries that started before this time. */
  @JsonProperty("end_time_ms")
  private Long endTimeMs;

  /** Limit results to queries that started after this time. */
  @JsonProperty("start_time_ms")
  private Long startTimeMs;

  public TimeRange setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  public Long getEndTimeMs() {
    return endTimeMs;
  }

  public TimeRange setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeRange that = (TimeRange) o;
    return Objects.equals(endTimeMs, that.endTimeMs)
        && Objects.equals(startTimeMs, that.startTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTimeMs, startTimeMs);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeRange.class)
        .add("endTimeMs", endTimeMs)
        .add("startTimeMs", startTimeMs)
        .toString();
  }
}
