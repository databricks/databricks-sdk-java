// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Defines when a detection rule executes.
 *
 * <p>A batch rule sets exactly one of `at_least_every` or `cron_expression`. A streaming rule runs
 * continuously and sets no timing; it accepts only `enabled`, and an omitted schedule means
 * enabled. The server rejects any other combination. `enabled` is orthogonal to the timing.
 */
@Generated
public class RuleSchedule {
  /**
   * Defines the minimum cadence as a duration string. It may contain components for days, hours,
   * minutes, and seconds (e.g. `5d`, `5d3h`, `3d2h5m12s`, `12m16s`).
   */
  @JsonProperty("at_least_every")
  private String atLeastEvery;

  /**
   * Runs the rule continuously. Detection rules do not accept it: batch rules reject it, and
   * streaming rules run continuously without it.
   */
  @JsonProperty("continuous")
  private Boolean continuous;

  /** Defines the schedule using a Quartz cron expression. */
  @JsonProperty("cron_expression")
  private String cronExpression;

  /** Sets whether the job is scheduled to run. Defaults to true. */
  @JsonProperty("enabled")
  private Boolean enabled;

  public RuleSchedule setAtLeastEvery(String atLeastEvery) {
    this.atLeastEvery = atLeastEvery;
    return this;
  }

  public String getAtLeastEvery() {
    return atLeastEvery;
  }

  public RuleSchedule setContinuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  public Boolean getContinuous() {
    return continuous;
  }

  public RuleSchedule setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  public String getCronExpression() {
    return cronExpression;
  }

  public RuleSchedule setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleSchedule that = (RuleSchedule) o;
    return Objects.equals(atLeastEvery, that.atLeastEvery)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(cronExpression, that.cronExpression)
        && Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atLeastEvery, continuous, cronExpression, enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleSchedule.class)
        .add("atLeastEvery", atLeastEvery)
        .add("continuous", continuous)
        .add("cronExpression", cronExpression)
        .add("enabled", enabled)
        .toString();
  }
}
