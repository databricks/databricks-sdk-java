// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the network connectivity types for the GKE nodes and the GKE master network.
 *
 * <p>Set to `PRIVATE_NODE_PUBLIC_MASTER` for a private GKE cluster for the workspace. The GKE nodes
 * will not have public IPs.
 *
 * <p>Set to `PUBLIC_NODE_PUBLIC_MASTER` for a public GKE cluster. The nodes of a public GKE cluster
 * have public IP addresses.
 */
@Generated
public enum GkeConfigConnectivityType {
  @JsonProperty("PRIVATE_NODE_PUBLIC_MASTER")
  PRIVATE_NODE_PUBLIC_MASTER,

  @JsonProperty("PUBLIC_NODE_PUBLIC_MASTER")
  PUBLIC_NODE_PUBLIC_MASTER,
}
