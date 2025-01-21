// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ProviderProviders */
@Generated
class ProviderProvidersImpl implements ProviderProvidersService {
  private final ApiClient apiClient;

  public ProviderProvidersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateProviderResponse create(CreateProviderRequest request) {
    String path = "/api/2.0/marketplace-provider/provider";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, CreateProviderResponse.class, headers);
  }

  @Override
  public void delete(DeleteProviderRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/providers/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteProviderResponse.class, headers);
  }

  @Override
  public GetProviderResponse get(GetProviderRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/providers/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetProviderResponse.class, headers);
  }

  @Override
  public ListProvidersResponse list(ListProvidersRequest request) {
    String path = "/api/2.0/marketplace-provider/providers";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListProvidersResponse.class, headers);
  }

  @Override
  public UpdateProviderResponse update(UpdateProviderRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/providers/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, UpdateProviderResponse.class, headers);
  }
}
