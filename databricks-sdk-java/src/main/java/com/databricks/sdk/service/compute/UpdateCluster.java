// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCluster {
  /** The cluster to be updated. */
  @JsonProperty("cluster")
  private UpdateClusterResource cluster;

  /** ID of the cluster. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /**
   * Specifies which fields of the cluster will be updated. This is required in the POST request.
   * The update mask should be supplied as a single string. To specify multiple fields, separate
   * them with commas (no spaces). To delete a field from a cluster configuration, add it to the
   * `update_mask` string but omit it from the `cluster` object.
   */
  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateCluster setCluster(UpdateClusterResource cluster) {
    this.cluster = cluster;
    return this;
  }

  public UpdateClusterResource getCluster() {
    return cluster;
  }

  public UpdateCluster setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public UpdateCluster setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCluster that = (UpdateCluster) o;
    return Objects.equals(cluster, that.cluster)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, clusterId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCluster.class)
        .add("cluster", cluster)
        .add("clusterId", clusterId)
        .add("updateMask", updateMask)
        .toString();
  }
}
