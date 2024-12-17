// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Stores the run state of the clean rooms notebook task. */
@Generated
public class CleanRoomTaskRunState {
  /**
   * A value indicating the run's current lifecycle state. This field is always available in the
   * response.
   */
  @JsonProperty("life_cycle_state")
  private CleanRoomTaskRunLifeCycleState lifeCycleState;

  /**
   * A value indicating the run's result. This field is only available for terminal lifecycle
   * states.
   */
  @JsonProperty("result_state")
  private CleanRoomTaskRunResultState resultState;

  public CleanRoomTaskRunState setLifeCycleState(CleanRoomTaskRunLifeCycleState lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

  public CleanRoomTaskRunLifeCycleState getLifeCycleState() {
    return lifeCycleState;
  }

  public CleanRoomTaskRunState setResultState(CleanRoomTaskRunResultState resultState) {
    this.resultState = resultState;
    return this;
  }

  public CleanRoomTaskRunResultState getResultState() {
    return resultState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomTaskRunState that = (CleanRoomTaskRunState) o;
    return Objects.equals(lifeCycleState, that.lifeCycleState)
        && Objects.equals(resultState, that.resultState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeCycleState, resultState);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomTaskRunState.class)
        .add("lifeCycleState", lifeCycleState)
        .add("resultState", resultState)
        .toString();
  }
}
