// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MonitorCronSchedule {
  /** Read only field that indicates whether a schedule is paused or not. */
  @JsonProperty("pause_status")
  private MonitorCronSchedulePauseStatus pauseStatus;

  /**
   * The expression that determines when to run the monitor. See [examples].
   *
   * <p>[examples]:
   * https://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
   */
  @JsonProperty("quartz_cron_expression")
  private String quartzCronExpression;

  /** The timezone id (e.g., ``"PST"``) in which to evaluate the quartz expression. */
  @JsonProperty("timezone_id")
  private String timezoneId;

  public MonitorCronSchedule setPauseStatus(MonitorCronSchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public MonitorCronSchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public MonitorCronSchedule setQuartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
    return this;
  }

  public String getQuartzCronExpression() {
    return quartzCronExpression;
  }

  public MonitorCronSchedule setTimezoneId(String timezoneId) {
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
    MonitorCronSchedule that = (MonitorCronSchedule) o;
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
    return new ToStringer(MonitorCronSchedule.class)
        .add("pauseStatus", pauseStatus)
        .add("quartzCronExpression", quartzCronExpression)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
