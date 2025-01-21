// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ProviderExchangeFilters */
@Generated
class ProviderExchangeFiltersImpl implements ProviderExchangeFiltersService {
  private final ApiClient apiClient;

  public ProviderExchangeFiltersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateExchangeFilterResponse create(CreateExchangeFilterRequest request) {
    String path = "/api/2.0/marketplace-exchange/filters";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, CreateExchangeFilterResponse.class, headers);
  }

  @Override
  public void delete(DeleteExchangeFilterRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/filters/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteExchangeFilterResponse.class, headers);
  }

  @Override
  public ListExchangeFiltersResponse list(ListExchangeFiltersRequest request) {
    String path = "/api/2.0/marketplace-exchange/filters";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListExchangeFiltersResponse.class, headers);
  }

  @Override
  public UpdateExchangeFilterResponse update(UpdateExchangeFilterRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/filters/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, UpdateExchangeFilterResponse.class, headers);
  }
}
