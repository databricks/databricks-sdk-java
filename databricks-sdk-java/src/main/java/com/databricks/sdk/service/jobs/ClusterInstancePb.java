// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClusterInstancePb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("spark_context_id")
  private String sparkContextId;

  public ClusterInstancePb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterInstancePb setSparkContextId(String sparkContextId) {
    this.sparkContextId = sparkContextId;
    return this;
  }

  public String getSparkContextId() {
    return sparkContextId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterInstancePb that = (ClusterInstancePb) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(sparkContextId, that.sparkContextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, sparkContextId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterInstancePb.class)
        .add("clusterId", clusterId)
        .add("sparkContextId", sparkContextId)
        .toString();
  }
}
