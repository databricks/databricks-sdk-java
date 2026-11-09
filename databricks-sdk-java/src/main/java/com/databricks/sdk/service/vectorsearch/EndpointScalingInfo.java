// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Scaling information for a Standard endpoint: the current scaling state, the requested QPS target,
 * and the progress of an in-progress scaling change.
 */
@Generated
public class EndpointScalingInfo {
  /**
   * Reason the in-progress scaling change is delayed. When set, `estimated_completion_timestamp` is
   * unset. Unset when the change is not delayed or no scaling change is in progress.
   */
  @JsonProperty("delayed_reason")
  private EndpointScalingInfoScalingDelayReason delayedReason;

  /**
   * Estimated time at which the in-progress scaling change will complete, in milliseconds since the
   * Unix epoch. The estimate may change as the scaling change progresses. Unset when no scaling
   * change is in progress, when no estimate is available, or when the change is delayed (see
   * `delayed_reason`).
   */
  @JsonProperty("estimated_completion_timestamp")
  private Long estimatedCompletionTimestamp;

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
  private EndpointScalingInfoScalingPhase phase;

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
   * Earliest time a new Target QPS change is accepted, in milliseconds since the Unix epoch. Set
   * only while a scaling change is in progress, the change lock is on, and the endpoint has a
   * recorded last throughput change; may be in the past once the lock has expired.
   */
  @JsonProperty("target_qps_change_allowed_after_timestamp")
  private Long targetQpsChangeAllowedAfterTimestamp;

  public EndpointScalingInfo setDelayedReason(EndpointScalingInfoScalingDelayReason delayedReason) {
    this.delayedReason = delayedReason;
    return this;
  }

  public EndpointScalingInfoScalingDelayReason getDelayedReason() {
    return delayedReason;
  }

  public EndpointScalingInfo setEstimatedCompletionTimestamp(Long estimatedCompletionTimestamp) {
    this.estimatedCompletionTimestamp = estimatedCompletionTimestamp;
    return this;
  }

  public Long getEstimatedCompletionTimestamp() {
    return estimatedCompletionTimestamp;
  }

  public EndpointScalingInfo setIndexInitializationPercentage(Long indexInitializationPercentage) {
    this.indexInitializationPercentage = indexInitializationPercentage;
    return this;
  }

  public Long getIndexInitializationPercentage() {
    return indexInitializationPercentage;
  }

  public EndpointScalingInfo setPhase(EndpointScalingInfoScalingPhase phase) {
    this.phase = phase;
    return this;
  }

  public EndpointScalingInfoScalingPhase getPhase() {
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

  public EndpointScalingInfo setTargetQpsChangeAllowedAfterTimestamp(
      Long targetQpsChangeAllowedAfterTimestamp) {
    this.targetQpsChangeAllowedAfterTimestamp = targetQpsChangeAllowedAfterTimestamp;
    return this;
  }

  public Long getTargetQpsChangeAllowedAfterTimestamp() {
    return targetQpsChangeAllowedAfterTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointScalingInfo that = (EndpointScalingInfo) o;
    return Objects.equals(delayedReason, that.delayedReason)
        && Objects.equals(estimatedCompletionTimestamp, that.estimatedCompletionTimestamp)
        && Objects.equals(indexInitializationPercentage, that.indexInitializationPercentage)
        && Objects.equals(phase, that.phase)
        && Objects.equals(requestedTargetQps, that.requestedTargetQps)
        && Objects.equals(state, that.state)
        && Objects.equals(
            targetQpsChangeAllowedAfterTimestamp, that.targetQpsChangeAllowedAfterTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        delayedReason,
        estimatedCompletionTimestamp,
        indexInitializationPercentage,
        phase,
        requestedTargetQps,
        state,
        targetQpsChangeAllowedAfterTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointScalingInfo.class)
        .add("delayedReason", delayedReason)
        .add("estimatedCompletionTimestamp", estimatedCompletionTimestamp)
        .add("indexInitializationPercentage", indexInitializationPercentage)
        .add("phase", phase)
        .add("requestedTargetQps", requestedTargetQps)
        .add("state", state)
        .add("targetQpsChangeAllowedAfterTimestamp", targetQpsChangeAllowedAfterTimestamp)
        .toString();
  }
}
