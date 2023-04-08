// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network configurations for the workspace. If you provide a network configuration ID for a new
 * workspace, Databricks deploys the new workspace into that associated customer-managed VPC. If
 * omitted, by default Databricks creates a new Databricks-managed VPC for the workspace in your
 * Google account and manages its lifecycle.
 *
 * <p>All the IP range configurations must be mutually exclusive. An attempt to create a workspace
 * fails if Databricks detects an IP range overlap.
 *
 * <p>Specify custom IP ranges in CIDR format. The IP ranges for these fields must not overlap, and
 * all IP addresses must be entirely within the following ranges: `10.0.0.0/8`, `100.64.0.0/10`,
 * `172.16.0.0/12`, `192.168.0.0/16`, and `240.0.0.0/4`.
 *
 * <p>The sizes of these IP ranges affect the maximum number of nodes for the workspace.
 *
 * <p>**Important**: Confirm the IP ranges used by your Databricks workspace before creating the
 * workspace. You cannot change them after your workspace is deployed. If the IP address ranges for
 * your Databricks are too small, IP exhaustion can occur, causing your Databricks jobs to fail. To
 * determine the address range sizes that you need, Databricks provides a calculator as a Microsoft
 * Excel spreadsheet. See [calculate subnet sizes for a new workspace].
 *
 * <p>[calculate subnet sizes for a new workspace]:
 * https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/network-sizing.html
 */
public class CreateGcpNetwork {
  /**
   * The common network configuration fields that can be used by both Databricks-managed VPCs and
   * customer-managed VPCs.
   */
  @JsonProperty("gcp_common_network_config")
  private GcpCommonNetworkConfig gcpCommonNetworkConfig;

  /**
   * The network settings for the workspace. The configurations are only for Databricks-managed
   * VPCs. It is ignored if you specify a customer-managed VPC in the `network_id` field.
   */
  @JsonProperty("gcp_managed_network_config")
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /**
   * The network configuration ID that is attached to the workspace. If you provide a network
   * configuration ID for a new workspace, Databricks validates the network resources and deploys
   * the new workspace into your associated customer-managed VPC that is specified in this network
   * configuration. If omitted, by default Databricks creates a new Databricks-managed VPC for the
   * workspace in your Google account and manages its lifecycle.
   */
  @JsonProperty("network_id")
  private String networkId;

  public CreateGcpNetwork setGcpCommonNetworkConfig(GcpCommonNetworkConfig gcpCommonNetworkConfig) {
    this.gcpCommonNetworkConfig = gcpCommonNetworkConfig;
    return this;
  }

  public GcpCommonNetworkConfig getGcpCommonNetworkConfig() {
    return gcpCommonNetworkConfig;
  }

  public CreateGcpNetwork setGcpManagedNetworkConfig(
      GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  public CreateGcpNetwork setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }
}
