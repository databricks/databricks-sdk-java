// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get status */
@Generated
public class ClusterStatusRequest {
  /** Unique identifier of the cluster whose status should be retrieved. */
  @QueryParam("cluster_id")
  private String clusterId;

  public ClusterStatusRequest setClusterId(String clusterId) {
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
    ClusterStatusRequest that = (ClusterStatusRequest) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterStatusRequest.class).add("clusterId", clusterId).toString();
  }
}
