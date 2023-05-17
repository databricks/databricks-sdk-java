// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.service.compute.BaseClusterInfo;
import com.databricks.sdk.service.compute.Library;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ClusterSpec {
  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs of this job.
   * When running jobs on an existing cluster, you may need to manually restart the cluster if it
   * stops responding. We suggest running jobs on new clusters for greater reliability
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  /**
   * An optional list of libraries to be installed on the cluster that executes the job. The default
   * value is an empty list.
   */
  @JsonProperty("libraries")
  private Collection<Library> libraries;

  /** If new_cluster, a description of a cluster that is created for each run. */
  @JsonProperty("new_cluster")
  private BaseClusterInfo newCluster;

  public ClusterSpec setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public ClusterSpec setLibraries(Collection<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<Library> getLibraries() {
    return libraries;
  }

  public ClusterSpec setNewCluster(BaseClusterInfo newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public BaseClusterInfo getNewCluster() {
    return newCluster;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterSpec that = (ClusterSpec) o;
    return Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingClusterId, libraries, newCluster);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSpec.class)
        .add("existingClusterId", existingClusterId)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .toString();
  }
}
