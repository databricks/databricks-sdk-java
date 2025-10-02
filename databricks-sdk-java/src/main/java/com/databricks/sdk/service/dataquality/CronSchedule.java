// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The data quality monitoring workflow cron schedule. */
@Generated
public class CronSchedule {
  /** Read only field that indicates whether the schedule is paused or not. */
  @JsonProperty("pause_status")
  private CronSchedulePauseStatus pauseStatus;

  /**
   * The expression that determines when to run the monitor. See [examples].
   *
   * <p>[examples]:
   * https://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
   */
  @JsonProperty("quartz_cron_expression")
  private String quartzCronExpression;

  /**
   * A Java timezone id. The schedule for a job will be resolved with respect to this timezone. See
   * `Java TimeZone <http://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html>`_ for
   * details. The timezone id (e.g., ``America/Los_Angeles``) in which to evaluate the quartz
   * expression.
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
