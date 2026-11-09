// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Constraints applied to Lakebase instances by a compute policy. */
@Generated
public class LakebaseConstraints {
  /** Maximum capacity units permitted per instance. Absence imposes no limit. */
  @JsonProperty("max_capacity_units_per_instance")
  private Long maxCapacityUnitsPerInstance;

  /** Maximum idle time in minutes before scale-to-zero. Absence imposes no requirement. */
  @JsonProperty("max_idle_minutes_before_scale_to_zero")
  private Long maxIdleMinutesBeforeScaleToZero;

  public LakebaseConstraints setMaxCapacityUnitsPerInstance(Long maxCapacityUnitsPerInstance) {
    this.maxCapacityUnitsPerInstance = maxCapacityUnitsPerInstance;
    return this;
  }

  public Long getMaxCapacityUnitsPerInstance() {
    return maxCapacityUnitsPerInstance;
  }

  public LakebaseConstraints setMaxIdleMinutesBeforeScaleToZero(
      Long maxIdleMinutesBeforeScaleToZero) {
    this.maxIdleMinutesBeforeScaleToZero = maxIdleMinutesBeforeScaleToZero;
    return this;
  }

  public Long getMaxIdleMinutesBeforeScaleToZero() {
    return maxIdleMinutesBeforeScaleToZero;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LakebaseConstraints that = (LakebaseConstraints) o;
    return Objects.equals(maxCapacityUnitsPerInstance, that.maxCapacityUnitsPerInstance)
        && Objects.equals(maxIdleMinutesBeforeScaleToZero, that.maxIdleMinutesBeforeScaleToZero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCapacityUnitsPerInstance, maxIdleMinutesBeforeScaleToZero);
  }

  @Override
  public String toString() {
    return new ToStringer(LakebaseConstraints.class)
        .add("maxCapacityUnitsPerInstance", maxCapacityUnitsPerInstance)
        .add("maxIdleMinutesBeforeScaleToZero", maxIdleMinutesBeforeScaleToZero)
        .toString();
  }
}
