// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A cron-based schedule trigger for the materialization pipeline. */
@Generated
public class CronSchedule {
  /** The cron expression defining the schedule (e.g., "0 0 * * *" for daily at midnight). */
  @JsonProperty("cron_expression")
  private String cronExpression;

  public CronSchedule setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  public String getCronExpression() {
    return cronExpression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CronSchedule that = (CronSchedule) o;
    return Objects.equals(cronExpression, that.cronExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class).add("cronExpression", cronExpression).toString();
  }
}
