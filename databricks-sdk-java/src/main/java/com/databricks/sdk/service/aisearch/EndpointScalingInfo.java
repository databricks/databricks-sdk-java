// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * Scaling information for a Standard endpoint: the current scaling state, the requested QPS target,
 * and the progress of an in-progress scaling change.
 */
@Generated
public class EndpointScalingInfo {
  /**
   * Reason the in-progress scaling change is delayed. When set, `estimated_completion_time` is
   * unset. Unset when the change is not delayed or no scaling change is in progress.
   */
  @JsonProperty("delayed_reason")
  private EndpointScalingInfoDelayReason delayedReason;

  /**
   * Estimated time at which the in-progress scaling change will complete. The estimate may change
   * as the scaling change progresses. Unset when no scaling change is in progress, when no estimate
   * is available, or when the change is delayed (see `delayed_reason`).
   */
  @JsonProperty("estimated_completion_time")
  private Timestamp estimatedCompletionTime;

  /**
   * Percentage of index initialization completed, from 0 to 100. Set only during the
   * `INITIALIZING_INDEX` phase; unset in other phases or when progress is not available.
   */
  @JsonProperty("index_initialization_percentage")
  private Long indexInitializationPercentage;

  /**
   * Current phase of the in-progress scaling change. Unset when no scaling change is in progress or
   * the phase is not available.
   */
  @JsonProperty("phase")
  private EndpointScalingInfoPhase phase;

  /**
   * The requested QPS target for the endpoint. Best-effort; the system does not guarantee this QPS
   * will be achieved.
   */
  @JsonProperty("requested_target_qps")
  private Long requestedTargetQps;

  /** The current state of the scaling change request. */
  @JsonProperty("state")
  private ScalingChangeState state;

  /**
   * Earliest time a new Target QPS change is accepted. Set only while a scaling change is in
   * progress, the change lock is on, and the endpoint has a recorded last throughput change; may be
   * in the past once the lock has expired.
   */
  @JsonProperty("target_qps_change_allowed_after_time")
  private Timestamp targetQpsChangeAllowedAfterTime;

  public EndpointScalingInfo setDelayedReason(EndpointScalingInfoDelayReason delayedReason) {
    this.delayedReason = delayedReason;
    return this;
  }

  public EndpointScalingInfoDelayReason getDelayedReason() {
    return delayedReason;
  }

  public EndpointScalingInfo setEstimatedCompletionTime(Timestamp estimatedCompletionTime) {
    this.estimatedCompletionTime = estimatedCompletionTime;
    return this;
  }

  public Timestamp getEstimatedCompletionTime() {
    return estimatedCompletionTime;
  }

  public EndpointScalingInfo setIndexInitializationPercentage(Long indexInitializationPercentage) {
    this.indexInitializationPercentage = indexInitializationPercentage;
    return this;
  }

  public Long getIndexInitializationPercentage() {
    return indexInitializationPercentage;
  }

  public EndpointScalingInfo setPhase(EndpointScalingInfoPhase phase) {
    this.phase = phase;
    return this;
  }

  public EndpointScalingInfoPhase getPhase() {
    return phase;
  }

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

  public EndpointScalingInfo setTargetQpsChangeAllowedAfterTime(
      Timestamp targetQpsChangeAllowedAfterTime) {
    this.targetQpsChangeAllowedAfterTime = targetQpsChangeAllowedAfterTime;
    return this;
  }

  public Timestamp getTargetQpsChangeAllowedAfterTime() {
    return targetQpsChangeAllowedAfterTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointScalingInfo that = (EndpointScalingInfo) o;
    return Objects.equals(delayedReason, that.delayedReason)
        && Objects.equals(estimatedCompletionTime, that.estimatedCompletionTime)
        && Objects.equals(indexInitializationPercentage, that.indexInitializationPercentage)
        && Objects.equals(phase, that.phase)
        && Objects.equals(requestedTargetQps, that.requestedTargetQps)
        && Objects.equals(state, that.state)
        && Objects.equals(targetQpsChangeAllowedAfterTime, that.targetQpsChangeAllowedAfterTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        delayedReason,
        estimatedCompletionTime,
        indexInitializationPercentage,
        phase,
        requestedTargetQps,
        state,
        targetQpsChangeAllowedAfterTime);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointScalingInfo.class)
        .add("delayedReason", delayedReason)
        .add("estimatedCompletionTime", estimatedCompletionTime)
        .add("indexInitializationPercentage", indexInitializationPercentage)
        .add("phase", phase)
        .add("requestedTargetQps", requestedTargetQps)
        .add("state", state)
        .add("targetQpsChangeAllowedAfterTime", targetQpsChangeAllowedAfterTime)
        .toString();
  }
}
