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
   * schedule is interpreted in the UTC time zone. Required when mode is MANUAL (or unset). Left
   * empty when mode is DERIVED, where the service computes it (aligned to UTC) from the features'
   * window timing and fills it in on the response.
   */
  @JsonProperty("cron_expression")
  private String cronExpression;

  /** How the schedule is determined. Defaults to MANUAL when unset. */
  @JsonProperty("mode")
  private CronScheduleMode mode;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CronSchedule that = (CronSchedule) o;
    return Objects.equals(cronExpression, that.cronExpression) && Objects.equals(mode, that.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, mode);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("cronExpression", cronExpression)
        .add("mode", mode)
        .toString();
  }
}
