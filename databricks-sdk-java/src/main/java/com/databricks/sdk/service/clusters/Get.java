// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.annotation.QueryParam;

/** Get cluster info */
public class Get {
  /** The cluster about which to retrieve information. */
  @QueryParam("cluster_id")
  private String clusterId;

  public Get setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }
}
