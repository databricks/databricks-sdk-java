// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The current status of the run */
@Generated
class RunStatusPb {
  @JsonProperty("queue_details")
  private QueueDetails queueDetails;

  @JsonProperty("state")
  private RunLifecycleStateV2State state;

  @JsonProperty("termination_details")
  private TerminationDetails terminationDetails;

  public RunStatusPb setQueueDetails(QueueDetails queueDetails) {
    this.queueDetails = queueDetails;
    return this;
  }

  public QueueDetails getQueueDetails() {
    return queueDetails;
  }

  public RunStatusPb setState(RunLifecycleStateV2State state) {
    this.state = state;
    return this;
  }

  public RunLifecycleStateV2State getState() {
    return state;
  }

  public RunStatusPb setTerminationDetails(TerminationDetails terminationDetails) {
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
    RunStatusPb that = (RunStatusPb) o;
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
    return new ToStringer(RunStatusPb.class)
        .add("queueDetails", queueDetails)
        .add("state", state)
        .add("terminationDetails", terminationDetails)
        .toString();
  }
}
