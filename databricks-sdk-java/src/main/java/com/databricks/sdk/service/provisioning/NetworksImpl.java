// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, Network.class);
  }

  @Override
  public void delete(DeleteNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Network get(GetNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    return apiClient.GET(path, request, Network.class);
  }

  @Override
  public Collection<Network> list() {
    String path = String.format("/api/2.0/accounts/%s/networks", apiClient.configuredAccountID());
    return apiClient.getCollection(path, null, Network.class);
  }
}
