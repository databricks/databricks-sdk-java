// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The configurations for the GKE cluster of a Databricks workspace.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>connectivityType</code>.</p>
   *
   * @param connectivityType a {@link com.databricks.sdk.service.provisioning.GkeConfigConnectivityType} object
   * @return a {@link com.databricks.sdk.service.provisioning.GkeConfig} object
   */
  public GkeConfig setConnectivityType(GkeConfigConnectivityType connectivityType) {
    this.connectivityType = connectivityType;
    return this;
  }

  /**
   * <p>Getter for the field <code>connectivityType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.GkeConfigConnectivityType} object
   */
  public GkeConfigConnectivityType getConnectivityType() {
    return connectivityType;
  }

  /**
   * <p>Setter for the field <code>masterIpRange</code>.</p>
   *
   * @param masterIpRange a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GkeConfig} object
   */
  public GkeConfig setMasterIpRange(String masterIpRange) {
    this.masterIpRange = masterIpRange;
    return this;
  }

  /**
   * <p>Getter for the field <code>masterIpRange</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMasterIpRange() {
    return masterIpRange;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GkeConfig that = (GkeConfig) o;
    return Objects.equals(connectivityType, that.connectivityType)
        && Objects.equals(masterIpRange, that.masterIpRange);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(connectivityType, masterIpRange);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GkeConfig.class)
        .add("connectivityType", connectivityType)
        .add("masterIpRange", masterIpRange)
        .toString();
  }
}
