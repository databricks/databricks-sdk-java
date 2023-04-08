// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestartCluster {
  /** The cluster to be started. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** <needs content added> */
  @JsonProperty("restart_user")
  private String restartUser;

  public RestartCluster setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public RestartCluster setRestartUser(String restartUser) {
    this.restartUser = restartUser;
    return this;
  }

  public String getRestartUser() {
    return restartUser;
  }
}
