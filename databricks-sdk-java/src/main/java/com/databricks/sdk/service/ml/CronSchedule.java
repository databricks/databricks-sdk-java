// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A cron-based schedule trigger for the materialization pipeline. */
@Generated
public class CronSchedule {
  /**
   * The cron expression defining the schedule (e.g., "0 0 * * *" for daily at midnight). The
   * schedule is interpreted in timezone_id (defaults to UTC). Required when mode is MANUAL (or
   * unset). Left empty when mode is DERIVED, where the service computes it (aligned to UTC) from
   * the features' window timing and fills it in on the response.
   */
  @JsonProperty("cron_expression")
  private String cronExpression;

  /** How the schedule is determined. Defaults to MANUAL when unset. */
  @JsonProperty("mode")
  private CronScheduleMode mode;

  /**
   * A Java timezone ID. The schedule is resolved with respect to this timezone. Defaults to UTC
   * when omitted. Can only be configured for MANUAL schedules; DERIVED schedules are always aligned
   * to UTC.
   */
  @JsonProperty("timezone_id")
  private String timezoneId;

  public CronSchedule setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  public String getCronExpression() {
    return cronExpression;
  }

  public CronSchedule setMode(CronScheduleMode mode) {
    this.mode = mode;
    return this;
  }

  public CronScheduleMode getMode() {
    return mode;
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
    return Objects.equals(cronExpression, that.cronExpression)
        && Objects.equals(mode, that.mode)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, mode, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("cronExpression", cronExpression)
        .add("mode", mode)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
