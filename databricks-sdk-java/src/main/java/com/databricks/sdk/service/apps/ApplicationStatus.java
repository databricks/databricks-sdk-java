// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ApplicationStatus {
  /** Application status message */
  @JsonProperty("message")
  private String message;

  /** The number of running instances of this application. */
  @JsonProperty("running_instances")
  private Long runningInstances;

  /** State of the application. */
  @JsonProperty("state")
  private ApplicationState state;

  public ApplicationStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ApplicationStatus setRunningInstances(Long runningInstances) {
    this.runningInstances = runningInstances;
    return this;
  }

  public Long getRunningInstances() {
    return runningInstances;
  }

  public ApplicationStatus setState(ApplicationState state) {
    this.state = state;
    return this;
  }

  public ApplicationState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApplicationStatus that = (ApplicationStatus) o;
    return Objects.equals(message, that.message)
        && Objects.equals(runningInstances, that.runningInstances)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, runningInstances, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ApplicationStatus.class)
        .add("message", message)
        .add("runningInstances", runningInstances)
        .add("state", state)
        .toString();
  }
}
