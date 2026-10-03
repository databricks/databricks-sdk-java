// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdatePrivateNetworkGatewayRequest {
  /**
   * The canonical resource name of the gateway, in the form
   * `accounts/{account_id}/network-connectivity-configs/{ncc_id}/private-network-gateways/{gateway_id}`.
   */
  @JsonIgnore private String name;

  /** The gateway containing the desired mutable field values. */
  @JsonProperty("private_network_gateway")
  private PrivateNetworkGateway privateNetworkGateway;

  /** The fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdatePrivateNetworkGatewayRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdatePrivateNetworkGatewayRequest setPrivateNetworkGateway(
      PrivateNetworkGateway privateNetworkGateway) {
    this.privateNetworkGateway = privateNetworkGateway;
    return this;
  }

  public PrivateNetworkGateway getPrivateNetworkGateway() {
    return privateNetworkGateway;
  }

  public UpdatePrivateNetworkGatewayRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePrivateNetworkGatewayRequest that = (UpdatePrivateNetworkGatewayRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(privateNetworkGateway, that.privateNetworkGateway)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privateNetworkGateway, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePrivateNetworkGatewayRequest.class)
        .add("name", name)
        .add("privateNetworkGateway", privateNetworkGateway)
        .add("updateMask", updateMask)
        .toString();
  }
}
