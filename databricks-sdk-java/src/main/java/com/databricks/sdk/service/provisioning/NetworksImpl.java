// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Network.class, headers);
  }

  @Override
  public void delete(DeleteNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public Network get(GetNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, Network.class, headers);
  }

  @Override
  public Collection<Network> list() {
    String path = String.format("/api/2.0/accounts/%s/networks", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.getCollection(path, null, Network.class, headers);
  }
}
