// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Policy for auto full refresh. */
@Generated
public class AutoFullRefreshPolicy {
  /** (Required, Mutable) Whether to enable auto full refresh or not. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /**
   * (Optional, Mutable) Specify the minimum interval in hours between the timestamp at which a
   * table was last full refreshed and the current timestamp for triggering auto full If unspecified
   * and autoFullRefresh is enabled then by default min_interval_hours is 24 hours.
   */
  @JsonProperty("min_interval_hours")
  private Long minIntervalHours;

  public AutoFullRefreshPolicy setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public AutoFullRefreshPolicy setMinIntervalHours(Long minIntervalHours) {
    this.minIntervalHours = minIntervalHours;
    return this;
  }

  public Long getMinIntervalHours() {
    return minIntervalHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoFullRefreshPolicy that = (AutoFullRefreshPolicy) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(minIntervalHours, that.minIntervalHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minIntervalHours);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoFullRefreshPolicy.class)
        .add("enabled", enabled)
        .add("minIntervalHours", minIntervalHours)
        .toString();
  }
}
