// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PeriodicTriggerState {
  /** */
  @JsonProperty("next_run_time")
  private Long nextRunTime;

  public PeriodicTriggerState setNextRunTime(Long nextRunTime) {
    this.nextRunTime = nextRunTime;
    return this;
  }

  public Long getNextRunTime() {
    return nextRunTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PeriodicTriggerState that = (PeriodicTriggerState) o;
    return Objects.equals(nextRunTime, that.nextRunTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextRunTime);
  }

  @Override
  public String toString() {
    return new ToStringer(PeriodicTriggerState.class).add("nextRunTime", nextRunTime).toString();
  }
}
