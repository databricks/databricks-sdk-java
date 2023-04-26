// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Providers */
class ProvidersImpl implements ProvidersService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for ProvidersImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ProvidersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public ProviderInfo create(CreateProvider request) {
    String path = "/api/2.1/unity-catalog/providers";
    return apiClient.POST(path, request, ProviderInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteProviderRequest request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ProviderInfo get(GetProviderRequest request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
    return apiClient.GET(path, request, ProviderInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListProvidersResponse list(ListProvidersRequest request) {
    String path = "/api/2.1/unity-catalog/providers";
    return apiClient.GET(path, request, ListProvidersResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListProviderSharesResponse listShares(ListSharesRequest request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s/shares", request.getName());
    return apiClient.GET(path, request, ListProviderSharesResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ProviderInfo update(UpdateProvider request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
    return apiClient.PATCH(path, request, ProviderInfo.class);
  }
}
