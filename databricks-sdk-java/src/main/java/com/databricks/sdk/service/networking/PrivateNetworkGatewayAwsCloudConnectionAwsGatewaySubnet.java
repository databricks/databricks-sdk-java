// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An AWS subnet used by the gateway. */
@Generated
public class PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet {
  /** The AWS subnet ID. */
  @JsonProperty("subnet_id")
  private String subnetId;

  public PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet setSubnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  public String getSubnetId() {
    return subnetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet that =
        (PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet) o;
    return Objects.equals(subnetId, that.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet.class)
        .add("subnetId", subnetId)
        .toString();
  }
}
