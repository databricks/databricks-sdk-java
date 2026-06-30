// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The current status of the run */
@Generated
public class RunStatus {
  /** If the run was queued, details about the reason for queuing the run. */
  @JsonProperty("queue_details")
  private QueueDetails queueDetails;

  /** */
  @JsonProperty("state")
  private RunLifecycleStateV2State state;

  /**
   * If the run is in a TERMINATING or TERMINATED state, details about the reason for terminating
   * the run.
   */
  @JsonProperty("termination_details")
  private TerminationDetails terminationDetails;

  public RunStatus setQueueDetails(QueueDetails queueDetails) {
    this.queueDetails = queueDetails;
    return this;
  }

  public QueueDetails getQueueDetails() {
    return queueDetails;
  }

  public RunStatus setState(RunLifecycleStateV2State state) {
    this.state = state;
    return this;
  }

  public RunLifecycleStateV2State getState() {
    return state;
  }

  public RunStatus setTerminationDetails(TerminationDetails terminationDetails) {
    this.terminationDetails = terminationDetails;
    return this;
  }

  public TerminationDetails getTerminationDetails() {
    return terminationDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunStatus that = (RunStatus) o;
    return Objects.equals(queueDetails, that.queueDetails)
        && Objects.equals(state, that.state)
        && Objects.equals(terminationDetails, that.terminationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueDetails, state, terminationDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(RunStatus.class)
        .add("queueDetails", queueDetails)
        .add("state", state)
        .add("terminationDetails", terminationDetails)
        .toString();
  }
}
