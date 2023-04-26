// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>JobCluster class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>jobClusterKey</code>.</p>
   *
   * @param jobClusterKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.JobCluster} object
   */
  public JobCluster setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobClusterKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJobClusterKey() {
    return jobClusterKey;
  }

  /**
   * <p>Setter for the field <code>newCluster</code>.</p>
   *
   * @param newCluster a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.jobs.JobCluster} object
   */
  public JobCluster setNewCluster(Object /* MISSING TYPE */ newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  /**
   * <p>Getter for the field <code>newCluster</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getNewCluster() {
    return newCluster;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCluster that = (JobCluster) o;
    return Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(newCluster, that.newCluster);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(jobClusterKey, newCluster);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(JobCluster.class)
        .add("jobClusterKey", jobClusterKey)
        .add("newCluster", newCluster)
        .toString();
  }
}
