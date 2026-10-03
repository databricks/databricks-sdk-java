// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.networking;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.UUID;

/** Package-local implementation of PrivateNetworkGateways */
@Generated
class PrivateNetworkGatewaysImpl implements PrivateNetworkGatewaysService {
  private final ApiClient apiClient;

  public PrivateNetworkGatewaysImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Operation createPrivateNetworkGateway(CreatePrivateNetworkGatewayRequest request) {
    String path =
        String.format("/api/networking/v1/%s/private-network-gateways", request.getParent());
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getPrivateNetworkGateway()));

      if (request.getRequestId() == null || request.getRequestId().isEmpty()) {
        request.setRequestId(UUID.randomUUID().toString());
      }
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deletePrivateNetworkGateway(DeletePrivateNetworkGatewayRequest request) {
    String path = String.format("/api/networking/v1/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PrivateNetworkGateway getPrivateNetworkGateway(GetPrivateNetworkGatewayRequest request) {
    String path = String.format("/api/networking/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PrivateNetworkGateway.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation getPrivateNetworkGatewayOperation(GetOperationRequest request) {
    String path = String.format("/api/networking/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPrivateNetworkGatewaysResponse listPrivateNetworkGateways(
      ListPrivateNetworkGatewaysRequest request) {
    String path =
        String.format("/api/networking/v1/%s/private-network-gateways", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListPrivateNetworkGatewaysResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PrivateNetworkGateway updatePrivateNetworkGateway(
      UpdatePrivateNetworkGatewayRequest request) {
    String path = String.format("/api/networking/v1/%s", request.getName());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getPrivateNetworkGateway()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PrivateNetworkGateway.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
