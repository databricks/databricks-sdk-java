// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ClusterInstance class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClusterInstance {
  /**
   * The canonical identifier for the cluster used by a run. This field is always available for runs
   * on existing clusters. For runs on new clusters, it becomes available once the cluster is
   * created. This value can be used to view logs by browsing to
   * `/#setting/sparkui/$cluster_id/driver-logs`. The logs continue to be available after the run
   * completes.
   *
   * <p>The response won’t include this field if the identifier is not available yet.
   */
  @JsonProperty("cluster_id")
  private String clusterId;

  /**
   * The canonical identifier for the Spark context used by a run. This field is filled in once the
   * run begins execution. This value can be used to view the Spark UI by browsing to
   * `/#setting/sparkui/$cluster_id/$spark_context_id`. The Spark UI continues to be available after
   * the run has completed.
   *
   * <p>The response won’t include this field if the identifier is not available yet.
   */
  @JsonProperty("spark_context_id")
  private String sparkContextId;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.ClusterInstance} object
   */
  public ClusterInstance setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>sparkContextId</code>.</p>
   *
   * @param sparkContextId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.ClusterInstance} object
   */
  public ClusterInstance setSparkContextId(String sparkContextId) {
    this.sparkContextId = sparkContextId;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkContextId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSparkContextId() {
    return sparkContextId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterInstance that = (ClusterInstance) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(sparkContextId, that.sparkContextId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, sparkContextId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClusterInstance.class)
        .add("clusterId", clusterId)
        .add("sparkContextId", sparkContextId)
        .toString();
  }
}
