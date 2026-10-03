// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Azure connection configuration. */
@Generated
public class PrivateNetworkGatewayAzureCloudConnection {
  /** The subnet where the gateway establishes connectivity. */
  @JsonProperty("gateway_subnet")
  private PrivateNetworkGatewayAzureCloudConnectionAzureGatewaySubnet gatewaySubnet;

  public PrivateNetworkGatewayAzureCloudConnection setGatewaySubnet(
      PrivateNetworkGatewayAzureCloudConnectionAzureGatewaySubnet gatewaySubnet) {
    this.gatewaySubnet = gatewaySubnet;
    return this;
  }

  public PrivateNetworkGatewayAzureCloudConnectionAzureGatewaySubnet getGatewaySubnet() {
    return gatewaySubnet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateNetworkGatewayAzureCloudConnection that = (PrivateNetworkGatewayAzureCloudConnection) o;
    return Objects.equals(gatewaySubnet, that.gatewaySubnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewaySubnet);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGatewayAzureCloudConnection.class)
        .add("gatewaySubnet", gatewaySubnet)
        .toString();
  }
}
