// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get status */
public class ClusterStatus {
  /** Unique identifier of the cluster whose status should be retrieved. */
  @QueryParam("cluster_id")
  private String clusterId;

  public ClusterStatus setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterStatus that = (ClusterStatus) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterStatus.class).add("clusterId", clusterId).toString();
  }
}
