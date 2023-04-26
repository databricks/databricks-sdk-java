// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of Networks */
class NetworksImpl implements NetworksService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for NetworksImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public NetworksImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Network create(CreateNetworkRequest request) {
    String path = String.format("/api/2.0/accounts/%s/networks", apiClient.configuredAccountID());
    return apiClient.POST(path, request, Network.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Network get(GetNetworkRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/networks/%s",
            apiClient.configuredAccountID(), request.getNetworkId());
    return apiClient.GET(path, request, Network.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<Network> list() {
    String path = String.format("/api/2.0/accounts/%s/networks", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }
}
