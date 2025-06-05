// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ResizeClusterPb {
  @JsonProperty("autoscale")
  private AutoScale autoscale;

  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("num_workers")
  private Long numWorkers;

  public ResizeClusterPb setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public AutoScale getAutoscale() {
    return autoscale;
  }

  public ResizeClusterPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ResizeClusterPb setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResizeClusterPb that = (ResizeClusterPb) o;
    return Objects.equals(autoscale, that.autoscale)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(numWorkers, that.numWorkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscale, clusterId, numWorkers);
  }

  @Override
  public String toString() {
    return new ToStringer(ResizeClusterPb.class)
        .add("autoscale", autoscale)
        .add("clusterId", clusterId)
        .add("numWorkers", numWorkers)
        .toString();
  }
}
