// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Proto representing a window */
@Generated
public class OperationTimeWindow {
  /**
   * Days of week in which the window is allowed to happen If not specified all days of the week
   * will be used.
   */
  @JsonProperty("days_of_week")
  private Collection<DayOfWeek> daysOfWeek;

  /** An integer between 0 and 23 denoting the start hour for the window in the 24-hour day. */
  @JsonProperty("start_hour")
  private Long startHour;

  /**
   * Time zone id of window. See
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html
   * for details. If not specified, UTC will be used.
   */
  @JsonProperty("time_zone_id")
  private String timeZoneId;

  public OperationTimeWindow setDaysOfWeek(Collection<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Collection<DayOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  public OperationTimeWindow setStartHour(Long startHour) {
    this.startHour = startHour;
    return this;
  }

  public Long getStartHour() {
    return startHour;
  }

  public OperationTimeWindow setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

  public String getTimeZoneId() {
    return timeZoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OperationTimeWindow that = (OperationTimeWindow) o;
    return Objects.equals(daysOfWeek, that.daysOfWeek)
        && Objects.equals(startHour, that.startHour)
        && Objects.equals(timeZoneId, that.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, startHour, timeZoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(OperationTimeWindow.class)
        .add("daysOfWeek", daysOfWeek)
        .add("startHour", startHour)
        .add("timeZoneId", timeZoneId)
        .toString();
  }
}
