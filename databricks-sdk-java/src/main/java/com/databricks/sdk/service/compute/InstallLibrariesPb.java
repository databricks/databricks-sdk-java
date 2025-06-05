// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class InstallLibrariesPb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("libraries")
  private Collection<Library> libraries;

  public InstallLibrariesPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public InstallLibrariesPb setLibraries(Collection<Library> libraries) {
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
    InstallLibrariesPb that = (InstallLibrariesPb) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(libraries, that.libraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraries);
  }

  @Override
  public String toString() {
    return new ToStringer(InstallLibrariesPb.class)
        .add("clusterId", clusterId)
        .add("libraries", libraries)
        .toString();
  }
}
