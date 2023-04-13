// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The result and lifecycle state of the run. */
public class RunState {
  /**
   * A description of a run’s current location in the run lifecycle. This field is always available
   * in the response.
   */
  @JsonProperty("life_cycle_state")
  private RunLifeCycleState lifeCycleState;

  /** This describes an enum */
  @JsonProperty("result_state")
  private RunResultState resultState;

  /**
   * A descriptive message for the current state. This field is unstructured, and its exact format
   * is subject to change.
   */
  @JsonProperty("state_message")
  private String stateMessage;

  /**
   * Whether a run was canceled manually by a user or by the scheduler because the run timed out.
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
        && Objects.equals(resultState, that.resultState)
        && Objects.equals(stateMessage, that.stateMessage)
        && Objects.equals(userCancelledOrTimedout, that.userCancelledOrTimedout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeCycleState, resultState, stateMessage, userCancelledOrTimedout);
  }

  @Override
  public String toString() {
    return new ToStringer(RunState.class)
        .add("lifeCycleState", lifeCycleState)
        .add("resultState", resultState)
        .add("stateMessage", stateMessage)
        .add("userCancelledOrTimedout", userCancelledOrTimedout)
        .toString();
  }
}
