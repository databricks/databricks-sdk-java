// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The configurations for the GKE cluster of a Databricks workspace. */
@Generated
class GkeConfigPb {
  @JsonProperty("connectivity_type")
  private GkeConfigConnectivityType connectivityType;

  @JsonProperty("master_ip_range")
  private String masterIpRange;

  public GkeConfigPb setConnectivityType(GkeConfigConnectivityType connectivityType) {
    this.connectivityType = connectivityType;
    return this;
  }

  public GkeConfigConnectivityType getConnectivityType() {
    return connectivityType;
  }

  public GkeConfigPb setMasterIpRange(String masterIpRange) {
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
    GkeConfigPb that = (GkeConfigPb) o;
    return Objects.equals(connectivityType, that.connectivityType)
        && Objects.equals(masterIpRange, that.masterIpRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityType, masterIpRange);
  }

  @Override
  public String toString() {
    return new ToStringer(GkeConfigPb.class)
        .add("connectivityType", connectivityType)
        .add("masterIpRange", masterIpRange)
        .toString();
  }
}
