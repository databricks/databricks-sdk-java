// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RestartWindowPb {
  @JsonProperty("days_of_week")
  private Collection<DayOfWeek> daysOfWeek;

  @JsonProperty("start_hour")
  private Long startHour;

  @JsonProperty("time_zone_id")
  private String timeZoneId;

  public RestartWindowPb setDaysOfWeek(Collection<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Collection<DayOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  public RestartWindowPb setStartHour(Long startHour) {
    this.startHour = startHour;
    return this;
  }

  public Long getStartHour() {
    return startHour;
  }

  public RestartWindowPb setTimeZoneId(String timeZoneId) {
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
    RestartWindowPb that = (RestartWindowPb) o;
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
    return new ToStringer(RestartWindowPb.class)
        .add("daysOfWeek", daysOfWeek)
        .add("startHour", startHour)
        .add("timeZoneId", timeZoneId)
        .toString();
  }
}
