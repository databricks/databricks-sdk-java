// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.Collection;

/** Package-local implementation of Networks */
@Generated
class NetworksImpl implements NetworksService {
  private final ApiClient apiClient;

  public NetworksImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Network create(CreateNetworkRequest request) {
    String path = String.format("/api/2.0/accounts/%s/networks", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Network.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Network delete(DeleteNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Network.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Network get(GetNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Network.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Collection<Network> list() {
    String path = String.format("/api/2.0/accounts/%s/networks", apiClient.configuredAccountID());
    Request req = new Request("GET", path);
    req.withHeader("Accept", "application/json");
    return apiClient.getCollection(req, Network.class);
  }
}
