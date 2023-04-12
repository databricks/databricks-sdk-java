// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CronTrigger {
  /** */
  @JsonProperty("quartz_cron_schedule")
  private String quartzCronSchedule;

  /** */
  @JsonProperty("timezone_id")
  private String timezoneId;

  public CronTrigger setQuartzCronSchedule(String quartzCronSchedule) {
    this.quartzCronSchedule = quartzCronSchedule;
    return this;
  }

  public String getQuartzCronSchedule() {
    return quartzCronSchedule;
  }

  public CronTrigger setTimezoneId(String timezoneId) {
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
    CronTrigger that = (CronTrigger) o;
    return Objects.equals(quartzCronSchedule, that.quartzCronSchedule)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quartzCronSchedule, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronTrigger.class)
        .add("quartzCronSchedule", quartzCronSchedule)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
