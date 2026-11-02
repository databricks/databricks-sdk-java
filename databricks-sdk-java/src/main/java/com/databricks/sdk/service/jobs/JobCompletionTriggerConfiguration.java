// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A trigger that starts a run after every upstream job completes with a configured status. */
@Generated
public class JobCompletionTriggerConfiguration {
  /** The status that all upstream jobs must have before this trigger fires. Defaults to SUCCESS. */
  @JsonProperty("if_status")
  private JobCompletionTriggerConfigurationIfStatus ifStatus;

  /**
   * The upstream jobs to monitor. Each job must be in a workspace attached to the same Unity
   * Catalog metastore as the downstream job. A maximum of 10 jobs can be monitored.
   */
  @JsonProperty("jobs")
  private Collection<JobCompletionTriggerConfigurationMonitoredJob> jobs;

  public JobCompletionTriggerConfiguration setIfStatus(
      JobCompletionTriggerConfigurationIfStatus ifStatus) {
    this.ifStatus = ifStatus;
    return this;
  }

  public JobCompletionTriggerConfigurationIfStatus getIfStatus() {
    return ifStatus;
  }

  public JobCompletionTriggerConfiguration setJobs(
      Collection<JobCompletionTriggerConfigurationMonitoredJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<JobCompletionTriggerConfigurationMonitoredJob> getJobs() {
    return jobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompletionTriggerConfiguration that = (JobCompletionTriggerConfiguration) o;
    return Objects.equals(ifStatus, that.ifStatus) && Objects.equals(jobs, that.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ifStatus, jobs);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompletionTriggerConfiguration.class)
        .add("ifStatus", ifStatus)
        .add("jobs", jobs)
        .toString();
  }
}
