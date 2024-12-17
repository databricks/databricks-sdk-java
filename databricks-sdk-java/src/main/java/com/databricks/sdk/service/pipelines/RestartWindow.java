// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RestartWindow {
  /**
   * Days of week in which the restart is allowed to happen (within a five-hour window starting at
   * start_hour). If not specified all days of the week will be used.
   */
  @JsonProperty("days_of_week")
  private Collection<RestartWindowDaysOfWeek> daysOfWeek;

  /**
   * An integer between 0 and 23 denoting the start hour for the restart window in the 24-hour day.
   * Continuous pipeline restart is triggered only within a five-hour window starting at this hour.
   */
  @JsonProperty("start_hour")
  private Long startHour;

  /**
   * Time zone id of restart window. See
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html
   * for details. If not specified, UTC will be used.
   */
  @JsonProperty("time_zone_id")
  private String timeZoneId;

  public RestartWindow setDaysOfWeek(Collection<RestartWindowDaysOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Collection<RestartWindowDaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  public RestartWindow setStartHour(Long startHour) {
    this.startHour = startHour;
    return this;
  }

  public Long getStartHour() {
    return startHour;
  }

  public RestartWindow setTimeZoneId(String timeZoneId) {
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
    RestartWindow that = (RestartWindow) o;
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
    return new ToStringer(RestartWindow.class)
        .add("daysOfWeek", daysOfWeek)
        .add("startHour", startHour)
        .add("timeZoneId", timeZoneId)
        .toString();
  }
}
