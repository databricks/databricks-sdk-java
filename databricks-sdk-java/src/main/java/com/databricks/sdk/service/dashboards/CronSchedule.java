// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CronSchedule {
  /**
   * A cron expression using quartz syntax. EX: `0 0 8 * * ?` represents everyday at 8am. See [Cron
   * Trigger] for details.
   *
   * <p>[Cron Trigger]:
   * http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
   */
  @JsonProperty("quartz_cron_expression")
  private String quartzCronExpression;

  /**
   * A Java timezone id. The schedule will be resolved with respect to this timezone. See [Java
   * TimeZone] for details.
   *
   * <p>[Java TimeZone]: https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html
   */
  @JsonProperty("timezone_id")
  private String timezoneId;

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
    return Objects.equals(quartzCronExpression, that.quartzCronExpression)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quartzCronExpression, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("quartzCronExpression", quartzCronExpression)
        .add("timezoneId", timezoneId)
        .toString();
  }
}
