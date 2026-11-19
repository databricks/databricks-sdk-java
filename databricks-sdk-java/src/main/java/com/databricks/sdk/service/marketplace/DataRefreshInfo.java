// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DataRefreshInfo {
  /** Number of time units. Must be greater than zero. */
  @JsonProperty("interval")
  private Long interval;

  /** Time unit that the interval is expressed in. */
  @JsonProperty("unit")
  private DataRefresh unit;

  public DataRefreshInfo setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  public DataRefreshInfo setUnit(DataRefresh unit) {
    this.unit = unit;
    return this;
  }

  public DataRefresh getUnit() {
    return unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataRefreshInfo that = (DataRefreshInfo) o;
    return Objects.equals(interval, that.interval) && Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, unit);
  }

  @Override
  public String toString() {
    return new ToStringer(DataRefreshInfo.class)
        .add("interval", interval)
        .add("unit", unit)
        .toString();
  }
}
