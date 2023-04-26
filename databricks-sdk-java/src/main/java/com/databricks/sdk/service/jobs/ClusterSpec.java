// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ClusterSpec class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
  private Collection<Object /* MISSING TYPE */> libraries;

  /** If new_cluster, a description of a cluster that is created for each run. */
  @JsonProperty("new_cluster")
  private Object /* MISSING TYPE */ newCluster;

  /**
   * <p>Setter for the field <code>existingClusterId</code>.</p>
   *
   * @param existingClusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.ClusterSpec} object
   */
  public ClusterSpec setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>existingClusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExistingClusterId() {
    return existingClusterId;
  }

  /**
   * <p>Setter for the field <code>libraries</code>.</p>
   *
   * @param libraries a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.ClusterSpec} object
   */
  public ClusterSpec setLibraries(Collection<Object /* MISSING TYPE */> libraries) {
    this.libraries = libraries;
    return this;
  }

  /**
   * <p>Getter for the field <code>libraries</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Object /* MISSING TYPE */> getLibraries() {
    return libraries;
  }

  /**
   * <p>Setter for the field <code>newCluster</code>.</p>
   *
   * @param newCluster a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.jobs.ClusterSpec} object
   */
  public ClusterSpec setNewCluster(Object /* MISSING TYPE */ newCluster) {
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
    ClusterSpec that = (ClusterSpec) o;
    return Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(existingClusterId, libraries, newCluster);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClusterSpec.class)
        .add("existingClusterId", existingClusterId)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .toString();
  }
}
