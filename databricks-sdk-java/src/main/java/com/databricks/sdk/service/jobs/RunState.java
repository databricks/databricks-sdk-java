// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The result and lifecycle state of the run.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>lifeCycleState</code>.</p>
   *
   * @param lifeCycleState a {@link com.databricks.sdk.service.jobs.RunLifeCycleState} object
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState setLifeCycleState(RunLifeCycleState lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

  /**
   * <p>Getter for the field <code>lifeCycleState</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunLifeCycleState} object
   */
  public RunLifeCycleState getLifeCycleState() {
    return lifeCycleState;
  }

  /**
   * <p>Setter for the field <code>resultState</code>.</p>
   *
   * @param resultState a {@link com.databricks.sdk.service.jobs.RunResultState} object
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState setResultState(RunResultState resultState) {
    this.resultState = resultState;
    return this;
  }

  /**
   * <p>Getter for the field <code>resultState</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunResultState} object
   */
  public RunResultState getResultState() {
    return resultState;
  }

  /**
   * <p>Setter for the field <code>stateMessage</code>.</p>
   *
   * @param stateMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState setStateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>stateMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStateMessage() {
    return stateMessage;
  }

  /**
   * <p>Setter for the field <code>userCancelledOrTimedout</code>.</p>
   *
   * @param userCancelledOrTimedout a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState setUserCancelledOrTimedout(Boolean userCancelledOrTimedout) {
    this.userCancelledOrTimedout = userCancelledOrTimedout;
    return this;
  }

  /**
   * <p>Getter for the field <code>userCancelledOrTimedout</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUserCancelledOrTimedout() {
    return userCancelledOrTimedout;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(lifeCycleState, resultState, stateMessage, userCancelledOrTimedout);
  }

  /** {@inheritDoc} */
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
