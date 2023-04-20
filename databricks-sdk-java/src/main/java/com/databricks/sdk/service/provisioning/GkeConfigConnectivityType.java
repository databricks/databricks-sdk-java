// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

/**
 * Specifies the network connectivity types for the GKE nodes and the GKE master network.
 *
 * <p>Set to `PRIVATE_NODE_PUBLIC_MASTER` for a private GKE cluster for the workspace. The GKE nodes
 * will not have public IPs.
 *
 * <p>Set to `PUBLIC_NODE_PUBLIC_MASTER` for a public GKE cluster. The nodes of a public GKE cluster
 * have public IP addresses.
 */
public enum GkeConfigConnectivityType {
  PRIVATE_NODE_PUBLIC_MASTER,
  PUBLIC_NODE_PUBLIC_MASTER,
}
