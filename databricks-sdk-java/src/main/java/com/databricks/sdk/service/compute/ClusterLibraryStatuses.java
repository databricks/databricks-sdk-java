// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ClusterLibraryStatuses class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClusterLibraryStatuses {
  /** Unique identifier for the cluster. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** Status of all libraries on the cluster. */
  @JsonProperty("library_statuses")
  private Collection<LibraryFullStatus> libraryStatuses;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterLibraryStatuses} object
   */
  public ClusterLibraryStatuses setClusterId(String clusterId) {
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
   * <p>Setter for the field <code>libraryStatuses</code>.</p>
   *
   * @param libraryStatuses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterLibraryStatuses} object
   */
  public ClusterLibraryStatuses setLibraryStatuses(Collection<LibraryFullStatus> libraryStatuses) {
    this.libraryStatuses = libraryStatuses;
    return this;
  }

  /**
   * <p>Getter for the field <code>libraryStatuses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<LibraryFullStatus> getLibraryStatuses() {
    return libraryStatuses;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterLibraryStatuses that = (ClusterLibraryStatuses) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(libraryStatuses, that.libraryStatuses);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraryStatuses);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClusterLibraryStatuses.class)
        .add("clusterId", clusterId)
        .add("libraryStatuses", libraryStatuses)
        .toString();
  }
}
