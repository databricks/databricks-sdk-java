// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ContinuousTriggerState {
  /** */
  @JsonProperty("consecutive_failures")
  private Long consecutiveFailures;

  /** */
  @JsonProperty("is_backing_off")
  private Boolean isBackingOff;

  /** */
  @JsonProperty("next_attempt_ms")
  private Long nextAttemptMs;

  public ContinuousTriggerState setConsecutiveFailures(Long consecutiveFailures) {
    this.consecutiveFailures = consecutiveFailures;
    return this;
  }

  public Long getConsecutiveFailures() {
    return consecutiveFailures;
  }

  public ContinuousTriggerState setIsBackingOff(Boolean isBackingOff) {
    this.isBackingOff = isBackingOff;
    return this;
  }

  public Boolean getIsBackingOff() {
    return isBackingOff;
  }

  public ContinuousTriggerState setNextAttemptMs(Long nextAttemptMs) {
    this.nextAttemptMs = nextAttemptMs;
    return this;
  }

  public Long getNextAttemptMs() {
    return nextAttemptMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContinuousTriggerState that = (ContinuousTriggerState) o;
    return Objects.equals(consecutiveFailures, that.consecutiveFailures)
        && Objects.equals(isBackingOff, that.isBackingOff)
        && Objects.equals(nextAttemptMs, that.nextAttemptMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consecutiveFailures, isBackingOff, nextAttemptMs);
  }

  @Override
  public String toString() {
    return new ToStringer(ContinuousTriggerState.class)
        .add("consecutiveFailures", consecutiveFailures)
        .add("isBackingOff", isBackingOff)
        .add("nextAttemptMs", nextAttemptMs)
        .toString();
  }
}
