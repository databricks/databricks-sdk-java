// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Contains the immutable set of upstream completions that triggered the run, in configured jobs
 * order
 */
@Generated
public class JobCompletionTriggerRunInfoDetails {
  /** */
  @JsonProperty("completed_jobs")
  private Collection<CompletedJob> completedJobs;

  public JobCompletionTriggerRunInfoDetails setCompletedJobs(
      Collection<CompletedJob> completedJobs) {
    this.completedJobs = completedJobs;
    return this;
  }

  public Collection<CompletedJob> getCompletedJobs() {
    return completedJobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompletionTriggerRunInfoDetails that = (JobCompletionTriggerRunInfoDetails) o;
    return Objects.equals(completedJobs, that.completedJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedJobs);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompletionTriggerRunInfoDetails.class)
        .add("completedJobs", completedJobs)
        .toString();
  }
}
