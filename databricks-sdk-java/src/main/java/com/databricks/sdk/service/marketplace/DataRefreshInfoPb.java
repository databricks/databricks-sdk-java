// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DataRefreshInfoPb {
  @JsonProperty("interval")
  private Long interval;

  @JsonProperty("unit")
  private DataRefresh unit;

  public DataRefreshInfoPb setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  public DataRefreshInfoPb setUnit(DataRefresh unit) {
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
    DataRefreshInfoPb that = (DataRefreshInfoPb) o;
    return Objects.equals(interval, that.interval) && Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, unit);
  }

  @Override
  public String toString() {
    return new ToStringer(DataRefreshInfoPb.class)
        .add("interval", interval)
        .add("unit", unit)
        .toString();
  }
}
