// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangeClusterOwner {
  /** <needs content added> */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** New owner of the cluster_id after this RPC. */
  @JsonProperty("owner_username")
  private String ownerUsername;

  public ChangeClusterOwner setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ChangeClusterOwner setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

  public String getOwnerUsername() {
    return ownerUsername;
  }
}
