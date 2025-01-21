// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Providers */
@Generated
class ProvidersImpl implements ProvidersService {
  private final ApiClient apiClient;

  public ProvidersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ProviderInfo create(CreateProvider request) {
    String path = "/api/2.1/unity-catalog/providers";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, ProviderInfo.class, headers);
  }

  @Override
  public void delete(DeleteProviderRequest request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public ProviderInfo get(GetProviderRequest request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ProviderInfo.class, headers);
  }

  @Override
  public ListProvidersResponse list(ListProvidersRequest request) {
    String path = "/api/2.1/unity-catalog/providers";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListProvidersResponse.class, headers);
  }

  @Override
  public ListProviderSharesResponse listShares(ListSharesRequest request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s/shares", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListProviderSharesResponse.class, headers);
  }

  @Override
  public ProviderInfo update(UpdateProvider request) {
    String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, ProviderInfo.class, headers);
  }
}
