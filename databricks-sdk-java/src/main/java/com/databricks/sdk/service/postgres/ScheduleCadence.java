// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/** One cadence at which automatic snapshots are taken. */
@Generated
public class ScheduleCadence {
  /** Take a snapshot once per day. */
  @JsonProperty("daily_schedule")
  private DailySchedule dailySchedule;

  /** Take a snapshot once per month. */
  @JsonProperty("monthly_schedule")
  private MonthlySchedule monthlySchedule;

  /**
   * How long snapshots from this cadence are kept before automatic deletion. Must be at least 1
   * hour. Applied when a snapshot is taken; not retroactive, so changing it affects only later
   * snapshots.
   */
  @JsonProperty("retention")
  private Duration retention;

  /** Take a snapshot once per week. */
  @JsonProperty("weekly_schedule")
  private WeeklySchedule weeklySchedule;

  public ScheduleCadence setDailySchedule(DailySchedule dailySchedule) {
    this.dailySchedule = dailySchedule;
    return this;
  }

  public DailySchedule getDailySchedule() {
    return dailySchedule;
  }

  public ScheduleCadence setMonthlySchedule(MonthlySchedule monthlySchedule) {
    this.monthlySchedule = monthlySchedule;
    return this;
  }

  public MonthlySchedule getMonthlySchedule() {
    return monthlySchedule;
  }

  public ScheduleCadence setRetention(Duration retention) {
    this.retention = retention;
    return this;
  }

  public Duration getRetention() {
    return retention;
  }

  public ScheduleCadence setWeeklySchedule(WeeklySchedule weeklySchedule) {
    this.weeklySchedule = weeklySchedule;
    return this;
  }

  public WeeklySchedule getWeeklySchedule() {
    return weeklySchedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScheduleCadence that = (ScheduleCadence) o;
    return Objects.equals(dailySchedule, that.dailySchedule)
        && Objects.equals(monthlySchedule, that.monthlySchedule)
        && Objects.equals(retention, that.retention)
        && Objects.equals(weeklySchedule, that.weeklySchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailySchedule, monthlySchedule, retention, weeklySchedule);
  }

  @Override
  public String toString() {
    return new ToStringer(ScheduleCadence.class)
        .add("dailySchedule", dailySchedule)
        .add("monthlySchedule", monthlySchedule)
        .add("retention", retention)
        .add("weeklySchedule", weeklySchedule)
        .toString();
  }
}
