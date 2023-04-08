// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class InstallLibraries {
  /** Unique identifier for the cluster on which to install these libraries. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The libraries to install. */
  @JsonProperty("libraries")
  private Collection<Library> libraries;

  public InstallLibraries setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public InstallLibraries setLibraries(Collection<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<Library> getLibraries() {
    return libraries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstallLibraries that = (InstallLibraries) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(libraries, that.libraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraries);
  }

  @Override
  public String toString() {
    return new ToStringer(InstallLibraries.class)
        .add("clusterId", clusterId)
        .add("libraries", libraries)
        .toString();
  }
}
