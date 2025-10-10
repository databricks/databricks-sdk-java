// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CronSchedule {
  /** The actual pause status of the schedule. This is an output-only field. */
  @JsonProperty("effective_pause_status")
  private SchedulePauseStatus effectivePauseStatus;

  /** Indicate whether this schedule is paused or not. */
  @JsonProperty("pause_status")
  private SchedulePauseStatus pauseStatus;

  /**
   * A cron expression using quartz syntax that specifies the schedule for this pipeline. Should use
   * the quartz format described here:
   * http://www.quartz-scheduler.org/documentation/quartz-2.1.7/tutorials/tutorial-lesson-06.html
   */
  @JsonProperty("quartz_cron_schedule")
  private String quartzCronSchedule;

  /**
   * A Java timezone id. The schedule will be resolved using this timezone. This will be combined
   * with the quartz_cron_schedule to determine the schedule. See
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html
   * for details.
   */
  @JsonProperty("timezone_id")
  private String timezoneId;

  public CronSchedule setEffectivePauseStatus(SchedulePauseStatus effectivePauseStatus) {
    this.effectivePauseStatus = effectivePauseStatus;
    return this;
  }

  public SchedulePauseStatus getEffectivePauseStatus() {
    return effectivePauseStatus;
  }

  public CronSchedule setPauseStatus(SchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public SchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public CronSchedule setQuartzCronSchedule(String quartzCronSchedule) {
    this.quartzCronSchedule = quartzCronSchedule;
    return this;
  }

  public String getQuartzCronSchedule() {
    return quartzCronSchedule;
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
    return Objects.equals(effectivePauseStatus, that.effectivePauseStatus)
        && Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(quartzCronSchedule, that.quartzCronSchedule)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectivePauseStatus, pauseStatus, quartzCronSchedule, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("effectivePauseStatus", effectivePauseStatus)
        .add("pauseStatus", pauseStatus)
        .add("quartzCronSchedule", quartzCronSchedule)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
