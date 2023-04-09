// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CronSchedule {
  /** Indicate whether this schedule is paused or not. */
  @JsonProperty("pause_status")
  private CronSchedulePauseStatus pauseStatus;

  /**
   * A Cron expression using Quartz syntax that describes the schedule for a job. See [Cron Trigger]
   * for details. This field is required."
   *
   * <p>[Cron Trigger]:
   * http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
   */
  @JsonProperty("quartz_cron_expression")
  private String quartzCronExpression;

  /**
   * A Java timezone ID. The schedule for a job is resolved with respect to this timezone. See [Java
   * TimeZone] for details. This field is required.
   *
   * <p>[Java TimeZone]: https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html
   */
  @JsonProperty("timezone_id")
  private String timezoneId;

  public CronSchedule setPauseStatus(CronSchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public CronSchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public CronSchedule setQuartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
    return this;
  }

  public String getQuartzCronExpression() {
    return quartzCronExpression;
  }

  public CronSchedule setTimezoneId(String timezoneId) {
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
    CronSchedule that = (CronSchedule) o;
    return Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(quartzCronExpression, that.quartzCronExpression)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pauseStatus, quartzCronExpression, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("pauseStatus", pauseStatus)
        .add("quartzCronExpression", quartzCronExpression)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
