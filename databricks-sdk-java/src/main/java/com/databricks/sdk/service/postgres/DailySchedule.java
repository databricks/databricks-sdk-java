// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Take a snapshot once per day, at the configured hour. */
@Generated
public class DailySchedule {
  /** The hour of the day, in UTC, at which to take the snapshot, in [0, 23]. */
  @JsonProperty("hour")
  private Long hour;

  public DailySchedule setHour(Long hour) {
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
    DailySchedule that = (DailySchedule) o;
    return Objects.equals(hour, that.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour);
  }

  @Override
  public String toString() {
    return new ToStringer(DailySchedule.class).add("hour", hour).toString();
  }
}
