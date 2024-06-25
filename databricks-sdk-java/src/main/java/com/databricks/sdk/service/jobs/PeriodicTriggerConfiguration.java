// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PeriodicTriggerConfiguration {
  /** The interval at which the trigger should run. */
  @JsonProperty("interval")
  private Long interval;

  /** The unit of time for the interval. */
  @JsonProperty("unit")
  private PeriodicTriggerConfigurationTimeUnit unit;

  public PeriodicTriggerConfiguration setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  public PeriodicTriggerConfiguration setUnit(PeriodicTriggerConfigurationTimeUnit unit) {
    this.unit = unit;
    return this;
  }

  public PeriodicTriggerConfigurationTimeUnit getUnit() {
    return unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PeriodicTriggerConfiguration that = (PeriodicTriggerConfiguration) o;
    return Objects.equals(interval, that.interval) && Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, unit);
  }

  @Override
  public String toString() {
    return new ToStringer(PeriodicTriggerConfiguration.class)
        .add("interval", interval)
        .add("unit", unit)
        .toString();
  }
}
