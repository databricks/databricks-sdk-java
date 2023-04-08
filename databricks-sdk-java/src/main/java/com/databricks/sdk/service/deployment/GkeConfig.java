// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The configurations for the GKE cluster of a Databricks workspace. */
public class GkeConfig {
  /**
   * Specifies the network connectivity types for the GKE nodes and the GKE master network.
   *
   * <p>Set to `PRIVATE_NODE_PUBLIC_MASTER` for a private GKE cluster for the workspace. The GKE
   * nodes will not have public IPs.
   *
   * <p>Set to `PUBLIC_NODE_PUBLIC_MASTER` for a public GKE cluster. The nodes of a public GKE
   * cluster have public IP addresses.
   */
  @JsonProperty("connectivity_type")
  private GkeConfigConnectivityType connectivityType;

  /**
   * The IP range from which to allocate GKE cluster master resources. This field will be ignored if
   * GKE private cluster is not enabled.
   *
   * <p>It must be exactly as big as `/28`.
   */
  @JsonProperty("master_ip_range")
  private String masterIpRange;

  public GkeConfig setConnectivityType(GkeConfigConnectivityType connectivityType) {
    this.connectivityType = connectivityType;
    return this;
  }

  public GkeConfigConnectivityType getConnectivityType() {
    return connectivityType;
  }

  public GkeConfig setMasterIpRange(String masterIpRange) {
    this.masterIpRange = masterIpRange;
    return this;
  }

  public String getMasterIpRange() {
    return masterIpRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GkeConfig that = (GkeConfig) o;
    return Objects.equals(connectivityType, that.connectivityType)
        && Objects.equals(masterIpRange, that.masterIpRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityType, masterIpRange);
  }

  @Override
  public String toString() {
    return new ToStringer(GkeConfig.class)
        .add("connectivityType", connectivityType)
        .add("masterIpRange", masterIpRange)
        .toString();
  }
}
