// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A recurring weekly time window during which platform-initiated maintenance is allowed to run for
 * a continuous job.
 */
@Generated
public class MaintenanceWindow {
  /** The day of week on which maintenance is allowed to happen. This field is required. */
  @JsonProperty("day_of_week")
  private DayOfWeek dayOfWeek;

  /**
   * An integer between 0 and 23 denoting the start hour for the maintenance window in the 24-hour
   * day. Platform-initiated maintenance is triggered only within a one-hour window starting at this
   * hour. This field is required.
   */
  @JsonProperty("start_hour")
  private Long startHour;

  /**
   * A Java timezone ID. The maintenance window is resolved with respect to this timezone. See [Java
   * TimeZone] for details. This field is required.
   *
   * <p>[Java TimeZone]: https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html
   */
  @JsonProperty("timezone_id")
  private String timezoneId;

  public MaintenanceWindow setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public MaintenanceWindow setStartHour(Long startHour) {
    this.startHour = startHour;
    return this;
  }

  public Long getStartHour() {
    return startHour;
  }

  public MaintenanceWindow setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  public String getTimezoneId() {
    return timezoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaintenanceWindow that = (MaintenanceWindow) o;
    return Objects.equals(dayOfWeek, that.dayOfWeek)
        && Objects.equals(startHour, that.startHour)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, startHour, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(MaintenanceWindow.class)
        .add("dayOfWeek", dayOfWeek)
        .add("startHour", startHour)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
