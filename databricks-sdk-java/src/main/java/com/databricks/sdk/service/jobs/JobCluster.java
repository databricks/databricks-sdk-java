// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  /**
   * The ID of the serverless compute object to bind this cluster to. At most one JobCluster per job
   * may set this field; the rate limit defined on the referenced serverless compute applies across
   * all tasks bound to this cluster.
   */
  @JsonProperty("serverless_compute_id")
  private String serverlessComputeId;

  public JobCluster setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public JobCluster setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  public JobCluster setServerlessComputeId(String serverlessComputeId) {
    this.serverlessComputeId = serverlessComputeId;
    return this;
  }

  public String getServerlessComputeId() {
    return serverlessComputeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCluster that = (JobCluster) o;
    return Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(serverlessComputeId, that.serverlessComputeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobClusterKey, newCluster, serverlessComputeId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCluster.class)
        .add("jobClusterKey", jobClusterKey)
        .add("newCluster", newCluster)
        .add("serverlessComputeId", serverlessComputeId)
        .toString();
  }
}
