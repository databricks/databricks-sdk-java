// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class JobCluster {
  /**
   * A unique name for the job cluster. This field is required and must be unique within the job.
   * `JobTaskSettings` may refer to this field to determine which cluster to launch for the task
   * execution.
   */
  @JsonProperty("job_cluster_key")
  private String jobClusterKey;

  /** If new_cluster, a description of a cluster that is created for each task. */
  @JsonProperty("new_cluster")
  private Object /* MISSING TYPE */ newCluster;

  public JobCluster setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public JobCluster setNewCluster(Object /* MISSING TYPE */ newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public Object /* MISSING TYPE */ getNewCluster() {
    return newCluster;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCluster that = (JobCluster) o;
    return Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(newCluster, that.newCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobClusterKey, newCluster);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCluster.class)
        .add("jobClusterKey", jobClusterKey)
        .add("newCluster", newCluster)
        .toString();
  }
}
