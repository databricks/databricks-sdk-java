// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class StartCluster {
  /** The cluster to be started. */
  @JsonProperty("cluster_id")
  private String clusterId;

  public StartCluster setClusterId(String clusterId) {
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
    StartCluster that = (StartCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(StartCluster.class).add("clusterId", clusterId).toString();
  }
}