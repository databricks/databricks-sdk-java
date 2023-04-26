// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TimeRange class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TimeRange {
  /** Limit results to queries that started before this time. */
  @JsonProperty("end_time_ms")
  private Long endTimeMs;

  /** Limit results to queries that started after this time. */
  @JsonProperty("start_time_ms")
  private Long startTimeMs;

  /**
   * <p>Setter for the field <code>endTimeMs</code>.</p>
   *
   * @param endTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.TimeRange} object
   */
  public TimeRange setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTimeMs() {
    return endTimeMs;
  }

  /**
   * <p>Setter for the field <code>startTimeMs</code>.</p>
   *
   * @param startTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.TimeRange} object
   */
  public TimeRange setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTimeMs() {
    return startTimeMs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeRange that = (TimeRange) o;
    return Objects.equals(endTimeMs, that.endTimeMs)
        && Objects.equals(startTimeMs, that.startTimeMs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(endTimeMs, startTimeMs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TimeRange.class)
        .add("endTimeMs", endTimeMs)
        .add("startTimeMs", startTimeMs)
        .toString();
  }
}
