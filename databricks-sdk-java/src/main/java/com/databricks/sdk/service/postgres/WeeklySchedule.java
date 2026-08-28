// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Take a snapshot once per week, on the configured day at the configured hour. */
@Generated
public class WeeklySchedule {
  /** The day of the week on which to take the snapshot. */
  @JsonProperty("day_of_week")
  private DayOfWeek dayOfWeek;

  /** The hour of the day, in UTC, at which to take the snapshot, in [0, 23]. */
  @JsonProperty("hour")
  private Long hour;

  public WeeklySchedule setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public WeeklySchedule setHour(Long hour) {
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
    WeeklySchedule that = (WeeklySchedule) o;
    return Objects.equals(dayOfWeek, that.dayOfWeek) && Objects.equals(hour, that.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, hour);
  }

  @Override
  public String toString() {
    return new ToStringer(WeeklySchedule.class)
        .add("dayOfWeek", dayOfWeek)
        .add("hour", hour)
        .toString();
  }
}
