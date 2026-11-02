// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration for the baking window (post-execution production monitoring). */
@Generated
public class BakingConfig {
  /**
   * Number of successful production runs required before the migration reaches MIGRATION_COMPLETE.
   * Default applied by the server (configurable).
   */
  @JsonProperty("run_count")
  private Long runCount;

  /**
   * Maximum baking window duration in hours. If the required run_count has not been reached within
   * this window, the migration transitions to FAILED. Default applied by the server (configurable).
   */
  @JsonProperty("time_window_hours")
  private Long timeWindowHours;

  public BakingConfig setRunCount(Long runCount) {
    this.runCount = runCount;
    return this;
  }

  public Long getRunCount() {
    return runCount;
  }

  public BakingConfig setTimeWindowHours(Long timeWindowHours) {
    this.timeWindowHours = timeWindowHours;
    return this;
  }

  public Long getTimeWindowHours() {
    return timeWindowHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BakingConfig that = (BakingConfig) o;
    return Objects.equals(runCount, that.runCount)
        && Objects.equals(timeWindowHours, that.timeWindowHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runCount, timeWindowHours);
  }

  @Override
  public String toString() {
    return new ToStringer(BakingConfig.class)
        .add("runCount", runCount)
        .add("timeWindowHours", timeWindowHours)
        .toString();
  }
}
