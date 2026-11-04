// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Time-range configuration for a batch detection rule. */
@Generated
public class RuleTimeRange {
  /**
   * Extends the start of the execution time range by a compact duration with integer days, hours,
   * minutes, and seconds in that order, such as `1h30m` or `15m`. Zero duration disables extension.
   * Unset or empty uses a fixed `15m` at execution time. Only the start moves; the end is
   * unchanged. Has no effect on batch SQL that does not use `IN_TIMERANGE`. Values must fit signed
   * 64-bit microseconds.
   */
  @JsonProperty("extend_lookback")
  private String extendLookback;

  public RuleTimeRange setExtendLookback(String extendLookback) {
    this.extendLookback = extendLookback;
    return this;
  }

  public String getExtendLookback() {
    return extendLookback;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleTimeRange that = (RuleTimeRange) o;
    return Objects.equals(extendLookback, that.extendLookback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendLookback);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleTimeRange.class).add("extendLookback", extendLookback).toString();
  }
}
