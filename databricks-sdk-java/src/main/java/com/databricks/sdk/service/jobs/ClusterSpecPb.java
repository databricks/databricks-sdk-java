// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ClusterSpecPb {
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  @JsonProperty("job_cluster_key")
  private String jobClusterKey;

  @JsonProperty("libraries")
  private Collection<com.databricks.sdk.service.compute.Library> libraries;

  @JsonProperty("new_cluster")
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  public ClusterSpecPb setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public ClusterSpecPb setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public ClusterSpecPb setLibraries(
      Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }

  public ClusterSpecPb setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterSpecPb that = (ClusterSpecPb) o;
    return Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingClusterId, jobClusterKey, libraries, newCluster);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSpecPb.class)
        .add("existingClusterId", existingClusterId)
        .add("jobClusterKey", jobClusterKey)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .toString();
  }
}
