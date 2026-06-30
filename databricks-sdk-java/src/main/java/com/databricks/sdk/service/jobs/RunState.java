// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The current state of the run. */
@Generated
public class RunState {
  /**
   * A value indicating the run's current lifecycle state. This field is always available in the
   * response. Note: Additional states might be introduced in future releases.
   */
  @JsonProperty("life_cycle_state")
  private RunLifeCycleState lifeCycleState;

  /** The reason indicating why the run was queued. */
  @JsonProperty("queue_reason")
  private String queueReason;

  /**
   * A value indicating the run's result. This field is only available for terminal lifecycle
   * states. Note: Additional states might be introduced in future releases.
   */
  @JsonProperty("result_state")
  private RunResultState resultState;

  /**
   * A descriptive message for the current state. This field is unstructured, and its exact format
   * is subject to change.
   */
  @JsonProperty("state_message")
  private String stateMessage;

  /**
   * A value indicating whether a run was canceled manually by a user or by the scheduler because
   * the run timed out.
   */
  @JsonProperty("user_cancelled_or_timedout")
  private Boolean userCancelledOrTimedout;

  public RunState setLifeCycleState(RunLifeCycleState lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

  public RunLifeCycleState getLifeCycleState() {
    return lifeCycleState;
  }

  public RunState setQueueReason(String queueReason) {
    this.queueReason = queueReason;
    return this;
  }

  public String getQueueReason() {
    return queueReason;
  }

  public RunState setResultState(RunResultState resultState) {
    this.resultState = resultState;
    return this;
  }

  public RunResultState getResultState() {
    return resultState;
  }

  public RunState setStateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  public String getStateMessage() {
    return stateMessage;
  }

  public RunState setUserCancelledOrTimedout(Boolean userCancelledOrTimedout) {
    this.userCancelledOrTimedout = userCancelledOrTimedout;
    return this;
  }

  public Boolean getUserCancelledOrTimedout() {
    return userCancelledOrTimedout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunState that = (RunState) o;
    return Objects.equals(lifeCycleState, that.lifeCycleState)
        && Objects.equals(queueReason, that.queueReason)
        && Objects.equals(resultState, that.resultState)
        && Objects.equals(stateMessage, that.stateMessage)
        && Objects.equals(userCancelledOrTimedout, that.userCancelledOrTimedout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lifeCycleState, queueReason, resultState, stateMessage, userCancelledOrTimedout);
  }

  @Override
  public String toString() {
    return new ToStringer(RunState.class)
        .add("lifeCycleState", lifeCycleState)
        .add("queueReason", queueReason)
        .add("resultState", resultState)
        .add("stateMessage", stateMessage)
        .add("userCancelledOrTimedout", userCancelledOrTimedout)
        .toString();
  }
}
