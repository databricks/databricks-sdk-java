// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The network configuration for workspaces. */
@Generated
public class WorkspaceNetwork {
  /**
   * The shared network config for GCP workspace. This object has common network configurations that
   * are network attributions of a workspace. This object is input-only.
   */
  @JsonProperty("gcp_common_network_config")
  private GcpCommonNetworkConfig gcpCommonNetworkConfig;

  /**
   * The mutually exclusive network deployment modes. The option decides which network mode the
   * workspace will use. The network config for GCP workspace with Databricks managed network. This
   * object is input-only and will not be provided when listing workspaces. See
   * go/gcp-byovpc-alpha-design for interface decisions.
   */
  @JsonProperty("gcp_managed_network_config")
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /**
   * The ID of the network object, if the workspace is a BYOVPC workspace. This should apply to
   * workspaces on all clouds in internal services. In accounts-rest-api, user will use
   * workspace.network_id for input and output instead. Currently (2021-06-19) the network ID is
   * only used by GCP.
   */
  @JsonProperty("network_id")
  private String networkId;

  public WorkspaceNetwork setGcpCommonNetworkConfig(GcpCommonNetworkConfig gcpCommonNetworkConfig) {
    this.gcpCommonNetworkConfig = gcpCommonNetworkConfig;
    return this;
  }

  public GcpCommonNetworkConfig getGcpCommonNetworkConfig() {
    return gcpCommonNetworkConfig;
  }

  public WorkspaceNetwork setGcpManagedNetworkConfig(
      GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  public WorkspaceNetwork setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceNetwork that = (WorkspaceNetwork) o;
    return Objects.equals(gcpCommonNetworkConfig, that.gcpCommonNetworkConfig)
        && Objects.equals(gcpManagedNetworkConfig, that.gcpManagedNetworkConfig)
        && Objects.equals(networkId, that.networkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpCommonNetworkConfig, gcpManagedNetworkConfig, networkId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceNetwork.class)
        .add("gcpCommonNetworkConfig", gcpCommonNetworkConfig)
        .add("gcpManagedNetworkConfig", gcpManagedNetworkConfig)
        .add("networkId", networkId)
        .toString();
  }
}
