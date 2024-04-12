// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ConsumerProviders */
@Generated
class ConsumerProvidersImpl implements ConsumerProvidersService {
  private final ApiClient apiClient;

  public ConsumerProvidersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetProviderResponse get(GetProviderRequest request) {
    String path = String.format("/api/2.1/marketplace-consumer/providers/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetProviderResponse.class, headers);
  }

  @Override
  public ListProvidersResponse list(ListProvidersRequest request) {
    String path = "/api/2.1/marketplace-consumer/providers";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListProvidersResponse.class, headers);
  }
}
