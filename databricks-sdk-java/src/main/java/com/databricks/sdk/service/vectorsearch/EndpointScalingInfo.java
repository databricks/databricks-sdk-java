// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EndpointScalingInfo {
  /**
   * Deprecated: use requested_target_qps. Kept at PUBLIC_BETA with deprecated = true so generated
   * SDK surfaces (Go, Java, TypeScript, Terraform) keep exposing the field with a deprecation
   * marker rather than losing it on next regeneration. Hiding completely (visibility =
   * PUBLIC_UNDOCUMENTED) is a follow-up PR once downstream consumers have migrated.
   */
  @JsonProperty("requested_min_qps")
  private Long requestedMinQps;

  /** The current state of the scaling change request. */
  @JsonProperty("state")
  private ScalingChangeState state;

  public EndpointScalingInfo setRequestedMinQps(Long requestedMinQps) {
    this.requestedMinQps = requestedMinQps;
    return this;
  }

  public Long getRequestedMinQps() {
    return requestedMinQps;
  }

  public EndpointScalingInfo setState(ScalingChangeState state) {
    this.state = state;
    return this;
  }

  public ScalingChangeState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointScalingInfo that = (EndpointScalingInfo) o;
    return Objects.equals(requestedMinQps, that.requestedMinQps)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedMinQps, state);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointScalingInfo.class)
        .add("requestedMinQps", requestedMinQps)
        .add("state", state)
        .toString();
  }
}
