// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstallLibraries {
  /** Unique identifier for the cluster on which to install these libraries. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The libraries to install. */
  @JsonProperty("libraries")
  private java.util.List<Library> libraries;

  public InstallLibraries setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public InstallLibraries setLibraries(java.util.List<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public java.util.List<Library> getLibraries() {
    return libraries;
  }
}
