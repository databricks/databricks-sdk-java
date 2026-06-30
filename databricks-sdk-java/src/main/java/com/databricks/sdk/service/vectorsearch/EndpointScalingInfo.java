// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EndpointScalingInfo {
  /**
   * The requested QPS target for the endpoint. Best-effort; the system does not guarantee this QPS
   * will be achieved.
   */
  @JsonProperty("requested_target_qps")
  private Long requestedTargetQps;

  /** The current state of the scaling change request. */
  @JsonProperty("state")
  private ScalingChangeState state;

  public EndpointScalingInfo setRequestedTargetQps(Long requestedTargetQps) {
    this.requestedTargetQps = requestedTargetQps;
    return this;
  }

  public Long getRequestedTargetQps() {
    return requestedTargetQps;
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
    return Objects.equals(requestedTargetQps, that.requestedTargetQps)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedTargetQps, state);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointScalingInfo.class)
        .add("requestedTargetQps", requestedTargetQps)
        .add("state", state)
        .toString();
  }
}
