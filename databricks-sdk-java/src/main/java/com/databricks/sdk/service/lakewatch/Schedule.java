// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Defines when a recurring job executes.
 *
 * <p>Exactly one of the timing modes (`at_least_every`, `cron_expression`, `continuous`) must be
 * set; combining them or setting none is rejected by the server. `compute_group` and `enabled` are
 * orthogonal to the timing.
 */
@Generated
public class Schedule {
  /**
   * Duration string defining the minimum cadence. May contain components for days, hours, minutes,
   * seconds (e.g. `5d`, `5d3h`, `3d2h5m12s`, `12m16s`).
   */
  @JsonProperty("at_least_every")
  private String atLeastEvery;

  /**
   * `dedicated`, `inherited`, `automatic`, or a custom group name. Reads return the value as
   * supplied. A rule whose schedule omits it runs on `dedicated`.
   */
  @JsonProperty("compute_group")
  private String computeGroup;

  /** Run continuously (sentinel — must be `true` when set in this branch). */
  @JsonProperty("continuous")
  private Boolean continuous;

  /** Quartz cron expression. */
  @JsonProperty("cron_expression")
  private String cronExpression;

  /** Whether the job is scheduled to run. Defaults to true. */
  @JsonProperty("enabled")
  private Boolean enabled;

  public Schedule setAtLeastEvery(String atLeastEvery) {
    this.atLeastEvery = atLeastEvery;
    return this;
  }

  public String getAtLeastEvery() {
    return atLeastEvery;
  }

  public Schedule setComputeGroup(String computeGroup) {
    this.computeGroup = computeGroup;
    return this;
  }

  public String getComputeGroup() {
    return computeGroup;
  }

  public Schedule setContinuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  public Boolean getContinuous() {
    return continuous;
  }

  public Schedule setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  public String getCronExpression() {
    return cronExpression;
  }

  public Schedule setEnabled(Boolean enabled) {
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
    Schedule that = (Schedule) o;
    return Objects.equals(atLeastEvery, that.atLeastEvery)
        && Objects.equals(computeGroup, that.computeGroup)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(cronExpression, that.cronExpression)
        && Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atLeastEvery, computeGroup, continuous, cronExpression, enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(Schedule.class)
        .add("atLeastEvery", atLeastEvery)
        .add("computeGroup", computeGroup)
        .add("continuous", continuous)
        .add("cronExpression", cronExpression)
        .add("enabled", enabled)
        .toString();
  }
}
