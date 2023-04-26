// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CronTrigger class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CronTrigger {
  /** */
  @JsonProperty("quartz_cron_schedule")
  private String quartzCronSchedule;

  /** */
  @JsonProperty("timezone_id")
  private String timezoneId;

  /**
   * <p>Setter for the field <code>quartzCronSchedule</code>.</p>
   *
   * @param quartzCronSchedule a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.CronTrigger} object
   */
  public CronTrigger setQuartzCronSchedule(String quartzCronSchedule) {
    this.quartzCronSchedule = quartzCronSchedule;
    return this;
  }

  /**
   * <p>Getter for the field <code>quartzCronSchedule</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQuartzCronSchedule() {
    return quartzCronSchedule;
  }

  /**
   * <p>Setter for the field <code>timezoneId</code>.</p>
   *
   * @param timezoneId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.CronTrigger} object
   */
  public CronTrigger setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  /**
   * <p>Getter for the field <code>timezoneId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTimezoneId() {
    return timezoneId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CronTrigger that = (CronTrigger) o;
    return Objects.equals(quartzCronSchedule, that.quartzCronSchedule)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(quartzCronSchedule, timezoneId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CronTrigger.class)
        .add("quartzCronSchedule", quartzCronSchedule)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
