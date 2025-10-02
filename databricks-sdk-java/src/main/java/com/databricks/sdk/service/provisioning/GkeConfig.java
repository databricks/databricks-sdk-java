// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The configurations of the GKE cluster used by the GCP workspace. */
@Generated
public class GkeConfig {
  /** The type of network connectivity of the GKE cluster. */
  @JsonProperty("connectivity_type")
  private GkeConfigConnectivityType connectivityType;

  /**
   * The IP range that will be used to allocate GKE cluster master resources from. This field must
   * not be set if gke_cluster_type=PUBLIC_NODE_PUBLIC_MASTER.
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
