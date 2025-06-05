// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The current state of the run. */
@Generated
class RunStatePb {
  @JsonProperty("life_cycle_state")
  private RunLifeCycleState lifeCycleState;

  @JsonProperty("queue_reason")
  private String queueReason;

  @JsonProperty("result_state")
  private RunResultState resultState;

  @JsonProperty("state_message")
  private String stateMessage;

  @JsonProperty("user_cancelled_or_timedout")
  private Boolean userCancelledOrTimedout;

  public RunStatePb setLifeCycleState(RunLifeCycleState lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

  public RunLifeCycleState getLifeCycleState() {
    return lifeCycleState;
  }

  public RunStatePb setQueueReason(String queueReason) {
    this.queueReason = queueReason;
    return this;
  }

  public String getQueueReason() {
    return queueReason;
  }

  public RunStatePb setResultState(RunResultState resultState) {
    this.resultState = resultState;
    return this;
  }

  public RunResultState getResultState() {
    return resultState;
  }

  public RunStatePb setStateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  public String getStateMessage() {
    return stateMessage;
  }

  public RunStatePb setUserCancelledOrTimedout(Boolean userCancelledOrTimedout) {
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
    RunStatePb that = (RunStatePb) o;
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
    return new ToStringer(RunStatePb.class)
        .add("lifeCycleState", lifeCycleState)
        .add("queueReason", queueReason)
        .add("resultState", resultState)
        .add("stateMessage", stateMessage)
        .add("userCancelledOrTimedout", userCancelledOrTimedout)
        .toString();
  }
}
