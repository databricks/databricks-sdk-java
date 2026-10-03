// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** AWS connection configuration. */
@Generated
public class PrivateNetworkGatewayAwsCloudConnection {
  /** The IAM role that Databricks assumes to manage gateway resources. */
  @JsonProperty("cross_account_role")
  private PrivateNetworkGatewayAwsCloudConnectionCrossAccountRole crossAccountRole;

  /** The subnets where the gateway establishes connectivity. */
  @JsonProperty("gateway_subnets")
  private Collection<PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet> gatewaySubnets;

  /** The security groups attached to the gateway network interface. */
  @JsonProperty("security_group_ids")
  private Collection<String> securityGroupIds;

  public PrivateNetworkGatewayAwsCloudConnection setCrossAccountRole(
      PrivateNetworkGatewayAwsCloudConnectionCrossAccountRole crossAccountRole) {
    this.crossAccountRole = crossAccountRole;
    return this;
  }

  public PrivateNetworkGatewayAwsCloudConnectionCrossAccountRole getCrossAccountRole() {
    return crossAccountRole;
  }

  public PrivateNetworkGatewayAwsCloudConnection setGatewaySubnets(
      Collection<PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet> gatewaySubnets) {
    this.gatewaySubnets = gatewaySubnets;
    return this;
  }

  public Collection<PrivateNetworkGatewayAwsCloudConnectionAwsGatewaySubnet> getGatewaySubnets() {
    return gatewaySubnets;
  }

  public PrivateNetworkGatewayAwsCloudConnection setSecurityGroupIds(
      Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateNetworkGatewayAwsCloudConnection that = (PrivateNetworkGatewayAwsCloudConnection) o;
    return Objects.equals(crossAccountRole, that.crossAccountRole)
        && Objects.equals(gatewaySubnets, that.gatewaySubnets)
        && Objects.equals(securityGroupIds, that.securityGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossAccountRole, gatewaySubnets, securityGroupIds);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGatewayAwsCloudConnection.class)
        .add("crossAccountRole", crossAccountRole)
        .add("gatewaySubnets", gatewaySubnets)
        .add("securityGroupIds", securityGroupIds)
        .toString();
  }
}
