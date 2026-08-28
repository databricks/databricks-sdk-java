// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Take a snapshot once per month, on the configured day at the configured hour. */
@Generated
public class MonthlySchedule {
  /**
   * The day of the month on which to take the snapshot, in [1, 31]. In shorter months the snapshot
   * is taken on the last day instead (day 31 runs on Feb 28 or 29, and on Apr 30), so every month
   * gets exactly one snapshot.
   */
  @JsonProperty("day")
  private Long day;

  /** The hour of the day, in UTC, at which to take the snapshot, in [0, 23]. */
  @JsonProperty("hour")
  private Long hour;

  public MonthlySchedule setDay(Long day) {
    this.day = day;
    return this;
  }

  public Long getDay() {
    return day;
  }

  public MonthlySchedule setHour(Long hour) {
    this.hour = hour;
    return this;
  }

  public Long getHour() {
    return hour;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonthlySchedule that = (MonthlySchedule) o;
    return Objects.equals(day, that.day) && Objects.equals(hour, that.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour);
  }

  @Override
  public String toString() {
    return new ToStringer(MonthlySchedule.class).add("day", day).add("hour", hour).toString();
  }
}
