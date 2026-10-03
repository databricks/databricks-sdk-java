// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreatePrivateNetworkGatewayRequest {
  /** The network connectivity configuration that will contain the gateway. */
  @JsonIgnore private String parent;

  /** The gateway to create. */
  @JsonProperty("private_network_gateway")
  private PrivateNetworkGateway privateNetworkGateway;

  /** A unique identifier for this request. The request is idempotent when this is provided. */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  public CreatePrivateNetworkGatewayRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreatePrivateNetworkGatewayRequest setPrivateNetworkGateway(
      PrivateNetworkGateway privateNetworkGateway) {
    this.privateNetworkGateway = privateNetworkGateway;
    return this;
  }

  public PrivateNetworkGateway getPrivateNetworkGateway() {
    return privateNetworkGateway;
  }

  public CreatePrivateNetworkGatewayRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePrivateNetworkGatewayRequest that = (CreatePrivateNetworkGatewayRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(privateNetworkGateway, that.privateNetworkGateway)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, privateNetworkGateway, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateNetworkGatewayRequest.class)
        .add("parent", parent)
        .add("privateNetworkGateway", privateNetworkGateway)
        .add("requestId", requestId)
        .toString();
  }
}
