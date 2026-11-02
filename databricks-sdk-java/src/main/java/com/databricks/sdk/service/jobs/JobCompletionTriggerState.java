// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Runtime state for a job completion trigger. */
@Generated
public class JobCompletionTriggerState {
  /** State for each configured upstream job, in the same order as `jobs`. */
  @JsonProperty("monitored_job_states")
  private Collection<JobCompletionTriggerStateMonitoredJobState> monitoredJobStates;

  public JobCompletionTriggerState setMonitoredJobStates(
      Collection<JobCompletionTriggerStateMonitoredJobState> monitoredJobStates) {
    this.monitoredJobStates = monitoredJobStates;
    return this;
  }

  public Collection<JobCompletionTriggerStateMonitoredJobState> getMonitoredJobStates() {
    return monitoredJobStates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompletionTriggerState that = (JobCompletionTriggerState) o;
    return Objects.equals(monitoredJobStates, that.monitoredJobStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitoredJobStates);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompletionTriggerState.class)
        .add("monitoredJobStates", monitoredJobStates)
        .toString();
  }
}
