// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.networking;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** These APIs manage private network gateways under network connectivity configurations. */
@Generated
public class PrivateNetworkGatewaysAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PrivateNetworkGatewaysAPI.class);

  private final PrivateNetworkGatewaysService impl;

  /** Regular-use constructor */
  public PrivateNetworkGatewaysAPI(ApiClient apiClient) {
    impl = new PrivateNetworkGatewaysImpl(apiClient);
  }

  /** Constructor for mocks */
  public PrivateNetworkGatewaysAPI(PrivateNetworkGatewaysService mock) {
    impl = mock;
  }

  /** Creates a private network gateway. */
  public CreatePrivateNetworkGatewayOperation createPrivateNetworkGateway(
      CreatePrivateNetworkGatewayRequest request) {
    Operation operation = impl.createPrivateNetworkGateway(request);
    return new CreatePrivateNetworkGatewayOperation(impl, operation);
  }

  public void deletePrivateNetworkGateway(String name) {
    deletePrivateNetworkGateway(new DeletePrivateNetworkGatewayRequest().setName(name));
  }

  /** Permanently deletes a private network gateway. */
  public void deletePrivateNetworkGateway(DeletePrivateNetworkGatewayRequest request) {
    impl.deletePrivateNetworkGateway(request);
  }

  public PrivateNetworkGateway getPrivateNetworkGateway(String name) {
    return getPrivateNetworkGateway(new GetPrivateNetworkGatewayRequest().setName(name));
  }

  /** Gets a private network gateway. */
  public PrivateNetworkGateway getPrivateNetworkGateway(GetPrivateNetworkGatewayRequest request) {
    return impl.getPrivateNetworkGateway(request);
  }

  public Operation getPrivateNetworkGatewayOperation(String name) {
    return getPrivateNetworkGatewayOperation(new GetOperationRequest().setName(name));
  }

  /** Gets the status of a private network gateway create operation. */
  public Operation getPrivateNetworkGatewayOperation(GetOperationRequest request) {
    return impl.getPrivateNetworkGatewayOperation(request);
  }

  public Iterable<PrivateNetworkGateway> listPrivateNetworkGateways(String parent) {
    return listPrivateNetworkGateways(new ListPrivateNetworkGatewaysRequest().setParent(parent));
  }

  /** Lists private network gateways under a network connectivity configuration. */
  public Iterable<PrivateNetworkGateway> listPrivateNetworkGateways(
      ListPrivateNetworkGatewaysRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listPrivateNetworkGateways,
        ListPrivateNetworkGatewaysResponse::getPrivateNetworkGateways,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates a private network gateway. */
  public PrivateNetworkGateway updatePrivateNetworkGateway(
      UpdatePrivateNetworkGatewayRequest request) {
    return impl.updatePrivateNetworkGateway(request);
  }

  public PrivateNetworkGatewaysService impl() {
    return impl;
  }
}
