// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage private network gateways under network connectivity configurations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PrivateNetworkGatewaysService {
  /** Creates a private network gateway. */
  Operation createPrivateNetworkGateway(
      CreatePrivateNetworkGatewayRequest createPrivateNetworkGatewayRequest);

  /** Permanently deletes a private network gateway. */
  void deletePrivateNetworkGateway(
      DeletePrivateNetworkGatewayRequest deletePrivateNetworkGatewayRequest);

  /** Gets a private network gateway. */
  PrivateNetworkGateway getPrivateNetworkGateway(
      GetPrivateNetworkGatewayRequest getPrivateNetworkGatewayRequest);

  /** Gets the status of a private network gateway create operation. */
  Operation getPrivateNetworkGatewayOperation(GetOperationRequest getOperationRequest);

  /** Lists private network gateways under a network connectivity configuration. */
  ListPrivateNetworkGatewaysResponse listPrivateNetworkGateways(
      ListPrivateNetworkGatewaysRequest listPrivateNetworkGatewaysRequest);

  /** Updates a private network gateway. */
  PrivateNetworkGateway updatePrivateNetworkGateway(
      UpdatePrivateNetworkGatewayRequest updatePrivateNetworkGatewayRequest);
}
