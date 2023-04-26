// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UninstallLibraries class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UninstallLibraries {
  /** Unique identifier for the cluster on which to uninstall these libraries. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The libraries to uninstall. */
  @JsonProperty("libraries")
  private Collection<Library> libraries;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.UninstallLibraries} object
   */
  public UninstallLibraries setClusterId(String clusterId) {
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
   * <p>Setter for the field <code>libraries</code>.</p>
   *
   * @param libraries a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.UninstallLibraries} object
   */
  public UninstallLibraries setLibraries(Collection<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  /**
   * <p>Getter for the field <code>libraries</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Library> getLibraries() {
    return libraries;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UninstallLibraries that = (UninstallLibraries) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(libraries, that.libraries);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraries);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UninstallLibraries.class)
        .add("clusterId", clusterId)
        .add("libraries", libraries)
        .toString();
  }
}
