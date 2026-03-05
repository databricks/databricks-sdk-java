// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EndpointGroupStatus {
  /**
   * Whether read-only connections to read-write endpoints are allowed. Only relevant if read
   * replicas are configured by specifying size.max > 1.
   */
  @JsonProperty("enable_readable_secondaries")
  private Boolean enableReadableSecondaries;

  /**
   * The maximum number of computes in the endpoint group. Currently, this must be equal to min. Set
   * to 1 for single compute endpoints, to disable HA. To manually suspend all computes in an
   * endpoint group, set disabled to true on the EndpointSpec.
   */
  @JsonProperty("max")
  private Long max;

  /**
   * The minimum number of computes in the endpoint group. Currently, this must be equal to max.
   * This must be greater than or equal to 1.
   */
  @JsonProperty("min")
  private Long min;

  public EndpointGroupStatus setEnableReadableSecondaries(Boolean enableReadableSecondaries) {
    this.enableReadableSecondaries = enableReadableSecondaries;
    return this;
  }

  public Boolean getEnableReadableSecondaries() {
    return enableReadableSecondaries;
  }

  public EndpointGroupStatus setMax(Long max) {
    this.max = max;
    return this;
  }

  public Long getMax() {
    return max;
  }

  public EndpointGroupStatus setMin(Long min) {
    this.min = min;
    return this;
  }

  public Long getMin() {
    return min;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointGroupStatus that = (EndpointGroupStatus) o;
    return Objects.equals(enableReadableSecondaries, that.enableReadableSecondaries)
        && Objects.equals(max, that.max)
        && Objects.equals(min, that.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableReadableSecondaries, max, min);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointGroupStatus.class)
        .add("enableReadableSecondaries", enableReadableSecondaries)
        .add("max", max)
        .add("min", min)
        .toString();
  }
}
